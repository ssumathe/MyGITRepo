
package com.ofss.fc.cz.app.creditcard.service.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ofss.fc.cz.app.creditcard.service.response package. 
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

    private final static QName _CreditCardResponse_QNAME = new QName("http://response.service.creditcard.app.cz.fc.ofss.com", "creditCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ofss.fc.cz.app.creditcard.service.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditCardResponse }
     * 
     */
    public CreditCardResponse createCreditCardResponse() {
        return new CreditCardResponse();
    }

    /**
     * Create an instance of {@link CreditCardFulfilmentResponse }
     * 
     */
    public CreditCardFulfilmentResponse createCreditCardFulfilmentResponse() {
        return new CreditCardFulfilmentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://response.service.creditcard.app.cz.fc.ofss.com", name = "creditCardResponse")
    public JAXBElement<CreditCardResponse> createCreditCardResponse(CreditCardResponse value) {
        return new JAXBElement<CreditCardResponse>(_CreditCardResponse_QNAME, CreditCardResponse.class, null, value);
    }

}
