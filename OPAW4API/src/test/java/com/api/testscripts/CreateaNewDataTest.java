package com.api.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class CreateaNewDataTest extends BaseClass{

	@Test
	public void checkNewData() throws IOException
	{
		String apiTestData = config.getApiTestData("createNewData");
		Response resp = config.executeRequest(apiTestData);
		
		resp.then().log().all();
	}
}
