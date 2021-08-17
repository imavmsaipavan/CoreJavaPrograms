package SeleniumPrograms;

import org.testng.annotations.Test;

public class GetAndSetDemo1 {

	@Test
	public static void getAndSet() {

		System.setProperty("RBG technologies", "Selenium");
		
		System.out.println(System.getProperty("RBG technologies"));
		
		setData();
		
		System.out.println(System.getProperty("RBG technologies"));	
	}
	
	@Test
	public static void setData()
	{
		System.setProperty("RBG technologies", "Selenium with Data");
	}

}
