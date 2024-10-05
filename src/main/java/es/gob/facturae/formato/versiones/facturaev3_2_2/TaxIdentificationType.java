
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxIdentificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonTypeCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}PersonTypeCodeType"/&gt;
 *         &lt;element name="ResidenceTypeCode" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ResidenceTypeCodeType"/&gt;
 *         &lt;element name="TaxIdentificationNumber" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMin3Max30Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIdentificationType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "personTypeCode",
    "residenceTypeCode",
    "taxIdentificationNumber"
})
public class TaxIdentificationType {

    @XmlElement(name = "PersonTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected PersonTypeCodeType personTypeCode;
    @XmlElement(name = "ResidenceTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected ResidenceTypeCodeType residenceTypeCode;
    @XmlElement(name = "TaxIdentificationNumber", required = true)
    protected String taxIdentificationNumber;

    /**
     * Obtiene el valor de la propiedad personTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public PersonTypeCodeType getPersonTypeCode() {
        return personTypeCode;
    }

    /**
     * Define el valor de la propiedad personTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public void setPersonTypeCode(PersonTypeCodeType value) {
        this.personTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public ResidenceTypeCodeType getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Define el valor de la propiedad residenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public void setResidenceTypeCode(ResidenceTypeCodeType value) {
        this.residenceTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Define el valor de la propiedad taxIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

}
