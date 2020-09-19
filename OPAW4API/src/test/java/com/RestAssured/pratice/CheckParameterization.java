package com.RestAssured.pratice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class CheckParameterization {

	@Test
	public void getDataByQS()
	{
		given().param("userId", "4")
		.pathParam("x", "posts")
		.when().get("https://jsonplaceholder.typicode.com/{x}")
		.then().log().all();
	}
}












