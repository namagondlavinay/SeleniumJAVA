package com.careerit.selenium.restassuredpack;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.FileReader;



import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class Selenium_Automate_PostEndPoints {
	
	public static void main(String[] args) throws Exception {
		Selenium_Automate_PostEndPoints obj=new Selenium_Automate_PostEndPoints();
		obj.executePOSTEndPoint();
		//obj.executePOSTEndPoint2();
	}
	
	
	
	
	public void executePOSTEndPoint() throws Exception{
		
		String baseUrl="https://reqres.in/";
		String endPointUrl="/api/users";
		
		JSONParser parser=new JSONParser();
		Object jsonRquest=parser.parse(new FileReader("./resources/postrequest.json"));
		
		org.json.simple.JSONObject objJson=(org.json.simple.JSONObject)jsonRquest;
		
		String body=objJson.toString();
		
		System.out.println("Request Body = "+ body);
		
		RestAssured_Utils objUtils=new RestAssured_Utils();
		
		RequestSpecification specific= objUtils.buildRequestSpecification(baseUrl, endPointUrl, null, null, null, body);
		
		Response response= RestAssured.given().spec(specific).log().uri().post();
		
		System.out.println("Status Code = "+ response.getStatusCode());
		
		System.out.println("Response Body = "+response.getBody().asString());
		
		JSONObject resonJsonObj=new JSONObject(response.getBody().asString());
		System.out.println("ID from response = "+resonJsonObj.get("id").toString());
		
		
		
		
		
	}
	
	public void executePOSTEndPoint2() throws Exception{
		
		String baseUrl="https://reqres.in/";
		String endPointUrl="/api/register";
		
		JSONParser parser=new JSONParser();
		Object jsonRquest=parser.parse(new FileReader("./resources/register.json"));
		
		JSONObject objJson=(JSONObject)jsonRquest;
		
		String body=objJson.toString();
		
		System.out.println("Request Body = "+ body);
		
		RestAssured_Utils objUtils=new RestAssured_Utils();
		
		RequestSpecification specific= objUtils.buildRequestSpecification(baseUrl, endPointUrl, null, null, null, body);
		
		Response response= RestAssured.given().spec(specific).log().uri().post();
		
		System.out.println("Status Code = "+ response.getStatusCode());
		
		System.out.println("Response Body = "+response.getBody().asString());
		
		
		
		
	}

}
