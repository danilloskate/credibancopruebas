

package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addAudit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addAudit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditoria" type="{http://ws.checkout.credibanco.pharos.com/}audit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAudit", propOrder = {
    "auditoria"
})
public class AddAudit {

    protected Audit auditoria;

    /**
     * Obtiene el valor de la propiedad auditoria.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAuditoria() {
        return auditoria;
    }

    /**
     * Define el valor de la propiedad auditoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAuditoria(Audit value) {
        this.auditoria = value;
    }

}
