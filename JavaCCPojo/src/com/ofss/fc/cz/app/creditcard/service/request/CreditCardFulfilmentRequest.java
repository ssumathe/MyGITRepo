
package com.ofss.fc.cz.app.creditcard.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardFulfilmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardFulfilmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandSilo" form="qualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="WPAC"/>
 *               &lt;enumeration value="SGBBSA"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="logoId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="cardCreationMode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="isInsuranceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="billingCycleDay" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="pricingCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="applicationReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="isJointlyOwned" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="cardCollectionBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="cardEmbossedName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="plasticStockCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="cardAdminBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="customerId" type="{http://request.service.creditcard.app.cz.fc.ofss.com}customerIdentifierType" form="qualified"/>
 *         &lt;element name="loyalty" type="{http://request.service.creditcard.app.cz.fc.ofss.com}membershipIdType" form="qualified"/>
 *         &lt;element name="electronicCommunicationConsent" type="{http://request.service.creditcard.app.cz.fc.ofss.com}electronicCommunicationConsent" form="qualified"/>
 *         &lt;element name="promotionalpricing" type="{http://request.service.creditcard.app.cz.fc.ofss.com}promotionalpricingType" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardFulfilmentRequest", propOrder = {
    "brandSilo",
    "segment",
    "accountId",
    "logoId",
    "cardCreationMode",
    "isInsuranceRequired",
    "creditLimit",
    "billingCycleDay",
    "pricingCode",
    "applicationReferenceId",
    "isJointlyOwned",
    "cardCollectionBranchCode",
    "cardEmbossedName",
    "plasticStockCode",
    "cardAdminBranchCode",
    "notes",
    "customerId",
    "loyalty",
    "electronicCommunicationConsent",
    "promotionalpricing"
})
public class CreditCardFulfilmentRequest {

    @XmlElement(required = true)
    protected String brandSilo;
    @XmlElement(required = true)
    protected String segment;
    @XmlElement(required = true)
    protected String accountId;
    @XmlElement(required = true)
    protected String logoId;
    @XmlElement(required = true)
    protected String cardCreationMode;
    protected boolean isInsuranceRequired;
    @XmlElement(required = true)
    protected String creditLimit;
    protected int billingCycleDay;
    @XmlElement(required = true)
    protected String pricingCode;
    @XmlElement(required = true)
    protected String applicationReferenceId;
    protected boolean isJointlyOwned;
    @XmlElement(required = true)
    protected String cardCollectionBranchCode;
    @XmlElement(required = true)
    protected String cardEmbossedName;
    @XmlElement(required = true)
    protected String plasticStockCode;
    @XmlElement(required = true)
    protected String cardAdminBranchCode;
    @XmlElement(required = true)
    protected String notes;
    @XmlElement(required = true)
    protected CustomerIdentifierType customerId;
    @XmlElement(required = true)
    protected MembershipIdType loyalty;
    @XmlElement(required = true)
    protected ElectronicCommunicationConsent electronicCommunicationConsent;
    @XmlElement(required = true)
    protected PromotionalpricingType promotionalpricing;

    /**
     * Gets the value of the brandSilo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandSilo() {
        return brandSilo;
    }

    /**
     * Sets the value of the brandSilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandSilo(String value) {
        this.brandSilo = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the logoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoId() {
        return logoId;
    }

    /**
     * Sets the value of the logoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoId(String value) {
        this.logoId = value;
    }

    /**
     * Gets the value of the cardCreationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCreationMode() {
        return cardCreationMode;
    }

    /**
     * Sets the value of the cardCreationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCreationMode(String value) {
        this.cardCreationMode = value;
    }

    /**
     * Gets the value of the isInsuranceRequired property.
     * 
     */
    public boolean isIsInsuranceRequired() {
        return isInsuranceRequired;
    }

    /**
     * Sets the value of the isInsuranceRequired property.
     * 
     */
    public void setIsInsuranceRequired(boolean value) {
        this.isInsuranceRequired = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the billingCycleDay property.
     * 
     */
    public int getBillingCycleDay() {
        return billingCycleDay;
    }

    /**
     * Sets the value of the billingCycleDay property.
     * 
     */
    public void setBillingCycleDay(int value) {
        this.billingCycleDay = value;
    }

    /**
     * Gets the value of the pricingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCode() {
        return pricingCode;
    }

    /**
     * Sets the value of the pricingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCode(String value) {
        this.pricingCode = value;
    }

    /**
     * Gets the value of the applicationReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationReferenceId() {
        return applicationReferenceId;
    }

    /**
     * Sets the value of the applicationReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationReferenceId(String value) {
        this.applicationReferenceId = value;
    }

    /**
     * Gets the value of the isJointlyOwned property.
     * 
     */
    public boolean isIsJointlyOwned() {
        return isJointlyOwned;
    }

    /**
     * Sets the value of the isJointlyOwned property.
     * 
     */
    public void setIsJointlyOwned(boolean value) {
        this.isJointlyOwned = value;
    }

    /**
     * Gets the value of the cardCollectionBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCollectionBranchCode() {
        return cardCollectionBranchCode;
    }

    /**
     * Sets the value of the cardCollectionBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCollectionBranchCode(String value) {
        this.cardCollectionBranchCode = value;
    }

    /**
     * Gets the value of the cardEmbossedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossedName() {
        return cardEmbossedName;
    }

    /**
     * Sets the value of the cardEmbossedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossedName(String value) {
        this.cardEmbossedName = value;
    }

    /**
     * Gets the value of the plasticStockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticStockCode() {
        return plasticStockCode;
    }

    /**
     * Sets the value of the plasticStockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticStockCode(String value) {
        this.plasticStockCode = value;
    }

    /**
     * Gets the value of the cardAdminBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAdminBranchCode() {
        return cardAdminBranchCode;
    }

    /**
     * Sets the value of the cardAdminBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAdminBranchCode(String value) {
        this.cardAdminBranchCode = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public CustomerIdentifierType getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifierType }
     *     
     */
    public void setCustomerId(CustomerIdentifierType value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the loyalty property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipIdType }
     *     
     */
    public MembershipIdType getLoyalty() {
        return loyalty;
    }

    /**
     * Sets the value of the loyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipIdType }
     *     
     */
    public void setLoyalty(MembershipIdType value) {
        this.loyalty = value;
    }

    /**
     * Gets the value of the electronicCommunicationConsent property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicCommunicationConsent }
     *     
     */
    public ElectronicCommunicationConsent getElectronicCommunicationConsent() {
        return electronicCommunicationConsent;
    }

    /**
     * Sets the value of the electronicCommunicationConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicCommunicationConsent }
     *     
     */
    public void setElectronicCommunicationConsent(ElectronicCommunicationConsent value) {
        this.electronicCommunicationConsent = value;
    }

    /**
     * Gets the value of the promotionalpricing property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalpricingType }
     *     
     */
    public PromotionalpricingType getPromotionalpricing() {
        return promotionalpricing;
    }

    /**
     * Sets the value of the promotionalpricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalpricingType }
     *     
     */
    public void setPromotionalpricing(PromotionalpricingType value) {
        this.promotionalpricing = value;
    }

}
