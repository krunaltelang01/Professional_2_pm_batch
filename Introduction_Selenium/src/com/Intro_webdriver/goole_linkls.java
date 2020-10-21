package com.Intro_webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class goole_linkls {

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		
		int a=driver.findElements(By.tagName("a")).size();
		
		System.out.println("Total linkis is   =" +a);
		
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a	[1]")).click();
		driver.findElement(By.linkText("English")).click();
		
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a	[4]")).click();
		driver.findElement(By.linkText("English")).click();

		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a	[6]")).click();
		driver.findElement(By.linkText("English")).click();

	}	

}
