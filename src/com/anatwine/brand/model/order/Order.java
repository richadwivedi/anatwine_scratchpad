
package com.anatwine.brand.model.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.anatwine.brand.model.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.anatwine.com/schemas/brand/v3/order}orderHeader"/>
 *         &lt;element name="billingAddress" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}address" minOccurs="0"/>
 *         &lt;element name="shippingAddress" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}address" minOccurs="0"/>
 *         &lt;element ref="{http://api.anatwine.com/schemas/brand/v3/order}orderLines" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderHeader",
    "billingAddress",
    "shippingAddress",
    "orderLines"
})
@XmlRootElement(name = "order", namespace = "http://api.anatwine.com/schemas/brand/v3/order")
public class Order {

    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected OrderHeader orderHeader;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected Address billingAddress;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected Address shippingAddress;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected OrderLines orderLines;

    /**
     * Gets the value of the orderHeader property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader }
     *     
     */
    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    /**
     * Sets the value of the orderHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader }
     *     
     */
    public void setOrderHeader(OrderHeader value) {
        this.orderHeader = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the orderLines property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLines }
     *     
     */
    public OrderLines getOrderLines() {
        return orderLines;
    }

    /**
     * Sets the value of the orderLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLines }
     *     
     */
    public void setOrderLines(OrderLines value) {
        this.orderLines = value;
    }

}
