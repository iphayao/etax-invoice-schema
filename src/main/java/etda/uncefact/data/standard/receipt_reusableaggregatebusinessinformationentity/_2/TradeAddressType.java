//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.12 at 05:38:41 PM ICT 
//


package etda.uncefact.data.standard.receipt_reusableaggregatebusinessinformationentity._2;

import etda.uncefact.data.standard.qualifieddatatype._1.CountryIDType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max16CodeType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max16TextType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max256TextType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max35IDType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max70TextType;
import etda.uncefact.data.standard.qualifieddatatype._1.TISI1099CityName;
import etda.uncefact.data.standard.qualifieddatatype._1.TISI1099CitySubDivisionName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005687&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Trade_ Address. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The place at which a particular Cross Industry (CI) trade related organization or person may be found or reached.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Address&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry Trade&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:IndustryContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:BusinessProcessRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SupportingRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SupportingRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SystemCapabilitiesContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SystemCapabilitiesContextValue&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TradeAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostcodeCode" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max16CodeType" minOccurs="0"/&gt;
 *         &lt;element name="BuildingName" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max70TextType" minOccurs="0"/&gt;
 *         &lt;element name="LineOne" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max256TextType" minOccurs="0"/&gt;
 *         &lt;element name="LineTwo" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max256TextType" minOccurs="0"/&gt;
 *         &lt;element name="LineThree" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max70TextType" minOccurs="0"/&gt;
 *         &lt;element name="LineFour" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max70TextType" minOccurs="0"/&gt;
 *         &lt;element name="LineFive" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max70TextType" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max70TextType" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}TISI1099CityName" minOccurs="0"/&gt;
 *         &lt;element name="CitySubDivisionName" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}TISI1099CitySubDivisionName" minOccurs="0"/&gt;
 *         &lt;element name="CountryID" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}CountryIDType" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubDivisionID" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max35IDType" minOccurs="0"/&gt;
 *         &lt;element name="BuildingNumber" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max16TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAddressType", propOrder = {
    "postcodeCode",
    "buildingName",
    "lineOne",
    "lineTwo",
    "lineThree",
    "lineFour",
    "lineFive",
    "streetName",
    "cityName",
    "citySubDivisionName",
    "countryID",
    "countrySubDivisionID",
    "buildingNumber"
})
public class TradeAddressType {

    @XmlElement(name = "PostcodeCode")
    protected Max16CodeType postcodeCode;
    @XmlElement(name = "BuildingName")
    protected Max70TextType buildingName;
    @XmlElement(name = "LineOne")
    protected Max256TextType lineOne;
    @XmlElement(name = "LineTwo")
    protected Max256TextType lineTwo;
    @XmlElement(name = "LineThree")
    protected Max70TextType lineThree;
    @XmlElement(name = "LineFour")
    protected Max70TextType lineFour;
    @XmlElement(name = "LineFive")
    protected Max70TextType lineFive;
    @XmlElement(name = "StreetName")
    protected Max70TextType streetName;
    @XmlElement(name = "CityName")
    protected TISI1099CityName cityName;
    @XmlElement(name = "CitySubDivisionName")
    protected TISI1099CitySubDivisionName citySubDivisionName;
    @XmlElement(name = "CountryID")
    protected CountryIDType countryID;
    @XmlElement(name = "CountrySubDivisionID")
    protected Max35IDType countrySubDivisionID;
    @XmlElement(name = "BuildingNumber")
    protected Max16TextType buildingNumber;

    /**
     * Gets the value of the postcodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Max16CodeType }
     *     
     */
    public Max16CodeType getPostcodeCode() {
        return postcodeCode;
    }

    /**
     * Sets the value of the postcodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max16CodeType }
     *     
     */
    public void setPostcodeCode(Max16CodeType value) {
        this.postcodeCode = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link Max70TextType }
     *     
     */
    public Max70TextType getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70TextType }
     *     
     */
    public void setBuildingName(Max70TextType value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the lineOne property.
     * 
     * @return
     *     possible object is
     *     {@link Max256TextType }
     *     
     */
    public Max256TextType getLineOne() {
        return lineOne;
    }

    /**
     * Sets the value of the lineOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max256TextType }
     *     
     */
    public void setLineOne(Max256TextType value) {
        this.lineOne = value;
    }

    /**
     * Gets the value of the lineTwo property.
     * 
     * @return
     *     possible object is
     *     {@link Max256TextType }
     *     
     */
    public Max256TextType getLineTwo() {
        return lineTwo;
    }

    /**
     * Sets the value of the lineTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max256TextType }
     *     
     */
    public void setLineTwo(Max256TextType value) {
        this.lineTwo = value;
    }

    /**
     * Gets the value of the lineThree property.
     * 
     * @return
     *     possible object is
     *     {@link Max70TextType }
     *     
     */
    public Max70TextType getLineThree() {
        return lineThree;
    }

    /**
     * Sets the value of the lineThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70TextType }
     *     
     */
    public void setLineThree(Max70TextType value) {
        this.lineThree = value;
    }

    /**
     * Gets the value of the lineFour property.
     * 
     * @return
     *     possible object is
     *     {@link Max70TextType }
     *     
     */
    public Max70TextType getLineFour() {
        return lineFour;
    }

    /**
     * Sets the value of the lineFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70TextType }
     *     
     */
    public void setLineFour(Max70TextType value) {
        this.lineFour = value;
    }

    /**
     * Gets the value of the lineFive property.
     * 
     * @return
     *     possible object is
     *     {@link Max70TextType }
     *     
     */
    public Max70TextType getLineFive() {
        return lineFive;
    }

    /**
     * Sets the value of the lineFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70TextType }
     *     
     */
    public void setLineFive(Max70TextType value) {
        this.lineFive = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link Max70TextType }
     *     
     */
    public Max70TextType getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max70TextType }
     *     
     */
    public void setStreetName(Max70TextType value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link TISI1099CityName }
     *     
     */
    public TISI1099CityName getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TISI1099CityName }
     *     
     */
    public void setCityName(TISI1099CityName value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the citySubDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link TISI1099CitySubDivisionName }
     *     
     */
    public TISI1099CitySubDivisionName getCitySubDivisionName() {
        return citySubDivisionName;
    }

    /**
     * Sets the value of the citySubDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TISI1099CitySubDivisionName }
     *     
     */
    public void setCitySubDivisionName(TISI1099CitySubDivisionName value) {
        this.citySubDivisionName = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link CountryIDType }
     *     
     */
    public CountryIDType getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryIDType }
     *     
     */
    public void setCountryID(CountryIDType value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the countrySubDivisionID property.
     * 
     * @return
     *     possible object is
     *     {@link Max35IDType }
     *     
     */
    public Max35IDType getCountrySubDivisionID() {
        return countrySubDivisionID;
    }

    /**
     * Sets the value of the countrySubDivisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max35IDType }
     *     
     */
    public void setCountrySubDivisionID(Max35IDType value) {
        this.countrySubDivisionID = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Max16TextType }
     *     
     */
    public Max16TextType getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max16TextType }
     *     
     */
    public void setBuildingNumber(Max16TextType value) {
        this.buildingNumber = value;
    }

}
