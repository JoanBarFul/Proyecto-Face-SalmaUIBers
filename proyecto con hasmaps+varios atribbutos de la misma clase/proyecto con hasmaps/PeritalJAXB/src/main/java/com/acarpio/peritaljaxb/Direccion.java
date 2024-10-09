/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acarpio.peritaljaxb;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */

@XmlRootElement(name = "Direccion")
public class Direccion {
    
    private String calle;
    private String ciudad;
    private int codigoPostal;
    
    
    public Direccion() {}

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public void rellenarDireccin(Object[] direccion){
        this.setCalle((String) direccion[0]);
        this.setCiudad((String) direccion[1]);
        this.setCodigoPostal((Integer) direccion[2]);
        
    }
    
}
