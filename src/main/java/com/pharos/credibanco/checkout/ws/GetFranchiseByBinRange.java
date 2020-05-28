
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFranchiseByBinRange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFranchiseByBinRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFranchiseByBinRange", propOrder = {
    "range"
})
public class GetFranchiseByBinRange {

    protected long range;

    /**
     * Obtiene el valor de la propiedad range.
     * 
     */
    public long getRange() {
        return range;
    }

    /**
     * Define el valor de la propiedad range.
     * 
     */
    public void setRange(long value) {
        this.range = value;
    }

}
