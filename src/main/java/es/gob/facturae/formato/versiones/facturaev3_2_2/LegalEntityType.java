
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LegalEntityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LegalEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorporateName" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax80Type"/&gt;
 *         &lt;element name="TradeName" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationData" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}RegistrationDataType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddressInSpain" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AddressType"/&gt;
 *           &lt;element name="OverseasAddress" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}OverseasAddressType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ContactDetails" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ContactDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEntityType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "corporateName",
    "tradeName",
    "registrationData",
    "addressInSpain",
    "overseasAddress",
    "contactDetails"
})
public class LegalEntityType {

    @XmlElement(name = "CorporateName", required = true)
    protected String corporateName;
    @XmlElement(name = "TradeName")
    protected String tradeName;
    @XmlElement(name = "RegistrationData")
    protected RegistrationDataType registrationData;
    @XmlElement(name = "AddressInSpain")
    protected AddressType addressInSpain;
    @XmlElement(name = "OverseasAddress")
    protected OverseasAddressType overseasAddress;
    @XmlElement(name = "ContactDetails")
    protected ContactDetailsType contactDetails;

    /**
     * Obtiene el valor de la propiedad corporateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Define el valor de la propiedad corporateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Define el valor de la propiedad tradeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationData.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDataType }
     *     
     */
    public RegistrationDataType getRegistrationData() {
        return registrationData;
    }

    /**
     * Define el valor de la propiedad registrationData.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDataType }
     *     
     */
    public void setRegistrationData(RegistrationDataType value) {
        this.registrationData = value;
    }

    /**
     * Obtiene el valor de la propiedad addressInSpain.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddressInSpain() {
        return addressInSpain;
    }

    /**
     * Define el valor de la propiedad addressInSpain.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddressInSpain(AddressType value) {
        this.addressInSpain = value;
    }

    /**
     * Obtiene el valor de la propiedad overseasAddress.
     * 
     * @return
     *     possible object is
     *     {@link OverseasAddressType }
     *     
     */
    public OverseasAddressType getOverseasAddress() {
        return overseasAddress;
    }

    /**
     * Define el valor de la propiedad overseasAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasAddressType }
     *     
     */
    public void setOverseasAddress(OverseasAddressType value) {
        this.overseasAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad contactDetails.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetailsType }
     *     
     */
    public ContactDetailsType getContactDetails() {
        return contactDetails;
    }

    /**
     * Define el valor de la propiedad contactDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetailsType }
     *     
     */
    public void setContactDetails(ContactDetailsType value) {
        this.contactDetails = value;
    }

}
