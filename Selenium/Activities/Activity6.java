package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

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
				//click it
				checkbox.click();
				//check if it selected
				System.out.println("Checkbox is selected: " + checkbox.isSelected());
				//click the checkbox again
				checkbox.click();
				//check if it selected again
				System.out.println("Checkbox is selected: " + checkbox.isSelected());
				
			///close 
			driver.close();
	}

}
