
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateUserData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateUserData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmNewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cellphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expDocumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUserData", propOrder = {
    "documentType",
    "documentNumber",
    "email",
    "firstName",
    "secondName",
    "lastName",
    "secondLastName",
    "password",
    "newPassword",
    "confirmNewPassword",
    "address",
    "city",
    "country",
    "cellphone",
    "enableQ",
    "expDocumentDate"
})
public class UpdateUserData {

    protected String documentType;
    protected String documentNumber;
    protected String email;
    protected String firstName;
    protected String secondName;
    protected String lastName;
    protected String secondLastName;
    protected String password;
    protected String newPassword;
    protected String confirmNewPassword;
    protected String address;
    protected String city;
    protected String country;
    protected String cellphone;
    protected String enableQ;
    protected String expDocumentDate;

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
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
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad secondName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Define el valor de la propiedad secondName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad secondLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLastName() {
        return secondLastName;
    }

    /**
     * Define el valor de la propiedad secondLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLastName(String value) {
        this.secondLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad newPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Define el valor de la propiedad newPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmNewPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    /**
     * Define el valor de la propiedad confirmNewPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmNewPassword(String value) {
        this.confirmNewPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad cellphone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * Define el valor de la propiedad cellphone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellphone(String value) {
        this.cellphone = value;
    }

    /**
     * Obtiene el valor de la propiedad enableQ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableQ() {
        return enableQ;
    }

    /**
     * Define el valor de la propiedad enableQ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableQ(String value) {
        this.enableQ = value;
    }

    /**
     * Obtiene el valor de la propiedad expDocumentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDocumentDate() {
        return expDocumentDate;
    }

    /**
     * Define el valor de la propiedad expDocumentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDocumentDate(String value) {
        this.expDocumentDate = value;
    }

}
