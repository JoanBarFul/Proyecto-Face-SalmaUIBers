
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceLineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssuerContractReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="IssuerContractDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IssuerTransactionReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="IssuerTransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverContractReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverContractDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverTransactionReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverTransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FileReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="FileDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryNotesReferences" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DeliveryNotesReferencesType" minOccurs="0"/&gt;
 *         &lt;element name="ItemDescription" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UnitOfMeasure" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPriceWithoutTax" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TotalCost" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="DiscountsAndRebates" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DiscountsAndRebatesType" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="GrossAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleUpToEightDecimalType"/&gt;
 *         &lt;element name="TaxesWithheld" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxesType" minOccurs="0"/&gt;
 *         &lt;element name="TaxesOutputs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tax" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxOutputType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LineItemPeriod" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PeriodDates" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalLineItemInformation" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecialTaxableEvent" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}SpecialTaxableEventType" minOccurs="0"/&gt;
 *         &lt;element name="ArticleCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="Extensions" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLineType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "issuerContractReference",
    "issuerContractDate",
    "issuerTransactionReference",
    "issuerTransactionDate",
    "receiverContractReference",
    "receiverContractDate",
    "receiverTransactionReference",
    "receiverTransactionDate",
    "fileReference",
    "fileDate",
    "sequenceNumber",
    "deliveryNotesReferences",
    "itemDescription",
    "quantity",
    "unitOfMeasure",
    "unitPriceWithoutTax",
    "totalCost",
    "discountsAndRebates",
    "charges",
    "grossAmount",
    "taxesWithheld",
    "taxesOutputs",
    "lineItemPeriod",
    "transactionDate",
    "additionalLineItemInformation",
    "specialTaxableEvent",
    "articleCode",
    "extensions"
})
public class InvoiceLineType {

