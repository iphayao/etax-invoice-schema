//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package etda.uncefact.data.standard.debitcreditnote_reusableaggregatebusinessinformationentity._2;

import java.util.ArrayList;
import java.util.List;
import etda.uncefact.data.standard.qualifieddatatype._1.Max16CodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:etda:uncefact:data:standard:TaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:DebitCreditNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01002608&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassCode" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max16CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ClassName" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max256Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductClassificationType", propOrder = {
    "classCode",
    "className"
})
public class ProductClassificationType {

    @XmlElement(name = "ClassCode")
    protected Max16CodeType classCode;
    @XmlElement(name = "ClassName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> className;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the className property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassName() {
        if (className == null) {
            className = new ArrayList<String>();
        }
        return this.className;
    }

}
