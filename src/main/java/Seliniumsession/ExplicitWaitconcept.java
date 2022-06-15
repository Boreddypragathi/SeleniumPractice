package Seliniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitconcept {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//webdriverwait
		//fluentwait
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By trail=By.id("Form_submitForm_subdomain");
		By name=By.id("Form_submitForm_Name");
		By Email=By.id("Form_submitForm_Email");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//need to press the ctrl+space
		WebElement name_ele=wait.until(ExpectedConditions.presenceOfElementLocated(name));
		name_ele.sendKeys("pragathi");
		getElement(trail).sendKeys("ravi");
		getElement(Email).sendKeys("bpragathi24@gmail.com");
		
		//driver.findElement(trail).sendKeys("firsttimme");
		//driver.findElement(Email).sendKeys("bpragathi24@gmail.com");	
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
public static WebElement ElementPresence(By locator,int timeout)//element is avaialable in DOM
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
public static WebElement ElementVisible(By locator,int timeout)//element is avaialble on the dom of the page and visible on the webpage.Visibilty 
//means it considers height and width of the webelement grater than 0
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
}
