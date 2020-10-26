package Temp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestEditBox {

@Test
    public static void main() {
    	
    	WebDriver driver;
    	
    	System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
        
        driver.findElement(By.name("q")).sendKeys("Mo");
        
        
   List<WebElement> ss= driver.findElements(By.xpath("//*[@class='col-12-12 _1PBbw8']/li"));

   
   for (WebElement s: ss) 
   {
	
	   System.out.println(s.getText());
	   
}
   
    } 
}

