package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		driver.manage().window().maximize();
		//verify using page title
		System.out.println("page title:" + driver.getTitle());
		//enter username password and submit it
		WebElement textbox = driver.findElement(By.id("textInputButton"));
		//check if it enabled
		System.out.println("Input is enabled: " + textbox.isEnabled());
		//click the checkbox again
		driver.findElement(By.id("textInputButton")).click();
		//check if it text enabled 
		System.out.println("Input field is enabled: " + textbox.isEnabled());
		
		//type something
		textbox.sendKeys("Example Test");
		System.out.println(textbox.getDomProperty("value"));
	///close 
	driver.close();
	}

}
