
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttachmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachmentCompressionAlgorithm" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AttachmentCompressionAlgorithmType" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFormat" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AttachmentFormatType"/&gt;
 *         &lt;element name="AttachmentEncoding" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AttachmentEncodingType" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentDescription" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "attachmentCompressionAlgorithm",
    "attachmentFormat",
    "attachmentEncoding",
    "attachmentDescription",
    "attachmentData"
})
public class AttachmentType {

    @XmlElement(name = "AttachmentCompressionAlgorithm")
    @XmlSchemaType(name = "string")
    protected AttachmentCompressionAlgorithmType attachmentCompressionAlgorithm;
    @XmlElement(name = "AttachmentFormat", required = true)
    @XmlSchemaType(name = "string")
    protected AttachmentFormatType attachmentFormat;
    @XmlElement(name = "AttachmentEncoding")
    @XmlSchemaType(name = "string")
    protected AttachmentEncodingType attachmentEncoding;
    @XmlElement(name = "AttachmentDescription")
    protected String attachmentDescription;
    @XmlElement(name = "AttachmentData", required = true)
    protected String attachmentData;

    /**
     * Obtiene el valor de la propiedad attachmentCompressionAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentCompressionAlgorithmType }
     *     
     */
    public AttachmentCompressionAlgorithmType getAttachmentCompressionAlgorithm() {
        return attachmentCompressionAlgorithm;
    }

    /**
     * Define el valor de la propiedad attachmentCompressionAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentCompressionAlgorithmType }
     *     
     */
    public void setAttachmentCompressionAlgorithm(AttachmentCompressionAlgorithmType value) {
        this.attachmentCompressionAlgorithm = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentFormat.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentFormatType }
     *     
     */
    public AttachmentFormatType getAttachmentFormat() {
        return attachmentFormat;
    }

    /**
     * Define el valor de la propiedad attachmentFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentFormatType }
     *     
     */
    public void setAttachmentFormat(AttachmentFormatType value) {
        this.attachmentFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentEncoding.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentEncodingType }
     *     
     */
    public AttachmentEncodingType getAttachmentEncoding() {
        return attachmentEncoding;
    }

    /**
     * Define el valor de la propiedad attachmentEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentEncodingType }
     *     
     */
    public void setAttachmentEncoding(AttachmentEncodingType value) {
        this.attachmentEncoding = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Define el valor de la propiedad attachmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentDescription(String value) {
        this.attachmentDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentData() {
        return attachmentData;
    }

    /**
     * Define el valor de la propiedad attachmentData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentData(String value) {
        this.attachmentData = value;
    }

}
