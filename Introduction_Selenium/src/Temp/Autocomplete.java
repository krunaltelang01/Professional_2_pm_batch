package Temp;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Autocomplete {
	WebDriver driver;
	@Test
	public void Main() throws Exception 
	{
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");

		driver.findElement(By.name("q")).sendKeys("sele");
		Thread.sleep(5000);
		
		List<WebElement> ss= driver.findElements(By.xpath("//*[@role='listbox']/li"));
		System.out.println(" total Maching are"+ss.size());
															//*[@class='col-12-12 _1PBbw8']/li
		for (WebElement s : ss) 
		{
			System.out.println(" = "+s.getText());
			
			if(s.getText().trim().equals("selenium")) 
			{
				s.click();
				break;
			}
			
		}
	
	}

	

}
