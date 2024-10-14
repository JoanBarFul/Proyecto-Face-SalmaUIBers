/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */

@XmlType(propOrder = {"issueDate", "invoiceCurrencyCode", "taxCurrencyCode", "languageName", "invoiceDescription"})
public class InvoiceIssueData {
    private String issueDate;
    private String invoiceCurrencyCode;
    private String taxCurrencyCode;
    private String languageName;
    private String invoiceDescription;
    @XmlElement(name = "IssueDate")
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @XmlElement(name = "InvoiceCurrencyCode")
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }

    @XmlElement(name = "TaxCurrencyCode")
    public String getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    public void setTaxCurrencyCode(String taxCurrencyCode) {
        this.taxCurrencyCode = taxCurrencyCode;
    }

    @XmlElement(name = "LanguageName")
    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
    
    // Descripción de la factura
    
    @XmlElement(name = "InvoiceDescription")
    public String getInvoiceDescription() {
        return this.invoiceDescription;
    }
    
    public void setInvoiceDescription(String value) {
        this.invoiceDescription = value;
    } 
    
}
