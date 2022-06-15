package Seliniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitforelements {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/ae/");
		By footers=By.xpath("//div[@class='footer-main']//li/a)").
		
		WebDriver wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		List<WebElement>footerlist=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footers));
	}

}
