package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_I_Frame {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		
		WebElement s= driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(s);
		
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("Automation");

	}

}
