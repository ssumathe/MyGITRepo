
package com.ofss.fc.cz.app.creditcard.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for membershipIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="membershipIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="membershipId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="membershipType" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="memberFirstName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="memberLastName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "membershipIdType", propOrder = {
    "membershipId",
    "membershipType",
    "startdate",
    "memberFirstName",
    "memberLastName"
})
public class MembershipIdType {

    @XmlElement(required = true)
    protected String membershipId;
    @XmlElement(required = true)
    protected String membershipType;
    @XmlElement(required = true)
    protected String startdate;
    @XmlElement(required = true)
    protected String memberFirstName;
    @XmlElement(required = true)
    protected String memberLastName;

    /**
     * Gets the value of the membershipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipId() {
        return membershipId;
    }

    /**
     * Sets the value of the membershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipId(String value) {
        this.membershipId = value;
    }

    /**
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipType(String value) {
        this.membershipType = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartdate(String value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the memberFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberFirstName() {
        return memberFirstName;
    }

    /**
     * Sets the value of the memberFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberFirstName(String value) {
        this.memberFirstName = value;
    }

    /**
     * Gets the value of the memberLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberLastName() {
        return memberLastName;
    }

    /**
     * Sets the value of the memberLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberLastName(String value) {
        this.memberLastName = value;
    }

}
