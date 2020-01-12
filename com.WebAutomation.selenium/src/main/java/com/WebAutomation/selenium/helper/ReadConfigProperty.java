package com.WebAutomation.selenium.helper;

import java.io.InputStream;


public class ReadConfigProperty {

	public static void main(String[] args) {
		InputStream input = ReadConfigProperty.class.getClassLoader().getResourceAsStream("/helper/config.properties");
		if(input !=null)
		{
			System.out.println("File Found");
		}
		else{
			System.out.println("File not found");
		}
	}

}
