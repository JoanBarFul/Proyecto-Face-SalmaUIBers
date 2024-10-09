/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.acarpio.peritaljaxb;



/**
 *
 * @author alexc
 */

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Tutorialers
// https://ducmanhphan.github.io/2019-12-28-How-to-use-JAXB-to-work-with-XML/ //
// http://blog.bdoughan.com/2012/07/jaxb-and-root-elements.html //
// https://timjansen.github.io/jarfiller/guide/jaxb/requiredelements.xhtml //
// XSD Oficial de face
// https://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml

public class PeritalJAXB {

    public static void main(String[] args) throws JAXBException {
        System.out.println("Hola Perital!");
        
        String ruta = (".//XM%LPerital.xml");
        
        
        Cliente cliente1 = new Cliente();
        HashMap<String,ArrayList<Object>> map = new HashMap<>();

        
        ArrayList<Object> Clientedata= new ArrayList<>();
        Clientedata.add("Toni");
        Clientedata.add("Arnaiz");
        Clientedata.add(123);

        map.put("Clientedata",Clientedata);

        ArrayList<Object>DireccionInfo = new ArrayList<>();
        DireccionInfo.add(new Object[]{"calle","ciudad",01});
        DireccionInfo.add(new Object[]{"calle","ciudad",02});
        map.put("DireccionInfo",DireccionInfo);   
        
        ArrayList<Object>variosInfo=new ArrayList<>();
        variosInfo.add("test1");
        map.put("test1",variosInfo);
        ArrayList<Object>variosInfo2=new ArrayList<>();
        variosInfo2.add("test2");
        map.put("test2",variosInfo2);
        cliente1.rellenarCliente(map);
        
       
        
        
        JAXBContext contexto = JAXBContext.newInstance(Cliente.class);
        Marshaller m = contexto.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        
        m.marshal(cliente1, System.out);
        m.marshal(cliente1, new File(ruta));
        
        
    }
}
