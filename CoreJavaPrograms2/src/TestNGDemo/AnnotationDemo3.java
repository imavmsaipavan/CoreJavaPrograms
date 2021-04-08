package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AnnotationDemo3 {
	@Test
	  public void funC() {
		  System.out.println("funA of AnnotationDemo1");
	  }
	
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod of AnnotationDemo1");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass of AnnotationDemo1");
	  }


	  @AfterTest
	  public void afterTest() {
		  System.out.println("afterTest of AnnotationDemo1");
	  }


	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("afterSuite of AnnotationDemo1");
	  }
}
