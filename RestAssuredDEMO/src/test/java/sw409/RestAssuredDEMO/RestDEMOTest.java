package sw409.RestAssuredDEMO;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestDEMOTest {
	
	@Test
	void testGetUser() 
	{
		RestAssured.baseURI="https://gorest.co.in/public-api/users";
		RequestSpecification httpRequest = RestAssured.given();
		Response httpResponse = httpRequest.request(Method.GET,"/123");
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		int statusCode = httpResponse.statusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
	@Test
	void testAddCustomer()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "btest");
		requestParams.put("salary", "3000");
		requestParams.put("age", "23");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response httpResponse = httpRequest.request(Method.POST, "/create");
		int statusCode = httpResponse.statusCode();
		String statusMessage = httpResponse.jsonPath().getString("status");
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(statusMessage, "success");
	}
}
