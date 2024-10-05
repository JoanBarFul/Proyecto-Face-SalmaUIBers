
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxOutputType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxTypeCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxTypeCodeType"/&gt;
 *         &lt;element name="TaxRate" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TaxableBase" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialTaxableBase" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialTaxAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="EquivalenceSurcharge" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleTwoDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="EquivalenceSurchargeAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxOutputType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "taxTypeCode",
    "taxRate",
    "taxableBase",
    "taxAmount",
    "specialTaxableBase",
    "specialTaxAmount",
    "equivalenceSurcharge",
    "equivalenceSurchargeAmount"
})
@XmlSeeAlso({
    es.gob.facturae.formato.versiones.facturaev3_2_2.InvoiceLineType.TaxesOutputs.Tax.class
})
public class TaxOutputType {

    @XmlElement(name = "TaxTypeCode", required = true)
    protected String taxTypeCode;
    @XmlElement(name = "TaxRate")
    protected double taxRate;
    @XmlElement(name = "TaxableBase", required = true)
    protected AmountType taxableBase;
    @XmlElement(name = "TaxAmount")
    protected AmountType taxAmount;
    @XmlElement(name = "SpecialTaxableBase")
    protected AmountType specialTaxableBase;
    @XmlElement(name = "SpecialTaxAmount")
    protected AmountType specialTaxAmount;
    @XmlElement(name = "EquivalenceSurcharge")
    protected Double equivalenceSurcharge;
    @XmlElement(name = "EquivalenceSurchargeAmount")
    protected AmountType equivalenceSurchargeAmount;

    /**
     * Obtiene el valor de la propiedad taxTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Define el valor de la propiedad taxTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTypeCode(String value) {
        this.taxTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRate.
     * 
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Define el valor de la propiedad taxRate.
     * 
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxableBase.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxableBase() {
        return taxableBase;
    }

    /**
     * Define el valor de la propiedad taxableBase.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxableBase(AmountType value) {
        this.taxableBase = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxAmount(AmountType value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad specialTaxableBase.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialTaxableBase() {
        return specialTaxableBase;
    }

    /**
     * Define el valor de la propiedad specialTaxableBase.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialTaxableBase(AmountType value) {
        this.specialTaxableBase = value;
    }

    /**
     * Obtiene el valor de la propiedad specialTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialTaxAmount() {
        return specialTaxAmount;
    }

    /**
     * Define el valor de la propiedad specialTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialTaxAmount(AmountType value) {
        this.specialTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalenceSurcharge.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEquivalenceSurcharge() {
        return equivalenceSurcharge;
    }

    /**
     * Define el valor de la propiedad equivalenceSurcharge.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEquivalenceSurcharge(Double value) {
        this.equivalenceSurcharge = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalenceSurchargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquivalenceSurchargeAmount() {
        return equivalenceSurchargeAmount;
    }

    /**
     * Define el valor de la propiedad equivalenceSurchargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEquivalenceSurchargeAmount(AmountType value) {
        this.equivalenceSurchargeAmount = value;
    }

}
