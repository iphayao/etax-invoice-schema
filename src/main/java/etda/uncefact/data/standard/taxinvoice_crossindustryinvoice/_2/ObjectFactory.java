//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.12 at 05:38:41 PM ICT 
//


package etda.uncefact.data.standard.taxinvoice_crossindustryinvoice._2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the etda.uncefact.data.standard.taxinvoice_crossindustryinvoice._2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TaxInvoiceCrossIndustryInvoice_QNAME = new QName("urn:etda:uncefact:data:standard:TaxInvoice_CrossIndustryInvoice:2", "TaxInvoice_CrossIndustryInvoice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: etda.uncefact.data.standard.taxinvoice_crossindustryinvoice._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TaxInvoiceCrossIndustryInvoiceType }
     * 
     */
    public TaxInvoiceCrossIndustryInvoiceType createTaxInvoiceCrossIndustryInvoiceType() {
        return new TaxInvoiceCrossIndustryInvoiceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxInvoiceCrossIndustryInvoiceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxInvoiceCrossIndustryInvoiceType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:etda:uncefact:data:standard:TaxInvoice_CrossIndustryInvoice:2", name = "TaxInvoice_CrossIndustryInvoice")
    public JAXBElement<TaxInvoiceCrossIndustryInvoiceType> createTaxInvoiceCrossIndustryInvoice(TaxInvoiceCrossIndustryInvoiceType value) {
        return new JAXBElement<TaxInvoiceCrossIndustryInvoiceType>(_TaxInvoiceCrossIndustryInvoice_QNAME, TaxInvoiceCrossIndustryInvoiceType.class, null, value);
    }

}
