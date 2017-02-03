
package com.anatwine.brand.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for media complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="media">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mediaURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaFileReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "media", namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", propOrder = {
    "mediaType",
    "mediaURL",
    "mediaFileReference",
    "sortOrder",
    "extensions"
})
public class Media {

    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes", required = true)
    protected String mediaType;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String mediaURL;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected String mediaFileReference;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected int sortOrder;
    @XmlElement(namespace = "http://api.anatwine.com/schemas/brand/v3/commonTypes")
    protected Extensions extensions;

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the mediaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaURL() {
        return mediaURL;
    }

    /**
     * Sets the value of the mediaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaURL(String value) {
        this.mediaURL = value;
    }

    /**
     * Gets the value of the mediaFileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaFileReference() {
        return mediaFileReference;
    }

    /**
     * Sets the value of the mediaFileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaFileReference(String value) {
        this.mediaFileReference = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     */
    public void setSortOrder(int value) {
        this.sortOrder = value;
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
