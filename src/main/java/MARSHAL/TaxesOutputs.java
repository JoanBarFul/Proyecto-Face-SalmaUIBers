/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author alexc
 */


@XmlType(propOrder = {"tax"})
public class TaxesOutputs {
    private List<Tax> tax;

    public TaxesOutputs() {
        this.tax = new ArrayList<>(); // Inicializa la lista
    }

    @XmlElement(name = "Tax")
    public List<Tax> getTax() {
        return tax; // Asegúrate de que devuelva la lista
    }

    public void setTax(List<Tax> tax) {
        this.tax = tax;
    }
}
