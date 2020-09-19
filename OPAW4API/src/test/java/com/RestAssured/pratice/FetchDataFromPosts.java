package com.RestAssured.pratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchDataFromPosts {

	@Test
	public void getData()
	{
		Response resp = RestAssured.get("http://localhost:3000/posts");
		
		/*int statusCode = resp.getStatusCode();
		System.out.println("Status code is : " + statusCode);
		System.out.println("--------------------------------------------");
		
		String contentType = resp.getContentType();
		System.out.println("Content Type is : " + contentType);
		System.out.println("--------------------------------------------");
		
		String actualData = resp.asString();
		System.out.println("Actual Data is : " + "\n" + actualData);
		System.out.println("--------------------------------------------");
		
		long timeInMS = resp.getTime();
		System.out.println("Response time is : " + timeInMS + " ms");*/
		
		resp.prettyPrint();
	}
}
