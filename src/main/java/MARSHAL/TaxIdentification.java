/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
/**
 *
 * @author alexc
 */


@XmlType(propOrder = {"personTypeCode", "residenceTypeCode", "taxIdentificationNumber"})
public class TaxIdentification {
    private String personTypeCode;
    private String residenceTypeCode;
    private String taxIdentificationNumber;

    @XmlElement(name = "PersonTypeCode")
    public String getPersonTypeCode() {
        return personTypeCode;
    }

    public void setPersonTypeCode(String personTypeCode) {
        this.personTypeCode = personTypeCode;
    }

    @XmlElement(name = "ResidenceTypeCode")
    public String getResidenceTypeCode() {
        return residenceTypeCode;
    }

    public void setResidenceTypeCode(String residenceTypeCode) {
        this.residenceTypeCode = residenceTypeCode;
    }

    @XmlElement(name = "TaxIdentificationNumber")
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }
}
