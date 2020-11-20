package com.employee.sw409;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeTests {
	
	@Test
	void testGetAllEmployees() {
		RestAssured.baseURI="http://employeebackend-env.eba-7npijpzr.us-east-2.elasticbeanstalk.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		Response httpResponse = httpRequest.request(Method.GET,"/getAllEmployees");
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		int statusCode = httpResponse.statusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
/*	@Test
	void testCreateEmployee() {
		RestAssured.baseURI="http://localhost:8080/api/v1"; 
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("employeeName", "Nicholas Rossell");
		requestParams.put("employeeTitle", "Garbage Man");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response httpResponse = httpRequest.request(Method.POST, "/createEmployee"); //NAME OF YOUR METHOD
		int statusCode = httpResponse.statusCode();
		String statusMessage = httpResponse.jsonPath().getString("status"); 
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(statusMessage, "success");
	}
	
	@Test
	void testUpdateEmployee() {
		RestAssured.baseURI="http://localhost:8080/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", "3");
		requestParams.put("employeeName", "Jasmine Holland");
		requestParams.put("employeeTitle", "Personal Secretary");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response httpResponse = httpRequest.request(Method.POST, "/updateEmployee"); //NAME OF YOUR METHOD
		int statusCode = httpResponse.statusCode();
		String statusMessage = httpResponse.jsonPath().getString("status"); 
		String res = httpResponse.getBody().asString();
		System.out.println("Response is: " + res);
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(statusMessage, "success");
	}
	
	@Test
	void testDeleteEmployee() {
		RestAssured.baseURI="http://localhost:8080/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", "7");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response httpResponse = httpRequest.request(Method.POST, "/deleteEmployee");
		int statusCode = httpResponse.statusCode();
		String statusMessage = httpResponse.jsonPath().getString("status");
		String res = httpResponse.getBody().asString();
		System.out.println("Reponse is: " + res);
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(statusMessage, "success");
	}
	
	*/
	
//	@Test
//	void testAddCustomer()
//	{
//		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
//		RequestSpecification httpRequest = RestAssured.given();
//		JSONObject requestParams = new JSONObject();
//		requestParams.put("name", "btest");
//		requestParams.put("salary", "3000");
//		requestParams.put("age", "23");
//		httpRequest.header("Content-Type", "application/json");
//		httpRequest.body(requestParams.toJSONString());
//		Response httpResponse = httpRequest.request(Method.POST, "/create");
//		int statusCode = httpResponse.statusCode();
//		String statusMessage = httpResponse.jsonPath().getString("status");
//		String res = httpResponse.getBody().asString();
//		System.out.println("Response is: " + res);
//		Assert.assertEquals(statusCode, 200);
//		Assert.assertEquals(statusMessage, "success");
//	}

}
