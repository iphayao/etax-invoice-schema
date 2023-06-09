//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package un.unece.uncefact.codelist.standard.unece.addresstype.d14a;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AddressTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A")
@XmlEnum
public enum AddressTypeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Postal address&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The address is representing a postal address.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("1")
    VALUE_1("1"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Fiscal address&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identification of an address as required by fiscal administrations.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("2")
    VALUE_2("2"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Physical address&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm63131="urn:un:unece:uncefact:codelist:standard:UNECE:AddressType:D14A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The address represents an actual physical location.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("3")
    VALUE_3("3");
    private final String value;

    AddressTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressTypeContentType fromValue(String v) {
        for (AddressTypeContentType c: AddressTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
