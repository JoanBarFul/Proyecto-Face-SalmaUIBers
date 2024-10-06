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


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {
    "taxIdentification",
    "partyIdentification",
    "administrativeCentres",  // Debe estar definido como una lista de centros
    "legalEntity"
})
public class BuyerParty {
    private TaxIdentification taxIdentification;
    private String partyIdentification;
    private AdministrativeCentres administrativeCentres;
    private LegalEntity legalEntity;

    @XmlElement(name = "TaxIdentification")
    public TaxIdentification getTaxIdentification() {
        return taxIdentification;
    }

    public void setTaxIdentification(TaxIdentification taxIdentification) {
        this.taxIdentification = taxIdentification;
    }

    @XmlElement(name = "PartyIdentification")
    public String getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(String partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    @XmlElement(name = "AdministrativeCentres")
    public AdministrativeCentres getAdministrativeCentres() {
        return administrativeCentres;
    }

    public void setAdministrativeCentres(AdministrativeCentres administrativeCentres) {
        this.administrativeCentres = administrativeCentres;
    }

    @XmlElement(name = "LegalEntity")
    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
    }
}
