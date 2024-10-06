package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {
    "invoiceHeader",
    "invoiceIssueData",
    "taxesOutputs",
    "invoiceTotals",
    "items",
    "paymentDetails",
    "additionalData"
})
public class Invoice {
    private InvoiceHeader invoiceHeader;
    private InvoiceIssueData invoiceIssueData;
    private TaxesOutputs taxesOutputs;
    private InvoiceTotals invoiceTotals;
    private Items items;
    private PaymentDetails paymentDetails;
    private AdditionalData additionalData;

    @XmlElement(name = "InvoiceHeader")
    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }

    @XmlElement(name = "InvoiceIssueData")
    public InvoiceIssueData getInvoiceIssueData() {
        return invoiceIssueData;
    }

    public void setInvoiceIssueData(InvoiceIssueData invoiceIssueData) {
        this.invoiceIssueData = invoiceIssueData;
    }

    @XmlElement(name = "TaxesOutputs")
    public TaxesOutputs getTaxesOutputs() {
        return taxesOutputs;
    }

    public void setTaxesOutputs(TaxesOutputs taxesOutputs) {
        this.taxesOutputs = taxesOutputs;
    }

    @XmlElement(name = "InvoiceTotals")
    public InvoiceTotals getInvoiceTotals() {
        return invoiceTotals;
    }

    public void setInvoiceTotals(InvoiceTotals invoiceTotals) {
        this.invoiceTotals = invoiceTotals;
    }

    @XmlElement(name = "Items")
    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @XmlElement(name = "PaymentDetails")
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @XmlElement(name = "AdditionalData")
    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
    }
}
