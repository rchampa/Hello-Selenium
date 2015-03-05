package es.ricardo.selenium.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	WebDriver driver = new FirefoxDriver();
    	
    	System.out.println("Hello Google...");  
        driver.get("http://localhost/selenium");  
    	
    	WebElement email = driver.findElement(By.id("email"));
    	WebElement register= driver.findElement(By.name("register"));
    	WebElement download = driver.findElement(By.linkText("Downloads"));

    }
}
