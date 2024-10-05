
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BatchType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BatchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BatchIdentifier" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax70Type"/&gt;
 *         &lt;element name="InvoicesCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TotalInvoicesAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType"/&gt;
 *         &lt;element name="TotalOutstandingAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType"/&gt;
 *         &lt;element name="TotalExecutableAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountType"/&gt;
 *         &lt;element name="InvoiceCurrencyCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}CurrencyCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "batchIdentifier",
    "invoicesCount",
    "totalInvoicesAmount",
    "totalOutstandingAmount",
    "totalExecutableAmount",
    "invoiceCurrencyCode"
})
public class BatchType {

    @XmlElement(name = "BatchIdentifier", required = true)
    protected String batchIdentifier;
    @XmlElement(name = "InvoicesCount")
    protected long invoicesCount;
    @XmlElement(name = "TotalInvoicesAmount", required = true)
    protected AmountType totalInvoicesAmount;
    @XmlElement(name = "TotalOutstandingAmount", required = true)
    protected AmountType totalOutstandingAmount;
    @XmlElement(name = "TotalExecutableAmount", required = true)
    protected AmountType totalExecutableAmount;
    @XmlElement(name = "InvoiceCurrencyCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType invoiceCurrencyCode;

    /**
     * Obtiene el valor de la propiedad batchIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchIdentifier() {
        return batchIdentifier;
    }

    /**
     * Define el valor de la propiedad batchIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchIdentifier(String value) {
        this.batchIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicesCount.
     * 
     */
    public long getInvoicesCount() {
        return invoicesCount;
    }

    /**
     * Define el valor de la propiedad invoicesCount.
     * 
     */
    public void setInvoicesCount(long value) {
        this.invoicesCount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalInvoicesAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalInvoicesAmount() {
        return totalInvoicesAmount;
    }

    /**
     * Define el valor de la propiedad totalInvoicesAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalInvoicesAmount(AmountType value) {
        this.totalInvoicesAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOutstandingAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOutstandingAmount() {
        return totalOutstandingAmount;
    }

    /**
     * Define el valor de la propiedad totalOutstandingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalOutstandingAmount(AmountType value) {
        this.totalOutstandingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExecutableAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalExecutableAmount() {
        return totalExecutableAmount;
    }

    /**
     * Define el valor de la propiedad totalExecutableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalExecutableAmount(AmountType value) {
        this.totalExecutableAmount = value;
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

}
