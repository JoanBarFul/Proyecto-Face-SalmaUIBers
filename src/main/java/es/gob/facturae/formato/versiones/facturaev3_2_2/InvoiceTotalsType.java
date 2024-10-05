
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceTotalsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceTotalsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalGrossAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="GeneralDiscounts" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DiscountsAndRebatesType" minOccurs="0"/&gt;
 *         &lt;element name="GeneralSurcharges" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="TotalGeneralDiscounts" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="TotalGeneralSurcharges" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="TotalGrossAmountBeforeTaxes" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TotalTaxOutputs" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TotalTaxesWithheld" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="InvoiceTotal" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="Subsidies" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}SubsidiesType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentsOnAccount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PaymentsOnAccountType" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursableExpenses" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ReimbursableExpenses" minOccurs="0"/&gt;
 *         &lt;element name="TotalFinancialExpenses" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleTwoDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="TotalOutstandingAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TotalPaymentsOnAccount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="AmountsWithheld" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AmountsWithheldType" minOccurs="0"/&gt;
 *         &lt;element name="TotalExecutableAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TotalReimbursableExpenses" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInKind" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PaymentInKindType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTotalsType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "totalGrossAmount",
    "generalDiscounts",
    "generalSurcharges",
    "totalGeneralDiscounts",
    "totalGeneralSurcharges",
    "totalGrossAmountBeforeTaxes",
    "totalTaxOutputs",
    "totalTaxesWithheld",
    "invoiceTotal",
    "subsidies",
    "paymentsOnAccount",
    "reimbursableExpenses",
    "totalFinancialExpenses",
    "totalOutstandingAmount",
    "totalPaymentsOnAccount",
    "amountsWithheld",
    "totalExecutableAmount",
    "totalReimbursableExpenses",
    "paymentInKind"
})
public class InvoiceTotalsType {

    @XmlElement(name = "TotalGrossAmount")
    protected double totalGrossAmount;
    @XmlElement(name = "GeneralDiscounts")
    protected DiscountsAndRebatesType generalDiscounts;
    @XmlElement(name = "GeneralSurcharges")
    protected ChargesType generalSurcharges;
    @XmlElement(name = "TotalGeneralDiscounts")
    protected Double totalGeneralDiscounts;
    @XmlElement(name = "TotalGeneralSurcharges")
    protected Double totalGeneralSurcharges;
    @XmlElement(name = "TotalGrossAmountBeforeTaxes")
    protected double totalGrossAmountBeforeTaxes;
    @XmlElement(name = "TotalTaxOutputs")
    protected double totalTaxOutputs;
    @XmlElement(name = "TotalTaxesWithheld")
    protected double totalTaxesWithheld;
    @XmlElement(name = "InvoiceTotal")
    protected double invoiceTotal;
    @XmlElement(name = "Subsidies")
    protected SubsidiesType subsidies;
    @XmlElement(name = "PaymentsOnAccount")
    protected PaymentsOnAccountType paymentsOnAccount;
    @XmlElement(name = "ReimbursableExpenses")
    protected ReimbursableExpenses reimbursableExpenses;
    @XmlElement(name = "TotalFinancialExpenses")
    protected Double totalFinancialExpenses;
    @XmlElement(name = "TotalOutstandingAmount")
    protected double totalOutstandingAmount;
    @XmlElement(name = "TotalPaymentsOnAccount")
    protected Double totalPaymentsOnAccount;
    @XmlElement(name = "AmountsWithheld")
    protected AmountsWithheldType amountsWithheld;
    @XmlElement(name = "TotalExecutableAmount")
    protected double totalExecutableAmount;
    @XmlElement(name = "TotalReimbursableExpenses")
    protected Double totalReimbursableExpenses;
    @XmlElement(name = "PaymentInKind")
    protected PaymentInKindType paymentInKind;

    /**
     * Obtiene el valor de la propiedad totalGrossAmount.
     * 
     */
    public double getTotalGrossAmount() {
        return totalGrossAmount;
    }

