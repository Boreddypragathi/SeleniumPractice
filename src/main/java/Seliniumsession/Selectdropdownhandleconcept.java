package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownhandleconcept {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	By country=By.id("Form_submitForm_Country");
	By states= By.id("Form_submitForm_State");
//		Select select=new Select(driver.findElement(country));
//		select.selectByIndex(5);
//		select.selectByVisibleText("india");
              
	
	
	driver.findElements(By.xpath("//select[@id=['Form_submitForm_Country']/option"));
	selectgetElemenybyText(country,"India");	
		Thread.sleep(2000);
		//selectgetElemenybyText(country,"India");
		//selectgetElemenybyvalue(country,"India");//short cut is not working ctrl+shift+2
		selectgetElemenybyText(states,"Goa");
	}
	
	
	public static WebElement getWebelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void selectgetElemenybyindex(By locator,int index)
	{
		Select select=new Select(getWebelement(locator));
		select.selectByIndex(5);
	}
	
	public static void selectgetElemenybyvalue(By locator,String value)
	{
		Select select=new Select(getWebelement(locator));
		select.selectByVisibleText(value);
	}
	public static void selectgetElemenybyText(By locator,String text)
	{
		Select select=new Select(getWebelement(locator));
		select.selectByVisibleText(text);
	}
	
	}
//assignmet

	
	


