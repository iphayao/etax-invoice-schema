//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.12 at 05:38:41 PM ICT 
//


package etda.uncefact.data.standard.receipt_reusableaggregatebusinessinformationentity._2;

import etda.uncefact.data.standard.qualifieddatatype._1.Max16CodeType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max256TextType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesignatedProductClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignatedProductClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassCode" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max16CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ClassName" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max256TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesignatedProductClassificationType", propOrder = {
    "classCode",
    "className"
})
public class DesignatedProductClassificationType {

    @XmlElement(name = "ClassCode")
    protected Max16CodeType classCode;
    @XmlElement(name = "ClassName")
    protected Max256TextType className;

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link Max16CodeType }
     *     
     */
    public Max16CodeType getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max16CodeType }
     *     
     */
    public void setClassCode(Max16CodeType value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link Max256TextType }
     *     
     */
    public Max256TextType getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max256TextType }
     *     
     */
    public void setClassName(Max256TextType value) {
        this.className = value;
    }

}
