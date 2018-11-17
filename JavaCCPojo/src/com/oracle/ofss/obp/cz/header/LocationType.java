
package com.oracle.ofss.obp.cz.header;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSB"/>
 *     &lt;enumeration value="Workstation"/>
 *     &lt;enumeration value="Server"/>
 *     &lt;enumeration value="Middleware"/>
 *     &lt;enumeration value="IP Address"/>
 *     &lt;enumeration value="Machine Name"/>
 *     &lt;enumeration value="Host Integration"/>
 *     &lt;enumeration value="Terminal"/>
 *     &lt;enumeration value="BusinessUnit"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Controller"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationType")
@XmlEnum
public enum LocationType {

    BSB("BSB"),
    @XmlEnumValue("Workstation")
    WORKSTATION("Workstation"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Middleware")
    MIDDLEWARE("Middleware"),
    @XmlEnumValue("IP Address")
    IP_ADDRESS("IP Address"),
    @XmlEnumValue("Machine Name")
    MACHINE_NAME("Machine Name"),
    @XmlEnumValue("Host Integration")
    HOST_INTEGRATION("Host Integration"),
    @XmlEnumValue("Terminal")
    TERMINAL("Terminal"),
    @XmlEnumValue("BusinessUnit")
    BUSINESS_UNIT("BusinessUnit"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Controller")
    CONTROLLER("Controller");
    private final String value;

    LocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationType fromValue(String v) {
        for (LocationType c: LocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
