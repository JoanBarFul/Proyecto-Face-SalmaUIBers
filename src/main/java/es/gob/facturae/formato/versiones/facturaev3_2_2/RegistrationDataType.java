
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistrationDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistrationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Book" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="RegisterOfCompaniesLocation" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="Sheet" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="Section" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="Volume" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalRegistrationData" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TextMax20Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationDataType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "book",
    "registerOfCompaniesLocation",
    "sheet",
    "folio",
    "section",
    "volume",
    "additionalRegistrationData"
})
public class RegistrationDataType {

    @XmlElement(name = "Book")
    protected String book;
    @XmlElement(name = "RegisterOfCompaniesLocation")
    protected String registerOfCompaniesLocation;
    @XmlElement(name = "Sheet")
    protected String sheet;
    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "Section")
    protected String section;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "AdditionalRegistrationData")
    protected String additionalRegistrationData;

    /**
     * Obtiene el valor de la propiedad book.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBook() {
        return book;
    }

    /**
     * Define el valor de la propiedad book.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBook(String value) {
        this.book = value;
    }

    /**
     * Obtiene el valor de la propiedad registerOfCompaniesLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterOfCompaniesLocation() {
        return registerOfCompaniesLocation;
    }

    /**
     * Define el valor de la propiedad registerOfCompaniesLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterOfCompaniesLocation(String value) {
        this.registerOfCompaniesLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad sheet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheet() {
        return sheet;
    }

    /**
     * Define el valor de la propiedad sheet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheet(String value) {
        this.sheet = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad section.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Define el valor de la propiedad section.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Obtiene el valor de la propiedad volume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Define el valor de la propiedad volume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalRegistrationData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalRegistrationData() {
        return additionalRegistrationData;
    }

    /**
     * Define el valor de la propiedad additionalRegistrationData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalRegistrationData(String value) {
        this.additionalRegistrationData = value;
    }

}
