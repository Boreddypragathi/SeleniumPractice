package Seliniumsession;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdownconceptexercise {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox1")).click();
		Thread.sleep(2000);
		By choices=By.xpath("(//div[contains(@class,'comboTreeDropDownContainer')])[2]//li/span[@class='comboTreeItemTitle']");
		selectChoice(choices,"all");
		//selectChoice(choices,"choice 3","choice 2");
		
		
	}
	public static void selectChoice(By locator, String... value) {
		List<WebElement> choiceLIst=driver.findElements(locator);
		System.out.println(choiceLIst.size());
		boolean flag = false;
		if (!value[0].trim().equalsIgnoreCase("all")) {
			for (WebElement e : choiceLIst) {
				String text = e.getText().trim();
				//System.out.println(text);

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						flag = true;
						e.click();
						break;
					}
				}

			}
		} else {
			
			// all selection logic:
						for (WebElement e : choiceLIst) {
							e.click();
							flag = true;
						}
					}
					
					if(flag == false) {
						System.out.println("choice is not available " + value[0]);
					}

				}
		
	}

