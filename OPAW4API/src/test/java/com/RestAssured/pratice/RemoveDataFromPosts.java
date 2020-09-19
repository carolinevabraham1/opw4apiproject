package com.RestAssured.pratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RemoveDataFromPosts {

	@Test
	public void removeData()
	{
		Response resp = RestAssured.delete("http://localhost:3000/posts/6");
		
		System.out.println("Status code is : " + resp.getStatusCode());
		System.out.println("--------------------------------------------");
		
		System.out.println("Content Type is : " + resp.getContentType());
		System.out.println("--------------------------------------------");
		
		System.out.println("Actual Data is : " + "\n" + resp.asString());
		System.out.println("--------------------------------------------");
		
		System.out.println("Response time is : " + resp.getTime() + " ms");
	}
}
