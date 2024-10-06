package com.face.dam.tjddga.JAXB.MARSHAL;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

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
}
