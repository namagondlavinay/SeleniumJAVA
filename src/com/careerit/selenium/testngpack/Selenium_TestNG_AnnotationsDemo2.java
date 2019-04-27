package com.careerit.selenium.testngpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_TestNG_AnnotationsDemo2 {
	
	
	
	@Test
	public void shoppoingCartTestCase_01(){
		System.out.println("Execution of shoppoingCartTestCase_01");
	}
	
	@Test
	public void shoppoingCartTestCase_02(){
		System.out.println("Execution of shoppoingCartTestCase_02");
	}
	
	@Test
	public void shoppoingCartTestCase_03(){
		System.out.println("Execution of shoppoingCartTestCase_03");
	}
	
	@Test
	public void shoppoingCartTestCase_04(){
		System.out.println("Execution of shoppoingCartTestCase_04");
	}
	
	@Test
	public void shoppoingCartTestCase_05(){
		System.out.println("Execution of shoppoingCartTestCase_05");
	}
	
	@BeforeMethod
	public void initiateWebDriver(){
		System.out.println("Initiating WebDriver");
	}
	
	@AfterMethod
	public void closeWebDriver(){
		System.out.println("Closing WebDriver");
	}
	
	

}
