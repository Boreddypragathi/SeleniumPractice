package Seliniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");	
		
		List<WebElement> Linkslist = driver.findElements(By.tagName("a"));
		
		/*for(int i=0; i<=Linkslist.size(); i++)
		{
			String list = Linkslist.get(i).getText();			
			if(!list.isEmpty())
			{
				System.out.println(list);	
			}
		}*/
		
		/*for (WebElement e : Linkslist) {
			String list = e.getText();			
			if(!list.isEmpty())
			{
				System.out.println(list);	
			}
		}*/
		
		//Linkslist.stream().forEach(ele -> System.out.println(ele.getText()));//using lambda expression using streams
		Linkslist.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		
		//get alt value for all the images -- Assignment
		public 
}

}
