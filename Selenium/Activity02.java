package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity02 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 // Setup the Firefox driver(GeckoDriver)
	    WebDriverManager.firefoxdriver().setup();

	    // Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
	    
	    // Open the browser
	    driver.get("https://v1.training-support.net/selenium/login-form");
	    
	    //title page
	    System.out.println("Home page Title:" + driver.getTitle());
	    
	    //username
	    driver.findElement(By.id("username")).sendKeys("admin");
	    
	    //password
        driver.findElement(By.id("password")).sendKeys("password");
        
        //login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
          
        // Print the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);       
	   
	    //take screenshot
	    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File savedScreenshot = new File("src/test/resources/screenshot.jpg");
        FileUtils.copyFile(screenshot, savedScreenshot);
        
      //exit
	    driver.quit();
	}

}
