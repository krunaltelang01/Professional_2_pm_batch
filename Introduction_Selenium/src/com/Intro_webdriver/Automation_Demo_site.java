package com.Intro_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Demo_site {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("John");
		
		driver.findElement(By.xpath("//input[@ng-model"
				+ "='LastName']")).sendKeys("Sinnhaa");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Old sangvi pune");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9898989892");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isSelected();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		driver.findElement(By.id("checkbox1")).isSelected();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[31]")).click();
	
		new Select(driver.findElement(By.xpath("//select[@id='Skills']"))).selectByVisibleText("Java");
		new Select(driver.findElement(By.xpath("//select[@id='countries']"))).selectByVisibleText("India");
		//new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"))).selectByVisibleText("India");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]"))).selectByVisibleText("1991");
		new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"))).selectByVisibleText("May");
		new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]"))).selectByVisibleText("23");
		
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Asdf@1223");
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Asdf@1223");
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Admin\\Desktop\\1.jpg");
			
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();

	}
}
