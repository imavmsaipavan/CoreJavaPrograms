package TestNGDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	@Test
	public void funA() 
	{
		System.out.println("funA of TestNGDemo4");
	}
	@Test
	public void funB() throws Exception 
	{
		System.out.println("funB of TestNGDemo4");
        throw new Exception("funB failed");		
	}
	@Test
	public void funC() 
	{
		System.out.println("funC of TestNGDemo4");
		throw new SkipException("funC skipping");
	}

	@Test(enabled = false)
	public void funD() 
	{
		System.out.println("funD of TestNGDemo4");

	}
}
