package Seliniumsession;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitle {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//title taking 5 sec
System.out.println(driver.getTitle());
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.titleContains("HR software"));
System.out.println(driver.getTitle());
getTitlecontains("HR software",5);
System.out.println(geturl("contact-sales",5));
}
	
public static String getTitlecontains(String Title,int timeout)
{
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));	
if(wait.until(ExpectedConditions.titleContains("HR software")))
{
	return driver.getTitle();
}
return null;
}
public static String waitfortitle(String Title,int timeout)
{
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));	
if(wait.until(ExpectedConditions.titleIs(Title)))
{
	return driver.getTitle();
}
return null;
}
public static String geturl(String urlfraction,int timeout)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));	
	if(wait.until(ExpectedConditions.urlContains(urlfraction)))
	{
		return driver.getCurrentUrl();

	}
	return null;
	
	public static String geturlis(String urlfraction,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));	
		if(wait.until(ExpectedConditions.urlis(urlfraction)))
		{
			return driver.getCurrentUrl();

		}
		return null;
}
}
