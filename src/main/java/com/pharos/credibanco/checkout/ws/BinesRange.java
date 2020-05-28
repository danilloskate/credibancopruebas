
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para binesRange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="binesRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endBin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="franchise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="international" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startBin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binesRange", propOrder = {
    "endBin",
    "franchise",
    "international",
    "startBin"
})
public class BinesRange {

    protected long endBin;
    protected String franchise;
    protected boolean international;
    protected long startBin;

    /**
     * Obtiene el valor de la propiedad endBin.
     * 
     */
    public long getEndBin() {
        return endBin;
    }

    /**
     * Define el valor de la propiedad endBin.
     * 
     */
    public void setEndBin(long value) {
        this.endBin = value;
    }

    /**
     * Obtiene el valor de la propiedad franchise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchise() {
        return franchise;
    }

    /**
     * Define el valor de la propiedad franchise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchise(String value) {
        this.franchise = value;
    }

    /**
     * Obtiene el valor de la propiedad international.
     * 
     */
    public boolean isInternational() {
        return international;
    }

    /**
     * Define el valor de la propiedad international.
     * 
     */
    public void setInternational(boolean value) {
        this.international = value;
    }

    /**
     * Obtiene el valor de la propiedad startBin.
     * 
     */
    public long getStartBin() {
        return startBin;
    }

    /**
     * Define el valor de la propiedad startBin.
     * 
     */
    public void setStartBin(long value) {
        this.startBin = value;
    }

}
