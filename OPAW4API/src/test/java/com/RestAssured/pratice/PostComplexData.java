package com.RestAssured.pratice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class PostComplexData {

	@Test
	public void addComplexData()
	{
		// step 1 :- set precodition
		RequestSpecification req = RestAssured.given();
		
		// step 2 :- Build JSONObjects
		JSONObject jobj1 = new JSONObject();
		jobj1.put("java" , "average");
		jobj1.put("selenium" , "very good");
		jobj1.put("manual" , "good");

		JSONObject jobj2 = new JSONObject();
		jobj2.put("name" , "Ajay");
		jobj2.put("id" , 25);
		jobj2.put("skills" , jobj1);

		JSONObject jobj3 = new JSONObject();
		jobj3.put("Employee" , jobj2);
		
		// step 3 :- convert a proper json object
		String jsonData = jobj3.toJSONString();
		req.body(jsonData);
		req.contentType(ContentType.JSON);

		// step 4 :- Apply precondition
		RequestSender sender = req.when();
		
		// step 5 :- Send the request with precondition
		Response resp = sender.post("http://localhost:3000/posts");
		
		// step 6 :- fetch everything from response
		resp.then().log().all();
	}
}















