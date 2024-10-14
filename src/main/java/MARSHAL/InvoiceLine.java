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




@XmlType(propOrder = {"issuerContractReference", "fileReference", "itemDescription", "quantity", "unitPriceWithoutTax", "totalCost", "grossAmount", "taxesOutputs", "lineItemPeriod"})
public class InvoiceLine {
    private String issuerContractReference;
    private String fileReference;
    private String itemDescription;
    private int quantity;
    private double unitPriceWithoutTax;
    private double totalCost;
    private double grossAmount;
    private TaxesOutputs taxesOutputs;
    private LineItemPeriod lineItemPeriod;

    @XmlElement(name = "IssuerContractReference")
    public String getIssuerContractReference() {
        return issuerContractReference;
    }

    public void setIssuerContractReference(String issuerContractReference) {
        this.issuerContractReference = issuerContractReference;
    }

    @XmlElement(name = "FileReference")
    public String getFileReference() {
        return fileReference;
    }

    public void setFileReference(String fileReference) {
        this.fileReference = fileReference;
    }

    @XmlElement(name = "ItemDescription")
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @XmlElement(name = "Quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @XmlElement(name = "UnitPriceWithoutTax")
    public double getUnitPriceWithoutTax() {
        return unitPriceWithoutTax;
    }

    public void setUnitPriceWithoutTax(double unitPriceWithoutTax) {
        this.unitPriceWithoutTax = unitPriceWithoutTax;
    }

    @XmlElement(name = "TotalCost")
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @XmlElement(name = "GrossAmount")
    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    @XmlElement(name = "TaxesOutputs")
    public TaxesOutputs getTaxesOutputs() {
        return taxesOutputs;
    }

    public void setTaxesOutputs(TaxesOutputs taxesOutputs) {
        this.taxesOutputs = taxesOutputs;
    }

    @XmlElement(name = "LineItemPeriod")
    public LineItemPeriod getLineItemPeriod() {
        return lineItemPeriod;
    }

    public void setLineItemPeriod(LineItemPeriod lineItemPeriod) {
        this.lineItemPeriod = lineItemPeriod;
    }
}

