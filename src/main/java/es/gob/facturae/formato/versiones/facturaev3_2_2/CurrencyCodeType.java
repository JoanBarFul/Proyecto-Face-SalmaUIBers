
package es.gob.facturae.formato.versiones.facturaev3_2_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CurrencyCodeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CurrencyCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFN"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AZN"/&gt;
 *     &lt;enumeration value="BAD"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BRR"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BYR"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="CDP"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DRP"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GEK"/&gt;
 *     &lt;enumeration value="GHC"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GWP"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MGF"/&gt;
 *     &lt;enumeration value="MNC"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZM"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIC"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NIS"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEI"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PES"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="RMB"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SRD"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *     &lt;enumeration value="TMM"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TPE"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UGS"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="UYP"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZWD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeType", namespace = "http://www.facturae.gob.es/formato/Versiones/Facturaev3_2_2.xml")
@XmlEnum
public enum CurrencyCodeType {

    AFN,
    ALL,
    AMD,
    ANG,
    AOA,
    ARS,
    AUD,
    AWG,
    AZN,
    BAD,
    BBD,
    BDT,
    BGN,
    BHD,
    BIF,
    BMD,
    BND,
    BOB,
    BRL,
    BRR,
    BSD,
    BWP,
    BYR,
    BZD,
    CAD,
    CDF,
    CDP,
    CHF,
    CLP,
    CNY,
    COP,
    CRC,
    CUP,
    CVE,
    CZK,
    DJF,
    DKK,
    DOP,
    DRP,
    DZD,
    EEK,
    EGP,
    ESP,
    ETB,
    EUR,
    FJD,
    FKP,
    GBP,
    GEK,
    GHC,
    GIP,
    GMD,
    GNF,
    GTQ,
    GWP,
    GYD,
    HKD,
    HNL,
    HRK,
    HTG,
    HUF,
    IDR,
    ILS,
    INR,
    IQD,
    IRR,
    ISK,
    JMD,
    JOD,
    JPY,
    KES,
    KGS,
    KHR,
    KMF,
    KPW,
    KRW,
    KWD,
    KYD,
    KZT,
    LAK,
    LBP,
    LKR,
    LRD,
    LSL,
    LTL,
    LVL,
    LYD,
    MAD,
    MDL,
    MGF,
    MNC,
    MNT,
    MOP,
    MRO,
    MUR,
    MVR,
    MWK,
    MXN,
    MYR,
    MZM,
    NGN,
    NIC,
    NIO,
    NIS,
    NOK,
    NPR,
    NZD,
    OMR,
    PAB,
    PEI,
    PEN,
    PES,
    PGK,
    PHP,
    PKR,
    PLN,
    PYG,
    QAR,
    RMB,
    RON,
    RUB,
    RWF,
    SAR,
    SBD,
    SCR,
    SDP,
    SEK,
    SGD,
    SHP,
    SKK,
    SLL,
    SOL,
    SOS,
    SRD,
    STD,
    SVC,
    SYP,
    SZL,
    THB,
    TJS,
    TMM,
    TND,
    TOP,
    TPE,
    TRY,
    TTD,
    TWD,
    TZS,
    UAH,
    UGS,
    USD,
    UYP,
    UYU,
    VEF,
    VND,
    VUV,
    WST,
    XAF,
    XCD,
    XOF,
    YER,
    ZAR,
    ZMK,
    ZWD;

    public String value() {
        return name();
    }

    public static CurrencyCodeType fromValue(String v) {
        return valueOf(v);
    }

}
