package com.careerit.selenium.testngpack;

import org.testng.annotations.Test;

public class Selenium_TestNG_TestAttributesDemo {
	
	@Test (description="Placing an order with Credit Card")
	public void testCase_01(){
		System.out.println("Executing Test Case 01");
	}
	
	@Test (description="Placing an order with promotional item")
	public void testCase_02(){
		System.out.println("Executing Test Case 02");
	}
	
	@Test (enabled=false)
	public void testCase_03(){
		System.out.println("Executing Test Case 03");
	}
	
	@Test
	public void testCase_04(){
		System.out.println("Executing Test Case 04");
	}
	
	@Test
	public void testCase_05(){
		System.out.println("Executing Test Case 05");
	}

}
