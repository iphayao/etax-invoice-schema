//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package etda.uncefact.data.standard.qualifieddatatype._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import un.unece.uncefact.identifierlist.standard.citynamefromtisi1099_2548.CityNameCodeContentType;


/**
 * <p>Java class for TISI1099CityName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TISI1099CityName"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:identifierlist:standard:CityNameFromTISI1099_2548&gt;CityNameCodeContentType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TISI1099CityName", propOrder = {
    "value"
})
public class TISI1099CityName {

    @XmlValue
    protected CityNameCodeContentType value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CityNameCodeContentType }
     *     
     */
    public CityNameCodeContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityNameCodeContentType }
     *     
     */
    public void setValue(CityNameCodeContentType value) {
        this.value = value;
    }

}
