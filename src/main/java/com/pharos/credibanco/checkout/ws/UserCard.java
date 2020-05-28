
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para userCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="userCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="favoriteToReceive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="franchise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hashedCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="internationalCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastPurchaseDues" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="micro1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="micro2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userCard", propOrder = {
    "accountType",
    "alias",
    "bin",
    "cardNumber",
    "counter",
    "documentNumber",
    "favorite",
    "favoriteToReceive",
    "franchise",
    "hashedCard",
    "id",
    "internationalCard",
    "lastCard",
    "lastPurchaseDues",
    "micro1",
    "micro2",
    "state",
    "validDate"
})
public class UserCard {

    protected String accountType;
    protected String alias;
    protected String bin;
    protected String cardNumber;
    protected String counter;
    protected String documentNumber;
    protected boolean favorite;
    protected boolean favoriteToReceive;
    protected String franchise;
    protected String hashedCard;
    protected long id;
    protected boolean internationalCard;
    protected String lastCard;
    protected int lastPurchaseDues;
    protected long micro1;
    protected long micro2;
    protected String state;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDate;

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Obtiene el valor de la propiedad bin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBin() {
        return bin;
    }

    /**
     * Define el valor de la propiedad bin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBin(String value) {
        this.bin = value;
    }

    /**
     * Obtiene el valor de la propiedad cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Define el valor de la propiedad cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad counter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounter() {
        return counter;
    }

    /**
     * Define el valor de la propiedad counter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounter(String value) {
        this.counter = value;
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
     * Obtiene el valor de la propiedad favorite.
     * 
     */
    public boolean isFavorite() {
        return favorite;
    }

    /**
     * Define el valor de la propiedad favorite.
     * 
     */
    public void setFavorite(boolean value) {
        this.favorite = value;
    }

    /**
     * Obtiene el valor de la propiedad favoriteToReceive.
     * 
     */
    public boolean isFavoriteToReceive() {
        return favoriteToReceive;
    }

    /**
     * Define el valor de la propiedad favoriteToReceive.
     * 
     */
    public void setFavoriteToReceive(boolean value) {
        this.favoriteToReceive = value;
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
     * Obtiene el valor de la propiedad hashedCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedCard() {
        return hashedCard;
    }

    /**
     * Define el valor de la propiedad hashedCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedCard(String value) {
        this.hashedCard = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad internationalCard.
     * 
     */
    public boolean isInternationalCard() {
        return internationalCard;
    }

    /**
     * Define el valor de la propiedad internationalCard.
     * 
     */
    public void setInternationalCard(boolean value) {
        this.internationalCard = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCard() {
        return lastCard;
    }

    /**
     * Define el valor de la propiedad lastCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCard(String value) {
        this.lastCard = value;
    }

    /**
     * Obtiene el valor de la propiedad lastPurchaseDues.
     * 
     */
    public int getLastPurchaseDues() {
        return lastPurchaseDues;
    }

    /**
     * Define el valor de la propiedad lastPurchaseDues.
     * 
     */
    public void setLastPurchaseDues(int value) {
        this.lastPurchaseDues = value;
    }

    /**
     * Obtiene el valor de la propiedad micro1.
     * 
     */
    public long getMicro1() {
        return micro1;
    }

    /**
     * Define el valor de la propiedad micro1.
     * 
     */
    public void setMicro1(long value) {
        this.micro1 = value;
    }

    /**
     * Obtiene el valor de la propiedad micro2.
     * 
     */
    public long getMicro2() {
        return micro2;
    }

    /**
     * Define el valor de la propiedad micro2.
     * 
     */
    public void setMicro2(long value) {
        this.micro2 = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad validDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDate() {
        return validDate;
    }

    /**
     * Define el valor de la propiedad validDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDate(XMLGregorianCalendar value) {
        this.validDate = value;
    }

}
