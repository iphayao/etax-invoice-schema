//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package etda.uncefact.data.standard.receipt_reusableaggregatebusinessinformationentity._2;

import java.util.ArrayList;
import java.util.List;
import etda.uncefact.data.standard.qualifieddatatype._1.AmountType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005941&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Settlement_ Monetary Summation. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A collection of trade settlement monetary totals specified for this Cross Industry Invoice Header (CIIH).&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Monetary Summation&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIIH&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Settlement&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Invoicing&lt;/ccts:BusinessProcessContextValue&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Receipt_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry&lt;/ccts:IndustryContextValue&gt;
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
 * <p>Java class for TradeSettlementHeaderMonetarySummationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeSettlementHeaderMonetarySummationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineTotalAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AllowanceTotalAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChargeTotalAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxBasisTotalAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxTotalAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GrandTotalAmount" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}AmountType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSettlementHeaderMonetarySummationType", propOrder = {
    "lineTotalAmount",
    "allowanceTotalAmount",
    "chargeTotalAmount",
    "taxBasisTotalAmount",
    "taxTotalAmount",
    "grandTotalAmount"
})
public class TradeSettlementHeaderMonetarySummationType {

    @XmlElement(name = "LineTotalAmount")
    protected List<AmountType> lineTotalAmount;
    @XmlElement(name = "AllowanceTotalAmount")
    protected List<AmountType> allowanceTotalAmount;
    @XmlElement(name = "ChargeTotalAmount")
    protected List<AmountType> chargeTotalAmount;
    @XmlElement(name = "TaxBasisTotalAmount")
    protected List<AmountType> taxBasisTotalAmount;
    @XmlElement(name = "TaxTotalAmount")
    protected List<AmountType> taxTotalAmount;
    @XmlElement(name = "GrandTotalAmount", required = true)
    protected List<AmountType> grandTotalAmount;

    /**
     * Gets the value of the lineTotalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lineTotalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineTotalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getLineTotalAmount() {
        if (lineTotalAmount == null) {
            lineTotalAmount = new ArrayList<AmountType>();
        }
        return this.lineTotalAmount;
    }

    /**
     * Gets the value of the allowanceTotalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceTotalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceTotalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAllowanceTotalAmount() {
        if (allowanceTotalAmount == null) {
            allowanceTotalAmount = new ArrayList<AmountType>();
        }
        return this.allowanceTotalAmount;
    }

    /**
     * Gets the value of the chargeTotalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chargeTotalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeTotalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getChargeTotalAmount() {
        if (chargeTotalAmount == null) {
            chargeTotalAmount = new ArrayList<AmountType>();
        }
        return this.chargeTotalAmount;
    }

    /**
     * Gets the value of the taxBasisTotalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxBasisTotalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxBasisTotalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getTaxBasisTotalAmount() {
        if (taxBasisTotalAmount == null) {
            taxBasisTotalAmount = new ArrayList<AmountType>();
        }
        return this.taxBasisTotalAmount;
    }

    /**
     * Gets the value of the taxTotalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getTaxTotalAmount() {
        if (taxTotalAmount == null) {
            taxTotalAmount = new ArrayList<AmountType>();
        }
        return this.taxTotalAmount;
    }

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the grandTotalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrandTotalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getGrandTotalAmount() {
        if (grandTotalAmount == null) {
            grandTotalAmount = new ArrayList<AmountType>();
        }
        return this.grandTotalAmount;
    }

}
