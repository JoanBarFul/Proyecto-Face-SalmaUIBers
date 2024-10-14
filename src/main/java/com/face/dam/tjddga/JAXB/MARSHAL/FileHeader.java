package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;

@XmlType(propOrder = {"schemaVersion", "modality", "invoiceIssuerType", "batch"})
public class FileHeader {
    private String schemaVersion;
    private String modality;
    private String invoiceIssuerType;
    private Batch batch;

    @XmlElement(name = "SchemaVersion")
    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    @XmlElement(name = "Modality")
    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    @XmlElement(name = "InvoiceIssuerType")
    public String getInvoiceIssuerType() {
        return invoiceIssuerType;
    }

    public void setInvoiceIssuerType(String invoiceIssuerType) {
        this.invoiceIssuerType = invoiceIssuerType;
    }

    @XmlElement(name = "Batch")
    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
    
    public void rellenarFileHeader(HashMap<String, ArrayList<Object>> map) {
        ArrayList<Object> valores = map.get("FileHeader");
        this.schemaVersion = (String) valores.get(0);
        this.modality = (String) valores.get(1);
        this.invoiceIssuerType = (String) valores.get(2);
        Batch Batch = new Batch();
        Batch.rellenarBatch(map);
        this.setBatch(Batch);
        
    }
    
    
}
