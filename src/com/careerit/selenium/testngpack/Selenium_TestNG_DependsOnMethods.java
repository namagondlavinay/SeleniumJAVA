package com.careerit.selenium.testngpack;

import org.testng.annotations.Test;

public class Selenium_TestNG_DependsOnMethods {
	
	@Test (dependsOnMethods="secondTestCase",alwaysRun=true)
	public void firstTestCase(){
		System.out.println("Executing first Test Case");
	}
	
	
	@Test
	public void secondTestCase(){
		System.out.println("Executing Second Test Case");
		throw new RuntimeException("Second Test Case Failed");
	}

}
