package com.careerit.selenium.testngpack;

import org.testng.annotations.Test;

public class Selenium_TestNG_TestPriority {
	
	@Test (priority=4)
	public void testCase_01(){
		System.out.println("Executing Test Case 01");
	}
	
	@Test (priority=3)
	public void testCase_02(){
		System.out.println("Executing Test Case 02");
	}
	
	@Test (priority=0)
	public void testCase_03(){
		System.out.println("Executing Test Case 03");
	}
	
	@Test (priority=1)
	public void testCase_04(){
		System.out.println("Executing Test Case 04");
	}
	
	@Test (priority=2)
	public void testCase_05(){
		System.out.println("Executing Test Case 05");
	}

}
