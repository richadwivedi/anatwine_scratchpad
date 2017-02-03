
package com.anatwine.brand.model.order;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="retailerChannelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anatwineOrderId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="retailerOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderPayment" type="{http://api.anatwine.com/schemas/brand/v3/order}orderPaymentValues"/>
 *         &lt;element name="extensions" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}extensions" minOccurs="0"/>
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
    "orderDate",
    "retailerChannelCode",
    "anatwineOrderId",
    "retailerOrderId",
    "orderPayment",
    "extensions"
})
@XmlRootElement(name = "orderHeader", namespace = "http://api.anatwine.com/schemas/brand/v3/order")
public class OrderHeader {

    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected String retailerChannelCode;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected BigInteger anatwineOrderId;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected String retailerOrderId;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    @XmlSchemaType(name = "string")
    protected OrderPaymentValues orderPayment;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected Extensions extensions;

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the retailerChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerChannelCode() {
        return retailerChannelCode;
    }

    /**
     * Sets the value of the retailerChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerChannelCode(String value) {
        this.retailerChannelCode = value;
    }

    /**
     * Gets the value of the anatwineOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnatwineOrderId() {
        return anatwineOrderId;
    }

    /**
     * Sets the value of the anatwineOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnatwineOrderId(BigInteger value) {
        this.anatwineOrderId = value;
    }

    /**
     * Gets the value of the retailerOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerOrderId() {
        return retailerOrderId;
    }

    /**
     * Sets the value of the retailerOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerOrderId(String value) {
        this.retailerOrderId = value;
    }

    /**
     * Gets the value of the orderPayment property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentValues }
     *     
     */
    public OrderPaymentValues getOrderPayment() {
        return orderPayment;
    }

    /**
     * Sets the value of the orderPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentValues }
     *     
     */
    public void setOrderPayment(OrderPaymentValues value) {
        this.orderPayment = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
