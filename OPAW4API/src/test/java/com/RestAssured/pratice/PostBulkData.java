package com.RestAssured.pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class PostBulkData {

	@Test
	public void addBulkData() throws IOException
	{
		// To fetch json data from file
		File f = new File("E:\\SampleTestClass\\IndiaInfo.json");
		FileInputStream fis = new FileInputStream(f);
		String jsonData = IOUtils.toString(fis , "UTF-8");
		
		// To add that json data  in a required api
		RequestSpecification reqsp = RestAssured.given();
		reqsp.body(jsonData);
		reqsp.contentType(ContentType.JSON);
		RequestSender sender = reqsp.when();
		Response resp = sender.post("http://localhost:3000/posts");
		resp.then().log().all();
	}
}











