package mytest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Seliniumsession.Webdriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	WebDriver driver;
	@BeforeTest(description = ".....setup for amazon test: launch chrome and enter url.....")
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
	}
	
	@AfterTest(description = "....closing the browser.....")
	public void tearDown() {
		driver.quit();
	}

}
