
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createCommerce complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createCommerce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commerceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificatePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceTerminalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCommerce", propOrder = {
    "commerceCode",
    "certificateName",
    "commerceName",
    "certificatePassword",
    "commerceTerminalCode",
    "certFile"
})
public class CreateCommerce {

    protected String commerceCode;
    protected String certificateName;
    protected String commerceName;
    protected String certificatePassword;
    protected String commerceTerminalCode;
    protected byte[] certFile;

    /**
     * Obtiene el valor de la propiedad commerceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceCode() {
        return commerceCode;
    }

    /**
     * Define el valor de la propiedad commerceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceCode(String value) {
        this.commerceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad certificateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * Define el valor de la propiedad certificateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateName(String value) {
        this.certificateName = value;
    }

    /**
     * Obtiene el valor de la propiedad commerceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceName() {
        return commerceName;
    }

    /**
     * Define el valor de la propiedad commerceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceName(String value) {
        this.commerceName = value;
    }

    /**
     * Obtiene el valor de la propiedad certificatePassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificatePassword() {
        return certificatePassword;
    }

    /**
     * Define el valor de la propiedad certificatePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificatePassword(String value) {
        this.certificatePassword = value;
    }

    /**
     * Obtiene el valor de la propiedad commerceTerminalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceTerminalCode() {
        return commerceTerminalCode;
    }

    /**
     * Define el valor de la propiedad commerceTerminalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceTerminalCode(String value) {
        this.commerceTerminalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad certFile.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertFile() {
        return certFile;
    }

    /**
     * Define el valor de la propiedad certFile.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertFile(byte[] value) {
        this.certFile = value;
    }

}
