package com.api.testscripts;

import org.testng.annotations.Test;

import com.api.genericLib.ApiConfig;
import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class FetchAllCountriesTest extends BaseClass{

	@Test
	public void getAllCountry() throws Exception
	{
		String apiTestData = config.getApiTestData("getAllCountries");
		Response resp = config.executeRequest(apiTestData);
		
		resp.then().log().all();
	}
}
