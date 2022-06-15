package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hapsignin {
public static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html");
driver.manage().window().maximize();

By username=By.xpath("//input[@ng-model='username']");
By password=By.xpath("(//input[contains(@class,'form-control')])[2]");
By loginbtn=By.xpath("//button[text()='Login']");
By gender=By.xpath("//select[@id=gender]");
By recruiter=By.xpath("//select[@id=recruiter]");

By createoffer=By.xpath("//a[@ng-href=\"#createoffer\"]");

//Hapsigningeneric hap=new Hapsigningeneric();
Thread.sleep(3000);
  dosendkeys(username, "admin");
  dosendkeys(password,"thiru@123");
  doclick(loginbtn);
  Thread.sleep(10000);
  
  WebElement menumouseover=driver.findElement(By.xpath("//a[contains(text(),'Offer/Employee Master')]"));
 // WebElement menumouseover=driver.findElement(By.xpath("//li[@class='dropdown ng-scope']"));
  Actions act=new Actions(driver);
  act.moveToElement(menumouseover).click().perform();
  doclick(createoffer);
  //driver.findElement(By.xpath("//a[@href='#home']")).click();
  //driver.findElement(By.id("myDiv")).click();
 	}

	
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void dosendkeys(By locator,String value)
	{
	getelement(locator).sendKeys(value);
	}
	public static void doclick(By locator)
	{
		getelement(locator).click();
	}
	
}
