package com.RestAssured.pratice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class FetchAllCountryData {

	@Test
	public void getAllCountries()
	{
		given().pathParam("x", "rest").pathParam("y", "v2").pathParam("z", "all")
		.when().get("https://restcountries.eu/{x}/{y}/{z}")
		.then().log().all();
	}
}
