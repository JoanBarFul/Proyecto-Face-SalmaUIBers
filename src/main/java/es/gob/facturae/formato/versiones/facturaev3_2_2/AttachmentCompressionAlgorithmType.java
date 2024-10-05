
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttachmentCompressionAlgorithmType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AttachmentCompressionAlgorithmType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZIP"/&gt;
 *     &lt;enumeration value="GZIP"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentCompressionAlgorithmType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum AttachmentCompressionAlgorithmType {

    ZIP,
    GZIP,
    NONE;

    public String value() {
        return name();
    }

    public static AttachmentCompressionAlgorithmType fromValue(String v) {
        return valueOf(v);
    }

}
