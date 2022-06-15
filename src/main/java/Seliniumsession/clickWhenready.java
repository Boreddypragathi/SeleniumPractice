package Seliniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickWhenready {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By contactsales=By.linkText("CONTACT SALES");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(contactsales)).click();
		clickwhenelementisready(contactsales,5);
	}
public static void clickwhenelementisready(By locator,int timeout)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
}
}
