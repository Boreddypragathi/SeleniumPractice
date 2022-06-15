package Seliniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start the Server 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helius\\Downloads\\chromedriver.exe");
		
		//Automation steps
		WebDriver driver = new ChromeDriver();
		driver.get("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html");	
		String Title = driver.getTitle();
		System.out.println("Page title:" +Title);
		
		//verification
		if(Title.equals("HAP")) {
			System.out.println("Valid Title");
		}
		else {
			System.out.println("Invalid Title");
		}
		
		driver.quit();
		
	}

}
