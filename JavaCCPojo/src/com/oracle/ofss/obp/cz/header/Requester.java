
package com.oracle.ofss.obp.cz.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Requester complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Requester">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requesterType" type="{http://www.oracle.com/ofss/obp/cz/header/}RequesterType"/>
 *         &lt;element name="requesterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requesterGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Requester", propOrder = {
    "requesterType",
    "requesterId",
    "requesterGroupType"
})
public class Requester {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RequesterType requesterType;
    @XmlElement(required = true)
    protected String requesterId;
    protected String requesterGroupType;

    /**
     * Gets the value of the requesterType property.
     * 
     * @return
     *     possible object is
     *     {@link RequesterType }
     *     
     */
    public RequesterType getRequesterType() {
        return requesterType;
    }

    /**
     * Sets the value of the requesterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequesterType }
     *     
     */
    public void setRequesterType(RequesterType value) {
        this.requesterType = value;
    }

    /**
     * Gets the value of the requesterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * Sets the value of the requesterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
    }

    /**
     * Gets the value of the requesterGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterGroupType() {
        return requesterGroupType;
    }

    /**
     * Sets the value of the requesterGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterGroupType(String value) {
        this.requesterGroupType = value;
    }

}
