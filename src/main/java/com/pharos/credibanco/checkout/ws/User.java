
package com.pharos.credibanco.checkout.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para user complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cellphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmacionClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countInvalid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expDocumentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestAuto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestBeauty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestClothes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestElectronics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestHome" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestTelco" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interestTravel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openSession" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="otp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otpExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="otpLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otpLoginExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="otpLoginTries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="otpTries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registerEnable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trxVal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tyc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "address",
    "birthdate",
    "cellphone",
    "city",
    "confirmacionClave",
    "countInvalid",
    "country",
    "documentNumber",
    "email",
    "enableQ",
    "expDocumentDate",
    "firstName",
    "gender",
    "interestAuto",
    "interestBeauty",
    "interestClothes",
    "interestElectronics",
    "interestHome",
    "interestOther",
    "interestTelco",
    "interestTravel",
    "lastName",
    "locked",
    "maritalStatus",
    "openSession",
    "otp",
    "otpExpiration",
    "otpLogin",
    "otpLoginExpiration",
    "otpLoginTries",
    "otpTries",
    "password",
    "passwordDate",
    "registerDate",
    "registerEnable",
    "secondLastName",
    "secondName",
    "sessionid",
    "trxVal",
    "tyc",
    "userType"
})
public class User {

    protected String address;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdate;
    protected String cellphone;
    protected String city;
    protected String confirmacionClave;
    protected Integer countInvalid;
    protected String country;
    protected String documentNumber;
    protected String email;
    protected String enableQ;
    protected String expDocumentDate;
    protected String firstName;
    protected String gender;
    protected Boolean interestAuto;
    protected Boolean interestBeauty;
    protected Boolean interestClothes;
    protected Boolean interestElectronics;
    protected Boolean interestHome;
    protected String interestOther;
    protected Boolean interestTelco;
    protected Boolean interestTravel;
    protected String lastName;
    protected String locked;
    protected String maritalStatus;
    protected int openSession;
    protected String otp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar otpExpiration;
    protected String otpLogin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar otpLoginExpiration;
    protected int otpLoginTries;
    protected int otpTries;
    protected String password;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registerDate;
    protected String registerEnable;
    protected String secondLastName;
    protected String secondName;
    protected String sessionid;
    protected int trxVal;
    protected String tyc;
    protected String userType;

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
     * Obtiene el valor de la propiedad birthdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Define el valor de la propiedad birthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
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
     * Obtiene el valor de la propiedad confirmacionClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmacionClave() {
        return confirmacionClave;
    }

    /**
     * Define el valor de la propiedad confirmacionClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmacionClave(String value) {
        this.confirmacionClave = value;
    }

    /**
     * Obtiene el valor de la propiedad countInvalid.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountInvalid() {
        return countInvalid;
    }

    /**
     * Define el valor de la propiedad countInvalid.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountInvalid(Integer value) {
        this.countInvalid = value;
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
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad interestAuto.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestAuto() {
        return interestAuto;
    }

    /**
     * Define el valor de la propiedad interestAuto.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestAuto(Boolean value) {
        this.interestAuto = value;
    }

    /**
     * Obtiene el valor de la propiedad interestBeauty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestBeauty() {
        return interestBeauty;
    }

    /**
     * Define el valor de la propiedad interestBeauty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestBeauty(Boolean value) {
        this.interestBeauty = value;
    }

    /**
     * Obtiene el valor de la propiedad interestClothes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestClothes() {
        return interestClothes;
    }

    /**
     * Define el valor de la propiedad interestClothes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestClothes(Boolean value) {
        this.interestClothes = value;
    }

    /**
     * Obtiene el valor de la propiedad interestElectronics.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestElectronics() {
        return interestElectronics;
    }

    /**
     * Define el valor de la propiedad interestElectronics.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestElectronics(Boolean value) {
        this.interestElectronics = value;
    }

    /**
     * Obtiene el valor de la propiedad interestHome.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestHome() {
        return interestHome;
    }

    /**
     * Define el valor de la propiedad interestHome.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestHome(Boolean value) {
        this.interestHome = value;
    }

    /**
     * Obtiene el valor de la propiedad interestOther.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestOther() {
        return interestOther;
    }

    /**
     * Define el valor de la propiedad interestOther.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestOther(String value) {
        this.interestOther = value;
    }

    /**
     * Obtiene el valor de la propiedad interestTelco.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestTelco() {
        return interestTelco;
    }

    /**
     * Define el valor de la propiedad interestTelco.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestTelco(Boolean value) {
        this.interestTelco = value;
    }

    /**
     * Obtiene el valor de la propiedad interestTravel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestTravel() {
        return interestTravel;
    }

    /**
     * Define el valor de la propiedad interestTravel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestTravel(Boolean value) {
        this.interestTravel = value;
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
     * Obtiene el valor de la propiedad locked.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocked() {
        return locked;
    }

    /**
     * Define el valor de la propiedad locked.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocked(String value) {
        this.locked = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define el valor de la propiedad maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad openSession.
     * 
     */
    public int getOpenSession() {
        return openSession;
    }

