package com.acarpio.peritaljaxb;

// Importaciones peritales
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormularioCliente extends JFrame {

    // ArrayList para almacenar los clientes
    private ArrayList<String> listaClientes = new ArrayList<>();
    private JComboBox<String> comboBoxClientes;

    public FormularioCliente() {
        setTitle("Formulario de Clientes");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 5, 10, 5); // Reducir márgenes laterales a la mitad
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta para Cliente
        JLabel labelCliente = new JLabel("Cliente:");

        // Lista de clientes. Solo va a mostrar el nombre de los clientes pero tiene que almacenar toda la información
        comboBoxClientes = new JComboBox<>(new String[0]);

        // Botón para añadir un nuevo cliente
        JButton botonAgregarCliente = new JButton("Añadir Cliente");

        // Acción del botón "Añadir Cliente" (abrir una nueva ventana)
        botonAgregarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaAgregarCliente();
            }
        });

        // Botón para enviar el formulario
        JButton botonEnviarFormulario = new JButton("Enviar Formulario");

        // Acción del botón "Enviar Formulario"
        botonEnviarFormulario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Formulario enviado con éxito.");
            }
        });

        // Añadir componentes al panel con posiciones en el GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(labelCliente, gbc);

        gbc.gridx = 1;
        panel.add(comboBoxClientes, gbc);

        gbc.gridx = 2; // Botón de nuevo cliente a la derecha
        panel.add(botonAgregarCliente, gbc);

        // Espacio vacío
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JLabel(), gbc);

        // Añadir el botón de "Enviar Formulario" abajo del todo
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(botonEnviarFormulario, gbc);

        // Añadir el panel a la ventana principal
        add(panel);
    }

    // Método para abrir la ventana de agregar un nuevo cliente
    private void ventanaAgregarCliente() {
        // Crear una nueva ventana
        JFrame ventana = new JFrame("Agregar Cliente");
        ventana.setSize(400, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        // Panel principal con border y padding
        JPanel panelAgregar = new JPanel();
        panelAgregar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panelAgregar.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Crear campos para ingresar nombre, apellido y otros datos
        JLabel labelNombreCliente = new JLabel("Nombre:");
        JTextField nombreCliente = new JTextField();
        nombreCliente.setPreferredSize(new Dimension(250, 30)); 

        JLabel labelApellidosCliente = new JLabel("Apellidos:");
        JTextField apellidosCliente = new JTextField();
        apellidosCliente.setPreferredSize(new Dimension(250, 30)); 

        JLabel labelClienteID = new JLabel("Cliente ID:");
        JTextField clienteID = new JTextField();
        clienteID.setPreferredSize(new Dimension(250, 30)); 

        JLabel labelDireccion1 = new JLabel("Dirección:");
        JLabel labelCalle1 = new JLabel("Calle:");
        JTextField calle1 = new JTextField();
        calle1.setPreferredSize(new Dimension(250, 30)); 
        
        JLabel labelCiudad1 = new JLabel("Ciudad:");
        JTextField ciudad1 = new JTextField();
        ciudad1.setPreferredSize(new Dimension(250, 30)); 
        
        JLabel labelCodigoPostal1 = new JLabel("Código Postal:");
        JTextField codigoPostal1 = new JTextField();
        codigoPostal1.setPreferredSize(new Dimension(250, 30)); 

        JLabel labelDireccion2 = new JLabel("Dirección 2:");
        JLabel labelCalle2 = new JLabel("Calle 2:");
        JTextField calle2 = new JTextField();
        calle2.setPreferredSize(new Dimension(250, 30)); 
        
        JLabel labelCiudad2 = new JLabel("Ciudad 2:");
        JTextField ciudad2 = new JTextField();
        ciudad2.setPreferredSize(new Dimension(250, 30)); 
        
        JLabel labelCodigoPostal2 = new JLabel("Código Postal 2:");
        JTextField codigoPostal2 = new JTextField();
        codigoPostal2.setPreferredSize(new Dimension(250, 30)); 

        JLabel labelVarios1 = new JLabel("Dato adicional 1:");
        JTextField varios1 = new JTextField();
        varios1.setPreferredSize(new Dimension(250, 30)); 

        JLabel labelVarios2 = new JLabel("Dato adicional 2:");
        JTextField varios2 = new JTextField();
        varios2.setPreferredSize(new Dimension(250, 30)); 

        // Botón para confirmar y agregar cliente
        JButton botonConfirmar = new JButton("Agregar");

        // Acción del botón
        botonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreCliente.getText();
                String apellido = apellidosCliente.getText();
                String nombreCompleto = nombre + " " + apellido;

                // Añadir el cliente a la lista
                listaClientes.add(nombreCompleto);

                // Actualizar el JComboBox
                actualizarComboBoxClientes();

                // Cerrar la ventana de agregar cliente
                ventana.dispose();
            }
        });

        // Añadir los componentes a la ventana de agregar cliente
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelAgregar.add(labelNombreCliente, gbc);
        gbc.gridx = 1;
        panelAgregar.add(nombreCliente, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panelAgregar.add(labelApellidosCliente, gbc);
        gbc.gridx = 1;
        panelAgregar.add(apellidosCliente, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panelAgregar.add(labelClienteID, gbc);
        gbc.gridx = 1;
        panelAgregar.add(clienteID, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panelAgregar.add(labelDireccion1, gbc);
        gbc.gridx = 1;
        panelAgregar.add(new JLabel(), gbc); // Espacio para la siguiente línea

        gbc.gridx = 0;
        gbc.gridy = 4;
        panelAgregar.add(labelCalle1, gbc);
        gbc.gridx = 1;
        panelAgregar.add(calle1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panelAgregar.add(labelCiudad1, gbc);
        gbc.gridx = 1;
        panelAgregar.add(ciudad1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panelAgregar.add(labelCodigoPostal1, gbc);
        gbc.gridx = 1;
        panelAgregar.add(codigoPostal1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panelAgregar.add(labelDireccion2, gbc);
        gbc.gridx = 1;
        panelAgregar.add(new JLabel(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        panelAgregar.add(labelCalle2, gbc);
        gbc.gridx = 1;
        panelAgregar.add(calle2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        panelAgregar.add(labelCiudad2, gbc);
        gbc.gridx = 1;
        panelAgregar.add(ciudad2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        panelAgregar.add(labelCodigoPostal2, gbc);
        gbc.gridx = 1;
        panelAgregar.add(codigoPostal2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 11;
        panelAgregar.add(labelVarios1, gbc);
        gbc.gridx = 1;
        panelAgregar.add(varios1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 12;
        panelAgregar.add(labelVarios2, gbc);
        gbc.gridx = 1;
        panelAgregar.add(varios2, gbc);

        // Panel para el botón de confirmación
        JPanel panelBoton = new JPanel();
        panelBoton.add(botonConfirmar);
        ventana.add(panelAgregar, BorderLayout.CENTER);
        ventana.add(panelBoton, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }

    // Método para actualizar el JComboBox con los clientes añadidos
    private void actualizarComboBoxClientes() {
        comboBoxClientes.removeAllItems();
        for (String cliente : listaClientes) {
            comboBoxClientes.addItem(cliente);
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioCliente formulario = new FormularioCliente();
            formulario.setVisible(true);
        });
    }
}
