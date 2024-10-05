
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AssigneeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssigneeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxIdentification" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}TaxIdentificationType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="LegalEntity" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}LegalEntityType"/&gt;
 *           &lt;element name="Individual" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}IndividualType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssigneeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "taxIdentification",
    "legalEntity",
    "individual"
})
public class AssigneeType {

    @XmlElement(name = "TaxIdentification", required = true)
    protected TaxIdentificationType taxIdentification;
    @XmlElement(name = "LegalEntity")
    protected LegalEntityType legalEntity;
    @XmlElement(name = "Individual")
    protected IndividualType individual;

    /**
     * Obtiene el valor de la propiedad taxIdentification.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationType }
     *     
     */
    public TaxIdentificationType getTaxIdentification() {
        return taxIdentification;
    }

    /**
     * Define el valor de la propiedad taxIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationType }
     *     
     */
    public void setTaxIdentification(TaxIdentificationType value) {
        this.taxIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad legalEntity.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityType }
     *     
     */
    public LegalEntityType getLegalEntity() {
        return legalEntity;
    }

    /**
     * Define el valor de la propiedad legalEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityType }
     *     
     */
    public void setLegalEntity(LegalEntityType value) {
        this.legalEntity = value;
    }

    /**
     * Obtiene el valor de la propiedad individual.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Define el valor de la propiedad individual.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

}
