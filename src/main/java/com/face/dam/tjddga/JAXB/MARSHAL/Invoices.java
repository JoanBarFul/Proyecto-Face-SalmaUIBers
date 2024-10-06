    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.face.dam.tjddga.JAXB.MARSHAL;
    import jakarta.xml.bind.annotation.XmlElement;
    import jakarta.xml.bind.annotation.XmlType;
    import java.util.List;
    import java.util.ArrayList;

    /**
     *
     * @author alexc
     */

    @XmlType(propOrder = {"invoice"})
    public class Invoices {
        private List<Invoice> invoice;

        public Invoices() {
            this.invoice = new ArrayList<>(); // Inicializa la lista
        }

        @XmlElement(name = "Invoice")
        public List<Invoice> getInvoice() {
            return invoice; // Asegúrate de que devuelva la lista
        }

        public void setInvoice(List<Invoice> invoice) {
            this.invoice = invoice;
        }
    }
