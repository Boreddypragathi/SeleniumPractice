package Seliniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	 private WebDriver driver;
	
	 public WebDriver init_Driver(String browserName) {
		 System.out.println("broser names is:" +browserName);
		 
		 if(browserName.equals("chrome")) {
			 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Helius\\Downloads\\chromedriver.exe");
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
	
		 if(browserName.equals("internetexplorer"))
		 {
			 //System.setProperty("webdriver.ie.driver", "C:\\Users\\Helius\\Downloads\\IEDriverServer.exe");
			WebDriverManager.firefoxdriver().setup();
			 driver=new InternetExplorerDriver();
		 }
		 else if(browserName.equals("firefox")){
			 System.out.println("Firefox Broser:" +browserName);
		 }
		 else{
			 System.out.println("Firefox Broser:" +browserName);
		 }
		 
		 
		return driver;
	 }

	 public void launchurl(String url) {
		 if(url == null) {
			 System.out.println("url is null");
			 return;
		 }
		 if(url.indexOf("http") == -1 || url.indexOf("https") == -1)
		 {
			 System.out.println("http(s) is missing in the url");
			 try {
				 throw new Exception("HTTPMISSING EXCEPTION");
				 }
			 catch (Exception e) {
				 System.out.println("https(s) is missing...");
			 }
			
			 
		 }
		 driver.get(url);		 
	 }
	 
	 public String getTitle() {
		 return driver.getTitle();
	 }
	 
	 public String getpageUrl() {
		 return driver.getCurrentUrl();
	 }
	 public void CloseBrowser(){
		 driver.close();
	 }
	 
	 public void quitBrowser() {
		 driver.quit();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
