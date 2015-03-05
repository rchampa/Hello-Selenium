package es.ricardo.selenium.helloworld;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TesNGExample {

	@BeforeTest
	public void openDBConnection() {
		System.out.println("I will execute Before any Test method/case executes");
	}

	@AfterTest
	public void CloseDBConnection() {
		System.out.println("I will execute After all Test method/case executes");
	}

	@Test
	public void testCase01() {
		System.out.println("Im in first testcase");
	}

	@Test
	public void testCase02() {
		System.out.println("Im in second testcase");
	}

	@Test
	public void testCase03() {
		System.out.println("Im in third testcase");
	}

	@BeforeMethod
	public void openBrowser() {
		System.out.println("I will be executed before Each Test Method");
	}

	@AfterMethod
	public void CloseBrowser() {
		System.out.println("I will be executed After Each Test Method");
	}
}