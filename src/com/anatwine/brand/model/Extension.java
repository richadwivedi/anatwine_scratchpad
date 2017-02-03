
package com.anatwine.brand.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extensionValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extension", namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", propOrder = {
    "extensionName",
    "extensionValue"
})
public class Extension {

    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String extensionName;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String extensionValue;

    /**
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionName() {
        return extensionName;
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(String value) {
        this.extensionName = value;
    }

    /**
     * Gets the value of the extensionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionValue() {
        return extensionValue;
    }

    /**
     * Sets the value of the extensionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionValue(String value) {
        this.extensionValue = value;
    }

}
