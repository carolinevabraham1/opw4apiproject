package com.api.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.api.genericLib.ApiConfig;
import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class FetchAllPostsTest extends BaseClass{

	@Test
	public void getAllPosts() throws Exception
	{
		String apiTestData = config.getApiTestData("getAllPostsfromPlacholder");
		Response resp = config.executeRequest(apiTestData);
		
		resp.then().log().all();
	}
}
