//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.26 at 11:00:54 PM ICT 
//


package un.unece.uncefact.codelist.standard.unece.paymenttermstypecode.d14a;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.codelist.standard.unece.paymenttermstypecode.d14a package. 
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

    private final static QName _PaymentTermsTypeCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:UNECE:PaymentTermsTypeCode:D14A", "PaymentTermsTypeCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.codelist.standard.unece.paymenttermstypecode.d14a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsTypeCodeContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentTermsTypeCodeContentType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:PaymentTermsTypeCode:D14A", name = "PaymentTermsTypeCode")
    public JAXBElement<PaymentTermsTypeCodeContentType> createPaymentTermsTypeCode(PaymentTermsTypeCodeContentType value) {
        return new JAXBElement<PaymentTermsTypeCodeContentType>(_PaymentTermsTypeCode_QNAME, PaymentTermsTypeCodeContentType.class, null, value);
    }

}