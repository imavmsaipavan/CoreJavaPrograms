package FrameWorkDemo1;

import java.io.IOException;

import org.testng.annotations.Test;

public class GFTest2 {

	@Test
	public void flightTest2() throws IOException
	{
		GenericFuntion1 key= new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("http://demo.guru99.com/test/newtours/index.php");
		key.enterData("xpath","//input[@type='text']", "Mercury");
		key.enterData("xpath","//input[@type='password']", "Mercury");
		key.click("xpath","//input[@type='submit']");

		String path ="C:\\Users\\mani\\Desktop\\ScreenShot\\screen2.png";
		key.takeScreenShot(path);
		
		
	}
	
}
