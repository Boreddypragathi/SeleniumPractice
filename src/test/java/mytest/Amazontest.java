package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazontest extends Basetest{
	WebDriver driver;
	@Test(priority = 1, description = ".....checking page title contains amazon......")
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.11", "....amazon page title is not matched....");
	}

	@Test(priority = 3, description = ".....checking page url contains amazon......")
	public void pageUrlTest() {
		//Run | Debug
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("amazon"), ".....amazon page url is not matched with amazon");
		//Comment
	}

	@Test(priority = 2, enabled = true, description = ".....checking search field exist on login page......")
	public void isSearchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
}
