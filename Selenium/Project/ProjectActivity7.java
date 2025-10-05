package Project;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class ProjectActivity7 {

		 WebDriver driver;

		    @BeforeClass
		    public void beforeClass() {
		        driver = new FirefoxDriver();

		        // Open browser
		       driver.get("http://alchemy.hguy.co/orangehrm");
		        driver.manage().window().maximize();
		    }

		    @Test
		    public void loginTest() {
		        // Find the username and password fields
		       WebElement username = driver.findElement(By.id("txtUsername"));
		       WebElement password = driver.findElement(By.id("txtPassword"));

		        // Enter credentials
		        username.sendKeys("orange");
		        password.sendKeys("orangepassword123");
		        driver.findElement(By.className("button")).click();
		        
		        // Click Myinfo - Qualification - Add
		        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		       
		        driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/pim/viewQualifications/empNumber/1']")).click();
		        driver.findElement(By.id("addWorkExperience")).click(); 
		        
		        // update details 
		        WebElement firstName = driver.findElement(By.id("experience_employer"));
		        WebElement lastName = driver.findElement(By.id("experience_jobtitle"));
		 
		        firstName.clear();
		        firstName.sendKeys("IBM");
		        lastName.clear();
		        lastName.sendKeys("Tester");
		        driver.findElement(By.id("btnWorkExpSave")).click(); 
		       
		        
	       
		  }

		   @AfterClass
		   public void afterClass() {
		        // Close browser
		    //driver.close();
			 	 
			  
		    }

	}
	


