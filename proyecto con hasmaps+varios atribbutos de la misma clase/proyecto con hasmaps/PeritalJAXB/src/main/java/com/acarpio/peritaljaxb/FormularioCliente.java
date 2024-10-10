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
        gbc.insets = new Insets(10, 10, 10, 10);
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
        ventana.setSize(400, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        // Panel principal con border y padding
        JPanel panelAgregar = new JPanel();
        panelAgregar.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelAgregar.setLayout(new GridLayout(8, 2, 10, 10));

        // Crear campos para ingresar nombre, apellido y otros datos
        JLabel labelNombreCliente = new JLabel("Nombre:");
        JTextField nombreCliente = new JTextField();

        JLabel labelApellidosCliente = new JLabel("Apellidos:");
        JTextField apellidosCliente = new JTextField();

        JLabel labelClienteID = new JLabel("ClienteID:");
        JTextField ClienteID = new JTextField();

        JLabel labelDirecciones = new JLabel("Dirección:");
        JTextField Direcciones = new JTextField();

        JLabel labelDirecciones2 = new JLabel("Dirección (2):");
        JTextField Direcciones2 = new JTextField();

        JLabel labelVarios1 = new JLabel("Dato adicional 1:");
        JTextField Varios1 = new JTextField();

        JLabel labelVarios2 = new JLabel("Dato adicional 2:");
        JTextField Varios2 = new JTextField();

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
        panelAgregar.add(labelNombreCliente);
        panelAgregar.add(nombreCliente);
        panelAgregar.add(labelApellidosCliente);
        panelAgregar.add(apellidosCliente);
        panelAgregar.add(labelClienteID);
        panelAgregar.add(ClienteID);
        panelAgregar.add(labelDirecciones);
        panelAgregar.add(Direcciones);
        panelAgregar.add(labelDirecciones2);
        panelAgregar.add(Direcciones2);
        panelAgregar.add(labelVarios1);
        panelAgregar.add(Varios1);
        panelAgregar.add(labelVarios2);
        panelAgregar.add(Varios2);

        // Panel para el botón de confirmación
        JPanel panelBoton = new JPanel();
        panelBoton.add(botonConfirmar);

        // Añadir el panel con los campos y el panel con el botón a la ventana
        ventana.add(panelAgregar, BorderLayout.CENTER);
        ventana.add(panelBoton, BorderLayout.SOUTH);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }

    // Método para actualizar el JComboBox cuando se añade un nuevo cliente
    private void actualizarComboBoxClientes() {
        comboBoxClientes.removeAllItems();
        for (String cliente : listaClientes) {
            comboBoxClientes.addItem(cliente);
        }
    }

    // ----------------------------- DIEGO -------------------------------------

    public static void main(String[] args) {
        FormularioCliente formulario = new FormularioCliente();
        formulario.setVisible(true);
    }
}
