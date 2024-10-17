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
    private OverseaAddress overseaAddress; // Campo para la dirección en el extranjero.

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
        // Si se establece una dirección en España, se elimina la dirección en el extranjero.
        if (addressInSpain != null) {
            this.overseaAddress = null; // Limpia el campo de dirección en el extranjero.
        }
        this.addressInSpain = addressInSpain;
    }

    @XmlElement(name = "OverseaAddress")
    public OverseaAddress getOverseaAddress() {
        return overseaAddress;
    }

    public void setOverseaAddress(OverseaAddress overseaAddress) {
        // Si se establece una dirección en el extranjero, se elimina la dirección en España.
        if (overseaAddress != null) {
            this.addressInSpain = null; // Limpia el campo de dirección en España.
        }
        this.overseaAddress = overseaAddress;
    }
}
