
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttachmentEncodingType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AttachmentEncodingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASE64"/&gt;
 *     &lt;enumeration value="BER"/&gt;
 *     &lt;enumeration value="DER"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentEncodingType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum AttachmentEncodingType {

    @XmlEnumValue("BASE64")
    BASE_64("BASE64"),
    BER("BER"),
    DER("DER"),
    NONE("NONE");
    private final String value;

    AttachmentEncodingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentEncodingType fromValue(String v) {
        for (AttachmentEncodingType c: AttachmentEncodingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
