package es.ricardo.selenium.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectModel {


	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://localhost/selenium/ejemplo2");
		
		LoginPage login_page = new LoginPage(driver);
		WebElement tf_username = login_page.getTFUsername();
		tf_username.sendKeys("rcb");
		WebElement tf_password = login_page.getTFPassword();
		tf_password.sendKeys("1234");
		
		String username = tf_username.getAttribute("value");
		String password = tf_password.getAttribute("value");
		System.out.println("LoginPage usuario: "+username);
		System.out.println("LoginPage password: "+password);
		
		WebElement bt_login = login_page.getButtonLogin();
		bt_login.click();
		
		HomePage home_page = new HomePage(driver);
		WebElement h3_username = home_page.getH3Username();
		String home_username = h3_username.getAttribute("innerHTML");
		System.out.println("HomePage username: "+home_username);
		
		WebElement tf_firstname = home_page.getTextFieldFirstName();
		tf_firstname.sendKeys("Ricardo");
		
		WebElement tf_surtname = home_page.getTextFieldSurName();
		tf_surtname.sendKeys("Champa");
		
		WebElement bt_save = home_page.getSaveButton();
		bt_save.click();
		
		WebElement data_firstname = home_page.getDataFirstName();
		System.out.println(data_firstname.getAttribute("innerHTML"));
		
		WebElement data_surname = home_page.getDataSurName();
		System.out.println(data_surname.getAttribute("innerHTML"));
		
		driver.quit();
		
	}
}
