
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReimbursableExpensesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReimbursableExpensesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReimbursableExpensesSellerParty" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursableExpensesBuyerParty" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceSeriesCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursableExpensesAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReimbursableExpensesType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "reimbursableExpensesSellerParty",
    "reimbursableExpensesBuyerParty",
    "issueDate",
    "invoiceNumber",
    "invoiceSeriesCode",
    "reimbursableExpensesAmount"
})
public class ReimbursableExpensesType {

    @XmlElement(name = "ReimbursableExpensesSellerParty")
    protected TaxIdentificationType reimbursableExpensesSellerParty;
    @XmlElement(name = "ReimbursableExpensesBuyerParty")
    protected TaxIdentificationType reimbursableExpensesBuyerParty;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceSeriesCode")
    protected String invoiceSeriesCode;
    @XmlElement(name = "ReimbursableExpensesAmount")
    protected double reimbursableExpensesAmount;

    /**
     * Obtiene el valor de la propiedad reimbursableExpensesSellerParty.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationType }
     *     
     */
    public TaxIdentificationType getReimbursableExpensesSellerParty() {
        return reimbursableExpensesSellerParty;
    }

    /**
     * Define el valor de la propiedad reimbursableExpensesSellerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationType }
     *     
     */
    public void setReimbursableExpensesSellerParty(TaxIdentificationType value) {
        this.reimbursableExpensesSellerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad reimbursableExpensesBuyerParty.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationType }
     *     
     */
    public TaxIdentificationType getReimbursableExpensesBuyerParty() {
        return reimbursableExpensesBuyerParty;
    }

    /**
     * Define el valor de la propiedad reimbursableExpensesBuyerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationType }
     *     
     */
    public void setReimbursableExpensesBuyerParty(TaxIdentificationType value) {
        this.reimbursableExpensesBuyerParty = value;
    }

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
     * Obtiene el valor de la propiedad reimbursableExpensesAmount.
     * 
     */
    public double getReimbursableExpensesAmount() {
        return reimbursableExpensesAmount;
    }

    /**
     * Define el valor de la propiedad reimbursableExpensesAmount.
     * 
     */
    public void setReimbursableExpensesAmount(double value) {
        this.reimbursableExpensesAmount = value;
    }

}
