package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo1 {
  @Test
  public void funA() {
	  System.out.println("funA of AnnotationDemo1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod of AnnotationDemo1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod of AnnotationDemo1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass of AnnotationDemo1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass of AnnotationDemo1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest of AnnotationDemo1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest of AnnotationDemo1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite of AnnotationDemo1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite of AnnotationDemo1");
  }

}
