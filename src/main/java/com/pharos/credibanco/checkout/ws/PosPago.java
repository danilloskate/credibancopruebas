
package com.pharos.credibanco.checkout.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para posPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="posPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commerceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceTerminalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="idTrx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedQuotas" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="trxInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posPago", propOrder = {
    "commerceCode",
    "commerceTerminalCode",
    "documentNumber",
    "id",
    "idTrx",
    "selectedAlias",
    "selectedQuotas",
    "trxInfo"
})
public class PosPago {

    protected String commerceCode;
    protected String commerceTerminalCode;
    protected String documentNumber;
    protected BigDecimal id;
    protected String idTrx;
    protected String selectedAlias;
    protected long selectedQuotas;
    protected String trxInfo;

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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idTrx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTrx() {
        return idTrx;
    }

    /**
     * Define el valor de la propiedad idTrx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTrx(String value) {
        this.idTrx = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedAlias() {
        return selectedAlias;
    }

    /**
     * Define el valor de la propiedad selectedAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedAlias(String value) {
        this.selectedAlias = value;
    }

    /**
     * Obtiene el valor de la propiedad selectedQuotas.
     * 
     */
    public long getSelectedQuotas() {
        return selectedQuotas;
    }

    /**
     * Define el valor de la propiedad selectedQuotas.
     * 
     */
    public void setSelectedQuotas(long value) {
        this.selectedQuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad trxInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxInfo() {
        return trxInfo;
    }

    /**
     * Define el valor de la propiedad trxInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxInfo(String value) {
        this.trxInfo = value;
    }

}
