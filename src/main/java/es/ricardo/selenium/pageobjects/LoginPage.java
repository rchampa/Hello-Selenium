package es.ricardo.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getTFUsername(){
		WebElement username = driver.findElement(By.name("username"));
		return username;
	}
	
	public WebElement getTFPassword(){
		WebElement password = driver.findElement(By.name("password"));
		return password;
	}
	
	public WebElement getButtonLogin(){
		WebElement login = driver.findElement(By.id("login"));
		return login;
	}

}
