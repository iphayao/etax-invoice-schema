//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.12 at 05:38:41 PM ICT 
//


package etda.uncefact.data.standard.abbreviatedtaxinvoice_reusableaggregatebusinessinformationentity._2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import etda.uncefact.data.standard.qualifieddatatype._1.AmountType;
import etda.uncefact.data.standard.qualifieddatatype._1.TaxTypeCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005832&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Trade_ Tax. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A Cross Industry (CI) trade related fiscal tax, duty or levy.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tax&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry Trade&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:IndustryContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:BusinessProcessRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SupportingRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SupportingRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SystemCapabilitiesContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:ns1="urn:un:unece:uncefact:data:Standard:QualifiedDataType:19" xmlns:ns2="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:19" xmlns:ns3="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:19" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:AbbreviatedTaxInvoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SystemCapabilitiesContextValue&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TradeTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeTaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}TaxTypeCodeType"/&gt;
 *         &lt;element name="CalculatedRate" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}PercentageRate"/&gt;
 *         &lt;element name="BasisAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CalculatedAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTaxType", propOrder = {
    "typeCode",
    "calculatedRate",
    "basisAmount",
    "calculatedAmount"
})
public class TradeTaxType {

    @XmlElement(name = "TypeCode", required = true)
    protected TaxTypeCodeType typeCode;
    @XmlElement(name = "CalculatedRate", required = true)
    protected BigDecimal calculatedRate;
    @XmlElement(name = "BasisAmount", required = true)
    protected List<AmountType> basisAmount;
    @XmlElement(name = "CalculatedAmount", required = true)
    protected List<AmountType> calculatedAmount;

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public TaxTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public void setTypeCode(TaxTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the calculatedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedRate() {
        return calculatedRate;
    }

    /**
     * Sets the value of the calculatedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedRate(BigDecimal value) {
        this.calculatedRate = value;
    }

    /**
     * Gets the value of the basisAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the basisAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasisAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getBasisAmount() {
        if (basisAmount == null) {
            basisAmount = new ArrayList<AmountType>();
        }
        return this.basisAmount;
    }

    /**
     * Gets the value of the calculatedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the calculatedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculatedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getCalculatedAmount() {
        if (calculatedAmount == null) {
            calculatedAmount = new ArrayList<AmountType>();
        }
        return this.calculatedAmount;
    }

}
