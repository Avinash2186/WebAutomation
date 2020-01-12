package com.WebAutomation.selenium.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class StartWebDriver {
	
	public static WebDriver driver = null;
	
	@BeforeMethod
	public static void setUp(){
		System.out.println("Inside Setup method of Startwebdriver.......");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

	}
	
	@AfterMethod
	public static void tearDown(){
		driver.quit();
	}

}
