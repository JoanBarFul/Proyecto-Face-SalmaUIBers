/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.face.dam.tjddga.JAXB.MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author alexc
 */


@XmlType(propOrder = {"corporateName", "registrationData", "addressInSpain"})
public class LegalEntity {
    private String corporateName;
    private RegistrationData registrationData;
    private AddressInSpain addressInSpain;

    @XmlElement(name = "CorporateName")
    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    @XmlElement(name = "RegistrationData")
    public RegistrationData getRegistrationData() {
        return registrationData;
    }

    public void setRegistrationData(RegistrationData registrationData) {
        this.registrationData = registrationData;
    }

    @XmlElement(name = "AddressInSpain")
    public AddressInSpain getAddressInSpain() {
        return addressInSpain;
    }

    public void setAddressInSpain(AddressInSpain addressInSpain) {
        this.addressInSpain = addressInSpain;
    }
    
    public void rellenarLegalEntity(HashMap<String, ArrayList<Object>> map) {
        ArrayList<Object> valores = map.get("LegalEntity");
        this.corporateName = (String) valores.get(0);
        
        // Objeto hijo RegistrationData
        RegistrationData regData = new RegistrationData();
        registrationData.rellenarRegistrationData(map);
        this.setRegistrationData(regData);
        
        // Objeot hijo adressInSpain
        
        AddressInSpain adressInSpain = new AddressInSpain();
        adressInSpain.rellenarAdressInSpain(map);
        this.setAddressInSpain(addressInSpain);
        
        
        
    }
    
    /*
    private String corporateName;
    private RegistrationData registrationData;
    private AddressInSpain addressInSpain;
    
    
    */
    
    
    
}
