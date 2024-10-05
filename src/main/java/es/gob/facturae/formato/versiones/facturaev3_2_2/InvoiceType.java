
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceHeader" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InvoiceHeaderType"/&gt;
 *         &lt;element name="InvoiceIssueData" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InvoiceIssueDataType"/&gt;
 *         &lt;element name="TaxesOutputs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tax" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxOutputType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaxesWithheld" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxesType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceTotals" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InvoiceTotalsType"/&gt;
 *         &lt;element name="Items" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ItemsType"/&gt;
 *         &lt;element name="PaymentDetails" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}InstallmentsType" minOccurs="0"/&gt;
 *         &lt;element name="LegalLiterals" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}LegalLiteralsType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalData" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AdditionalDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "invoiceHeader",
    "invoiceIssueData",
    "taxesOutputs",
    "taxesWithheld",
    "invoiceTotals",
    "items",
    "paymentDetails",
    "legalLiterals",
    "additionalData"
})
public class InvoiceType {

    @XmlElement(name = "InvoiceHeader", required = true)
    protected InvoiceHeaderType invoiceHeader;
    @XmlElement(name = "InvoiceIssueData", required = true)
    protected InvoiceIssueDataType invoiceIssueData;
    @XmlElement(name = "TaxesOutputs", required = true)
    protected InvoiceType.TaxesOutputs taxesOutputs;
    @XmlElement(name = "TaxesWithheld")
    protected TaxesType taxesWithheld;
    @XmlElement(name = "InvoiceTotals", required = true)
    protected InvoiceTotalsType invoiceTotals;
    @XmlElement(name = "Items", required = true)
    protected ItemsType items;
    @XmlElement(name = "PaymentDetails")
    protected InstallmentsType paymentDetails;
    @XmlElement(name = "LegalLiterals")
    protected LegalLiteralsType legalLiterals;
    @XmlElement(name = "AdditionalData")
    protected AdditionalDataType additionalData;

    /**
     * Obtiene el valor de la propiedad invoiceHeader.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public InvoiceHeaderType getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Define el valor de la propiedad invoiceHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public void setInvoiceHeader(InvoiceHeaderType value) {
        this.invoiceHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceIssueData.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIssueDataType }
     *     
     */
    public InvoiceIssueDataType getInvoiceIssueData() {
        return invoiceIssueData;
    }

    /**
     * Define el valor de la propiedad invoiceIssueData.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIssueDataType }
     *     
     */
    public void setInvoiceIssueData(InvoiceIssueDataType value) {
        this.invoiceIssueData = value;
    }

    /**
     * Obtiene el valor de la propiedad taxesOutputs.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType.TaxesOutputs }
     *     
     */
    public InvoiceType.TaxesOutputs getTaxesOutputs() {
        return taxesOutputs;
    }

    /**
     * Define el valor de la propiedad taxesOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType.TaxesOutputs }
     *     
     */
    public void setTaxesOutputs(InvoiceType.TaxesOutputs value) {
        this.taxesOutputs = value;
    }

    /**
     * Obtiene el valor de la propiedad taxesWithheld.
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxesWithheld() {
        return taxesWithheld;
    }

    /**
     * Define el valor de la propiedad taxesWithheld.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxesWithheld(TaxesType value) {
        this.taxesWithheld = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceTotals.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotalsType }
     *     
     */
    public InvoiceTotalsType getInvoiceTotals() {
        return invoiceTotals;
    }

    /**
     * Define el valor de la propiedad invoiceTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotalsType }
     *     
     */
    public void setInvoiceTotals(InvoiceTotalsType value) {
        this.invoiceTotals = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link ItemsType }
     *     
     */
    public ItemsType getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemsType }
     *     
     */
    public void setItems(ItemsType value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentsType }
     *     
     */
    public InstallmentsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Define el valor de la propiedad paymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentsType }
     *     
     */
    public void setPaymentDetails(InstallmentsType value) {
        this.paymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad legalLiterals.
     * 
     * @return
     *     possible object is
     *     {@link LegalLiteralsType }
     *     
     */
    public LegalLiteralsType getLegalLiterals() {
        return legalLiterals;
    }

    /**
     * Define el valor de la propiedad legalLiterals.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalLiteralsType }
     *     
     */
    public void setLegalLiterals(LegalLiteralsType value) {
        this.legalLiterals = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalData.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDataType }
     *     
     */
    public AdditionalDataType getAdditionalData() {
        return additionalData;
    }

    /**
     * Define el valor de la propiedad additionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDataType }
     *     
     */
    public void setAdditionalData(AdditionalDataType value) {
        this.additionalData = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Tax" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxOutputType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tax"
    })
    public static class TaxesOutputs {

        @XmlElement(name = "Tax", required = true)
        protected List<TaxOutputType> tax;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxOutputType }
         * 
         * 
         */
        public List<TaxOutputType> getTax() {
            if (tax == null) {
                tax = new ArrayList<TaxOutputType>();
            }
            return this.tax;
        }

    }

}
