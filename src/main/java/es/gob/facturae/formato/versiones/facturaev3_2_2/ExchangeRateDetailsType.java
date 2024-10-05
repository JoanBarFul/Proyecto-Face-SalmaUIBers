
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExchangeRateDetailsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="ExchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateDetailsType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "exchangeRate",
    "exchangeRateDate"
})
public class ExchangeRateDetailsType {

    @XmlElement(name = "ExchangeRate")
    protected double exchangeRate;
    @XmlElement(name = "ExchangeRateDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeRateDate;

    /**
     * Obtiene el valor de la propiedad exchangeRate.
     * 
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Define el valor de la propiedad exchangeRate.
     * 
     */
    public void setExchangeRate(double value) {
        this.exchangeRate = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Define el valor de la propiedad exchangeRateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDate(XMLGregorianCalendar value) {
        this.exchangeRateDate = value;
    }

}
