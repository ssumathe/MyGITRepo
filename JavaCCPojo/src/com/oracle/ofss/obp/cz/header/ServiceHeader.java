
package com.oracle.ofss.obp.cz.header;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageAttributes" type="{http://www.oracle.com/ofss/obp/cz/header/}MessageAttributes" form="qualified"/>
 *         &lt;element name="applicationAttributes" type="{http://www.oracle.com/ofss/obp/cz/header/}ApplicationAttributes" form="qualified"/>
 *         &lt;element name="additionalInfo" type="{http://www.oracle.com/ofss/obp/cz/header/}AdditionalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHeader", propOrder = {
    "messageAttributes",
    "applicationAttributes",
    "additionalInfo"
})
public class ServiceHeader {

    @XmlElement(required = true)
    protected MessageAttributes messageAttributes;
    @XmlElement(required = true)
    protected ApplicationAttributes applicationAttributes;
    protected List<AdditionalInfo> additionalInfo;

    /**
     * Gets the value of the messageAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAttributes }
     *     
     */
    public MessageAttributes getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * Sets the value of the messageAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAttributes }
     *     
     */
    public void setMessageAttributes(MessageAttributes value) {
        this.messageAttributes = value;
    }

    /**
     * Gets the value of the applicationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAttributes }
     *     
     */
    public ApplicationAttributes getApplicationAttributes() {
        return applicationAttributes;
    }

    /**
     * Sets the value of the applicationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAttributes }
     *     
     */
    public void setApplicationAttributes(ApplicationAttributes value) {
        this.applicationAttributes = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * 
     * 
     */
    public List<AdditionalInfo> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalInfo>();
        }
        return this.additionalInfo;
    }

}
