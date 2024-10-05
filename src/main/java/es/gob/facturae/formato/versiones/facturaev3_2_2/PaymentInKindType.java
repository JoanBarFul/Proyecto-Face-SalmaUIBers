
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentInKindType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentInKindType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentInKindReason" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/&gt;
 *         &lt;element name="PaymentInKindAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInKindType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "paymentInKindReason",
    "paymentInKindAmount"
})
public class PaymentInKindType {

    @XmlElement(name = "PaymentInKindReason", required = true)
    protected String paymentInKindReason;
    @XmlElement(name = "PaymentInKindAmount")
    protected double paymentInKindAmount;

    /**
     * Obtiene el valor de la propiedad paymentInKindReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInKindReason() {
        return paymentInKindReason;
    }

    /**
     * Define el valor de la propiedad paymentInKindReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInKindReason(String value) {
        this.paymentInKindReason = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInKindAmount.
     * 
     */
    public double getPaymentInKindAmount() {
        return paymentInKindAmount;
    }

    /**
     * Define el valor de la propiedad paymentInKindAmount.
     * 
     */
    public void setPaymentInKindAmount(double value) {
        this.paymentInKindAmount = value;
    }

}
