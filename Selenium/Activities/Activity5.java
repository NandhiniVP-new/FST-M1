package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		driver.manage().window().maximize();
		//verify using page title
		System.out.println("page title:" + driver.getTitle());
		//enter username password and submit it
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
		
		driver.close();
	}

}
