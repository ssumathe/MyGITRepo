
package com.ofss.fc.cz.app.creditcard.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.ofss.obp.cz.header.ServiceHeader;


/**
 * <p>Java class for addCreditCardRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addCreditCardRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.oracle.com/ofss/obp/cz/header/}serviceHeader"/>
 *         &lt;element name="CreditCardFulfilmentRequest" type="{http://request.service.creditcard.app.cz.fc.ofss.com}CreditCardFulfilmentRequest"/>
 *         &lt;element name="SubmissionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCreditCardRequest", propOrder = {
    "serviceHeader",
    "creditCardFulfilmentRequest",
    "submissionId",
    "applicationId"
})
public class AddCreditCardRequest {

    @XmlElement(namespace = "http://www.oracle.com/ofss/obp/cz/header/", required = true)
    protected ServiceHeader serviceHeader;
    @XmlElement(name = "CreditCardFulfilmentRequest", required = true)
    protected CreditCardFulfilmentRequest creditCardFulfilmentRequest;
    @XmlElement(name = "SubmissionId")
    protected String submissionId;
    @XmlElement(name = "ApplicationId")
    protected String applicationId;

    /**
     * Gets the value of the serviceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getServiceHeader() {
        return serviceHeader;
    }

    /**
     * Sets the value of the serviceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setServiceHeader(ServiceHeader value) {
        this.serviceHeader = value;
    }

    /**
     * Gets the value of the creditCardFulfilmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardFulfilmentRequest }
     *     
     */
    public CreditCardFulfilmentRequest getCreditCardFulfilmentRequest() {
        return creditCardFulfilmentRequest;
    }

    /**
     * Sets the value of the creditCardFulfilmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardFulfilmentRequest }
     *     
     */
    public void setCreditCardFulfilmentRequest(CreditCardFulfilmentRequest value) {
        this.creditCardFulfilmentRequest = value;
    }

    /**
     * Gets the value of the submissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionId() {
        return submissionId;
    }

    /**
     * Sets the value of the submissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionId(String value) {
        this.submissionId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

}
