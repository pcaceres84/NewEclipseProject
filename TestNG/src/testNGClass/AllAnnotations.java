package testNGClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AllAnnotations {

	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("This is a Before Suite Annotation");

	}

	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("This is a After Suite Annotation");

	}

	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("This is a After Test Annotation");

	}

	@BeforeClass
	public void beforeClassAnnotation() {
		System.out.println("This is a Before Class Annotation");

	}

	@AfterClass
	public void afterClassAnnotation() {
		System.out.println("This is a After Class Annotation");

	}

	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is a Before Method Annotation");

	}

	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This a After Method Annotation");

	}

	@Test
	public void testAnnotation1() {
		System.out.println("This is a Test Annotation 1");

	}

	@Test
	public void testAnnotation2() {
		System.out.println("This is a Test Annotation 2");

	}

	@Test
	public void testAnnotation3() {
		System.out.println("This is a Test Annotation 3");

	}

}