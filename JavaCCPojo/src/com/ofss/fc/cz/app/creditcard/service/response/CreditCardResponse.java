
package com.ofss.fc.cz.app.creditcard.service.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.ofss.obp.cz.status.ServiceStatus;


/**
 * <p>Java class for creditCardResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCardResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.oracle.com/ofss/obp/cz/status/}serviceStatus"/>
 *         &lt;element name="data" type="{http://response.service.creditcard.app.cz.fc.ofss.com}CreditCardFulfilmentResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardResponse", propOrder = {
    "serviceStatus",
    "data"
})
public class CreditCardResponse {

    @XmlElement(namespace = "http://www.oracle.com/ofss/obp/cz/status/", required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected CreditCardFulfilmentResponse data;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardFulfilmentResponse }
     *     
     */
    public CreditCardFulfilmentResponse getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardFulfilmentResponse }
     *     
     */
    public void setData(CreditCardFulfilmentResponse value) {
        this.data = value;
    }

}
