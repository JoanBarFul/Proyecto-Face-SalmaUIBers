/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author alexc
 */

@XmlRootElement(name = "TaxesWithheld")
public class TaxesWithheld {

    private double totalTaxesWithheld;

    @XmlElement(name = "TotalTaxesWithheld")
    public double getTotalTaxesWithheld() {
        return totalTaxesWithheld;
    }

    public void setTotalTaxesWithheld(double totalTaxesWithheld) {
        this.totalTaxesWithheld = totalTaxesWithheld;
    }
}
