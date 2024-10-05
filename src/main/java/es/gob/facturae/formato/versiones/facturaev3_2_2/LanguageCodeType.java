
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LanguageCodeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="LanguageCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ar"/&gt;
 *     &lt;enumeration value="be"/&gt;
 *     &lt;enumeration value="bg"/&gt;
 *     &lt;enumeration value="ca"/&gt;
 *     &lt;enumeration value="cs"/&gt;
 *     &lt;enumeration value="da"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="el"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="et"/&gt;
 *     &lt;enumeration value="eu"/&gt;
 *     &lt;enumeration value="fi"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="ga"/&gt;
 *     &lt;enumeration value="gl"/&gt;
 *     &lt;enumeration value="hr"/&gt;
 *     &lt;enumeration value="hu"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="lv"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="mk"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="ro"/&gt;
 *     &lt;enumeration value="ru"/&gt;
 *     &lt;enumeration value="sk"/&gt;
 *     &lt;enumeration value="sl"/&gt;
 *     &lt;enumeration value="sq"/&gt;
 *     &lt;enumeration value="sr"/&gt;
 *     &lt;enumeration value="sv"/&gt;
 *     &lt;enumeration value="tr"/&gt;
 *     &lt;enumeration value="uk"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageCodeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum LanguageCodeType {


    /**
     * Arabe
     * 
     */
    @XmlEnumValue("ar")
    AR("ar"),

    /**
     * Bielorruso
     * 
     */
    @XmlEnumValue("be")
    BE("be"),

    /**
     * Búlgaro
     * 
     */
    @XmlEnumValue("bg")
    BG("bg"),

    /**
     * Catalán
     * 
     */
    @XmlEnumValue("ca")
    CA("ca"),

    /**
     * Checo
     * 
     */
    @XmlEnumValue("cs")
    CS("cs"),

    /**
     * Danés
     * 
     */
    @XmlEnumValue("da")
    DA("da"),

    /**
     * Alemán
     * 
     */
    @XmlEnumValue("de")
    DE("de"),

    /**
     * Griego moderno
     * 
     */
    @XmlEnumValue("el")
    EL("el"),

    /**
     * Inglés
     * 
     */
    @XmlEnumValue("en")
    EN("en"),

    /**
     * Español
     * 
     */
    @XmlEnumValue("es")
    ES("es"),

    /**
     * Estonio
     * 
     */
    @XmlEnumValue("et")
    ET("et"),

    /**
     * Vascuence
     * 
     */
    @XmlEnumValue("eu")
    EU("eu"),

    /**
     * Finlandés
     * 
     */
    @XmlEnumValue("fi")
    FI("fi"),

    /**
     * Francés
     * 
     */
    @XmlEnumValue("fr")
    FR("fr"),

    /**
     * Gaélico de Irlanda
     * 
     */
    @XmlEnumValue("ga")
    GA("ga"),

    /**
     * Gallego
     * 
     */
    @XmlEnumValue("gl")
    GL("gl"),

    /**
     * Croata
     * 
     */
    @XmlEnumValue("hr")
    HR("hr"),

    /**
     * Húngaro
     * 
     */
    @XmlEnumValue("hu")
    HU("hu"),

    /**
     * Islandés
     * 
     */
    @XmlEnumValue("is")
    IS("is"),

    /**
     * Italiano
     * 
     */
    @XmlEnumValue("it")
    IT("it"),

    /**
     * Letón
     * 
     */
    @XmlEnumValue("lv")
    LV("lv"),

    /**
     * Lituano
     * 
     */
    @XmlEnumValue("lt")
    LT("lt"),

    /**
     * Macedonio
     * 
     */
    @XmlEnumValue("mk")
    MK("mk"),

    /**
     * Maltés
     * 
     */
    @XmlEnumValue("mt")
    MT("mt"),

    /**
     * Neerlandés
     * 
     */
    @XmlEnumValue("nl")
    NL("nl"),

    /**
     * Noruego
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * Polaco
     * 
     */
    @XmlEnumValue("pl")
    PL("pl"),

    /**
     * Portugués
     * 
     */
    @XmlEnumValue("pt")
    PT("pt"),

    /**
     * Rumano
     * 
     */
    @XmlEnumValue("ro")
    RO("ro"),

    /**
     * Ruso
     * 
     */
    @XmlEnumValue("ru")
    RU("ru"),

    /**
     * Eslovaco
     * 
     */
    @XmlEnumValue("sk")
    SK("sk"),

    /**
     * Esloveno
     * 
     */
    @XmlEnumValue("sl")
    SL("sl"),

    /**
     * Albanés
     * 
     */
    @XmlEnumValue("sq")
    SQ("sq"),

    /**
     * Serbio
     * 
     */
    @XmlEnumValue("sr")
    SR("sr"),

    /**
     * Sueco
     * 
     */
    @XmlEnumValue("sv")
    SV("sv"),

    /**
     * Turco
     * 
     */
    @XmlEnumValue("tr")
    TR("tr"),

    /**
     * Ucraniano
     * 
     */
    @XmlEnumValue("uk")
    UK("uk");
    private final String value;

    LanguageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageCodeType fromValue(String v) {
        for (LanguageCodeType c: LanguageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