    /**
     * Define el valor de la propiedad openSession.
     * 
     */
    public void setOpenSession(int value) {
        this.openSession = value;
    }

    /**
     * Obtiene el valor de la propiedad otp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtp() {
        return otp;
    }

    /**
     * Define el valor de la propiedad otp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtp(String value) {
        this.otp = value;
    }

    /**
     * Obtiene el valor de la propiedad otpExpiration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOtpExpiration() {
        return otpExpiration;
    }

    /**
     * Define el valor de la propiedad otpExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOtpExpiration(XMLGregorianCalendar value) {
        this.otpExpiration = value;
    }

    /**
     * Obtiene el valor de la propiedad otpLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpLogin() {
        return otpLogin;
    }

    /**
     * Define el valor de la propiedad otpLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpLogin(String value) {
        this.otpLogin = value;
    }

    /**
     * Obtiene el valor de la propiedad otpLoginExpiration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOtpLoginExpiration() {
        return otpLoginExpiration;
    }

    /**
     * Define el valor de la propiedad otpLoginExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOtpLoginExpiration(XMLGregorianCalendar value) {
        this.otpLoginExpiration = value;
    }

    /**
     * Obtiene el valor de la propiedad otpLoginTries.
     * 
     */
    public int getOtpLoginTries() {
        return otpLoginTries;
    }

    /**
     * Define el valor de la propiedad otpLoginTries.
     * 
     */
    public void setOtpLoginTries(int value) {
        this.otpLoginTries = value;
    }

    /**
     * Obtiene el valor de la propiedad otpTries.
     * 
     */
    public int getOtpTries() {
        return otpTries;
    }

    /**
     * Define el valor de la propiedad otpTries.
     * 
     */
    public void setOtpTries(int value) {
        this.otpTries = value;
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
     * Obtiene el valor de la propiedad passwordDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordDate() {
        return passwordDate;
    }

    /**
     * Define el valor de la propiedad passwordDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordDate(XMLGregorianCalendar value) {
        this.passwordDate = value;
    }

    /**
     * Obtiene el valor de la propiedad registerDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisterDate() {
        return registerDate;
    }

    /**
     * Define el valor de la propiedad registerDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisterDate(XMLGregorianCalendar value) {
        this.registerDate = value;
    }

    /**
     * Obtiene el valor de la propiedad registerEnable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterEnable() {
        return registerEnable;
    }

    /**
     * Define el valor de la propiedad registerEnable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterEnable(String value) {
        this.registerEnable = value;
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
     * Obtiene el valor de la propiedad sessionid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionid() {
        return sessionid;
    }

    /**
     * Define el valor de la propiedad sessionid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionid(String value) {
        this.sessionid = value;
    }

    /**
     * Obtiene el valor de la propiedad trxVal.
     * 
     */
    public int getTrxVal() {
        return trxVal;
    }

    /**
     * Define el valor de la propiedad trxVal.
     * 
     */
    public void setTrxVal(int value) {
        this.trxVal = value;
    }

    /**
     * Obtiene el valor de la propiedad tyc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyc() {
        return tyc;
    }

    /**
     * Define el valor de la propiedad tyc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyc(String value) {
        this.tyc = value;
    }

    /**
     * Obtiene el valor de la propiedad userType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Define el valor de la propiedad userType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
