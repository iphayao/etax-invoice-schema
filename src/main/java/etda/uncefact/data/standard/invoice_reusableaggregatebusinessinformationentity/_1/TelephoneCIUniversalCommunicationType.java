//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package etda.uncefact.data.standard.invoice_reusableaggregatebusinessinformationentity._1;

import etda.uncefact.data.standard.invoice_qualifieddatatype._1.Max256IDType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneCIUniversalCommunicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneCIUniversalCommunicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URIID" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}Max256IDType" minOccurs="0"/&gt;
 *         &lt;element name="CompleteNumber" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}PhoneNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneCIUniversalCommunicationType", propOrder = {
    "uriid",
    "completeNumber"
})
public class TelephoneCIUniversalCommunicationType {

    @XmlElement(name = "URIID")
    protected Max256IDType uriid;
    @XmlElement(name = "CompleteNumber")
    protected String completeNumber;

    /**
     * Gets the value of the uriid property.
     * 
     * @return
     *     possible object is
     *     {@link Max256IDType }
     *     
     */
    public Max256IDType getURIID() {
        return uriid;
    }

    /**
     * Sets the value of the uriid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max256IDType }
     *     
     */
    public void setURIID(Max256IDType value) {
        this.uriid = value;
    }

    /**
     * Gets the value of the completeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteNumber() {
        return completeNumber;
    }

    /**
     * Sets the value of the completeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteNumber(String value) {
        this.completeNumber = value;
    }

}
