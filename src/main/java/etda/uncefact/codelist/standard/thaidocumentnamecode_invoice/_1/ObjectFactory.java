//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package etda.uncefact.codelist.standard.thaidocumentnamecode_invoice._1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the etda.uncefact.codelist.standard.thaidocumentnamecode_invoice._1 package. 
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

    private final static QName _ThaiDocumentNameCodeInvoice_QNAME = new QName("urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1", "ThaiDocumentNameCodeInvoice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: etda.uncefact.codelist.standard.thaidocumentnamecode_invoice._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThaiDocumentNameCodeInvoiceContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThaiDocumentNameCodeInvoiceContentType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:etda:uncefact:codelist:standard:ThaiDocumentNameCode_Invoice:1", name = "ThaiDocumentNameCodeInvoice")
    public JAXBElement<ThaiDocumentNameCodeInvoiceContentType> createThaiDocumentNameCodeInvoice(ThaiDocumentNameCodeInvoiceContentType value) {
        return new JAXBElement<ThaiDocumentNameCodeInvoiceContentType>(_ThaiDocumentNameCodeInvoice_QNAME, ThaiDocumentNameCodeInvoiceContentType.class, null, value);
    }

}