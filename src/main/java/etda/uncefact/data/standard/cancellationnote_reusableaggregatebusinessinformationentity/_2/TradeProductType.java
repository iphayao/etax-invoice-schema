//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package etda.uncefact.data.standard.cancellationnote_reusableaggregatebusinessinformationentity._2;

import java.util.ArrayList;
import java.util.List;
import etda.uncefact.data.standard.qualifieddatatype._1.Max256TextType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max35IDType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max70IDType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005809&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Trade_ Product. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Any tangible output or service produced by human or mechanical effort or by a natural process for Cross Industry (CI) trade purposes.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Product&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry Trade&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:IndustryContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:BusinessProcessRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SupportingRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SupportingRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SystemCapabilitiesContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SystemCapabilitiesContextValue&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TradeProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max35IDType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalID" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max70IDType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max256TextType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IndividualTradeProductInstance" type="{urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2}TradeProductInstanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginTradeCountry" type="{urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2}TradeCountryType" minOccurs="0"/&gt;
 *         &lt;element name="InformationNote" type="{urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2}NoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max256TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DesignatedProductClassification" type="{urn:etda:uncefact:data:standard:CancellationNote_ReusableAggregateBusinessInformationEntity:2}ProductClassificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeProductType", propOrder = {
    "id",
    "globalID",
    "name",
    "individualTradeProductInstance",
    "originTradeCountry",
    "informationNote",
    "description",
    "designatedProductClassification"
})
public class TradeProductType {

    @XmlElement(name = "ID")
    protected Max35IDType id;
    @XmlElement(name = "GlobalID")
    protected Max70IDType globalID;
    @XmlElement(name = "Name", required = true)
    protected List<Max256TextType> name;
    @XmlElement(name = "IndividualTradeProductInstance")
    protected List<TradeProductInstanceType> individualTradeProductInstance;
    @XmlElement(name = "OriginTradeCountry")
    protected TradeCountryType originTradeCountry;
    @XmlElement(name = "InformationNote")
    protected List<NoteType> informationNote;
    @XmlElement(name = "Description")
    protected List<Max256TextType> description;
    @XmlElement(name = "DesignatedProductClassification")
    protected ProductClassificationType designatedProductClassification;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Max35IDType }
     *     
     */
    public Max35IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max35IDType }
     *     
     */
    public void setID(Max35IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the globalID property.
     * 
     * @return
     *     possible object is
     *     {@link Max70IDType }
     *     
     */
    public Max70IDType getGlobalID() {
        return globalID;
    }

    /**
     * Sets the value of the globalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70IDType }
     *     
     */
    public void setGlobalID(Max70IDType value) {
        this.globalID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Max256TextType }
     * 
     * 
     */
    public List<Max256TextType> getName() {
        if (name == null) {
            name = new ArrayList<Max256TextType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the individualTradeProductInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the individualTradeProductInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualTradeProductInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeProductInstanceType }
     * 
     * 
     */
    public List<TradeProductInstanceType> getIndividualTradeProductInstance() {
        if (individualTradeProductInstance == null) {
            individualTradeProductInstance = new ArrayList<TradeProductInstanceType>();
        }
        return this.individualTradeProductInstance;
    }

    /**
     * Gets the value of the originTradeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCountryType }
     *     
     */
    public TradeCountryType getOriginTradeCountry() {
        return originTradeCountry;
    }

    /**
     * Sets the value of the originTradeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCountryType }
     *     
     */
    public void setOriginTradeCountry(TradeCountryType value) {
        this.originTradeCountry = value;
    }

    /**
     * Gets the value of the informationNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the informationNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getInformationNote() {
        if (informationNote == null) {
            informationNote = new ArrayList<NoteType>();
        }
        return this.informationNote;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Max256TextType }
     * 
     * 
     */
    public List<Max256TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<Max256TextType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the designatedProductClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassificationType }
     *     
     */
    public ProductClassificationType getDesignatedProductClassification() {
        return designatedProductClassification;
    }

    /**
     * Sets the value of the designatedProductClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassificationType }
     *     
     */
    public void setDesignatedProductClassification(ProductClassificationType value) {
        this.designatedProductClassification = value;
    }

}
