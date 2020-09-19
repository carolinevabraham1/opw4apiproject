package com.api.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class AddBulkDataTest extends BaseClass{

	@Test
	public void checkBulkPost() throws Exception
	{
		String apiTestData = config.getApiTestData("addBulkData");
		Response resp = config.executeBulkPostRequest(apiTestData);
		
		resp.then().log().all();
	}
}
