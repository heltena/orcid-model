//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 04:27:39 PM GMT 
//

package org.orcid.jaxb.model.v3.release.notification.permission;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "uri", "path", "host" })
@XmlRootElement(name = "authorization-url", namespace = "http://www.orcid.org/ns/notification")
@Schema(description = "AuthorizationUrlV3_0")
public class AuthorizationUrl implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4942822562344458290L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected String host;

    public AuthorizationUrl() {
    }

    public AuthorizationUrl(String uri) {
        this.uri = uri;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHost(String value) {
        this.host = value;
    }

}
