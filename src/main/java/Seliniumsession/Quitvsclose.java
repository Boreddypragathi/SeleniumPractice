package Seliniumsession;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quitvsclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sessios id
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html");
	String title	=driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	//Quit:
	 //while sending all the request one sesiion id is created//browser is closed  //session id is null in case of quit 
	driver.close();//in case of close same session id will be available even after driver.close but it won't give the current url,it will say that invalid session id
	System.out.println(driver.getCurrentUrl());
	
	           //
	//close 
	//
		
		
		
	}
	
	

}
