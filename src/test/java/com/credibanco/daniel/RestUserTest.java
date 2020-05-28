package com.credibanco.daniel;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class RestUserTest {

    @Test
    @BeforeEach
    void authenticateUserTest() {

        Map<String,String> authBody = new HashMap<>();
		authBody.put("email", "pruebas.pago@credibanco.com");
		authBody.put("password", "Credibanco16/");

        given().contentType("application/json").body(authBody).when().post("/api/user/auth").then().statusCode(201);
    }

    @Test
    public void getUserTest() {
        given()
        .when().get("/api/user/pruebas.pago@credibanco.com").then().statusCode(200);
    }

    @Test
    public void getUserCardsTest() {
        given()
        .when().get("/api/user/cards/75896312")
        .then()
            .statusCode(200);
    }




}
