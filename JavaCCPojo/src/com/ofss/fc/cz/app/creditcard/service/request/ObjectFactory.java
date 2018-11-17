
package com.ofss.fc.cz.app.creditcard.service.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ofss.fc.cz.app.creditcard.service.request package. 
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

    private final static QName _CreateCreditCardRequest_QNAME = new QName("http://request.service.creditcard.app.cz.fc.ofss.com", "createCreditCardRequest");
    private final static QName _AddCreditCardRequest_QNAME = new QName("http://request.service.creditcard.app.cz.fc.ofss.com", "addCreditCardRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ofss.fc.cz.app.creditcard.service.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCreditCardRequest }
     * 
     */
    public CreateCreditCardRequest createCreateCreditCardRequest() {
        return new CreateCreditCardRequest();
    }

    /**
     * Create an instance of {@link AddCreditCardRequest }
     * 
     */
    public AddCreditCardRequest createAddCreditCardRequest() {
        return new AddCreditCardRequest();
    }

    /**
     * Create an instance of {@link CreditCardFulfilmentRequest }
     * 
     */
    public CreditCardFulfilmentRequest createCreditCardFulfilmentRequest() {
        return new CreditCardFulfilmentRequest();
    }

    /**
     * Create an instance of {@link MembershipIdType }
     * 
     */
    public MembershipIdType createMembershipIdType() {
        return new MembershipIdType();
    }

    /**
     * Create an instance of {@link PromotionalpricingType }
     * 
     */
    public PromotionalpricingType createPromotionalpricingType() {
        return new PromotionalpricingType();
    }

    /**
     * Create an instance of {@link CustomerIdentifierType }
     * 
     */
    public CustomerIdentifierType createCustomerIdentifierType() {
        return new CustomerIdentifierType();
    }

    /**
     * Create an instance of {@link ElectronicCommunicationConsent }
     * 
     */
    public ElectronicCommunicationConsent createElectronicCommunicationConsent() {
        return new ElectronicCommunicationConsent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCreditCardRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.creditcard.app.cz.fc.ofss.com", name = "createCreditCardRequest")
    public JAXBElement<CreateCreditCardRequest> createCreateCreditCardRequest(CreateCreditCardRequest value) {
        return new JAXBElement<CreateCreditCardRequest>(_CreateCreditCardRequest_QNAME, CreateCreditCardRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCreditCardRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://request.service.creditcard.app.cz.fc.ofss.com", name = "addCreditCardRequest")
    public JAXBElement<AddCreditCardRequest> createAddCreditCardRequest(AddCreditCardRequest value) {
        return new JAXBElement<AddCreditCardRequest>(_AddCreditCardRequest_QNAME, AddCreditCardRequest.class, null, value);
    }

}
