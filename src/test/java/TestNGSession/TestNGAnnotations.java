package TestNGSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
@BeforeSuite//1
	public void DBConnection() {
	System.out.println("BS---Connection establish");
	}
@BeforeTest//2
public void CreateUser() {
		System.out.println("BT---Create USer");
}	
	@BeforeClass//3	
	public void LaunchBrowser() {
	System.out.println("BC--LaunchBrowser");
	}
	
@BeforeMethod	//4
	public void LoginToApp() {
		System.out.println("BM---Login");
	}
	
	@Test	
	public void getPageTitle() {
		System.out.println("Connection establish");
	}
	
	@Test	
	public void userInfoTest() {
		System.out.println("Connection establish");
	}
	public void searchTest() {
		System.out.println("searchTest");
	}
	@AfterMethod //6 //9 //12
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass //13
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}

	@AfterTest //14
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}

	@AfterSuite //15
	public void disconnectDB() {
		System.out.println("AS -- disconnectDB");
	}
	
	
//	
//	BS---Connection establish
//	BT---Create USer
//	BC--LaunchBrowser
//	BM---Login
//	Connection establish
//	AM -- logout
//	BM---Login
//	Connection establish
//	AM -- logout
//	AC -- closeBrowser
//	AT -- deleteUser
//	PASSED: getPageTitle
//	PASSED: userInfoTest	
	
	
	
	
	
	
	
}
