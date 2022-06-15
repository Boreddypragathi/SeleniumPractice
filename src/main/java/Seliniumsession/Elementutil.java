package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementutil {
	
private  WebDriver driver;
	
public Elementutil(WebDriver driver)
	{
		this.driver=driver;
	}

public static By getBy(String locatorType, String locatorValue) {
	   By locator = null;
	   switch(locatorType.toLowerCase()){
	   case "id":
		   locator = By.id(locatorValue);
		   break;
	   case "name":
		   locator = By.name(locatorValue);
		   break;
	   case "class":
		   locator = By.className(locatorValue);
		   break;
	   case "xpath":
		   locator = By.xpath(locatorValue);
		   break;
	   case "link":
		   locator = By.linkText(locatorValue);
		   break;
		   
	   default:			   
		   break;
	   }
	   return locator;
}

public WebElement getElement(By locator)
{
	 return driver.findElement(locator);
}

public void doSendKeys(By locator,String value)
{
	getElement(locator).sendKeys(value);
}

}


