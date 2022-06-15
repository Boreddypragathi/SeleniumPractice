package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategy {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//every application first DOM will be loaded//DOM structure//It is a document//with HTML and XML
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/register");
		Thread.sleep(1000);
		//create webelement(By using locator+action(click+select+send keys+right click+text+displayed or not you can check
		//id
		/*driver.findElement(By.id("employee_name")).sendKeys("Pragathi");
		driver.findElement(By.id("designation")).sendKeys("selenium expert");*/
		/*WebElement name=driver.findElement(By.id("employee_name"));
		WebElement designation=driver.findElement(By.id("designation")); mnkAX  BNNN
		name.sendKeys("pragathi");
		name.sendKeys("selenium expert");*/
		//By locator approach....By is a class1`
		//By name=By.id("employee_name");
		//By designation=By.id("designation");
		//WebElement name_ele=driver.findElement(name);
		//WebElement designation_ele=driver.findElement(designation);
		//name_ele.sendKeys("Pragathi");
		//designation_ele.sendKeys("Seleniumexpert");
		//by locator approach usimg generic function
	
		//By name=By.id("employee_name");
		//By designation=By.id("designation");
		   // getElement(name).sendKeys("pragathi"); 
		
		//5 By locator with generic function of webelement and actions
			
		   // By name=By.id("username");
		//	By designation=By.id("password");
			//doSendKeys(name,"pragathi");
			//doSendKeys(designation,"seleniumexpert");
			
				
			//doSendKeys(name, "Pragathi");
			//doSendKeys(lastname, "seleniumexpert");
			
			//6th
			//Elementutil eleutil=new Elementutil(driver);
		   // eleutil.doSendKeys(firstname,"pragathi");//any normal example,,need to look about the usage of this kayword in java
			//eleutil.doSendKeys(name,"seleniumexpert");
			 
			 //7th String Locator
			/* String first_name_id = "input-firstname";
			 String last_name_id = "input-lastname";
			 String email_name="email";
			 String  telephone_name="telephone";
			 String  tax_id="input-fax";
			 String  company_name_class="form-control";
			 String  address_name1_xpath="//*[@id=\"input-address-1\"]";
			 String  address_name2_xpath="//*[@id=\"input-address-2\"]";
			 String  tax_id_city="input-city";
			 String  id_confirm="input-confirm";
			 String  postcode_id="input-postcode";
			 String  password_id="input-password";
			 String Agree_name="agree";*/
		
		//String first_name_id = "input-firstname";
		//String button = "//*[@type='submit']";
		By button = By.xpath("//*[@type='submit']");
		
		// doSendKeys("id", "input-firstname", "pragathi");
		 doClick(button);
		
		 //  By first_name_id = By.id("input-firstname");
		 //  By last_name_id = By.id("input-lastname");
		   
		 //  doSendKeys(first_name_id, "pragathi");
		   
		  
			 
			// doSendKeys("id", first_name_id, "pragathi");
		   
			 
			/* doSendKeys(getBy("id",first_name_id), "pragathi");
			 doSendKeys(getBy("id", last_name_id), "boreddy");
			 doSendKeys(getBy("name",email_name), "bpragathi24@gmail.com");
			 doSendKeys(getBy("name",telephone_name), "9032411221");
			 doSendKeys(getBy("id",tax_id), "0007");
			 doSendKeys(getBy("class",company_name_class), "Helius");
			 doSendKeys(getBy("xpath",address_name1_xpath), "kkl");
			 doSendKeys(getBy("xpath",address_name2_xpath), "gulladurthy");
			 doSendKeys(getBy("id",tax_id_city), "HYD");
			 doSendKeys(getBy("id",postcode_id), "518134");
			 doSendKeys(getBy("id",password_id), "pragathi@123");
			 doSendKeys(getBy("id",id_confirm), "pragathi@123"); */
			 
			 
			 
			  
			 }	
	
	
	
	   public static By getBy(String locatorType, String locatorValue) {
		   By locator = null;
		   switch(locatorType.toLowerCase()){
		   case "id":
			   locator = By.id(locatorValue);
			   break;
		   case "name":
			   locator = By.name(locatorValue);
			   break;
		   case "class":
			   locator = By.className(locatorValue);
			   break;
		   case "xpath":
			   locator = By.xpath(locatorValue);
			   break;
		   case "link":
			   locator = By.linkText(locatorValue);
			   break;
			   
		   default:			   
			   break;
		   }
		   return locator;
	   }
		
		public static void doSendKeys(By locator, String value){
			getElement(locator).sendKeys(value);
		}
	    
		public static void validateText(String string, String value){
			//Assertions
		}
		
		public static WebElement getElement(By locator){
		 return driver.findElement(locator);
	    }
		public static void doSendKeys(String locatorType, String locatorValue, String value) {
			getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	
}
		public static void doClick(By locator) {
			getElement(locator).click();
		}
}


