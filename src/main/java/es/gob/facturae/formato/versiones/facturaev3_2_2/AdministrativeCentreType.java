
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdministrativeCentreType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdministrativeCentreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CentreCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax10Type" minOccurs="0"/&gt;
 *         &lt;element name="RoleTypeCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}RoleTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstSurname" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type" minOccurs="0"/&gt;
 *         &lt;element name="SecondSurname" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax40Type" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddressInSpain" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}AddressType"/&gt;
 *           &lt;element name="OverseasAddress" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}OverseasAddressType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ContactDetails" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ContactDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalGLN" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax14Type" minOccurs="0"/&gt;
 *         &lt;element name="LogicalOperationalPoint" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax14Type" minOccurs="0"/&gt;
 *         &lt;element name="CentreDescription" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax2500Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrativeCentreType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "centreCode",
    "roleTypeCode",
    "name",
    "firstSurname",
    "secondSurname",
    "addressInSpain",
    "overseasAddress",
    "contactDetails",
    "physicalGLN",
    "logicalOperationalPoint",
    "centreDescription"
})
public class AdministrativeCentreType {

    @XmlElement(name = "CentreCode")
    protected String centreCode;
    @XmlElement(name = "RoleTypeCode")
    protected String roleTypeCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FirstSurname")
    protected String firstSurname;
    @XmlElement(name = "SecondSurname")
    protected String secondSurname;
    @XmlElement(name = "AddressInSpain")
    protected AddressType addressInSpain;
    @XmlElement(name = "OverseasAddress")
    protected OverseasAddressType overseasAddress;
    @XmlElement(name = "ContactDetails")
    protected ContactDetailsType contactDetails;
    @XmlElement(name = "PhysicalGLN")
    protected String physicalGLN;
    @XmlElement(name = "LogicalOperationalPoint")
    protected String logicalOperationalPoint;
    @XmlElement(name = "CentreDescription")
    protected String centreDescription;

    /**
     * Obtiene el valor de la propiedad centreCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentreCode() {
        return centreCode;
    }

    /**
     * Define el valor de la propiedad centreCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentreCode(String value) {
        this.centreCode = value;
    }

    /**
     * Obtiene el valor de la propiedad roleTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleTypeCode() {
        return roleTypeCode;
    }

    /**
     * Define el valor de la propiedad roleTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleTypeCode(String value) {
        this.roleTypeCode = value;
    }

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

    /**
     * Obtiene el valor de la propiedad physicalGLN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalGLN() {
        return physicalGLN;
    }

    /**
     * Define el valor de la propiedad physicalGLN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalGLN(String value) {
        this.physicalGLN = value;
    }

    /**
     * Obtiene el valor de la propiedad logicalOperationalPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalOperationalPoint() {
        return logicalOperationalPoint;
    }

    /**
     * Define el valor de la propiedad logicalOperationalPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalOperationalPoint(String value) {
        this.logicalOperationalPoint = value;
    }

    /**
     * Obtiene el valor de la propiedad centreDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentreDescription() {
        return centreDescription;
    }

    /**
     * Define el valor de la propiedad centreDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentreDescription(String value) {
        this.centreDescription = value;
    }

}
