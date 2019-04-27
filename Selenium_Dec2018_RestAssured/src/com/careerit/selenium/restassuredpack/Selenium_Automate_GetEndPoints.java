package com.careerit.selenium.restassuredpack;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Selenium_Automate_GetEndPoints {
	
	
	public static void main(String[] args) {
		Selenium_Automate_GetEndPoints obj=new Selenium_Automate_GetEndPoints();
		
		obj.executeGETEndPointURL();
	}
	
	public void executeGETEndPointURL(){
		String baseUrl="https://reqres.in";
		String endPointUrl="api/users";
		Map<String, String> queryParams=new HashMap<String, String>();
		queryParams.put("page", "2");
		
		RestAssured_Utils objUtils=new RestAssured_Utils();
		
		 RequestSpecification request= objUtils.buildRequestSpecification(baseUrl, endPointUrl, null, null, null, null);
		 
		 Response response= RestAssured.given().spec(request).log().uri().get();
		 
		 System.out.println(response.getBody().asString());
		 
		 JSONObject jsonObject = new JSONObject(response.getBody().asString());
		 
		String totalPages =jsonObject.get("total").toString();
		 
		System.out.println("Total  = "+ totalPages);
		
		 JSONArray dataArray= (JSONArray)jsonObject.get("data");
		 
		System.out.println("First Name of 3rd json object = "+dataArray.getJSONObject(0).get("first_name").toString());
		
		
		 
		 
		
	}
	
	
  
	
	

}
