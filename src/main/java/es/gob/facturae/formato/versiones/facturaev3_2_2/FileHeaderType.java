
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FileHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SchemaVersion" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}SchemaVersionType"/&gt;
 *         &lt;element name="Modality" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ModalityType"/&gt;
 *         &lt;element name="InvoiceIssuerType" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InvoiceIssuerTypeType"/&gt;
 *         &lt;element name="ThirdParty" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ThirdPartyType" minOccurs="0"/&gt;
 *         &lt;element name="Batch" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}BatchType"/&gt;
 *         &lt;element name="FactoringAssignmentData" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}FactoringAssignmentDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileHeaderType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "schemaVersion",
    "modality",
    "invoiceIssuerType",
    "thirdParty",
    "batch",
    "factoringAssignmentData"
})
public class FileHeaderType {

    @XmlElement(name = "SchemaVersion", required = true, defaultValue = "3.2.2")
    protected String schemaVersion;
    @XmlElement(name = "Modality", required = true)
    @XmlSchemaType(name = "string")
    protected ModalityType modality;
    @XmlElement(name = "InvoiceIssuerType", required = true)
    @XmlSchemaType(name = "string")
    protected InvoiceIssuerTypeType invoiceIssuerType;
    @XmlElement(name = "ThirdParty")
    protected ThirdPartyType thirdParty;
    @XmlElement(name = "Batch", required = true)
    protected BatchType batch;
    @XmlElement(name = "FactoringAssignmentData")
    protected FactoringAssignmentDataType factoringAssignmentData;

    /**
     * Obtiene el valor de la propiedad schemaVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Define el valor de la propiedad schemaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad modality.
     * 
     * @return
     *     possible object is
     *     {@link ModalityType }
     *     
     */
    public ModalityType getModality() {
        return modality;
    }

    /**
     * Define el valor de la propiedad modality.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalityType }
     *     
     */
    public void setModality(ModalityType value) {
        this.modality = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceIssuerType.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIssuerTypeType }
     *     
     */
    public InvoiceIssuerTypeType getInvoiceIssuerType() {
        return invoiceIssuerType;
    }

    /**
     * Define el valor de la propiedad invoiceIssuerType.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIssuerTypeType }
     *     
     */
    public void setInvoiceIssuerType(InvoiceIssuerTypeType value) {
        this.invoiceIssuerType = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdParty.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyType }
     *     
     */
    public ThirdPartyType getThirdParty() {
        return thirdParty;
    }

    /**
     * Define el valor de la propiedad thirdParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyType }
     *     
     */
    public void setThirdParty(ThirdPartyType value) {
        this.thirdParty = value;
    }

    /**
     * Obtiene el valor de la propiedad batch.
     * 
     * @return
     *     possible object is
     *     {@link BatchType }
     *     
     */
    public BatchType getBatch() {
        return batch;
    }

    /**
     * Define el valor de la propiedad batch.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchType }
     *     
     */
    public void setBatch(BatchType value) {
        this.batch = value;
    }

    /**
     * Obtiene el valor de la propiedad factoringAssignmentData.
     * 
     * @return
     *     possible object is
     *     {@link FactoringAssignmentDataType }
     *     
     */
    public FactoringAssignmentDataType getFactoringAssignmentData() {
        return factoringAssignmentData;
    }

    /**
     * Define el valor de la propiedad factoringAssignmentData.
     * 
     * @param value
     *     allowed object is
     *     {@link FactoringAssignmentDataType }
     *     
     */
    public void setFactoringAssignmentData(FactoringAssignmentDataType value) {
        this.factoringAssignmentData = value;
    }

}
