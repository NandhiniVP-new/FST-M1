package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

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
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				//print the title of the After login page
				String message  = driver.findElement(By.xpath("//h2[contains(@class, 'text-4xl')]")).getText();
				System.out.println(message);
				
				driver.quit();

				
	}

}
