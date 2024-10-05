
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DiscountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DiscountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountReason" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/&gt;
 *         &lt;element name="DiscountRate" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "discountReason",
    "discountRate",
    "discountAmount"
})
public class DiscountType {

    @XmlElement(name = "DiscountReason", required = true)
    protected String discountReason;
    @XmlElement(name = "DiscountRate")
    protected Double discountRate;
    @XmlElement(name = "DiscountAmount")
    protected double discountAmount;

    /**
     * Obtiene el valor de la propiedad discountReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountReason() {
        return discountReason;
    }

    /**
     * Define el valor de la propiedad discountReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountReason(String value) {
        this.discountReason = value;
    }

    /**
     * Obtiene el valor de la propiedad discountRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountRate() {
        return discountRate;
    }

    /**
     * Define el valor de la propiedad discountRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountRate(Double value) {
        this.discountRate = value;
    }

    /**
     * Obtiene el valor de la propiedad discountAmount.
     * 
     */
    public double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define el valor de la propiedad discountAmount.
     * 
     */
    public void setDiscountAmount(double value) {
        this.discountAmount = value;
    }

}
