
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceIssuerTypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="InvoiceIssuerTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="RE"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceIssuerTypeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum InvoiceIssuerTypeType {


    /**
     * Proveedor (Emisor).
     * 
     */
    EM,

    /**
     * Cliente (Receptor).
     * 
     */
    RE,

    /**
     * Tercero.
     * 
     */
    TE;

    public String value() {
        return name();
    }

    public static InvoiceIssuerTypeType fromValue(String v) {
        return valueOf(v);
    }

}
