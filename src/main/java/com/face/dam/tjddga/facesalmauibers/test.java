package com.face.dam.tjddga.facesalmauibers;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.ArrayList;

import com.face.dam.tjddga.JAXB.MARSHAL.*;

public class test {

    public static void main(String[] args) {
        try {
            // Crear la factura
            Facturae facturae = new Facturae();

            // Configuración del FileHeader
            FileHeader fileHeader = new FileHeader();
            fileHeader.setSchemaVersion("3.2.2");
            fileHeader.setModality("I");
            fileHeader.setInvoiceIssuerType("EM");

            // Configuración del Batch
            Batch batch = new Batch();
            batch.setBatchIdentifier("A80907397SMP008166239");
            batch.setInvoicesCount(1);

            TotalAmount totalInvoicesAmount = new TotalAmount();
            totalInvoicesAmount.setTotalAmount(2420.00);
            batch.setTotalInvoicesAmount(totalInvoicesAmount);

            TotalAmount totalOutstandingAmount = new TotalAmount();
            totalOutstandingAmount.setTotalAmount(2420.00);
            batch.setTotalOutstandingAmount(totalOutstandingAmount);

            TotalAmount totalExecutableAmount = new TotalAmount();
            totalExecutableAmount.setTotalAmount(2420.00);
            batch.setTotalExecutableAmount(totalExecutableAmount);

            batch.setInvoiceCurrencyCode("EUR");
            fileHeader.setBatch(batch);
            facturae.setFileHeader(fileHeader);

            // Configuración de las Parties
            Parties parties = new Parties();

            // SellerParty
            SellerParty sellerParty = new SellerParty();
            TaxIdentification sellerTaxId = new TaxIdentification();
            sellerTaxId.setPersonTypeCode("J");
            sellerTaxId.setResidenceTypeCode("R");
            sellerTaxId.setTaxIdentificationNumber("Q0000000J");
            sellerParty.setTaxIdentification(sellerTaxId);

            LegalEntity sellerLegalEntity = new LegalEntity();
            sellerLegalEntity.setCorporateName("Nestor Soriano");

            RegistrationData sellerRegistrationData = new RegistrationData();
            sellerRegistrationData.setBook(0);
            sellerRegistrationData.setRegisterOfCompaniesLocation("Reg. M. de Madrid");
            sellerRegistrationData.setSheet(999999);
            sellerRegistrationData.setFolio(99);
            sellerRegistrationData.setSection(9);
            sellerRegistrationData.setVolume(9999);
            sellerLegalEntity.setRegistrationData(sellerRegistrationData);

            AddressInSpain sellerAddress = new AddressInSpain();
            sellerAddress.setAddress("Calle falsa 123");
            sellerAddress.setPostCode("07600");
            sellerAddress.setTown("Palma");
            sellerAddress.setProvince("Baleares");
            sellerAddress.setCountryCode("ESP");
            sellerLegalEntity.setAddressInSpain(sellerAddress);
            sellerParty.setLegalEntity(sellerLegalEntity);

            parties.setSellerParty(sellerParty);

            // BuyerParty
            BuyerParty buyerParty = new BuyerParty();
            TaxIdentification buyerTaxId = new TaxIdentification();
            buyerTaxId.setPersonTypeCode("J");
            buyerTaxId.setResidenceTypeCode("R");
            buyerTaxId.setTaxIdentificationNumber("B00000000");
            buyerParty.setTaxIdentification(buyerTaxId);
            buyerParty.setPartyIdentification("99999999");

            // AdministrativeCentres
            AdministrativeCentres adminCentres = new AdministrativeCentres();
            AdministrativeCentre adminCentre = new AdministrativeCentre();
            adminCentre.setCentreCode("EA0009999");
            adminCentre.setRoleTypeCode("03");

            AddressInSpain adminCentreAddress = new AddressInSpain();
            adminCentreAddress.setAddress("Calle caracas, 8");
            adminCentreAddress.setPostCode("07600");
            adminCentreAddress.setTown("Mérida");
            adminCentreAddress.setProvince("Badajoz");
            adminCentreAddress.setCountryCode("ESP");
            adminCentre.setAddressInSpain(adminCentreAddress);
            adminCentre.setCentreDescription("VF000000");

            // Inicializa la lista antes de añadir
            if (adminCentres.getAdministrativeCentre() == null) {
                adminCentres.setAdministrativeCentre(new ArrayList<>());
            }
            adminCentres.getAdministrativeCentre().add(adminCentre);
            buyerParty.setAdministrativeCentres(adminCentres);

            LegalEntity buyerLegalEntity = new LegalEntity();
            buyerLegalEntity.setCorporateName("CIFP FBmoll 2DAM");
            buyerLegalEntity.setAddressInSpain(adminCentreAddress);
            buyerParty.setLegalEntity(buyerLegalEntity);

            parties.setBuyerParty(buyerParty);
            facturae.setParties(parties);

            // Configuración de las Invoices
            Invoices invoices = new Invoices();
            Invoice invoice = new Invoice();

            InvoiceHeader invoiceHeader = new InvoiceHeader();
            invoiceHeader.setInvoiceNumber("19870617");
            invoiceHeader.setInvoiceDocumentType("FC");
            invoiceHeader.setInvoiceClass("OO");
            invoice.setInvoiceHeader(invoiceHeader);

            // InvoiceIssueData
            InvoiceIssueData invoiceIssueData = new InvoiceIssueData();
            invoiceIssueData.setIssueDate("2022-06-05");
            invoiceIssueData.setInvoiceCurrencyCode("EUR");
            invoiceIssueData.setTaxCurrencyCode("EUR");
            invoiceIssueData.setLanguageName("es");
            
            invoiceIssueData.setInvoiceDescription("Esto es una factura de prueba, uwu.");
            
            
            invoice.setInvoiceIssueData(invoiceIssueData);

            // TaxesOutputs
            TaxesOutputs taxesOutputs = new TaxesOutputs();
            Tax tax = new Tax();
            tax.setTaxTypeCode("01");
            tax.setTaxRate(21.00);
            TaxableBase taxableBase = new TaxableBase();
            taxableBase.setTotalAmount(2000.00);
            tax.setTaxableBase(taxableBase);

            TaxAmount taxAmount = new TaxAmount();
            taxAmount.setTotalAmount(420.00);
            tax.setTaxAmount(taxAmount);

            // Inicializa la lista antes de añadir
            if (taxesOutputs.getTax() == null) {
                taxesOutputs.setTax(new ArrayList<>());
            }
            taxesOutputs.getTax().add(tax);
           
            // InvoiceTotals
            invoice.setTaxesOutputs(taxesOutputs);
            InvoiceTotals invoiceTotals = new InvoiceTotals();
            
            
            invoiceTotals.setTotalGrossAmount("2420.00"); // Total bruto
            invoiceTotals.setTotalGrossAmountBeforeTaxes("2000.00"); // Total bruto antes de impuestos
            invoiceTotals.setTotalTaxOutputs("420.00"); // Total de impuestos
            invoiceTotals.setInvoiceTotal("2000.00"); // Establecer el valor correspondiente
            invoiceTotals.setTotalOutstandingAmount("2420.00"); // Total a pagar
            invoiceTotals.setTotalTaxesWithheld("50");
            invoiceTotals.setTotalExecutableAmount(2420.00); // Total ejecutable
            invoice.setInvoiceTotals(invoiceTotals);

            // Items
            Items items = new Items();

            // Primer ítem
            InvoiceLine invoiceLine1 = new InvoiceLine();
            invoiceLine1.setIssuerContractReference("123456789");
            invoiceLine1.setFileReference("NUMREFxx");
            invoiceLine1.setItemDescription("Ensaimada gigantesca");
            invoiceLine1.setQuantity(1);
            invoiceLine1.setUnitPriceWithoutTax(2000.00); // Precio unitario sin impuestos
            invoiceLine1.setTotalCost(2000.00); // Costo total
            invoiceLine1.setGrossAmount(2420.00); // Monto bruto
            invoiceLine1.setTaxesOutputs(taxesOutputs); // Usar la variable de taxesOutputs

            LineItemPeriod lineItemPeriod1 = new LineItemPeriod();
            lineItemPeriod1.setStartDate("2022-06-05");
            lineItemPeriod1.setEndDate("2023-06-05");
            invoiceLine1.setLineItemPeriod(lineItemPeriod1);

            // Inicializa la lista antes de añadir
            if (items.getInvoiceLine() == null) {
                items.setInvoiceLine(new ArrayList<>());
            }
            items.getInvoiceLine().add(invoiceLine1);

            // Segundo ítem
            InvoiceLine invoiceLine2 = new InvoiceLine();
            invoiceLine2.setIssuerContractReference("987654321");
            invoiceLine2.setFileReference("NUMREFyy");
            invoiceLine2.setItemDescription("Chocolate con churros");
            invoiceLine2.setQuantity(1);
            invoiceLine2.setUnitPriceWithoutTax(500.00); // Precio unitario sin impuestos
            invoiceLine2.setTotalCost(500.00); // Costo total
            invoiceLine2.setGrossAmount(605.00); // Monto bruto
            invoiceLine2.setTaxesOutputs(taxesOutputs); // Usar la variable de taxesOutputs

            LineItemPeriod lineItemPeriod2 = new LineItemPeriod();
            lineItemPeriod2.setStartDate("2022-06-05");
            lineItemPeriod2.setEndDate("2023-06-05");
            invoiceLine2.setLineItemPeriod(lineItemPeriod2);

            // Añadir el segundo ítem a la lista
            items.getInvoiceLine().add(invoiceLine2);

            // Asignar items a la factura
            invoice.setItems(items);


            // PaymentDetails
            PaymentDetails paymentDetails = new PaymentDetails();

            // Crear objeto Installment
            Installment installment = new Installment();
            installment.setInstallmentDueDate("2022-06-05");
            installment.setInstallmentAmount("2420.00"); // Asegúrate de que sea un String con dos decimales
            installment.setPaymentMeans("04"); // Usa el código de pago como String

            // Crear objeto AccountToBeCredited
            AccountToBeCredited accountToBeCredited = new AccountToBeCredited();
            accountToBeCredited.setIban("ES1000491500022910080785");
            installment.setAccountToBeCredited(accountToBeCredited);

            // Añadir el installment al PaymentDetails
            if (paymentDetails.getInstallments() == null) {
                paymentDetails.setInstallments(new ArrayList<>());
            }
            paymentDetails.getInstallments().add(installment);

            // Inicializa la lista de installments antes de añadir
            if (paymentDetails.getInstallments() == null) {
                paymentDetails.setInstallments(new ArrayList<>());
            }
            paymentDetails.getInstallments().add(installment);
            invoice.setPaymentDetails(paymentDetails);

            // AdditionalData
            AdditionalData additionalData = new AdditionalData();
            additionalData.setInvoiceAdditionalInformation("Nerf BBKarin");
            invoice.setAdditionalData(additionalData);

            // Añadir la factura a la lista de Invoices
            if (invoices.getInvoice() == null) {
                invoices.setInvoice(new ArrayList<>());
            }
            invoices.getInvoice().add(invoice);
            facturae.setInvoices(invoices);

            // Marshalling
            JAXBContext context = JAXBContext.newInstance(Facturae.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(facturae, new File("factura2.xml"));


        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
