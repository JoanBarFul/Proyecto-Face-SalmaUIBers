package com.acarpio.peritaljaxb;

import java.util.ArrayList;
import java.util.HashMap;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlRootElement(name = "Varios")
public class varios {
    
    private String info;
    public varios(){}
    public void setInfo(String info){
        this.info=info;
    }
    public String getInfo(){
        return info;
    }
    public void rellenarInfo(HashMap<String,ArrayList<Object>> map,String nom){
        ArrayList<Object> valores = map.get(nom);
        this.info=(String) valores.get(0);
    }
}
