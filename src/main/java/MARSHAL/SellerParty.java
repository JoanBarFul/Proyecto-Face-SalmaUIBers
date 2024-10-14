package MARSHAL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import formulario.PruebaFormulario;

/**
 *
 * @author alexc
 */

@XmlType(propOrder = {"taxIdentification", "legalEntityOrIndividual"})
public class SellerParty {
    private TaxIdentification taxIdentification;
    private LegalEntity legalEntity;
    private Individual individual;

    @XmlElement(name = "TaxIdentification")
    public TaxIdentification getTaxIdentification() {
        return taxIdentification;
    }

    public void setTaxIdentification(TaxIdentification taxIdentification) {
        this.taxIdentification = taxIdentification;
    }

    // Aquí utilizamos @XmlElements para definir la alternativa entre LegalEntity e Individual
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
        this.individual = null; // Solo puede haber uno, así que anulamos el otro
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
        this.legalEntity = null; // Solo puede haber uno, así que anulamos el otro
    }
    
    public void rellenar() {
        java.awt.Frame parentFrame = null;  // Puedes pasar un JFrame si lo tienes
        PruebaFormulario miFormulario = new PruebaFormulario(parentFrame, true, this); // Modal
        miFormulario.setVisible(true);
    }
}
