
package com.anatwine.brand.model.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderPaymentValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="orderPaymentValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "orderPaymentValues", namespace = "http://api.anatwine.com/schemas/brand/v3/order")
@XmlEnum
public enum OrderPaymentValues {

    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final String value;

    OrderPaymentValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderPaymentValues fromValue(String v) {
        for (OrderPaymentValues c: OrderPaymentValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
