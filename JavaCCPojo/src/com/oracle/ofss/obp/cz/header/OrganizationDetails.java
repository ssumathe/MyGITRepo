
package com.oracle.ofss.obp.cz.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="legalEntity" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="marketEntity" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="targetBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDetails", propOrder = {
    "organizationId",
    "legalEntity",
    "marketEntity",
    "businessUnit",
    "targetBranch"
})
public class OrganizationDetails {

    @XmlElement(required = true)
    protected String organizationId;
    @XmlElement(required = true)
    protected String legalEntity;
    @XmlElement(required = true)
    protected String marketEntity;
    protected String businessUnit;
    protected String targetBranch;

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the legalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntity(String value) {
        this.legalEntity = value;
    }

    /**
     * Gets the value of the marketEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketEntity() {
        return marketEntity;
    }

    /**
     * Sets the value of the marketEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketEntity(String value) {
        this.marketEntity = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the targetBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    /**
     * Sets the value of the targetBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetBranch(String value) {
        this.targetBranch = value;
    }

}
