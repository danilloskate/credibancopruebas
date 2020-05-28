
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCommerce complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCommerce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commerceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCommerce", propOrder = {
    "commerceCode",
    "terminalCode"
})
public class GetCommerce {

    protected String commerceCode;
    protected String terminalCode;

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
     * Obtiene el valor de la propiedad terminalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCode() {
        return terminalCode;
    }

    /**
     * Define el valor de la propiedad terminalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCode(String value) {
        this.terminalCode = value;
    }

}
