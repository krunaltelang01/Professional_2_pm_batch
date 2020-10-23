package com.Intro_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("WebTable")).click();
		String s=	driver.findElement(By.xpath("//div[contains(text(),'9055577333')]")).getText();
		System.out.println(s);
		
		String s1=	driver.findElement(By.xpath("//div[contains(text(),'tyagi.shailja11@gmail.com')]")).getText();
		System.out.println(s1);

	
	}
}
