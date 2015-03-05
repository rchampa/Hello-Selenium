package es.ricardo.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumJUnitTest {
	
	static WebDriver driver;
	WebElement email,register,download; 
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Hello.. Im in before class method");
		System.out.println("Hello selenium & webdriver...");  
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/selenium/ejemplo1");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Hello.. im in Before test method");
    	
	}

	@Test
	public void testEmail() {
		System.out.println("Email test...");
		email = driver.findElement(By.id("email"));
		String placeholder=email.getAttribute("placeholder");
		Assert.assertEquals("ricardo@mail.com", placeholder);

	}

	@Test
	public void testRegister() {
		System.out.println("Register test...");
    	register = driver.findElement(By.name("register"));
    	String text = register.getAttribute("value");
    	Assert.assertEquals(text, "");
	}
	
	@Test
	public void testLink() {
		System.out.println("Href test...");
		download = driver.findElement(By.linkText("Downloads"));
		String url = download.getAttribute("href");
		Assert.assertNotNull(url);
    	
	}


	@After
	public void tearDown() throws Exception {
		System.out.println("Hello.. im in After test method");
		
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("Hello.. Im in After class method");
		driver.quit();
	}
}
