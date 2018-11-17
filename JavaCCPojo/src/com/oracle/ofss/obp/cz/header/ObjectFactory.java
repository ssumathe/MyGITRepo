
package com.oracle.ofss.obp.cz.header;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.ofss.obp.cz.header package. 
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

    private final static QName _ServiceHeader_QNAME = new QName("http://www.oracle.com/ofss/obp/cz/header/", "serviceHeader");
    private final static QName _MessageAttributesExpiryTimestamp_QNAME = new QName("http://www.oracle.com/ofss/obp/cz/header/", "expiryTimestamp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.ofss.obp.cz.header
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceHeader }
     * 
     */
    public ServiceHeader createServiceHeader() {
        return new ServiceHeader();
    }

    /**
     * Create an instance of {@link MessageAttributes }
     * 
     */
    public MessageAttributes createMessageAttributes() {
        return new MessageAttributes();
    }

    /**
     * Create an instance of {@link AdditionalInfo }
     * 
     */
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }

    /**
     * Create an instance of {@link Requester }
     * 
     */
    public Requester createRequester() {
        return new Requester();
    }

    /**
     * Create an instance of {@link OrganizationDetails }
     * 
     */
    public OrganizationDetails createOrganizationDetails() {
        return new OrganizationDetails();
    }

    /**
     * Create an instance of {@link ApplicationAttributes }
     * 
     */
    public ApplicationAttributes createApplicationAttributes() {
        return new ApplicationAttributes();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/ofss/obp/cz/header/", name = "serviceHeader")
    public JAXBElement<ServiceHeader> createServiceHeader(ServiceHeader value) {
        return new JAXBElement<ServiceHeader>(_ServiceHeader_QNAME, ServiceHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/ofss/obp/cz/header/", name = "expiryTimestamp", scope = MessageAttributes.class)
    public JAXBElement<XMLGregorianCalendar> createMessageAttributesExpiryTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessageAttributesExpiryTimestamp_QNAME, XMLGregorianCalendar.class, MessageAttributes.class, value);
    }

}
