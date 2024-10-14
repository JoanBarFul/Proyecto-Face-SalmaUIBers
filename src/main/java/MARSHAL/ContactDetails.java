package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */

@XmlType(propOrder = {"telephone", "teleFax", "webAddress", "electronicMail"})
public class ContactDetails {
    private String telephone;
    private String teleFax;
    private String webAddress;
    private String electronicMail;

    @XmlElement(name = "Telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @XmlElement(name = "TeleFax")
    public String getTeleFax() {
        return teleFax;
    }

    public void setTeleFax(String teleFax) {
        this.teleFax = teleFax;
    }

    @XmlElement(name = "WebAddress")
    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    @XmlElement(name = "ElectronicMail")
    public String getElectronicMail() {
        return electronicMail;
    }

    public void setElectronicMail(String electronicMail) {
        this.electronicMail = electronicMail;
    }
}
