
package com.oracle.ofss.obp.cz.header;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="Contact Centre"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="IVR Telephony"/>
 *     &lt;enumeration value="Relationship Managed"/>
 *     &lt;enumeration value="External Broker"/>
 *     &lt;enumeration value="External EFA"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="BT Online"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelType")
@XmlEnum
public enum ChannelType {

    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("Contact Centre")
    CONTACT_CENTRE("Contact Centre"),
    ATM("ATM"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("IVR Telephony")
    IVR_TELEPHONY("IVR Telephony"),
    @XmlEnumValue("Relationship Managed")
    RELATIONSHIP_MANAGED("Relationship Managed"),
    @XmlEnumValue("External Broker")
    EXTERNAL_BROKER("External Broker"),
    @XmlEnumValue("External EFA")
    EXTERNAL_EFA("External EFA"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("BT Online")
    BT_ONLINE("BT Online");
    private final String value;

    ChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelType fromValue(String v) {
        for (ChannelType c: ChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
