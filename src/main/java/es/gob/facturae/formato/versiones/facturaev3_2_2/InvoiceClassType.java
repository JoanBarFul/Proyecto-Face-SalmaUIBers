
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceClassType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="InvoiceClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OO"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="OC"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceClassType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum InvoiceClassType {


    /**
     * Original.
     * 
     */
    OO,

    /**
     * Original rectificativa
     * 
     */
    OR,

    /**
     * Original recapitulativa.
     * 
     */
    OC,

    /**
     * Copia original.
     * 
     */
    CO,

    /**
     * Copia rectificativa.
     * 
     */
    CR,

    /**
     * Copia recapitulativa.
     * 
     */
    CC;

    public String value() {
        return name();
    }

    public static InvoiceClassType fromValue(String v) {
        return valueOf(v);
    }

}
