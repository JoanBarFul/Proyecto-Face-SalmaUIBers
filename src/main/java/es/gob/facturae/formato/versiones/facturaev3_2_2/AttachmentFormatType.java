
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttachmentFormatType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AttachmentFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="xml"/&gt;
 *     &lt;enumeration value="doc"/&gt;
 *     &lt;enumeration value="gif"/&gt;
 *     &lt;enumeration value="rtf"/&gt;
 *     &lt;enumeration value="pdf"/&gt;
 *     &lt;enumeration value="xls"/&gt;
 *     &lt;enumeration value="jpg"/&gt;
 *     &lt;enumeration value="bmp"/&gt;
 *     &lt;enumeration value="tiff"/&gt;
 *     &lt;enumeration value="html"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentFormatType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum AttachmentFormatType {

    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("rtf")
    RTF("rtf"),
    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("xls")
    XLS("xls"),
    @XmlEnumValue("jpg")
    JPG("jpg"),
    @XmlEnumValue("bmp")
    BMP("bmp"),
    @XmlEnumValue("tiff")
    TIFF("tiff"),
    @XmlEnumValue("html")
    HTML("html");
    private final String value;

    AttachmentFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentFormatType fromValue(String v) {
        for (AttachmentFormatType c: AttachmentFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
