package Seliniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//back
		//forward
		//refresh
		//open url
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Helius\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.Amazon.com");//to () is calling get()
		System.out.println(driver.getTitle());
		driver.navigate().back();//both are sysnanyms get(),navigate().to() no diffrrence
		System.out.println(driver.getTitle());
		driver.navigate().forward();//
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		}

}
