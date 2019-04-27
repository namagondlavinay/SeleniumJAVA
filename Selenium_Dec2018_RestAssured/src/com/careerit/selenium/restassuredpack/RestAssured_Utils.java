package com.careerit.selenium.restassuredpack;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestAssured_Utils {
	
	RequestSpecification buildRequestSpecification(String baseUrl,String endPointUrl,Map<String,String> headers,Map<String,String> queryParams,Map<String,String> pathParams,String body){
		RequestSpecBuilder requestBuilder = null;
		try {
			requestBuilder = new RequestSpecBuilder();
			
			requestBuilder.setBaseUri(baseUrl);
			requestBuilder.setBasePath(endPointUrl);
			if (headers!=null){requestBuilder.addHeaders(headers);}
			if (queryParams!=null){requestBuilder.addParams(queryParams);}
			if (pathParams!=null){requestBuilder.addPathParams(pathParams);}
			requestBuilder.setConfig(RestAssuredConfig.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()));
			requestBuilder.setUrlEncodingEnabled(false);
			if(body!=null){requestBuilder.setBody(body);}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return requestBuilder.build();
		
	}

}
