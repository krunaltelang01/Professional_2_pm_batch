package com.Intro_webdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_Brouser_launch 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");
		
		
		driver.manage().deleteCookie(null);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS );
	

	}

}
