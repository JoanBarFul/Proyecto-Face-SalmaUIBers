
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChargeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChargeReason" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/&gt;
 *         &lt;element name="ChargeRate" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="ChargeAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "chargeReason",
    "chargeRate",
    "chargeAmount"
})
public class ChargeType {

    @XmlElement(name = "ChargeReason", required = true)
    protected String chargeReason;
    @XmlElement(name = "ChargeRate")
    protected Double chargeRate;
    @XmlElement(name = "ChargeAmount")
    protected double chargeAmount;

    /**
     * Obtiene el valor de la propiedad chargeReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeReason() {
        return chargeReason;
    }

    /**
     * Define el valor de la propiedad chargeReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeReason(String value) {
        this.chargeReason = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChargeRate() {
        return chargeRate;
    }

    /**
     * Define el valor de la propiedad chargeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChargeRate(Double value) {
        this.chargeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeAmount.
     * 
     */
    public double getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Define el valor de la propiedad chargeAmount.
     * 
     */
    public void setChargeAmount(double value) {
        this.chargeAmount = value;
    }

}
