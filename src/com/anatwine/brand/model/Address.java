
package com.anatwine.brand.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retailerCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address1" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType"/>
 *         &lt;element name="address2" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType" minOccurs="0"/>
 *         &lt;element name="address3" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType" minOccurs="0"/>
 *         &lt;element name="address4" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType" minOccurs="0"/>
 *         &lt;element name="address5" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType" minOccurs="0"/>
 *         &lt;element name="address6" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType"/>
 *         &lt;element name="city" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType"/>
 *         &lt;element name="state" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType" minOccurs="0"/>
 *         &lt;element name="country" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}AddressStringType"/>
 *         &lt;element name="addressString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}email"/>
 *         &lt;element name="homeTel" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}telephone" minOccurs="0"/>
 *         &lt;element name="mobileTel" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}telephone" minOccurs="0"/>
 *         &lt;element name="workTel" type="{http://api.anatwine.com/schemas/brand/v3/commonTypes}telephone" minOccurs="0"/>
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
@XmlType(name = "address", namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", propOrder = {
    "retailerCustomerNumber",
    "title",
    "firstName",
    "lastName",
    "address1",
    "address2",
    "address3",
    "address4",
    "address5",
    "address6",
    "zip",
    "city",
    "state",
    "country",
    "addressString",
    "email",
    "homeTel",
    "mobileTel",
    "workTel",
    "extensions"
})
public class Address {

    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected BigInteger retailerCustomerNumber;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String title;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String firstName;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String lastName;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String address1;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String address2;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String address3;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String address4;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String address5;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String address6;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String zip;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String city;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String state;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String country;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String addressString;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String email;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String homeTel;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String mobileTel;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String workTel;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected Extensions extensions;

    /**
     * Gets the value of the retailerCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetailerCustomerNumber() {
        return retailerCustomerNumber;
    }

    /**
     * Sets the value of the retailerCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetailerCustomerNumber(BigInteger value) {
        this.retailerCustomerNumber = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the address5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress5() {
        return address5;
    }

    /**
     * Sets the value of the address5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress5(String value) {
        this.address5 = value;
    }

    /**
     * Gets the value of the address6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress6() {
        return address6;
    }

    /**
     * Sets the value of the address6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress6(String value) {
        this.address6 = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the addressString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressString() {
        return addressString;
    }

    /**
     * Sets the value of the addressString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressString(String value) {
        this.addressString = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the homeTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTel() {
        return homeTel;
    }

    /**
     * Sets the value of the homeTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTel(String value) {
        this.homeTel = value;
    }

    /**
     * Gets the value of the mobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileTel() {
        return mobileTel;
    }

    /**
     * Sets the value of the mobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileTel(String value) {
        this.mobileTel = value;
    }

    /**
     * Gets the value of the workTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTel() {
        return workTel;
    }

    /**
     * Sets the value of the workTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTel(String value) {
        this.workTel = value;
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
