
package com.anatwine.brand.model.order;

import java.math.BigInteger;
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
 *         &lt;element name="orderLineId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="brandArticleSku" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}brandArticleSku" minOccurs="0"/>
 *         &lt;element name="ean" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}ean"/>
 *         &lt;element name="retailerArticleSku" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}brandArticleSku"/>
 *         &lt;element name="retailerSizeId" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}brandArticleSku" minOccurs="0"/>
 *         &lt;element name="orderLinePrice" type="{http://api.anatwine.com/schemas/brand/v3/order}orderLinePrice"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="articleDescription" type="{http://api.anatwine.com/schemas/brand/v3/order}articleDescription"/>
 *         &lt;element name="deliveryServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orderLineId",
    "brandArticleSku",
    "ean",
    "retailerArticleSku",
    "retailerSizeId",
    "orderLinePrice",
    "quantity",
    "articleDescription",
    "deliveryServiceCode",
    "extensions"
})
@XmlRootElement(name = "orderLine", namespace = "http://api.anatwine.com/schemas/brand/v3/order")
public class OrderLine {

    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected BigInteger orderLineId;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected String brandArticleSku;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected String ean;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected String retailerArticleSku;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected String retailerSizeId;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected OrderLinePrice orderLinePrice;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected BigInteger quantity;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order", required = true)
    protected String articleDescription;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected String deliveryServiceCode;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/order")
    protected Extensions extensions;

    /**
     * Gets the value of the orderLineId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderLineId() {
        return orderLineId;
    }

    /**
     * Sets the value of the orderLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderLineId(BigInteger value) {
        this.orderLineId = value;
    }

    /**
     * Gets the value of the brandArticleSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandArticleSku() {
        return brandArticleSku;
    }

    /**
     * Sets the value of the brandArticleSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandArticleSku(String value) {
        this.brandArticleSku = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the retailerArticleSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerArticleSku() {
        return retailerArticleSku;
    }

    /**
     * Sets the value of the retailerArticleSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerArticleSku(String value) {
        this.retailerArticleSku = value;
    }

    /**
     * Gets the value of the retailerSizeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerSizeId() {
        return retailerSizeId;
    }

    /**
     * Sets the value of the retailerSizeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerSizeId(String value) {
        this.retailerSizeId = value;
    }

    /**
     * Gets the value of the orderLinePrice property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLinePrice }
     *     
     */
    public OrderLinePrice getOrderLinePrice() {
        return orderLinePrice;
    }

    /**
     * Sets the value of the orderLinePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLinePrice }
     *     
     */
    public void setOrderLinePrice(OrderLinePrice value) {
        this.orderLinePrice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the articleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleDescription() {
        return articleDescription;
    }

    /**
     * Sets the value of the articleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleDescription(String value) {
        this.articleDescription = value;
    }

    /**
     * Gets the value of the deliveryServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceCode() {
        return deliveryServiceCode;
    }

    /**
     * Sets the value of the deliveryServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceCode(String value) {
        this.deliveryServiceCode = value;
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
