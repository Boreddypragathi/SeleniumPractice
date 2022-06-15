package TestNGSession;

import org.testng.annotations.Test;

public class EcpectedExceptionconcept {
	String Name;
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void logintest()
	{
		System.out.println("login test");
		int i=9/3;
		EcpectedExceptionconcept obj=new EcpectedExceptionconcept();
		obj.Name="Naveen";
		//obj.Name=null;
		System.out.println(obj.Name);

		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
