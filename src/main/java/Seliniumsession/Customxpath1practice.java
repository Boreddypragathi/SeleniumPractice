package Seliniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Customxpath1practice {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromiumdriver().setup();
driver=new ChromeDriver();
driver.get("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html");
Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//driver.findElement(By.xpath("//input[@id='username' and @name='username']")).sendKeys("admin");
//driver.findElement(By.xpath("//input[@id='username' and @name='username' and @type='text']")).sendKeys("admin");
//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@ng-model='username']")).sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]")).sendKeys("thiru@123");
driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
