package com.RestAssured.pratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoJsonPath {

	@Test
	public void checkJsonPath()
	{
		Response resp = RestAssured.get("http://localhost:3000/posts");
		
		resp.prettyPrint();
		
		// JsonPath to capture the selenium rating:- 
		Object seleniumRating = resp.jsonPath().get("Employee.skills.selenium[0]");
		System.out.println("Selenium Rating is : " + seleniumRating);
		
		// JsonPath to capture the manual rating:- 
		Object manualRating = resp.jsonPath().get("Employee.skills.manual[0]");
		System.out.println("Manual Rating is : " + manualRating);
		
		// JsonPath to capture the name of employee:- 
		Object employeeName = resp.jsonPath().get("Employee.name[0]");
		System.out.println("Employee Name is : " + employeeName);

		// JsonPath to capture the all Skills:- 
		Object skills = resp.jsonPath().get("Employee.skills[0]");
		System.out.println("All Skills is : " + skills);
	}
}
/*

Selenium Rating is : good
Manual Rating is : average
Employee Name is : Anuj
All Skills is : {java=very good, selenium=good, manual=average}

*/




