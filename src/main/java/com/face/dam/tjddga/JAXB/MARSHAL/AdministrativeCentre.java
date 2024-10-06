/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.face.dam.tjddga.JAXB.MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
/**
 *
 * @author alexc
 */

@XmlType(propOrder = {
    "centreCode",             // Asegúrate de que este es correcto según el XSD
    "roleTypeCode",
    "addressInSpain",
    "centreDescription"       // Este debe estar también como se define en el XSD
})

public class AdministrativeCentre {
    private String centreCode;
    private String roleTypeCode;
    private AddressInSpain addressInSpain;
    private String centreDescription;

    @XmlElement(name = "CentreCode")
    public String getCentreCode() {
        return centreCode;
    }

    public void setCentreCode(String centreCode) {
        this.centreCode = centreCode;
    }

    @XmlElement(name = "RoleTypeCode")
    public String getRoleTypeCode() {
        return roleTypeCode;
    }

    public void setRoleTypeCode(String roleTypeCode) {
        this.roleTypeCode = roleTypeCode;
    }

    @XmlElement(name = "AddressInSpain")
    public AddressInSpain getAddressInSpain() {
        return addressInSpain;
    }

    public void setAddressInSpain(AddressInSpain addressInSpain) {
        this.addressInSpain = addressInSpain;
    }

    @XmlElement(name = "CentreDescription")
    public String getCentreDescription() {
        return centreDescription;
    }

    public void setCentreDescription(String centreDescription) {
        this.centreDescription = centreDescription;
    }
}
