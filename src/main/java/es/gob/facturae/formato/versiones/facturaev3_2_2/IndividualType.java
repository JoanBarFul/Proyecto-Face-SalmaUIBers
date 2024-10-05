
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IndividualType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IndividualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type"/&gt;
 *         &lt;element name="FirstSurname" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type"/&gt;
 *         &lt;element name="SecondSurname" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type" minOccurs="0"/&gt;
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
@XmlType(name = "IndividualType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "name",
    "firstSurname",
    "secondSurname",
    "addressInSpain",
    "overseasAddress",
    "contactDetails"
})
public class IndividualType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FirstSurname", required = true)
    protected String firstSurname;
    @XmlElement(name = "SecondSurname")
    protected String secondSurname;
    @XmlElement(name = "AddressInSpain")
    protected AddressType addressInSpain;
    @XmlElement(name = "OverseasAddress")
    protected OverseasAddressType overseasAddress;
    @XmlElement(name = "ContactDetails")
    protected ContactDetailsType contactDetails;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad firstSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSurname() {
        return firstSurname;
    }

    /**
     * Define el valor de la propiedad firstSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSurname(String value) {
        this.firstSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad secondSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondSurname() {
        return secondSurname;
    }

    /**
     * Define el valor de la propiedad secondSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondSurname(String value) {
        this.secondSurname = value;
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
