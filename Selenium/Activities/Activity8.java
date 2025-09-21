package Activities;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		//create action
		Actions builder = new Actions(driver);
		//open the page
		driver.get("https://training-support.net/webelements/mouse-events");
		driver.manage().window().maximize();
		//get page title
		System.out.println("page title:" + driver.getTitle());
		
		
		//Find the elements that can be clciked
		
		WebElement cargLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
	
		//perform left click on cargolock
		builder.click(cargLock).pause(Duration.ofSeconds(2)).click(cargoToml).pause(Duration.ofSeconds(2)).build().perform();
		//print the message
		String message = driver.findElement(By.id("result")).getText();
		System.out.println(message);
		
		//double clcick src and right click 
		builder.doubleClick(srcButton).pause(Duration.ofSeconds(2)).contextClick(targetButton).pause(Duration.ofSeconds(2)).perform();
		builder.click(driver.findElement(By.xpath("//span[text()='Open']"))).pause(Duration.ofSeconds(1)).build().perform();
		
		message = driver.findElement(By.id("result")).getText();
		System.out.println(message);
		
		
		//close 
	driver.close();
	}

}
