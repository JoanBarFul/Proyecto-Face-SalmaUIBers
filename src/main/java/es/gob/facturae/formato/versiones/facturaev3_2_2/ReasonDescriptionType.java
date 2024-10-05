
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReasonDescriptionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ReasonDescriptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Número de la factura"/&gt;
 *     &lt;enumeration value="Serie de la factura"/&gt;
 *     &lt;enumeration value="Fecha expedición"/&gt;
 *     &lt;enumeration value="Nombre y apellidos/Razón Social-Emisor"/&gt;
 *     &lt;enumeration value="Nombre y apellidos/Razón Social-Receptor"/&gt;
 *     &lt;enumeration value="Identificación fiscal Emisor/obligado"/&gt;
 *     &lt;enumeration value="Identificación fiscal Receptor"/&gt;
 *     &lt;enumeration value="Domicilio Emisor/Obligado"/&gt;
 *     &lt;enumeration value="Domicilio Receptor"/&gt;
 *     &lt;enumeration value="Detalle Operación"/&gt;
 *     &lt;enumeration value="Porcentaje impositivo a aplicar"/&gt;
 *     &lt;enumeration value="Cuota tributaria a aplicar"/&gt;
 *     &lt;enumeration value="Fecha/Periodo a aplicar"/&gt;
 *     &lt;enumeration value="Clase de factura"/&gt;
 *     &lt;enumeration value="Literales legales"/&gt;
 *     &lt;enumeration value="Base imponible"/&gt;
 *     &lt;enumeration value="Cálculo de cuotas repercutidas"/&gt;
 *     &lt;enumeration value="Cálculo de cuotas retenidas"/&gt;
 *     &lt;enumeration value="Base imponible modificada por devolución de envases / embalajes"/&gt;
 *     &lt;enumeration value="Base imponible modificada por descuentos y bonificaciones"/&gt;
 *     &lt;enumeration value="Base imponible modificada por resolución firme, judicial o administrativa"/&gt;
 *     &lt;enumeration value="Base imponible modificada cuotas repercutidas no satisfechas. Auto de declaración de concurso"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReasonDescriptionType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum ReasonDescriptionType {

    @XmlEnumValue("N\u00famero de la factura")
    NÚMERO_DE_LA_FACTURA("N\u00famero de la factura"),
    @XmlEnumValue("Serie de la factura")
    SERIE_DE_LA_FACTURA("Serie de la factura"),
    @XmlEnumValue("Fecha expedici\u00f3n")
    FECHA_EXPEDICIÓN("Fecha expedici\u00f3n"),
    @XmlEnumValue("Nombre y apellidos/Raz\u00f3n Social-Emisor")
    NOMBRE_Y_APELLIDOS_RAZÓN_SOCIAL_EMISOR("Nombre y apellidos/Raz\u00f3n Social-Emisor"),
    @XmlEnumValue("Nombre y apellidos/Raz\u00f3n Social-Receptor")
    NOMBRE_Y_APELLIDOS_RAZÓN_SOCIAL_RECEPTOR("Nombre y apellidos/Raz\u00f3n Social-Receptor"),
    @XmlEnumValue("Identificaci\u00f3n fiscal Emisor/obligado")
    IDENTIFICACIÓN_FISCAL_EMISOR_OBLIGADO("Identificaci\u00f3n fiscal Emisor/obligado"),
    @XmlEnumValue("Identificaci\u00f3n fiscal Receptor")
    IDENTIFICACIÓN_FISCAL_RECEPTOR("Identificaci\u00f3n fiscal Receptor"),
    @XmlEnumValue("Domicilio Emisor/Obligado")
    DOMICILIO_EMISOR_OBLIGADO("Domicilio Emisor/Obligado"),
    @XmlEnumValue("Domicilio Receptor")
    DOMICILIO_RECEPTOR("Domicilio Receptor"),
    @XmlEnumValue("Detalle Operaci\u00f3n")
    DETALLE_OPERACIÓN("Detalle Operaci\u00f3n"),
    @XmlEnumValue("Porcentaje impositivo a aplicar")
    PORCENTAJE_IMPOSITIVO_A_APLICAR("Porcentaje impositivo a aplicar"),
    @XmlEnumValue("Cuota tributaria a aplicar")
    CUOTA_TRIBUTARIA_A_APLICAR("Cuota tributaria a aplicar"),
    @XmlEnumValue("Fecha/Periodo a aplicar")
    FECHA_PERIODO_A_APLICAR("Fecha/Periodo a aplicar"),
    @XmlEnumValue("Clase de factura")
    CLASE_DE_FACTURA("Clase de factura"),
    @XmlEnumValue("Literales legales")
    LITERALES_LEGALES("Literales legales"),
    @XmlEnumValue("Base imponible")
    BASE_IMPONIBLE("Base imponible"),
    @XmlEnumValue("C\u00e1lculo de cuotas repercutidas")
    CÁLCULO_DE_CUOTAS_REPERCUTIDAS("C\u00e1lculo de cuotas repercutidas"),
    @XmlEnumValue("C\u00e1lculo de cuotas retenidas")
    CÁLCULO_DE_CUOTAS_RETENIDAS("C\u00e1lculo de cuotas retenidas"),
    @XmlEnumValue("Base imponible modificada por devoluci\u00f3n de envases / embalajes")
    BASE_IMPONIBLE_MODIFICADA_POR_DEVOLUCIÓN_DE_ENVASES_EMBALAJES("Base imponible modificada por devoluci\u00f3n de envases / embalajes"),
    @XmlEnumValue("Base imponible modificada por descuentos y bonificaciones")
    BASE_IMPONIBLE_MODIFICADA_POR_DESCUENTOS_Y_BONIFICACIONES("Base imponible modificada por descuentos y bonificaciones"),
    @XmlEnumValue("Base imponible modificada por resoluci\u00f3n firme, judicial o administrativa")
    BASE_IMPONIBLE_MODIFICADA_POR_RESOLUCIÓN_FIRME_JUDICIAL_O_ADMINISTRATIVA("Base imponible modificada por resoluci\u00f3n firme, judicial o administrativa"),
    @XmlEnumValue("Base imponible modificada cuotas repercutidas no satisfechas. Auto de declaraci\u00f3n de concurso")
    BASE_IMPONIBLE_MODIFICADA_CUOTAS_REPERCUTIDAS_NO_SATISFECHAS_AUTO_DE_DECLARACIÓN_DE_CONCURSO("Base imponible modificada cuotas repercutidas no satisfechas. Auto de declaraci\u00f3n de concurso");
    private final String value;

    ReasonDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonDescriptionType fromValue(String v) {
        for (ReasonDescriptionType c: ReasonDescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
