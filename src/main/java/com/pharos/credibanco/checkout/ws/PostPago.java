
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para postPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="postPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posPago" type="{http://ws.checkout.credibanco.pharos.com/}posPago" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postPago", propOrder = {
    "posPago"
})
public class PostPago {

    protected PosPago posPago;

    /**
     * Obtiene el valor de la propiedad posPago.
     * 
     * @return
     *     possible object is
     *     {@link PosPago }
     *     
     */
    public PosPago getPosPago() {
        return posPago;
    }

    /**
     * Define el valor de la propiedad posPago.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPago }
     *     
     */
    public void setPosPago(PosPago value) {
        this.posPago = value;
    }

}
