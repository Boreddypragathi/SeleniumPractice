package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsandclick {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
By Email=By.id("input-email");
By pwd=By.id("input-password");
By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
//Actions action=new Actions(driver);
//action.sendKeys(getelement(Email), "bpragathi24@gmail.com");
//action.sendKeys(getelement(pwd), "pragathi@123");
//action.click(getelement(login)).perform();	
doSendKeys(Email,"bpragathi24@gmaill.com");
doSendKeys(pwd,"pragathi@123");
doActionsclick(login);
}
public static WebElement getelement(By locator)
{
	return driver.findElement(locator);
}
public static void doSendKeys(By locator,String value)
{
	Actions act=new Actions(driver);
	act.sendKeys(getelement(locator),value).perform();
}
public static void doActionsclick(By locator)
{
	Actions act=new Actions(driver);
	act.click(getelement(locator)).perform();
}

}
