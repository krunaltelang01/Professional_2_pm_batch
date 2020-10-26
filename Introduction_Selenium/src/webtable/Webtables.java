package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares SetUp\\Selenium Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		Thread.sleep(5000);
		
		String s=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[5]/font")).getText();
		System.out.println(s);
		
	
		
	}

}
