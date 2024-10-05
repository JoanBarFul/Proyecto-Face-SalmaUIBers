
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InstallmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InstallmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstallmentDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="InstallmentAmount" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}DoubleTwoDecimalType"/&gt;
 *         &lt;element name="PaymentMeans" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PaymentMeansType"/&gt;
 *         &lt;element name="AccountToBeCredited" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AccountType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentReconciliationReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountToBeDebited" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AccountType" minOccurs="0"/&gt;
 *         &lt;element name="CollectionAdditionalInformation" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/&gt;
 *         &lt;element name="RegulatoryReportingData" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}RegulatoryReportingDataType" minOccurs="0"/&gt;
 *         &lt;element name="DebitReconciliationReference" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "installmentDueDate",
    "installmentAmount",
    "paymentMeans",
    "accountToBeCredited",
    "paymentReconciliationReference",
    "accountToBeDebited",
    "collectionAdditionalInformation",
    "regulatoryReportingData",
    "debitReconciliationReference"
})
public class InstallmentType {

    @XmlElement(name = "InstallmentDueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar installmentDueDate;
    @XmlElement(name = "InstallmentAmount")
    protected double installmentAmount;
    @XmlElement(name = "PaymentMeans", required = true)
    protected String paymentMeans;
    @XmlElement(name = "AccountToBeCredited")
    protected AccountType accountToBeCredited;
    @XmlElement(name = "PaymentReconciliationReference")
    protected String paymentReconciliationReference;
    @XmlElement(name = "AccountToBeDebited")
    protected AccountType accountToBeDebited;
    @XmlElement(name = "CollectionAdditionalInformation")
    protected String collectionAdditionalInformation;
    @XmlElement(name = "RegulatoryReportingData")
    protected String regulatoryReportingData;
    @XmlElement(name = "DebitReconciliationReference")
    protected String debitReconciliationReference;

    /**
     * Obtiene el valor de la propiedad installmentDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Define el valor de la propiedad installmentDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallmentDueDate(XMLGregorianCalendar value) {
        this.installmentDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentAmount.
     * 
     */
    public double getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Define el valor de la propiedad installmentAmount.
     * 
     */
    public void setInstallmentAmount(double value) {
        this.installmentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMeans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Define el valor de la propiedad paymentMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMeans(String value) {
        this.paymentMeans = value;
    }

    /**
     * Obtiene el valor de la propiedad accountToBeCredited.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountToBeCredited() {
        return accountToBeCredited;
    }

    /**
     * Define el valor de la propiedad accountToBeCredited.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountToBeCredited(AccountType value) {
        this.accountToBeCredited = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentReconciliationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReconciliationReference() {
        return paymentReconciliationReference;
    }

    /**
     * Define el valor de la propiedad paymentReconciliationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReconciliationReference(String value) {
        this.paymentReconciliationReference = value;
    }

    /**
     * Obtiene el valor de la propiedad accountToBeDebited.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountToBeDebited() {
        return accountToBeDebited;
    }

    /**
     * Define el valor de la propiedad accountToBeDebited.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountToBeDebited(AccountType value) {
        this.accountToBeDebited = value;
    }

    /**
     * Obtiene el valor de la propiedad collectionAdditionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAdditionalInformation() {
        return collectionAdditionalInformation;
    }

    /**
     * Define el valor de la propiedad collectionAdditionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAdditionalInformation(String value) {
        this.collectionAdditionalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad regulatoryReportingData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatoryReportingData() {
        return regulatoryReportingData;
    }

    /**
     * Define el valor de la propiedad regulatoryReportingData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatoryReportingData(String value) {
        this.regulatoryReportingData = value;
    }

    /**
     * Obtiene el valor de la propiedad debitReconciliationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitReconciliationReference() {
        return debitReconciliationReference;
    }

    /**
     * Define el valor de la propiedad debitReconciliationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitReconciliationReference(String value) {
        this.debitReconciliationReference = value;
    }

}
