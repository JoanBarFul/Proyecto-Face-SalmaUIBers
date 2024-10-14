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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"taxTypeCode", "taxRate", "taxableBase", "taxAmount"})
public class Tax {
    private String taxTypeCode;
    private double taxRate;
    private TaxableBase taxableBase; // Debe ser de tipo TaxableBase
    private TaxAmount taxAmount;

    @XmlElement(name = "TaxTypeCode")
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    public void setTaxTypeCode(String taxTypeCode) {
        this.taxTypeCode = taxTypeCode;
    }

    @XmlElement(name = "TaxRate")
    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @XmlElement(name = "TaxableBase")
    public TaxableBase getTaxableBase() {
        return taxableBase;
    }

    public void setTaxableBase(TaxableBase taxableBase) {
        this.taxableBase = taxableBase; // Asegúrate de que este método esté definido así
    }

    @XmlElement(name = "TaxAmount")
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(TaxAmount taxAmount) {
        this.taxAmount = taxAmount;
    }
}

