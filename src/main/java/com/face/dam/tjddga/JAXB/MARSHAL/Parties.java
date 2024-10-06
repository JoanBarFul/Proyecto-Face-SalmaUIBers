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


@XmlType(propOrder = {"sellerParty", "buyerParty"})
public class Parties {
    private SellerParty sellerParty;
    private BuyerParty buyerParty;

    @XmlElement(name = "SellerParty")
    public SellerParty getSellerParty() {
        return sellerParty;
    }

    public void setSellerParty(SellerParty sellerParty) {
        this.sellerParty = sellerParty;
    }

    @XmlElement(name = "BuyerParty")
    public BuyerParty getBuyerParty() {
        return buyerParty;
    }

    public void setBuyerParty(BuyerParty buyerParty) {
        this.buyerParty = buyerParty;
    }
}
