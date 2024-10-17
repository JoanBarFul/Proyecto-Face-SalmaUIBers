package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author alexc
 */

@XmlType(propOrder = {
    "taxIdentification",
    "partyIdentification",
    "legalEntityOrIndividual" // Aquí es donde agregamos la elección entre LegalEntity e Individual
})
public class BuyerParty {
    private TaxIdentification taxIdentification;
    private String partyIdentification;
    private LegalEntity legalEntity;
    private Individual individual;

    @XmlElement(name = "TaxIdentification")
    public TaxIdentification getTaxIdentification() {
        return taxIdentification;
    }

    public void setTaxIdentification(TaxIdentification taxIdentification) {
        this.taxIdentification = taxIdentification;
    }

    @XmlElement(name = "PartyIdentification")
    public String getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(String partyIdentification) {
        this.partyIdentification = partyIdentification;
    }


    // Usamos @XmlElements para definir que puede ser o LegalEntity o Individual
    @XmlElements({
        @XmlElement(name = "LegalEntity", type = LegalEntity.class),
        @XmlElement(name = "Individual", type = Individual.class)
    })
    public Object getLegalEntityOrIndividual() {
        if (legalEntity != null) {
            return legalEntity;
        } else {
            return individual;
        }
    }

    public void setLegalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
        this.individual = null;  // Aseguramos que solo uno esté presente
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
        this.legalEntity = null;  // Aseguramos que solo uno esté presente
    }
}
