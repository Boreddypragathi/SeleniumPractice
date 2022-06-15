package Seliniumsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiffrrentLocators {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(1000);
		//id can always be unique
		//nmae may be duplicate
		//driver.findElement(By.name("username")).sendKeys("Pragathi");
		//driver.findElement(By.name("firstname")).sendKeys("boreddy");
		//doSendKeys("firstname","Pragathi");
		// link text//driver.findElement(By.linkText("Register"));
		By name=By.name("username");
		By firstname=By.name("firstname");
		By loginbtn=By.name("loginbutton");
		doClick(loginbtn);
		dogetAttribute(By.id("input-email"),"value");
	}
	
	public static WebElement getElement(By locator)
	{ 
	return driver.findElement( locator);
	}
	public static void DoSendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	public static String dogettext(By locator)
	{
	return getElement(locator).getText();
	}

public static boolean doIsdisplayed(By locator)
{
	return getElement(locator).isDisplayed();
}
public static boolean doIsenabled(By locator)
{
	return getElement(locator).isEnabled();
}
public static String dogetAttribute (By locator,String value)
{
	return getElement(locator).getAttribute("value");
}
}
