/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexc
 */
package com.acarpio.peritaljaxb;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.glassfish.jaxb.core.v2.model.util.ArrayInfoUtil;


@XmlType(propOrder = { "nombreCliente",
                     "apellidosCliente", 
                     "clienteID",
                     "direcciones",
                     "test1",
                     "test2"})

@XmlRootElement(name = "Cliente")

public class Cliente {
    
    private String nombreCliente;
    private String apellidosCliente;
    private int clienteID;
    private ArrayList<Direccion> direcciones;
    private varios test1;
    private varios test2;
   

    @XmlElement(name = "test1")
    public varios gettest1(){
        return test1;
    }
    public void setTest1(varios test1){
        this.test1=test1;
    }
    @XmlElement(name = "test2")
    public varios gettest2(){
        return test2;
    }
    public void setTest2(varios test2){
        this.test2=test2;
    }

    public Cliente() {
        this.direcciones = new ArrayList<>();
    }
 
    @XmlElement(name = "NombreCliente")
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    @XmlElement(name = "ApellidoCliente")
    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }
    @XmlElement(name = "IDPerital")
    public int getClienteID() {
        return clienteID;
    }

    
    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }
    @XmlElementWrapper(name = "Direcciones")
    @XmlElement(name = "Direccion")
    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }
    
    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
   

    
    
    public void rellenarCliente(HashMap<String,ArrayList<Object>> map ){
        ArrayList<Object> valores = map.get("Clientedata");
        this.nombreCliente=(String) valores.get(0);
        this.apellidosCliente= (String) valores.get(1);
        this.clienteID=(int) valores.get(2);
        ArrayList<Object> direcciones = map.get("DireccionInfo");
        for (Object direccion : direcciones) {
            Object[] infoDireccion = (Object[]) direccion;
            Direccion direccionTemporal = new Direccion();
            direccionTemporal.rellenarDireccin(infoDireccion);
            this.getDirecciones().add(direccionTemporal);
            
        }
        varios testa1 = new varios();
        testa1.rellenarInfo(map,"test1");
        this.test1=testa1;
        varios testa2 = new varios();
        testa2.rellenarInfo(map,"test2");
        this.test2=testa2;

        


    }
    

    
    
    
     
}
