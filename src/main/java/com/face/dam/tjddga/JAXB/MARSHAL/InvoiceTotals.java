package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {
        "totalGrossAmount", 
        "totalGrossAmountBeforeTaxes",
        "totalTaxOutputs", 
        "totalTaxesWithheld",
        "invoiceTotal", // Añadido
        "totalOutstandingAmount", 
        "totalExecutableAmount"
})
public class InvoiceTotals {
    private String totalGrossAmount; 
    private String totalGrossAmountBeforeTaxes; 
    private String totalTaxOutputs; 
    private String totalTaxesWithheld; // Este se mantiene
    private String invoiceTotal; // Este se añade
    private String totalOutstandingAmount; 
    private Double totalExecutableAmount; 

    @XmlElement(name = "TotalGrossAmount") 
    public String getTotalGrossAmount() {
        return totalGrossAmount;
    }

    public void setTotalGrossAmount(String totalGrossAmount) {
        this.totalGrossAmount = totalGrossAmount;
    }

    @XmlElement(name = "TotalGrossAmountBeforeTaxes") 
    public String getTotalGrossAmountBeforeTaxes() {
        return totalGrossAmountBeforeTaxes;
    }

    public void setTotalGrossAmountBeforeTaxes(String totalGrossAmountBeforeTaxes) {
        this.totalGrossAmountBeforeTaxes = totalGrossAmountBeforeTaxes;
    }

    @XmlElement(name = "TotalTaxOutputs") 
    public String getTotalTaxOutputs() {
        return totalTaxOutputs;
    }

    public void setTotalTaxOutputs(String totalTaxOutputs) {
        this.totalTaxOutputs = totalTaxOutputs;
    }

    @XmlElement(name = "TotalTaxesWithheld") // Se mantiene
    public String getTotalTaxesWithheld() {
        return totalTaxesWithheld;
    }

    public void setTotalTaxesWithheld(String totalTaxesWithheld) {
        this.totalTaxesWithheld = totalTaxesWithheld;
    }

    @XmlElement(name = "InvoiceTotal") // Añadido
    public String getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(String invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    @XmlElement(name = "TotalOutstandingAmount") 
    public String getTotalOutstandingAmount() {
        return totalOutstandingAmount;
    }

    public void setTotalOutstandingAmount(String totalOutstandingAmount) {
        this.totalOutstandingAmount = totalOutstandingAmount;
    }

    @XmlElement(name = "TotalExecutableAmount") 
    public Double getTotalExecutableAmount() {
        return totalExecutableAmount;
    }

    public void setTotalExecutableAmount(Double totalExecutableAmount) {
        this.totalExecutableAmount = totalExecutableAmount;
    }
}
