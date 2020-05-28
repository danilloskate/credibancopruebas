package com.credibanco.rest.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.credibanco.daniel.constantes.Constantes;
import com.pharos.credibanco.checkout.ws.CheckoutWSService;
import com.pharos.credibanco.checkout.ws.CheckoutWSServiceService;
import com.pharos.credibanco.checkout.ws.Response;
import com.pharos.credibanco.checkout.ws.User;
import com.pharos.credibanco.checkout.ws.UserCard;

public class RestUser {

	public String address;
	public XMLGregorianCalendar birthdate;
	public String cellphone;
	public String city;
	public String confirmacionClave;
	public Integer countInvalid;
	public String country;
	public String documentNumber;
	public String email;
	public String enableQ;
	public String expDocumentDate;
	public String firstName;
	public String gender;
	public Boolean interestAuto;
	public Boolean interestBeauty;
	public Boolean interestClothes;
	public Boolean interestElectronics;
	public Boolean interestHome;
	public String interestOther;
	public Boolean interestTelco;
	public Boolean interestTravel;
	public String lastName;
	public String locked;
	public String maritalStatus;
	public int openSession;
	public String otp;
	public XMLGregorianCalendar otpExpiration;
	public String otpLogin;
	public XMLGregorianCalendar otpLoginExpiration;
	public int otpLoginTries;
	public int otpTries;
	public String password;
	public XMLGregorianCalendar passwordDate;
	public XMLGregorianCalendar registerDate;
	public String registerEnable;
	public String secondLastName;
	public String secondName;
	public String sessionid;
	public int trxVal;
	public String tyc;
	public String userType;
	private static Boolean estaAutenticado = false;

	public RestUser() {
		// Empty
	}

	public RestUser(User user) {
		this.address = user.getAddress();
		this.birthdate = user.getBirthdate();
		this.cellphone = user.getCellphone();
		this.city = user.getCity();
		this.confirmacionClave = user.getConfirmacionClave();
		this.countInvalid = user.getCountInvalid();
		this.country = user.getCountry();
		this.documentNumber = user.getDocumentNumber();
		this.email = user.getEmail();
		this.enableQ = user.getEnableQ();
		this.expDocumentDate = user.getExpDocumentDate();
		this.firstName = user.getFirstName();
		this.gender = user.getGender();
		this.interestAuto = user.isInterestAuto();
		this.interestBeauty = user.isInterestBeauty();
		this.interestClothes = user.isInterestClothes();
		this.interestElectronics = user.isInterestElectronics();
		this.interestHome = user.isInterestHome();
		this.interestOther = user.getInterestOther();
		this.interestTelco = user.isInterestTelco();
		this.interestTravel = user.isInterestTravel();
		this.lastName = user.getLastName();
		this.locked = user.getLocked();
		this.maritalStatus = user.getMaritalStatus();
		this.openSession = user.getOpenSession();
		this.otp = user.getOtp();
		this.otpExpiration = user.getOtpExpiration();
		this.otpLogin = user.getOtpLogin();
		this.otpLoginExpiration = user.getOtpLoginExpiration();
		this.otpLoginTries = user.getOtpLoginTries();
		this.otpTries = user.getOtpTries();
		this.password = user.getPassword();
		this.passwordDate = user.getPasswordDate();
		this.registerDate = user.getRegisterDate();
		this.registerEnable = user.getRegisterEnable();
		this.secondLastName = user.getSecondLastName();
		this.secondName = user.getSecondName();
		this.sessionid = user.getSessionid();
		this.trxVal = user.getTrxVal();
		this.tyc = user.getTyc();
		this.userType = user.getUserType();
	}

	public static RestUser getUser(String userEmail) {
		CheckoutWSServiceService checkoutWSServiceService = new CheckoutWSServiceService();
		CheckoutWSService checkoutWSServicePort = checkoutWSServiceService.getCheckoutWSServicePort();

		if (Boolean.TRUE.equals(estaAutenticado)) {
			User user = checkoutWSServicePort.getUser(userEmail);
			return new RestUser(user);
		} else {
			return new RestUser();
		}

	}

	public static javax.ws.rs.core.Response authenticateUser(Authentication auth) {

		CheckoutWSServiceService checkoutWSServiceService = new CheckoutWSServiceService();
		CheckoutWSService checkoutWSServicePort = checkoutWSServiceService.getCheckoutWSServicePort();
		Response response = checkoutWSServicePort.authenticateUser(auth.email, auth.password);

		if (response.getEstado().equals(Constantes.ESTADO_EXITOSO_USUARIO)) {
			estaAutenticado = true;
			return javax.ws.rs.core.Response.ok(response).status(Constantes.STATUS_CODE_CREATED).build();
		} else {
			estaAutenticado = false;
			return javax.ws.rs.core.Response.ok(response).status(Constantes.STATUS_CODE_FORBIDDEN).build();
		}

	}

	public static List<Card> getUserCards(String documentNumber) {

		List<UserCard> userCardsList;
		List<Card> cardList = new ArrayList<>();
		CheckoutWSServiceService checkoutWSServiceService = new CheckoutWSServiceService();
		CheckoutWSService checkoutWSServicePort = checkoutWSServiceService.getCheckoutWSServicePort();

		if (Boolean.TRUE.equals(estaAutenticado)) {
			userCardsList = checkoutWSServicePort.getUserCards(documentNumber, Constantes.EMPTY_STRING);

			for (UserCard userCard : userCardsList) {
				cardList.add(new Card(userCard));
			}
			return cardList;

		} else {
			return Collections.emptyList();
		}

	}
}