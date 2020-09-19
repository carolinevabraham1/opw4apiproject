package com.api.genericLib;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredCommonUtils {

	public void validateStatusCode(Response resp , int expectedStatusCode)
	{
		resp.then().assertThat().statusCode(expectedStatusCode);
		System.out.println("status code validation is successfull");
	}
	
	public void validateContentType(Response resp)
	{
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println("content type validation is successfull");
	}
	
	public void validateResponseTime(Response resp , long withInRange)
	{
		resp.then().assertThat().time(Matchers.lessThan(withInRange));
		System.out.println("Response Time validation is successfull");
	}
	
	public void validateKeyValuePair(Response resp , String jsonPath, String expectedValue)
	{
		Object obj = resp.jsonPath().get(jsonPath);
		String actualValue = obj.toString();
		Assert.assertEquals(actualValue, expectedValue);
	}
}
















