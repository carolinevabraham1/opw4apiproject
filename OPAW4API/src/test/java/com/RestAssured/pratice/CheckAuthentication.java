package com.RestAssured.pratice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CheckAuthentication {

	public void acessAuthApiByPreemptive()
	{
		Response resp = given().auth().preemptive().basic("username", "password")
						.when().get("authorised api");
		
		resp.then().log().all();
	}
	
	public void acessAuthApiByChallenging()
	{
		Response resp = given().auth().basic("username", "password")
						.when().get("authorised api");
		
		resp.then().log().all();
	}
	
	public void acessAuthAPIByToken()
	{
		String tokenID = getTokenID();
		Response resp = given()
						.body("")
						.contentType(ContentType.JSON)
						.auth().oauth2(tokenID)
						.when().get("Authorised Main API");
		
		resp.then().log().all();
	}
	
	public String getTokenID()
	{
		Response resp = get("Token Prvider API");
		
		Object token = resp.jsonPath().get("TokenID");
		
		return token.toString();
	}
}



















