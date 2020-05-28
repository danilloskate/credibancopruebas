package com.credibanco.daniel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.credibanco.daniel.constantes.Constantes;
import com.credibanco.rest.entidades.Authentication;
import com.pharos.credibanco.checkout.ws.CheckoutWSService;
import com.pharos.credibanco.checkout.ws.CheckoutWSServiceService;
import com.pharos.credibanco.checkout.ws.Response;
import com.pharos.credibanco.checkout.ws.User;
import com.pharos.credibanco.checkout.ws.UserCard;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class RestApiTest {

    private static Authentication auth;
    private static String documentNumber;

    @BeforeAll
    static void createAuthenticationObject() {
        auth = new Authentication("pruebas.pago@credibanco.com", "Credibanco16/");
    }

    @Test
    @BeforeEach
    @DisplayName("authenticateUser test")
    void authenticateUserTest() {
        CheckoutWSServiceService checkoutWSServiceService = new CheckoutWSServiceService();
        CheckoutWSService checkoutWSServicePort = checkoutWSServiceService.getCheckoutWSServicePort();
        Response response = checkoutWSServicePort.authenticateUser(auth.email, auth.password);
        assertEquals(Constantes.ESTADO_EXITOSO_USUARIO, response.getEstado());
    }

    @Test
    @DisplayName("getUser test") 
    void getUserTest() {
        CheckoutWSServiceService checkoutWSServiceService = new CheckoutWSServiceService();
        CheckoutWSService checkoutWSServicePort = checkoutWSServiceService.getCheckoutWSServicePort();
        User user = checkoutWSServicePort.getUser(auth.email);
        documentNumber = user.getDocumentNumber();
        assertEquals(auth.email.toLowerCase(), user.getEmail().toLowerCase());
    }

    @Test
    @DisplayName("getUserCards test") 
    void getUserCardsTest() {
        List<UserCard> userCardsList;
        CheckoutWSServiceService checkoutWSServiceService = new CheckoutWSServiceService();
        CheckoutWSService checkoutWSServicePort = checkoutWSServiceService.getCheckoutWSServicePort();
        userCardsList = checkoutWSServicePort.getUserCards(documentNumber, Constantes.EMPTY_STRING);
        assertTrue(userCardsList.size() > 0);
    }

}