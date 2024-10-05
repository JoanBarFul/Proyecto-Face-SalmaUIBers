
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContactDetailsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContactDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Telephone" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax15Type" minOccurs="0"/&gt;
 *         &lt;element name="TeleFax" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax15Type" minOccurs="0"/&gt;
 *         &lt;element name="WebAddress" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicMail" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="ContactPersons" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type" minOccurs="0"/&gt;
 *         &lt;element name="CnoCnae" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}CnoCnaeType" minOccurs="0"/&gt;
 *         &lt;element name="INETownCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax9Type" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalContactDetails" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax60Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetailsType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "telephone",
    "teleFax",
    "webAddress",
    "electronicMail",
    "contactPersons",
    "cnoCnae",
    "ineTownCode",
    "additionalContactDetails"
})
public class ContactDetailsType {

    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "TeleFax")
    protected String teleFax;
    @XmlElement(name = "WebAddress")
    protected String webAddress;
    @XmlElement(name = "ElectronicMail")
    protected String electronicMail;
    @XmlElement(name = "ContactPersons")
    protected String contactPersons;
    @XmlElement(name = "CnoCnae")
    protected String cnoCnae;
    @XmlElement(name = "INETownCode")
    protected String ineTownCode;
    @XmlElement(name = "AdditionalContactDetails")
    protected String additionalContactDetails;

    /**
     * Obtiene el valor de la propiedad telephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Define el valor de la propiedad telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Obtiene el valor de la propiedad teleFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeleFax() {
        return teleFax;
    }

    /**
     * Define el valor de la propiedad teleFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeleFax(String value) {
        this.teleFax = value;
    }

    /**
     * Obtiene el valor de la propiedad webAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Define el valor de la propiedad webAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddress(String value) {
        this.webAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicMail() {
        return electronicMail;
    }

    /**
     * Define el valor de la propiedad electronicMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicMail(String value) {
        this.electronicMail = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPersons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersons() {
        return contactPersons;
    }

    /**
     * Define el valor de la propiedad contactPersons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersons(String value) {
        this.contactPersons = value;
    }

    /**
     * Obtiene el valor de la propiedad cnoCnae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnoCnae() {
        return cnoCnae;
    }

    /**
     * Define el valor de la propiedad cnoCnae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnoCnae(String value) {
        this.cnoCnae = value;
    }

    /**
     * Obtiene el valor de la propiedad ineTownCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINETownCode() {
        return ineTownCode;
    }

    /**
     * Define el valor de la propiedad ineTownCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINETownCode(String value) {
        this.ineTownCode = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalContactDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalContactDetails() {
        return additionalContactDetails;
    }

    /**
     * Define el valor de la propiedad additionalContactDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalContactDetails(String value) {
        this.additionalContactDetails = value;
    }

}
