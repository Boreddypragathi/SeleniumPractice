package Seliniumsession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is applied for all web elements
		//it is not a custom wait for each webelement
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//1.home page
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("Ravi");//10
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("pragathi");//10
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("naresh");//10
		//2.contact page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//now if are in contact page it will always take the latest wait it is 5 seconds
		//come back o home page it will always take the 10 seconds
		//wait is differ from one page to other
		//if you don't want wait we have to nullify the value by passing 0 vlaue
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(000));
		//it is not applicable for non webelements--title of the page,URL,alert
		//if the element is not there still we need to wait for 10 seconds
	}

}
