
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CorrectiveType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorrectiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceSeriesCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ReasonCodeType"/&gt;
 *         &lt;element name="ReasonDescription" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ReasonDescriptionType"/&gt;
 *         &lt;element name="TaxPeriod" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PeriodDates"/&gt;
 *         &lt;element name="CorrectionMethod" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}CorrectionMethodType"/&gt;
 *         &lt;element name="CorrectionMethodDescription" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}CorrectionMethodDescriptionType"/&gt;
 *         &lt;element name="AdditionalReasonDescription" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectiveType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "invoiceNumber",
    "invoiceSeriesCode",
    "reasonCode",
    "reasonDescription",
    "taxPeriod",
    "correctionMethod",
    "correctionMethodDescription",
    "additionalReasonDescription",
    "invoiceIssueDate"
})
public class CorrectiveType {

    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceSeriesCode")
    protected String invoiceSeriesCode;
    @XmlElement(name = "ReasonCode", required = true)
    protected String reasonCode;
    @XmlElement(name = "ReasonDescription", required = true)
    @XmlSchemaType(name = "string")
    protected ReasonDescriptionType reasonDescription;
    @XmlElement(name = "TaxPeriod", required = true)
    protected PeriodDates taxPeriod;
    @XmlElement(name = "CorrectionMethod", required = true)
    protected String correctionMethod;
    @XmlElement(name = "CorrectionMethodDescription", required = true)
    @XmlSchemaType(name = "string")
    protected CorrectionMethodDescriptionType correctionMethodDescription;
    @XmlElement(name = "AdditionalReasonDescription")
    protected String additionalReasonDescription;
    @XmlElement(name = "InvoiceIssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceIssueDate;

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceSeriesCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSeriesCode() {
        return invoiceSeriesCode;
    }

    /**
     * Define el valor de la propiedad invoiceSeriesCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSeriesCode(String value) {
        this.invoiceSeriesCode = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonDescription.
     * 
     * @return
     *     possible object is
     *     {@link ReasonDescriptionType }
     *     
     */
    public ReasonDescriptionType getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Define el valor de la propiedad reasonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonDescriptionType }
     *     
     */
    public void setReasonDescription(ReasonDescriptionType value) {
        this.reasonDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad taxPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDates }
     *     
     */
    public PeriodDates getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Define el valor de la propiedad taxPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDates }
     *     
     */
    public void setTaxPeriod(PeriodDates value) {
        this.taxPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionMethod() {
        return correctionMethod;
    }

    /**
     * Define el valor de la propiedad correctionMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionMethod(String value) {
        this.correctionMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionMethodDescription.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionMethodDescriptionType }
     *     
     */
    public CorrectionMethodDescriptionType getCorrectionMethodDescription() {
        return correctionMethodDescription;
    }

    /**
     * Define el valor de la propiedad correctionMethodDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionMethodDescriptionType }
     *     
     */
    public void setCorrectionMethodDescription(CorrectionMethodDescriptionType value) {
        this.correctionMethodDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalReasonDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalReasonDescription() {
        return additionalReasonDescription;
    }

    /**
     * Define el valor de la propiedad additionalReasonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalReasonDescription(String value) {
        this.additionalReasonDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    /**
     * Define el valor de la propiedad invoiceIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceIssueDate(XMLGregorianCalendar value) {
        this.invoiceIssueDate = value;
    }

}
