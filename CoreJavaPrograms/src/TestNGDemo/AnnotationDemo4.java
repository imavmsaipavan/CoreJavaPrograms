package TestNGDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo4 {

	@Test
	  public void funD() {
		  System.out.println("funA of AnnotationDemo1");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod of AnnotationDemo1");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass of AnnotationDemo1");
	  }

	
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforeTest of AnnotationDemo1");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("beforeSuite of AnnotationDemo1");
	  }

	 
}
