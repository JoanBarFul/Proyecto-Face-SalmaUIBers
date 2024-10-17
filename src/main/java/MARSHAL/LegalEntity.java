package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */
@XmlType(propOrder = {"corporateName", "registrationData", "addressInSpain", "overseaAddress"})
public class LegalEntity {
    private String corporateName;
    private RegistrationData registrationData;
    private AddressInSpain addressInSpain;
    private OverseaAddress overseaAddress; // Campo opcional para la dirección en el extranjero.

    @XmlElement(name = "CorporateName")
    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    @XmlElement(name = "RegistrationData")
    public RegistrationData getRegistrationData() {
        return registrationData;
    }

    public void setRegistrationData(RegistrationData registrationData) {
        this.registrationData = registrationData;
    }

    @XmlElement(name = "AddressInSpain")
    public AddressInSpain getAddressInSpain() {
        return addressInSpain;
    }

    public void setAddressInSpain(AddressInSpain addressInSpain) {
        this.addressInSpain = addressInSpain;
    }

    // Campo opcional para dirección en el extranjero.
    @XmlElement(name = "OverseaAddress", nillable = true) // nillable permite que sea opcional
    public OverseaAddress getOverseaAddress() {
        return overseaAddress;
    }

    public void setOverseaAddress(OverseaAddress overseaAddress) {
        this.overseaAddress = overseaAddress;
    }
}
