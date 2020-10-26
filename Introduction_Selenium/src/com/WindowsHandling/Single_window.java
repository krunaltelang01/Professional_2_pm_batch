package com.WindowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_window {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		String parent= driver.getWindowHandle();
	
		  for (String child : driver.getWindowHandles())
		  {
			  driver.switchTo().window(child); 
		  }
	
		driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys("Testing");
	
		driver.close();
		
	
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	}
}


