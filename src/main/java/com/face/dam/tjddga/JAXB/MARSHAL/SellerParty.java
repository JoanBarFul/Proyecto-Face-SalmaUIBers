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


@XmlType(propOrder = {"taxIdentification", "legalEntity"})
public class SellerParty {
    private TaxIdentification taxIdentification;
    private LegalEntity legalEntity;

    @XmlElement(name = "TaxIdentification")
    public TaxIdentification getTaxIdentification() {
        return taxIdentification;
    }

    public void setTaxIdentification(TaxIdentification taxIdentification) {
        this.taxIdentification = taxIdentification;
    }

    @XmlElement(name = "LegalEntity")
    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
    }
    
    public void rellenarSellerParty(HashMap<String, ArrayList<Object>> map) {
        ArrayList<Object> valores = map.get("SellerParty");
        
        // Objeto hijo TaxIdentification
        TaxIdentification taxID = new TaxIdentification();
        taxID.rellenarTaxIdentification(map);
        this.taxIdentification = taxID;
        
        // Objeto hijo legalEntity
        
        LegalEntity legEntity = new LegalEntity();
        legEntity.rellenarLegalEntity(map);
        this.legalEntity = legEntity;
        
        
        
    }
    
    
    
    
    /*
    
        private TaxIdentification taxIdentification;
    private LegalEntity legalEntity;
    
    */
    
    
}
