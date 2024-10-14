package com.face.dam.tjddga.facesalmauibers;
import MARSHAL.AddressInSpain;
import MARSHAL.SellerParty;
import MARSHAL.TotalAmount;
import MARSHAL.Batch;
import MARSHAL.BuyerParty;
import MARSHAL.FileHeader;
import MARSHAL.InvoiceLine;
import MARSHAL.Facturae;
import MARSHAL.Invoice;
import MARSHAL.InvoiceHeader;
import MARSHAL.Parties;
import MARSHAL.LegalEntity;
import MARSHAL.Invoices;
import MARSHAL.TaxIdentification;
import MARSHAL.Items;
import MARSHAL.InvoiceIssueData;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class prueba extends JFrame {

    // Componentes de la GUI para ingresar datos
    private JTextField txtInvoiceNumber, txtIssueDate, txtSellerName, txtSellerAddress, txtSellerTaxId;
    private JTextField txtBuyerName, txtBuyerAddress, txtBuyerTaxId, txtItemDescription, txtItemPrice, txtItemQuantity;
    private JButton btnGenerateXML, btnAddItem;
    private JTable itemTable;
    private DefaultTableModel itemTableModel;

    // Lista para almacenar los ítems dinámicamente
    private ArrayList<InvoiceLine> invoiceLines;

    public prueba () {
        setTitle("Generador de Facturas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar la lista de ítems
        invoiceLines = new ArrayList<>();

        // Panel para contener los campos
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(15, 2));

        // Campos de factura
        panel.add(new JLabel("Número de Factura:"));
        txtInvoiceNumber = new JTextField();
        panel.add(txtInvoiceNumber);

        panel.add(new JLabel("Fecha de Emisión: (YYYY-MM-DD)"));
        txtIssueDate = new JTextField();
        panel.add(txtIssueDate);

        // Datos del Vendedor
        panel.add(new JLabel("Nombre del Vendedor:"));
        txtSellerName = new JTextField();
        panel.add(txtSellerName);

        panel.add(new JLabel("Dirección del Vendedor:"));
        txtSellerAddress = new JTextField();
        panel.add(txtSellerAddress);

        panel.add(new JLabel("NIF/CIF del Vendedor:"));
        txtSellerTaxId = new JTextField();
        panel.add(txtSellerTaxId);

        // Datos del Comprador
        panel.add(new JLabel("Nombre del Comprador:"));
        txtBuyerName = new JTextField();
        panel.add(txtBuyerName);

        panel.add(new JLabel("Dirección del Comprador:"));
        txtBuyerAddress = new JTextField();
        panel.add(txtBuyerAddress);

        panel.add(new JLabel("NIF/CIF del Comprador:"));
        txtBuyerTaxId = new JTextField();
        panel.add(txtBuyerTaxId);

        // Campos para ingresar los ítems
        panel.add(new JLabel("Descripción del Ítem:"));
        txtItemDescription = new JTextField();
        panel.add(txtItemDescription);

        panel.add(new JLabel("Cantidad del Ítem:"));
        txtItemQuantity = new JTextField();
        panel.add(txtItemQuantity);

        panel.add(new JLabel("Precio del Ítem sin Impuestos:"));
        txtItemPrice = new JTextField();
        panel.add(txtItemPrice);

        // Botón para agregar ítems
        btnAddItem = new JButton("Agregar Ítem");
        panel.add(btnAddItem);

        // Acción del botón para agregar ítem
        btnAddItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarItem();
            }
        });

        // Botón para generar la factura
        btnGenerateXML = new JButton("Generar Factura XML");
        panel.add(btnGenerateXML);

        // Acción del botón para generar la factura
        btnGenerateXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarFacturaXML();
            }
        });

        // Tabla para mostrar los ítems agregados
        itemTableModel = new DefaultTableModel(new Object[]{"Descripción", "Cantidad", "Precio sin impuestos", "Costo total"}, 0);
        itemTable = new JTable(itemTableModel);

        // Panel de scroll para la tabla
        JScrollPane scrollPane = new JScrollPane(itemTable);
        scrollPane.setPreferredSize(new Dimension(600, 200));

        // Añadir paneles al frame
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void agregarItem() {
        try {
            // Obtener los valores del ítem
            String descripcion = txtItemDescription.getText();
            int cantidad = Integer.parseInt(txtItemQuantity.getText());
            double precio = Double.parseDouble(txtItemPrice.getText());

            // Calcular el costo total del ítem
            double totalCost = cantidad * precio;

            // Añadir el ítem a la tabla
            itemTableModel.addRow(new Object[]{descripcion, cantidad, precio, totalCost});

            // Crear un nuevo InvoiceLine y añadirlo a la lista
            InvoiceLine invoiceLine = new InvoiceLine();
            invoiceLine.setItemDescription(descripcion);
            invoiceLine.setQuantity(cantidad);
            invoiceLine.setUnitPriceWithoutTax(precio);
            invoiceLine.setTotalCost(totalCost);

            // Añadir a la lista de ítems
            invoiceLines.add(invoiceLine);

            // Limpiar los campos de ítems
            txtItemDescription.setText("");
            txtItemQuantity.setText("");
            txtItemPrice.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos para cantidad y precio.");
        }
    }

    private void generarFacturaXML() {
        try {
            // Crear la factura
            Facturae facturae = new Facturae();

            // Configuración del FileHeader
            FileHeader fileHeader = new FileHeader();
            fileHeader.setSchemaVersion("3.2.2");
            fileHeader.setModality("I");
            fileHeader.setInvoiceIssuerType("EM");

            // Batch
            Batch batch = new Batch();
            batch.setBatchIdentifier("A80907397SMP008166239");
            batch.setInvoicesCount(1);

            TotalAmount totalAmount = new TotalAmount();
            double totalInvoiceAmount = 0.0;

            // Calcular el total de la factura sumando los ítems agregados
            for (InvoiceLine line : invoiceLines) {
                totalInvoiceAmount += line.getTotalCost();
            }

            totalAmount.setTotalAmount(totalInvoiceAmount);
            batch.setTotalInvoicesAmount(totalAmount);
            batch.setInvoiceCurrencyCode("EUR");
            fileHeader.setBatch(batch);
            facturae.setFileHeader(fileHeader);

            // Configuración del vendedor
            Parties parties = new Parties();
            SellerParty sellerParty = new SellerParty();
            TaxIdentification sellerTaxId = new TaxIdentification();
            sellerTaxId.setPersonTypeCode("J");
            sellerTaxId.setResidenceTypeCode("R");
            sellerTaxId.setTaxIdentificationNumber(txtSellerTaxId.getText());
            sellerParty.setTaxIdentification(sellerTaxId);

            LegalEntity sellerLegalEntity = new LegalEntity();
            sellerLegalEntity.setCorporateName(txtSellerName.getText());

            AddressInSpain sellerAddress = new AddressInSpain();
            sellerAddress.setAddress(txtSellerAddress.getText());
            sellerAddress.setPostCode("07600");
            sellerAddress.setTown("Palma");
            sellerAddress.setProvince("Baleares");
            sellerAddress.setCountryCode("ESP");
            sellerLegalEntity.setAddressInSpain(sellerAddress);
            sellerParty.setLegalEntity(sellerLegalEntity);

            parties.setSellerParty(sellerParty);

            // Configuración del comprador
            BuyerParty buyerParty = new BuyerParty();
            TaxIdentification buyerTaxId = new TaxIdentification();
            buyerTaxId.setPersonTypeCode("J");
            buyerTaxId.setResidenceTypeCode("R");
            buyerTaxId.setTaxIdentificationNumber(txtBuyerTaxId.getText());
            buyerParty.setTaxIdentification(buyerTaxId);

            LegalEntity buyerLegalEntity = new LegalEntity();
            buyerLegalEntity.setCorporateName(txtBuyerName.getText());

            AddressInSpain buyerAddress = new AddressInSpain();
            buyerAddress.setAddress(txtBuyerAddress.getText());
            buyerAddress.setPostCode("07600");
            buyerAddress.setTown("Mérida");
            buyerAddress.setProvince("Badajoz");
            buyerAddress.setCountryCode("ESP");
            buyerLegalEntity.setAddressInSpain(buyerAddress);
            buyerParty.setLegalEntity(buyerLegalEntity);

            parties.setBuyerParty(buyerParty);
            facturae.setParties(parties);

            // Configuración de la factura
            Invoices invoices = new Invoices();
            Invoice invoice = new Invoice();

            InvoiceHeader invoiceHeader = new InvoiceHeader();
            invoiceHeader.setInvoiceNumber(txtInvoiceNumber.getText());
            invoiceHeader.setInvoiceDocumentType("FC");
            invoiceHeader.setInvoiceClass("OO");
            invoice.setInvoiceHeader(invoiceHeader);

            // InvoiceIssueData
            InvoiceIssueData invoiceIssueData = new InvoiceIssueData();
            invoiceIssueData.setIssueDate(txtIssueDate.getText());
            invoiceIssueData.setInvoiceCurrencyCode("EUR");
            invoice.setInvoiceIssueData(invoiceIssueData);

            // Añadir todos los ítems a la factura
            Items items = new Items();
            items.setInvoiceLine(invoiceLines);
            invoice.setItems(items);

            // Añadir la factura a la lista de facturas
            invoices.setInvoice(new ArrayList<>());
            invoices.getInvoice().add(invoice);
            facturae.setInvoices(invoices);

            // Marshalling (Generar XML)
            JAXBContext context = JAXBContext.newInstance(Facturae.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(facturae, new File("factura_generada.xml"));

            JOptionPane.showMessageDialog(this, "Factura generada con éxito");

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos para cantidad y precio.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            prueba frame = new prueba();
            frame.setVisible(true);
        });
    }
}