    @XmlElement(name = "IssuerContractReference")
    protected String issuerContractReference;
    @XmlElement(name = "IssuerContractDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuerContractDate;
    @XmlElement(name = "IssuerTransactionReference")
    protected String issuerTransactionReference;
    @XmlElement(name = "IssuerTransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuerTransactionDate;
    @XmlElement(name = "ReceiverContractReference")
    protected String receiverContractReference;
    @XmlElement(name = "ReceiverContractDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverContractDate;
    @XmlElement(name = "ReceiverTransactionReference")
    protected String receiverTransactionReference;
    @XmlElement(name = "ReceiverTransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiverTransactionDate;
    @XmlElement(name = "FileReference")
    protected String fileReference;
    @XmlElement(name = "FileDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fileDate;
    @XmlElement(name = "SequenceNumber")
    protected Double sequenceNumber;
    @XmlElement(name = "DeliveryNotesReferences")
    protected DeliveryNotesReferencesType deliveryNotesReferences;
    @XmlElement(name = "ItemDescription", required = true)
    protected String itemDescription;
    @XmlElement(name = "Quantity")
    protected double quantity;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "UnitPriceWithoutTax")
    protected double unitPriceWithoutTax;
    @XmlElement(name = "TotalCost")
    protected double totalCost;
    @XmlElement(name = "DiscountsAndRebates")
    protected DiscountsAndRebatesType discountsAndRebates;
    @XmlElement(name = "Charges")
    protected ChargesType charges;
    @XmlElement(name = "GrossAmount")
    protected double grossAmount;
    @XmlElement(name = "TaxesWithheld")
    protected TaxesType taxesWithheld;
    @XmlElement(name = "TaxesOutputs", required = true)
    protected InvoiceLineType.TaxesOutputs taxesOutputs;
    @XmlElement(name = "LineItemPeriod")
    protected PeriodDates lineItemPeriod;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "AdditionalLineItemInformation")
    protected String additionalLineItemInformation;
    @XmlElement(name = "SpecialTaxableEvent")
    protected SpecialTaxableEventType specialTaxableEvent;
    @XmlElement(name = "ArticleCode")
    protected String articleCode;
    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;

    /**
     * Obtiene el valor de la propiedad issuerContractReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerContractReference() {
        return issuerContractReference;
    }

    /**
     * Define el valor de la propiedad issuerContractReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerContractReference(String value) {
        this.issuerContractReference = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerContractDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuerContractDate() {
        return issuerContractDate;
    }

    /**
     * Define el valor de la propiedad issuerContractDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuerContractDate(XMLGregorianCalendar value) {
        this.issuerContractDate = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerTransactionReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerTransactionReference() {
        return issuerTransactionReference;
    }

    /**
     * Define el valor de la propiedad issuerTransactionReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerTransactionReference(String value) {
        this.issuerTransactionReference = value;
    }

    /**
     * Obtiene el valor de la propiedad issuerTransactionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuerTransactionDate() {
        return issuerTransactionDate;
    }

    /**
     * Define el valor de la propiedad issuerTransactionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuerTransactionDate(XMLGregorianCalendar value) {
        this.issuerTransactionDate = value;
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

    /**
     * Obtiene el valor de la propiedad receiverContractDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverContractDate() {
        return receiverContractDate;
    }

    /**
     * Define el valor de la propiedad receiverContractDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverContractDate(XMLGregorianCalendar value) {
        this.receiverContractDate = value;
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
     * Obtiene el valor de la propiedad receiverTransactionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiverTransactionDate() {
        return receiverTransactionDate;
    }

    /**
     * Define el valor de la propiedad receiverTransactionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiverTransactionDate(XMLGregorianCalendar value) {
        this.receiverTransactionDate = value;
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
     * Obtiene el valor de la propiedad fileDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileDate() {
        return fileDate;
    }

    /**
     * Define el valor de la propiedad fileDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileDate(XMLGregorianCalendar value) {
        this.fileDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define el valor de la propiedad sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSequenceNumber(Double value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryNotesReferences.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNotesReferencesType }
     *     
     */
    public DeliveryNotesReferencesType getDeliveryNotesReferences() {
        return deliveryNotesReferences;
    }

    /**
     * Define el valor de la propiedad deliveryNotesReferences.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNotesReferencesType }
     *     
     */
    public void setDeliveryNotesReferences(DeliveryNotesReferencesType value) {
        this.deliveryNotesReferences = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Define el valor de la propiedad itemDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad unitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Define el valor de la propiedad unitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad unitPriceWithoutTax.
     * 
     */
    public double getUnitPriceWithoutTax() {
        return unitPriceWithoutTax;
    }

    /**
     * Define el valor de la propiedad unitPriceWithoutTax.
     * 
     */
    public void setUnitPriceWithoutTax(double value) {
        this.unitPriceWithoutTax = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCost.
     * 
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Define el valor de la propiedad totalCost.
     * 
     */
    public void setTotalCost(double value) {
        this.totalCost = value;
    }

    /**
     * Obtiene el valor de la propiedad discountsAndRebates.
     * 
     * @return
     *     possible object is
     *     {@link DiscountsAndRebatesType }
     *     
     */
    public DiscountsAndRebatesType getDiscountsAndRebates() {
        return discountsAndRebates;
    }

    /**
     * Define el valor de la propiedad discountsAndRebates.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountsAndRebatesType }
     *     
     */
    public void setDiscountsAndRebates(DiscountsAndRebatesType value) {
        this.discountsAndRebates = value;
    }

    /**
     * Obtiene el valor de la propiedad charges.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getCharges() {
        return charges;
    }

    /**
     * Define el valor de la propiedad charges.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setCharges(ChargesType value) {
        this.charges = value;
    }

    /**
     * Obtiene el valor de la propiedad grossAmount.
     * 
     */
    public double getGrossAmount() {
        return grossAmount;
    }

    /**
     * Define el valor de la propiedad grossAmount.
     * 
     */
    public void setGrossAmount(double value) {
        this.grossAmount = value;
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
     * Obtiene el valor de la propiedad taxesOutputs.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLineType.TaxesOutputs }
     *     
     */
    public InvoiceLineType.TaxesOutputs getTaxesOutputs() {
        return taxesOutputs;
    }

    /**
     * Define el valor de la propiedad taxesOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLineType.TaxesOutputs }
     *     
     */
    public void setTaxesOutputs(InvoiceLineType.TaxesOutputs value) {
        this.taxesOutputs = value;
    }

    /**
     * Obtiene el valor de la propiedad lineItemPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDates }
     *     
     */
    public PeriodDates getLineItemPeriod() {
        return lineItemPeriod;
    }

    /**
     * Define el valor de la propiedad lineItemPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDates }
     *     
     */
    public void setLineItemPeriod(PeriodDates value) {
        this.lineItemPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Define el valor de la propiedad transactionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalLineItemInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalLineItemInformation() {
        return additionalLineItemInformation;
    }

    /**
     * Define el valor de la propiedad additionalLineItemInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalLineItemInformation(String value) {
        this.additionalLineItemInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad specialTaxableEvent.
     * 
     * @return
     *     possible object is
     *     {@link SpecialTaxableEventType }
     *     
     */
    public SpecialTaxableEventType getSpecialTaxableEvent() {
        return specialTaxableEvent;
    }

    /**
     * Define el valor de la propiedad specialTaxableEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialTaxableEventType }
     *     
     */
    public void setSpecialTaxableEvent(SpecialTaxableEventType value) {
        this.specialTaxableEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad articleCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleCode() {
        return articleCode;
    }

    /**
     * Define el valor de la propiedad articleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleCode(String value) {
        this.articleCode = value;
    }

    /**
     * Obtiene el valor de la propiedad extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Define el valor de la propiedad extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
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
     *         &lt;element name="Tax" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxOutputType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        protected List<InvoiceLineType.TaxesOutputs.Tax> tax;

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
         * {@link InvoiceLineType.TaxesOutputs.Tax }
         * 
         * 
         */
        public List<InvoiceLineType.TaxesOutputs.Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<InvoiceLineType.TaxesOutputs.Tax>();
            }
            return this.tax;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxOutputType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Tax
            extends TaxOutputType
        {


        }

    }

}
