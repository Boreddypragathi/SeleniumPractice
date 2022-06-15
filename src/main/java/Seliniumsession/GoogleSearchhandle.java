package Seliniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchhandle {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//every application first DOM will be loaded//DOM structure//It is a document//with HTML and XML
		driver.get("http://google.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Naveen AutomationLabs");
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));
		Thread.sleep(3000);
		
		for(WebElement e : suggList) 
		{
			String text = e.getText();
			System.out.println(text);
			if(text.contains("naveen automationlabs github"))
			{
				e.click();
				break;
			}
		}

	}

}
