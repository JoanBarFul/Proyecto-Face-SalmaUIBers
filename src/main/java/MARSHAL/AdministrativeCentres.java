/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alexc
 */



@XmlType(propOrder = {"administrativeCentre"})
public class AdministrativeCentres {
    private List<AdministrativeCentre> administrativeCentre;

    public AdministrativeCentres() {
        this.administrativeCentre = new ArrayList<>(); // Inicializa la lista
    }

    @XmlElement(name = "AdministrativeCentre")
    public List<AdministrativeCentre> getAdministrativeCentre() {
        return administrativeCentre; // Asegúrate de que devuelva la lista
    }

    public void setAdministrativeCentre(List<AdministrativeCentre> administrativeCentre) {
        this.administrativeCentre = administrativeCentre;
    }
}
