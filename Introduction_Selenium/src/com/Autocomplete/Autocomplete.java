package com.Autocomplete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete { //auto sugesions

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> serach_item = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		
		System.out.println("Total search Item is  ="+serach_item.size());
		
		for (WebElement s : serach_item) 
		{
			System.out.println(s.getText());
		
		
			if(s.getText().trim().equalsIgnoreCase("selenium IDE")) 
			{
				s.click();
				break;
			}
		
		}
		
	
	}

}
