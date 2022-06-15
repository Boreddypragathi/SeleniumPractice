package Seliniumsession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webdriver {

	//public Webdriver() {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		

		// TODO Auto-generated constructor stub
	//is just library,tool,framework to perform user actons on the browser
	//only for web web automation tool applications
	
	//supports java,python,c#,go,kotlin,JS
	//it supports multiple platforms,MAC,Windows,Linux
	//free and open source source code is avaialble to modify anything
	//Selenium 4:w3c protocol certified

	//Not for mobile native application
	//can not automate the desktop applicaton
	//not capable of automation of captcha,BARCODE,security testing,performance testing
	//Any UI look and feel
	//no built in test report
	//2008:selenium IDE got released
	//Selenium RC :selenum 1---2011
	//2013:Selenium webdriver+Rc(remote control server based)---selenium webdriver---selenium2
	//Selenium 3----2018
	//selenium 4---2021 sep(W3C webdriver protocol)
	//launch chrome:chrome
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helius\\Downloads\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();//launch browser
	driver.get("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html");
	String title=driver.getTitle();
	System.out.println("page title is     "+   title);
	if(title.equals("HAP"))
	{
	System.out.println("HAP is the title");
	}
	else
	{
		System.out.println("Invalid page");
	}
String url	=driver.getCurrentUrl();
System.out.println("current url"  +url);
if(url.equals("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html"))
{
	System.out.println("correct url");
}
else
{
	System.out.println("incorrect url");
}
	//driver.quit();
}//automation testing is --automation steps+verification points
}
