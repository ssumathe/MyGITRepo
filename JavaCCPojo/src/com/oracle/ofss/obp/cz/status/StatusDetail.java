
package com.oracle.ofss.obp.cz.status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="providerErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="providerErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="providerErrorCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetail", propOrder = {
    "providerId",
    "providerErrorCode",
    "providerErrorDescription",
    "providerErrorCategory"
})
public class StatusDetail {

    @XmlElement(required = true)
    protected String providerId;
    @XmlElement(required = true)
    protected String providerErrorCode;
    protected String providerErrorDescription;
    protected String providerErrorCategory;

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the providerErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderErrorCode() {
        return providerErrorCode;
    }

    /**
     * Sets the value of the providerErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderErrorCode(String value) {
        this.providerErrorCode = value;
    }

    /**
     * Gets the value of the providerErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderErrorDescription() {
        return providerErrorDescription;
    }

    /**
     * Sets the value of the providerErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderErrorDescription(String value) {
        this.providerErrorDescription = value;
    }

    /**
     * Gets the value of the providerErrorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderErrorCategory() {
        return providerErrorCategory;
    }

    /**
     * Sets the value of the providerErrorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderErrorCategory(String value) {
        this.providerErrorCategory = value;
    }

}
