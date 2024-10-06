package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"invoiceNumber", "invoiceSeriesCode", "invoiceDocumentType", "invoiceClass"}) // Agregado
public class InvoiceHeader {
    private String invoiceNumber;
    private String invoiceSeriesCode;  
    private String invoiceDocumentType; 
    private String invoiceClass; // Añadido

    @XmlElement(name = "InvoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @XmlElement(name = "InvoiceSeriesCode") 
    public String getInvoiceSeriesCode() {
        return invoiceSeriesCode;
    }

    public void setInvoiceSeriesCode(String invoiceSeriesCode) {
        this.invoiceSeriesCode = invoiceSeriesCode;
    }

    @XmlElement(name = "InvoiceDocumentType") 
    public String getInvoiceDocumentType() {
        return invoiceDocumentType;
    }

    public void setInvoiceDocumentType(String invoiceDocumentType) {
        this.invoiceDocumentType = invoiceDocumentType;
    }

    @XmlElement(name = "InvoiceClass") // Asegúrate de usar el nombre correcto según el XSD
    public String getInvoiceClass() {
        return invoiceClass;
    }

    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }
}
