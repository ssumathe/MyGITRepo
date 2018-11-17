
package com.oracle.ofss.obp.cz.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationDetails" type="{http://www.oracle.com/ofss/obp/cz/header/}OrganizationDetails"/>
 *         &lt;element name="channel" type="{http://www.oracle.com/ofss/obp/cz/header/}ChannelType" form="qualified"/>
 *         &lt;element name="originatingSystemId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="originatingSubSystemId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="requester" type="{http://www.oracle.com/ofss/obp/cz/header/}Requester"/>
 *         &lt;element name="location" type="{http://www.oracle.com/ofss/obp/cz/header/}Location"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationAttributes", propOrder = {
    "organizationDetails",
    "channel",
    "originatingSystemId",
    "originatingSubSystemId",
    "requester",
    "location"
})
public class ApplicationAttributes {

    @XmlElement(required = true)
    protected OrganizationDetails organizationDetails;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ChannelType channel;
    @XmlElement(required = true)
    protected String originatingSystemId;
    @XmlElement(required = true)
    protected String originatingSubSystemId;
    @XmlElement(required = true)
    protected Requester requester;
    @XmlElement(required = true)
    protected Location location;

    /**
     * Gets the value of the organizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetails }
     *     
     */
    public OrganizationDetails getOrganizationDetails() {
        return organizationDetails;
    }

    /**
     * Sets the value of the organizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetails }
     *     
     */
    public void setOrganizationDetails(OrganizationDetails value) {
        this.organizationDetails = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChannel(ChannelType value) {
        this.channel = value;
    }

    /**
     * Gets the value of the originatingSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingSystemId() {
        return originatingSystemId;
    }

    /**
     * Sets the value of the originatingSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingSystemId(String value) {
        this.originatingSystemId = value;
    }

    /**
     * Gets the value of the originatingSubSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingSubSystemId() {
        return originatingSubSystemId;
    }

    /**
     * Sets the value of the originatingSubSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingSubSystemId(String value) {
        this.originatingSubSystemId = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link Requester }
     *     
     */
    public Requester getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requester }
     *     
     */
    public void setRequester(Requester value) {
        this.requester = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}
