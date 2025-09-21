package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/login-form/");
		driver.manage().window().maximize();
		//verify using page title
		System.out.println("page title:" + driver.getTitle());
		//enter username password and submit it
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		//print the title of the After login page
		System.out.println("After login :" + driver.getTitle());
		
		driver.quit();

		
	}

}
