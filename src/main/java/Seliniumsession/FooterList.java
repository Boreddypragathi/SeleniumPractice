package Seliniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FooterList {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.freshworks.com/ae/");
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	//List<WebElement> footerlist=driver.findElements(By.xpath("//div[@class='footer-main']//ul//a"));
		List<WebElement> rightsidelist=driver.findElements(By.xpath("//div[@class='list-group']/a"));
		Thread.sleep(3000);
		
		
		//footerlist.stream().forEach(e->System.out.println(e.getText()));
		//footerlist.stream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));
	rightsidelist.stream().forEach(e->System.out.println(e.getText()));
	rightsidelist.stream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));
	}
	
}
	


