package es.ricardo.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getH3Username(){
		WebElement username = driver.findElement(By.id("username"));
		return username;
	}
	
	public WebElement getTextFieldFirstName(){
		WebElement firstname = driver.findElement(By.id("firstname"));
		return firstname;
	}
	
	public WebElement getTextFieldSurName(){
		WebElement surname = driver.findElement(By.id("surname"));
		return surname;
	}
	
	public WebElement getDataFirstName(){
		WebElement data_firsname = driver.findElement(By.id("data_firstname"));
		return data_firsname;
	}
	
	public WebElement getDataSurName(){
		WebElement data_surname = driver.findElement(By.id("data_surname"));
		return data_surname;
	}
	
	public WebElement getSaveButton(){
		WebElement save = driver.findElement(By.id("save"));
		return save;
	}

}
