package Seliniumsession;

import java.util.List;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class genericmethodusingstring {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		public static void getAllElements(by locator,String value)
		{	
			List<String> li=driver.getElements(locator);
			
			for(String e:li)
			{
				String text=e.getText();
			}
		}
		

	}

}
