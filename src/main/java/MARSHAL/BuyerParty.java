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
    "administrativeCentres",  // Debe estar definido como una lista de centros
    "legalEntityOrIndividual" // Aquí es donde agregamos la elección entre LegalEntity e Individual
})
public class BuyerParty {
    private TaxIdentification taxIdentification;
    private String partyIdentification;
    private AdministrativeCentres administrativeCentres;
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

    @XmlElement(name = "AdministrativeCentres")
    public AdministrativeCentres getAdministrativeCentres() {
        return administrativeCentres;
    }

    public void setAdministrativeCentres(AdministrativeCentres administrativeCentres) {
        this.administrativeCentres = administrativeCentres;
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
