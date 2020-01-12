package com.WebAutomation.selenium.smokeTest;

import org.testng.annotations.Test;

import com.WebAutomation.selenium.helper.StartWebDriver;

public class SecondTest extends StartWebDriver{
	
	@Test
	public void test2_1(){
		System.out.println("HEllo Second Test from ::: "+driver.getTitle());
		
	}

}
