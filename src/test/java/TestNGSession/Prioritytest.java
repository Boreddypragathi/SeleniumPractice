package TestNGSession;

import org.testng.annotations.Test;

public class Prioritytest {
	@Test(priority = 1)
	public void a_test() {
		System.out.println(" a test ");
	}

	@Test(priority = -1)
	public void b_test() {
		System.out.println(" b test ");
	}

	@Test(priority = 0)
	public void c_test() {
		System.out.println(" c test ");
	}//if priority is same for all it will consider alphabetics
	//if some of them are prioritised and some then m do not have priority first no priproty test cases will run
//if priority given as numeric ,and alphabets as priority first numerics will run
	@Test(priority = 2)
	public void d_test() {
		System.out.println(" d test ");
	}

	@Test(priority = 3)
	public void e_test() {
		System.out.println(" e test ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}