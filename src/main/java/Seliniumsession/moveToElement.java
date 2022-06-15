package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveToElement {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();//parent to child elements
		                                         //multi level menu items
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		WebElement parentmenu=driver.findElement(By.linkText("/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(parentmenu);
		
	}

}
