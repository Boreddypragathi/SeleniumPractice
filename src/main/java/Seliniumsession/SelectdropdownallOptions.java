package Seliniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectdropdownallOptions {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country=By.id("Form_submitForm_Country");
		By states= By.id("Form_submitForm_state");
		Select select_country = new Select(driver.findElement(country));
List<WebElement>getalloption=select_country.getAllSelectedOptions();
		for(WebElement e:getalloption)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals("india"));
			{
				e.click();
				break;
			}
		}
		
	}

}
