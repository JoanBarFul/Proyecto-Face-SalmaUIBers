
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeliveryNoteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeliveryNoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryNoteNumber" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax30Type"/&gt;
 *         &lt;element name="DeliveryNoteDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryNoteType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "deliveryNoteNumber",
    "deliveryNoteDate"
})
public class DeliveryNoteType {

    @XmlElement(name = "DeliveryNoteNumber", required = true)
    protected String deliveryNoteNumber;
    @XmlElement(name = "DeliveryNoteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryNoteDate;

    /**
     * Obtiene el valor de la propiedad deliveryNoteNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNoteNumber() {
        return deliveryNoteNumber;
    }

    /**
     * Define el valor de la propiedad deliveryNoteNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNoteNumber(String value) {
        this.deliveryNoteNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryNoteDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryNoteDate() {
        return deliveryNoteDate;
    }

    /**
     * Define el valor de la propiedad deliveryNoteDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryNoteDate(XMLGregorianCalendar value) {
        this.deliveryNoteDate = value;
    }

}
