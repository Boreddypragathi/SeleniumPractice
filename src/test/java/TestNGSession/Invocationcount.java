package TestNGSession;

import org.testng.annotations.Test;

public class Invocationcount {
@Test(invocationCount=10)
public void createusertest()
{
	System.out.println("create user test");
}
}
//if you don't want to execute any test we can use enabled =true
