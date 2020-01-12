package com.WebAutomation.selenium.smokeTest;

import org.testng.annotations.Test;

import com.WebAutomation.selenium.helper.StartWebDriver;

public class FirstTest extends StartWebDriver {
	
	@Test
	public void test1(){
		System.out.println("HEllo First Test::: "+driver.getCurrentUrl());
	}

}
