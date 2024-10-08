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


@XmlType(propOrder = {"book", "registerOfCompaniesLocation", "sheet", "folio", "section", "volume"})
public class RegistrationData {
    private int book;
    private String registerOfCompaniesLocation;
    private int sheet;
    private int folio;
    private int section;
    private int volume;

    @XmlElement(name = "Book")
    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    @XmlElement(name = "RegisterOfCompaniesLocation")
    public String getRegisterOfCompaniesLocation() {
        return registerOfCompaniesLocation;
    }

    public void setRegisterOfCompaniesLocation(String registerOfCompaniesLocation) {
        this.registerOfCompaniesLocation = registerOfCompaniesLocation;
    }

    @XmlElement(name = "Sheet")
    public int getSheet() {
        return sheet;
    }

    public void setSheet(int sheet) {
        this.sheet = sheet;
    }

    @XmlElement(name = "Folio")
    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    @XmlElement(name = "Section")
    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @XmlElement(name = "Volume")
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
