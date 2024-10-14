package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */

@XmlType(propOrder = {"name", "firstSurname", "secondSurname", "addressInSpain", "contactDetails"})
public class Individual {
    private String name;
    private String firstSurname;
    private String secondSurname;
    private AddressInSpain addressInSpain;
    private ContactDetails contactDetails;

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "FirstSurname")
    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    @XmlElement(name = "SecondSurname")
    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    @XmlElement(name = "AddressInSpain")
    public AddressInSpain getAddressInSpain() {
        return addressInSpain;
    }

    public void setAddressInSpain(AddressInSpain addressInSpain) {
        this.addressInSpain = addressInSpain;
    }

    @XmlElement(name = "ContactDetails")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
