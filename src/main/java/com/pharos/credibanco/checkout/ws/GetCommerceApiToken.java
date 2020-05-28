
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCommerceApiToken complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCommerceApiToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getCommerceApiToken", propOrder = {
    "uniqueCode",
    "terminalCode"
})
public class GetCommerceApiToken {

    protected String uniqueCode;
    protected String terminalCode;

    /**
     * Obtiene el valor de la propiedad uniqueCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCode() {
        return uniqueCode;
    }

    /**
     * Define el valor de la propiedad uniqueCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCode(String value) {
        this.uniqueCode = value;
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
