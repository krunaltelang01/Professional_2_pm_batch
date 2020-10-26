package com.Frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_inside_Frame {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Automation");
		
		driver.switchTo().defaultContent();
	
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	}

}
