package Seliniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchHandle {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.findElement(By.id("search_query_top")).sendKeys("Dress");
Thread.sleep(3000);
//List<WebElement> sugglist=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
Thread.sleep(3000);
driver.findElement(By.xpath("//li[@contains(text(),'Casual Dresses > Printed' )]")).click();

//for(WebElement e:sugglist)
//{
//String text=e.getText();	
//if(text.contains("Casual Dresses > Printed"))
//	{
//	e.click();
//	break;
//		//System.out.println(text);//doubts need to asked
//	}
//}
//driver.findElement(By.xpath("//*[@id=\"search\"]/div[2]/ul/li[5]")).click();


	}

}
