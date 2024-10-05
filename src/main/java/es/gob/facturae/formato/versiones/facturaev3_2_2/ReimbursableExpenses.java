
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReimbursableExpenses complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReimbursableExpenses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReimbursableExpenses" type="{http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml}ReimbursableExpensesType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReimbursableExpenses", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml", propOrder = {
    "reimbursableExpenses"
})
public class ReimbursableExpenses {

    @XmlElement(name = "ReimbursableExpenses", required = true)
    protected List<ReimbursableExpensesType> reimbursableExpenses;

    /**
     * Gets the value of the reimbursableExpenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reimbursableExpenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReimbursableExpenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReimbursableExpensesType }
     * 
     * 
     */
    public List<ReimbursableExpensesType> getReimbursableExpenses() {
        if (reimbursableExpenses == null) {
            reimbursableExpenses = new ArrayList<ReimbursableExpensesType>();
        }
        return this.reimbursableExpenses;
    }

}
