
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUserCards complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUserCards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserCards", propOrder = {
    "documentNumber",
    "auditoria"
})
public class GetUserCards {

    protected String documentNumber;
    protected String auditoria;

    /**
     * Obtiene el valor de la propiedad documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define el valor de la propiedad documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad auditoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditoria() {
        return auditoria;
    }

    /**
     * Define el valor de la propiedad auditoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditoria(String value) {
        this.auditoria = value;
    }

}
