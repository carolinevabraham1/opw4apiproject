package com.RestAssured.pratice;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ChaeckAssertions {

//	@Test
	public void getAssertions()
	{
		Response resp = given().param("userId", "4").pathParam("x", "posts")
		.when().get("https://jsonplaceholder.typicode.com/{x}");
		
		int statusCode = resp.getStatusCode();
		System.out.println("Status code is : " + statusCode);
		Assert.assertEquals(statusCode, 200);

		String contentType = resp.getContentType();
		System.out.println("Content Type is : " + contentType);
		Assert.assertEquals(contentType, "application/json; charset=utf-8");
		
		long timeInMs = resp.getTime();
		System.out.println("Response Time is : " + timeInMs);
		Assert.assertTrue(timeInMs < 10000);
		
		Object title = resp.jsonPath().get("title[1]");
		System.out.println("2nd object title is : " + title);
		Assert.assertEquals(title, "doloremque illum aliquid sunt");
		
		resp.then().log().all();
	}
	
	@Test
	public void getAsssertionByRA()
	{
		Response resp = given().param("userId", "4").pathParam("x", "posts")
		.when().get("https://jsonplaceholder.typicode.com/{x}");
		
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().contentType("application/json; charset=utf-8");
		resp.then().assertThat().time(Matchers.lessThan(6000L));
		
		resp.then().log().all();
	}
}













