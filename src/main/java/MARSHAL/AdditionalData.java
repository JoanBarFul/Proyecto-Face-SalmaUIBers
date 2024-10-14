/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */
@XmlType(propOrder = {"invoiceAdditionalInformation"})
public class AdditionalData {
    private String invoiceAdditionalInformation; // Atributo para la información adicional

    @XmlElement(name = "InvoiceAdditionalInformation")
    public String getInvoiceAdditionalInformation() {
        return invoiceAdditionalInformation;
    }

    public void setInvoiceAdditionalInformation(String invoiceAdditionalInformation) {
        this.invoiceAdditionalInformation = invoiceAdditionalInformation;
    }
}
