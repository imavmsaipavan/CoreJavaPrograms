package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo3 {

	@Test(priority = 0)
	public void loginTest() 
	{
		System.out.println("loginTest of TestNGDemo3");
		System.out.println(10/10);
	}
	@Test(priority = 1, dependsOnMethods = "loginTest" )
	public void customerDetails()
	{
		System.out.println("customerDetails of TestNGDemo3");
		System.out.println(0/0);
	}
	
}
