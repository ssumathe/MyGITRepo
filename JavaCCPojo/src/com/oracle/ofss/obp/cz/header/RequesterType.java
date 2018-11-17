
package com.oracle.ofss.obp.cz.header;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequesterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequesterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Staff"/>
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="Partner"/>
 *     &lt;enumeration value="Intermediary"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Profile Owner"/>
 *     &lt;enumeration value="Operator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequesterType")
@XmlEnum
public enum RequesterType {

    @XmlEnumValue("Staff")
    STAFF("Staff"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Partner")
    PARTNER("Partner"),
    @XmlEnumValue("Intermediary")
    INTERMEDIARY("Intermediary"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Profile Owner")
    PROFILE_OWNER("Profile Owner"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator");
    private final String value;

    RequesterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequesterType fromValue(String v) {
        for (RequesterType c: RequesterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
