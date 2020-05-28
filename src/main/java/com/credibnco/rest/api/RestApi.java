package com.credibnco.rest.api;


import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.credibanco.rest.entidades.RestUser;
import com.credibanco.rest.entidades.Card;
import com.credibanco.rest.entidades.Authentication;

@Path("/api")
@ApplicationScoped
public class RestApi {

	 @GET
	    @Path("/user/{userEmail}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public RestUser getUser(@PathParam("userEmail") String userEmail) {

	        return RestUser.getUser(userEmail);
	    }

	    @GET
	    @Path("/user/cards/{documentNumber}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Card> getUserCards(@PathParam("documentNumber") String documentNumber) {

	        return RestUser.getUserCards(documentNumber);
	    }

	    @POST
	    @Path("/user/auth")
	    @Transactional
	    @Produces(MediaType.APPLICATION_JSON)
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response authenticateUser(Authentication auth) {

	        return RestUser.authenticateUser(auth);
	    }
}