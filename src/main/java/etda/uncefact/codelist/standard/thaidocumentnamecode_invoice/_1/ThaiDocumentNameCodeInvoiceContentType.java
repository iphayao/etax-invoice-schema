//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package etda.uncefact.codelist.standard.thaidocumentnamecode_invoice._1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThaiDocumentNameCodeInvoiceContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ThaiDocumentNameCodeInvoiceContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="80"/&gt;
 *     &lt;enumeration value="81"/&gt;
 *     &lt;enumeration value="82"/&gt;
 *     &lt;enumeration value="380"/&gt;
 *     &lt;enumeration value="388"/&gt;
 *     &lt;enumeration value="T01"/&gt;
 *     &lt;enumeration value="T02"/&gt;
 *     &lt;enumeration value="T03"/&gt;
 *     &lt;enumeration value="T04"/&gt;
 *     &lt;enumeration value="T05"/&gt;
 *     &lt;enumeration value="T06"/&gt;
 *     &lt;enumeration value="T07"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThaiDocumentNameCodeInvoiceContentType", namespace = "urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1")
@XmlEnum
public enum ThaiDocumentNameCodeInvoiceContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Debit note related to goods or services&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Debit information related to a transaction for goods or services to the relevant party.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("80")
    VALUE_1("80"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Credit note related to goods or services&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Document message used to provide credit information related to a transaction for goods or services to the relevant party.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("81")
    VALUE_2("81"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Metered services invoice&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Document/message claiming payment for the supply of metered services (e.g., gas, electricity, etc.) supplied to a fixed meter whose consumption is measured over a period of time.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("82")
    VALUE_3("82"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Commercial invoice&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;(1334) Document/message claiming payment for goods or services supplied under conditions agreed between seller and buyer.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("380")
    VALUE_4("380"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Self-billed invoice&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An invoice the invoicee is producing instead of the seller.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("388")
    VALUE_5("388"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Consignment invoice&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Commercial invoice that covers a transaction other than one involving a sale.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("T01")
    VALUE_6("T01"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Factored credit note&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm61001Invoice="urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Credit note related to assigned invoice(s).&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("T02")
    VALUE_7("T02"),
    @XmlEnumValue("T03")
    VALUE_8("T03"),
    @XmlEnumValue("T04")
    VALUE_9("T04"),
    @XmlEnumValue("T05")
    VALUE_10("T05"),
    @XmlEnumValue("T06")
    VALUE_11("T06"),
    @XmlEnumValue("T07")
    VALUE_12("T07");
    private final String value;

    ThaiDocumentNameCodeInvoiceContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThaiDocumentNameCodeInvoiceContentType fromValue(String v) {
        for (ThaiDocumentNameCodeInvoiceContentType c: ThaiDocumentNameCodeInvoiceContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
