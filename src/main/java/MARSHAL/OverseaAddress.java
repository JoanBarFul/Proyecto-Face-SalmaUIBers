/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MARSHAL;

/**
 *
 * @author alexc
 */

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Clase para la dirección en el extranjero.
 */
@XmlType(propOrder = {"country", "postcodeAndTown", "province"})
public class OverseaAddress {
    private String country; // País
    private String postcodeAndTown; // Código postal y ciudad
    private String province; // Provincia

    @XmlElement(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement(name = "PostcodeAndTown")
    public String getPostcodeAndTown() {
        return postcodeAndTown;
    }

    public void setPostcodeAndTown(String postcodeAndTown) {
        this.postcodeAndTown = postcodeAndTown;
    }

    @XmlElement(name = "Province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
