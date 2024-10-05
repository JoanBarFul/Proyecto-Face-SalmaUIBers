
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceIssueDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceIssueDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="OperationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PlaceOfIssue" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PlaceOfIssueType" minOccurs="0"/&gt;
 *         &lt;element name="InvoicingPeriod" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PeriodDates" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceCurrencyCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}CurrencyCodeType"/&gt;
 *         &lt;element name="ExchangeRateDetails" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ExchangeRateDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="TaxCurrencyCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}CurrencyCodeType"/&gt;
 *         &lt;element name="LanguageName" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}LanguageCodeType"/&gt;
 *         &lt;element name="InvoiceDescription" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverTransactionReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="FileReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverContractReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceIssueDataType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "issueDate",
    "operationDate",
    "placeOfIssue",
    "invoicingPeriod",
    "invoiceCurrencyCode",
    "exchangeRateDetails",
    "taxCurrencyCode",
    "languageName",
    "invoiceDescription",
    "receiverTransactionReference",
    "fileReference",
    "receiverContractReference"
})
public class InvoiceIssueDataType {

    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "OperationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(name = "PlaceOfIssue")
    protected PlaceOfIssueType placeOfIssue;
    @XmlElement(name = "InvoicingPeriod")
    protected PeriodDates invoicingPeriod;
    @XmlElement(name = "InvoiceCurrencyCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType invoiceCurrencyCode;
    @XmlElement(name = "ExchangeRateDetails")
    protected ExchangeRateDetailsType exchangeRateDetails;
    @XmlElement(name = "TaxCurrencyCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType taxCurrencyCode;
    @XmlElement(name = "LanguageName", required = true)
    @XmlSchemaType(name = "string")
    protected LanguageCodeType languageName;
    @XmlElement(name = "InvoiceDescription")
    protected String invoiceDescription;
    @XmlElement(name = "ReceiverTransactionReference")
    protected String receiverTransactionReference;
    @XmlElement(name = "FileReference")
    protected String fileReference;
    @XmlElement(name = "ReceiverContractReference")
    protected String receiverContractReference;

    /**
     * Obtiene el valor de la propiedad issueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad operationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Define el valor de la propiedad operationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad placeOfIssue.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfIssueType }
     *     
     */
    public PlaceOfIssueType getPlaceOfIssue() {
        return placeOfIssue;
    }

    /**
     * Define el valor de la propiedad placeOfIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfIssueType }
     *     
     */
    public void setPlaceOfIssue(PlaceOfIssueType value) {
        this.placeOfIssue = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDates }
     *     
     */
    public PeriodDates getInvoicingPeriod() {
        return invoicingPeriod;
    }

    /**
     * Define el valor de la propiedad invoicingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDates }
     *     
     */
    public void setInvoicingPeriod(PeriodDates value) {
        this.invoicingPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /**
     * Define el valor de la propiedad invoiceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setInvoiceCurrencyCode(CurrencyCodeType value) {
        this.invoiceCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRateDetails.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public ExchangeRateDetailsType getExchangeRateDetails() {
        return exchangeRateDetails;
    }

    /**
     * Define el valor de la propiedad exchangeRateDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public void setExchangeRateDetails(ExchangeRateDetailsType value) {
        this.exchangeRateDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Define el valor de la propiedad taxCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTaxCurrencyCode(CurrencyCodeType value) {
        this.taxCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad languageName.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageName() {
        return languageName;
    }

    /**
     * Define el valor de la propiedad languageName.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageName(LanguageCodeType value) {
        this.languageName = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    /**
     * Define el valor de la propiedad invoiceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDescription(String value) {
        this.invoiceDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad receiverTransactionReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverTransactionReference() {
        return receiverTransactionReference;
    }

    /**
     * Define el valor de la propiedad receiverTransactionReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverTransactionReference(String value) {
        this.receiverTransactionReference = value;
    }

    /**
     * Obtiene el valor de la propiedad fileReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReference() {
        return fileReference;
    }

    /**
     * Define el valor de la propiedad fileReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReference(String value) {
        this.fileReference = value;
    }

    /**
     * Obtiene el valor de la propiedad receiverContractReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverContractReference() {
        return receiverContractReference;
    }

    /**
     * Define el valor de la propiedad receiverContractReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverContractReference(String value) {
        this.receiverContractReference = value;
    }

}
