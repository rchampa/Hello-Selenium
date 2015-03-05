package es.ricardo.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import es.ricardo.selenium.pageobjects.HomePage;
import es.ricardo.selenium.pageobjects.LoginPage;

public class PageObjectModelJUnit {


	
	static WebDriver driver;

	private static String username;
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Starting selenium & webdriver...");  
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://localhost/selenium/ejemplo2");
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		System.out.println("Login test...");
		LoginPage login_page = new LoginPage(driver);
		WebElement tf_username = login_page.getTFUsername();
		WebElement tf_password = login_page.getTFPassword();
		WebElement bt_login = login_page.getButtonLogin();
		
		Assert.assertNotNull(tf_username);
		Assert.assertNotNull(tf_password);
		Assert.assertNotNull(bt_login);
		
		tf_username.sendKeys("rcb");
		tf_password.sendKeys("1234");
		
		username = tf_username.getAttribute("innerHTML");
		
		bt_login.click();
	
	}

	@Test
	public void testHome() {
		System.out.println("Home test...");
		HomePage home_page = new HomePage(driver);
		WebElement h3_username = home_page.getH3Username();
		String text = h3_username.getAttribute("innerHTML");
		System.out.println(text);
		
    	Assert.assertTrue(text.contains(username));
    	
    	WebElement tf_firstname = home_page.getTextFieldFirstName();
    	WebElement tf_surname = home_page.getTextFieldSurName();
    	String my_name = "Ricardo";
    	String my_surname = "Champa";
    	tf_firstname.sendKeys(my_name);
    	tf_surname.sendKeys(my_surname);
    	
    	WebElement bt_save = home_page.getSaveButton();
    	bt_save.click();
    	
    	WebElement data_firstname = home_page.getDataFirstName();
    	WebElement data_surname = home_page.getDataSurName();
    	String text_data_firstname = data_firstname.getAttribute("innerHTML");
    	String text_data_surname = data_surname.getAttribute("innerHTML");
    	
    	Assert.assertEquals(text_data_firstname, my_name);
    	Assert.assertEquals(text_data_surname, my_surname);
    	
	}
	


	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("Hello.. Im in After class method");
		driver.quit();
	}

}
