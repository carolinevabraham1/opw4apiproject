package com.RestAssured.pratice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchCountriesByJsonPath {
	
	// @Test
	public void fetchCurrancyCode()
	{
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		
		// capture all currencies code
		Object obj = resp.jsonPath().get("currencies.code");
		System.out.println(obj);
		
		// capture 1st currencies code
		Object obj1 = resp.jsonPath().get("currencies.code[52]");
		System.out.println(obj1);
	}
	
	// @Test
	public void fetchCodeForSpecificCountry()
	{
		String reqCountry = "French Polynesia";
		
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		
		ArrayList<Object> allCountryName = resp.jsonPath().get("name");
		
		Iterator<Object> itr = allCountryName.iterator();
		
		int count = 0;
		
		boolean flag = false;
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj.equals(reqCountry))
			{
				System.out.println(reqCountry + " is present in a list");
				Object obj1 = resp.jsonPath().get("currencies.code["+count+"]");
				System.out.println(reqCountry + " is having currencies code as " + obj1);
				flag = true;
				break;
			}
			count++;
		}
		if(!flag)
		{
			throw new IllegalArgumentException("country name is invalid");
		}
	}
	
	@Test
	public void fetchCodeForSpecificCountry1()
	{
		String reqCountry = "India";
		
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		
		ArrayList<Object> allCountryName = resp.jsonPath().get("name");
		
		if(allCountryName.contains(reqCountry))
		{
			int index = allCountryName.indexOf(reqCountry);
			Object obj1 = resp.jsonPath().get("currencies.code["+index+"]");
			System.out.println(reqCountry + " is having currencies code as " + obj1);		
		}else{
			throw new IllegalArgumentException("country name is invalid");
		}
	}
}





	












