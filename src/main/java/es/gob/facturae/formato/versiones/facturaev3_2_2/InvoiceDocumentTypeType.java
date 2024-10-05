
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceDocumentTypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="InvoiceDocumentTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FC"/&gt;
 *     &lt;enumeration value="FA"/&gt;
 *     &lt;enumeration value="AF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceDocumentTypeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum InvoiceDocumentTypeType {


    /**
     * Factura Completa.
     * 
     */
    FC,

    /**
     * Factura abreviada.
     * 
     */
    FA,

    /**
     * AutoFactura.
     * 
     */
    AF;

    public String value() {
        return name();
    }

    public static InvoiceDocumentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
