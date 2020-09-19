package com.RestAssured.pratice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddNewDatainPosts {

	@Test
	public void createNewData()
	{
		// step 1 :- set precondition
		RequestSpecification reqpc = RestAssured.given();
		
		// step 2 :- create json object
		JSONObject jobj = new JSONObject();
		
		jobj.put("designation", "Manager");
		
		// step 3 :- convert into json form & provide body
		String jsonData = jobj.toJSONString();
		reqpc.body(jsonData);
		
		// step 4 :- set the content type for request
		reqpc.contentType(ContentType.JSON);
		
		// step 5 :- apply this precondition on request
		RequestSender sender = reqpc.when();
		
		// step 6 :- send the request
		Response resp = sender.patch("http://localhost:3000/posts/11");
		
		// step 7 :- fetch complete response
		ValidatableResponse then = resp.then();
		then.log().all();
	}
}















