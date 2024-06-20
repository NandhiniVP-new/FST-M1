package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Setup the Firefox driver(GeckoDriver)
	    WebDriverManager.firefoxdriver().setup();

	    // Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://v1.training-support.net");
	    
	    //title page
	    System.out.println("Home page Title:" + driver.getTitle());
	    
	    //find the button
	    driver.findElement(By.id("about-link")).click();
	    
	    //new page 
	    System.out.println("About page title: " + driver.getTitle());
	    
	    //exit
	    driver.quit();
	}

}
