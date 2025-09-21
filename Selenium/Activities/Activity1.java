package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a driver object
		WebDriver driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net/");
		driver.manage().window().maximize();
		//verify using page title
		System.out.println("page title:" + driver.getTitle());
		//locate  and click about us link
		driver.findElement(By.className("card")).click();
		//driver.findElement(By.cssSelector("a.card.my-8")).click();
		//driver.findElement(By.linkText("About Us")).click();// we have to give exact text
		//print the title of the about us page
		System.out.println("New Page title is :" + driver.getTitle());
		
		driver.quit();
	}

}
