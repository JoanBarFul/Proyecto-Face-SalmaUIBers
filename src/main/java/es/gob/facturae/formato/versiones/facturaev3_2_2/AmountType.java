
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AmountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="EquivalentInEuros" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleTwoDecimalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "totalAmount",
    "equivalentInEuros"
})
public class AmountType {

    @XmlElement(name = "TotalAmount")
    protected double totalAmount;
    @XmlElement(name = "EquivalentInEuros")
    protected Double equivalentInEuros;

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalentInEuros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEquivalentInEuros() {
        return equivalentInEuros;
    }

    /**
     * Define el valor de la propiedad equivalentInEuros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEquivalentInEuros(Double value) {
        this.equivalentInEuros = value;
    }

}
