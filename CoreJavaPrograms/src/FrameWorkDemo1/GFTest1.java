package FrameWorkDemo1;

import org.testng.annotations.Test;

public class GFTest1 {

	@Test
	public void loginTest()
	{
		GenericFuntion1 key = new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("http://gmail.com");
		key.enterData("ID", "identifierId", "asaipavan333@gmail.com");
		key.click("xpath", "//*[@id='identifierNext']/div/button/div[2]");
	}
}
