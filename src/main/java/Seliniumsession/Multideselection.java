package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multideselection {
	public static  WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
WebElement source=driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("droppable"));
Actions act = new Actions(driver);

		act.clickAndHold(source).moveToElement(target).release().perform();
		
		

		//act.dragAndDrop(source, target).perform();
		//act.dragAndDrop(source, target).build().perform();
		//act.dragAndDrop(source, target).build();

		
	}

}