    /**
     * Define el valor de la propiedad totalGrossAmount.
     * 
     */
    public void setTotalGrossAmount(double value) {
        this.totalGrossAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad generalDiscounts.
     * 
     * @return
     *     possible object is
     *     {@link DiscountsAndRebatesType }
     *     
     */
    public DiscountsAndRebatesType getGeneralDiscounts() {
        return generalDiscounts;
    }

    /**
     * Define el valor de la propiedad generalDiscounts.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountsAndRebatesType }
     *     
     */
    public void setGeneralDiscounts(DiscountsAndRebatesType value) {
        this.generalDiscounts = value;
    }

    /**
     * Obtiene el valor de la propiedad generalSurcharges.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getGeneralSurcharges() {
        return generalSurcharges;
    }

    /**
     * Define el valor de la propiedad generalSurcharges.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setGeneralSurcharges(ChargesType value) {
        this.generalSurcharges = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGeneralDiscounts.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalGeneralDiscounts() {
        return totalGeneralDiscounts;
    }

    /**
     * Define el valor de la propiedad totalGeneralDiscounts.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalGeneralDiscounts(Double value) {
        this.totalGeneralDiscounts = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGeneralSurcharges.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalGeneralSurcharges() {
        return totalGeneralSurcharges;
    }

    /**
     * Define el valor de la propiedad totalGeneralSurcharges.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalGeneralSurcharges(Double value) {
        this.totalGeneralSurcharges = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGrossAmountBeforeTaxes.
     * 
     */
    public double getTotalGrossAmountBeforeTaxes() {
        return totalGrossAmountBeforeTaxes;
    }

    /**
     * Define el valor de la propiedad totalGrossAmountBeforeTaxes.
     * 
     */
    public void setTotalGrossAmountBeforeTaxes(double value) {
        this.totalGrossAmountBeforeTaxes = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxOutputs.
     * 
     */
    public double getTotalTaxOutputs() {
        return totalTaxOutputs;
    }

    /**
     * Define el valor de la propiedad totalTaxOutputs.
     * 
     */
    public void setTotalTaxOutputs(double value) {
        this.totalTaxOutputs = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxesWithheld.
     * 
     */
    public double getTotalTaxesWithheld() {
        return totalTaxesWithheld;
    }

    /**
     * Define el valor de la propiedad totalTaxesWithheld.
     * 
     */
    public void setTotalTaxesWithheld(double value) {
        this.totalTaxesWithheld = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceTotal.
     * 
     */
    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * Define el valor de la propiedad invoiceTotal.
     * 
     */
    public void setInvoiceTotal(double value) {
        this.invoiceTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidies.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiesType }
     *     
     */
    public SubsidiesType getSubsidies() {
        return subsidies;
    }

    /**
     * Define el valor de la propiedad subsidies.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiesType }
     *     
     */
    public void setSubsidies(SubsidiesType value) {
        this.subsidies = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentsOnAccount.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsOnAccountType }
     *     
     */
    public PaymentsOnAccountType getPaymentsOnAccount() {
        return paymentsOnAccount;
    }

    /**
     * Define el valor de la propiedad paymentsOnAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsOnAccountType }
     *     
     */
    public void setPaymentsOnAccount(PaymentsOnAccountType value) {
        this.paymentsOnAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad reimbursableExpenses.
     * 
     * @return
     *     possible object is
     *     {@link ReimbursableExpenses }
     *     
     */
    public ReimbursableExpenses getReimbursableExpenses() {
        return reimbursableExpenses;
    }

    /**
     * Define el valor de la propiedad reimbursableExpenses.
     * 
     * @param value
     *     allowed object is
     *     {@link ReimbursableExpenses }
     *     
     */
    public void setReimbursableExpenses(ReimbursableExpenses value) {
        this.reimbursableExpenses = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFinancialExpenses.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFinancialExpenses() {
        return totalFinancialExpenses;
    }

    /**
     * Define el valor de la propiedad totalFinancialExpenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFinancialExpenses(Double value) {
        this.totalFinancialExpenses = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOutstandingAmount.
     * 
     */
    public double getTotalOutstandingAmount() {
        return totalOutstandingAmount;
    }

    /**
     * Define el valor de la propiedad totalOutstandingAmount.
     * 
     */
    public void setTotalOutstandingAmount(double value) {
        this.totalOutstandingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPaymentsOnAccount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPaymentsOnAccount() {
        return totalPaymentsOnAccount;
    }

    /**
     * Define el valor de la propiedad totalPaymentsOnAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPaymentsOnAccount(Double value) {
        this.totalPaymentsOnAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad amountsWithheld.
     * 
     * @return
     *     possible object is
     *     {@link AmountsWithheldType }
     *     
     */
    public AmountsWithheldType getAmountsWithheld() {
        return amountsWithheld;
    }

    /**
     * Define el valor de la propiedad amountsWithheld.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsWithheldType }
     *     
     */
    public void setAmountsWithheld(AmountsWithheldType value) {
        this.amountsWithheld = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExecutableAmount.
     * 
     */
    public double getTotalExecutableAmount() {
        return totalExecutableAmount;
    }

    /**
     * Define el valor de la propiedad totalExecutableAmount.
     * 
     */
    public void setTotalExecutableAmount(double value) {
        this.totalExecutableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalReimbursableExpenses.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalReimbursableExpenses() {
        return totalReimbursableExpenses;
    }

    /**
     * Define el valor de la propiedad totalReimbursableExpenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalReimbursableExpenses(Double value) {
        this.totalReimbursableExpenses = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInKind.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInKindType }
     *     
     */
    public PaymentInKindType getPaymentInKind() {
        return paymentInKind;
    }

    /**
     * Define el valor de la propiedad paymentInKind.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInKindType }
     *     
     */
    public void setPaymentInKind(PaymentInKindType value) {
        this.paymentInKind = value;
    }

}
