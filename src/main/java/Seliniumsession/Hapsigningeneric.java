package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hapsigningeneric {
private static WebDriver driver;
//WebDriverManager.chromedriver().setup();

public  WebElement getelement(By locator)
{
	return driver.findElement(locator);
}

public void dosendkeys(By locator,String value)
{
getelement(locator).sendKeys(value);
}
public  void doclick(By locator)
{
	getelement(locator).click();
}
}
