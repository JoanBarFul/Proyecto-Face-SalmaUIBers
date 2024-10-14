package MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {
        "batchIdentifier",
        "invoicesCount",
        "totalInvoicesAmount",
        "totalOutstandingAmount",
        "totalExecutableAmount",
        "invoiceCurrencyCode"
})
public class Batch {
    private String batchIdentifier;
    private int invoicesCount;
    private TotalAmount totalInvoicesAmount;
    private TotalAmount totalOutstandingAmount;
    private TotalAmount totalExecutableAmount;
    private String invoiceCurrencyCode;

    @XmlElement(name = "BatchIdentifier")
    public String getBatchIdentifier() {
        return batchIdentifier;
    }

    public void setBatchIdentifier(String batchIdentifier) {
        this.batchIdentifier = batchIdentifier;
    }

    @XmlElement(name = "InvoicesCount")
    public int getInvoicesCount() {
        return invoicesCount;
    }

    public void setInvoicesCount(int invoicesCount) {
        this.invoicesCount = invoicesCount;
    }

    @XmlElement(name = "TotalInvoicesAmount")
    public TotalAmount getTotalInvoicesAmount() {
        return totalInvoicesAmount;
    }

    public void setTotalInvoicesAmount(TotalAmount totalInvoicesAmount) {
        this.totalInvoicesAmount = totalInvoicesAmount;
    }

    @XmlElement(name = "TotalOutstandingAmount")
    public TotalAmount getTotalOutstandingAmount() {
        return totalOutstandingAmount;
    }

    public void setTotalOutstandingAmount(TotalAmount totalOutstandingAmount) {
        this.totalOutstandingAmount = totalOutstandingAmount;
    }

    @XmlElement(name = "TotalExecutableAmount")
    public TotalAmount getTotalExecutableAmount() {
        return totalExecutableAmount;
    }

    public void setTotalExecutableAmount(TotalAmount totalExecutableAmount) {
        this.totalExecutableAmount = totalExecutableAmount;
    }

    @XmlElement(name = "InvoiceCurrencyCode")
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }
}
