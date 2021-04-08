package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertDemo2 {

	
	@Test
	public void funA() {
		System.out.println("funA of TestNGAssertDemo2");
		Assert.assertTrue(true,"Test case pass");
		
	}
}
