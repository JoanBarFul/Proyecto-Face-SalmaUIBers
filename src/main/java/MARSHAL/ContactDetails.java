package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */

@XmlType(propOrder = {"telephone", "electronicMail"})
public class ContactDetails {
    private String telephone;
    private String electronicMail;

    @XmlElement(name = "Telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }





    @XmlElement(name = "ElectronicMail")
    public String getElectronicMail() {
        return electronicMail;
    }

    public void setElectronicMail(String electronicMail) {
        this.electronicMail = electronicMail;
    }
}
