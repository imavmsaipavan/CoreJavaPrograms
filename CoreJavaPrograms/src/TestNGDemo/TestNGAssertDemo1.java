package TestNGDemo;


import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGAssertDemo1 {

	@Test
public void funA() 
{
	System.out.println("funA of TestNGAssertDemo1");
    Assert.assertTrue(true);
}
	@Test
	public void funB()
	{
		System.out.println("funB of TestNGAssertDemo1");
		Assert.assertTrue(false);
	}
	@Test
	public void funC() {
		System.out.println("funC of TestNGAssertDemo1");
		Assert.assertFalse(false);
	}
	@Test
	public void funD() 
	{
		System.out.println("funA of TestNGAssertDemo1");
	    Assert.assertFalse(true);
	}
	
}
