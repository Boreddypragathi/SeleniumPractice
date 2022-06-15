package TestNGSession;

import org.testng.annotations.Test;
//AAA Rule
//Arrange Act Assert
public class DependenceonMethods {
@Test
public void logintest()
{
	System.out.println("login test");
	int i=9/0;
}
@Test(dependsOnMethods="logintest")	
public void dashboardtest()
{
	System.out.println("dashboard test");
}
@Test(dependsOnMethods="logintest")
public void searchTest()
{
	System.out.println("search test");
}
	
	
	
	
	
	
	
	
	
	
	
	
}
