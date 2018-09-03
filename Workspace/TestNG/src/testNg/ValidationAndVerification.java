package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ValidationAndVerification {

	WebDriver driver;

	@BeforeTest
	public void start() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://phppot.com/demo/php-user-registration-form");
		Thread.sleep(2000);
	}

	@Test
	public void email_Fail() throws InterruptedException {

		// User Name

		WebElement UName = driver.findElement(By.xpath("//input[@name='userName']"));
		UName.sendKeys("Banner90");

		// First Name

		WebElement fName = driver.findElement(By.xpath("//input[@name='firstName']"));
		fName.sendKeys("Banner");

		// Last Name

		WebElement lName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lName.sendKeys("viker");

		// Password and Re-Password

		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("qwertyui");

		WebElement password2 = driver.findElement(By.xpath("//input[@name='confirm_password']"));
		password2.sendKeys("qwertyui");

		// Email

		WebElement email = driver.findElement(By.xpath("//input[@name='userEmail']"));
		email.sendKeys("viker");

		// Gender

		driver.findElement(By.xpath("//input[@value='Female']")).click();
		
		// Terms Accept

		driver.findElement(By.xpath("//input[@name='terms']")).click();
		
		//Register Hit
	
		driver.findElement(By.xpath("//input[@class='btnRegister']")).click();
		Thread.sleep(3000);
		// Verify

		String errorMessage =driver.findElement(By.xpath("//div[text()='Invalid Email Address']")).getText();
		
		//String errorMessage =driver.findElement(By.xpath("div[@class='error-message']")).getText();
		System.out.println(errorMessage+" "+"Result");
		
	}
	
/*	@Test
	public void password_Mismatch() {

		// User Name

		WebElement UName = driver.findElement(By.xpath("//input[@name='userName']"));
		UName.sendKeys("Banner90");

		// First Name

		WebElement fName = driver.findElement(By.xpath("//input[@name='firstName']"));
		fName.sendKeys("Banner");

		// Last Name

		WebElement lName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lName.sendKeys("viker");

		// Password and Re-Password

		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("qwertyui");

		WebElement password2 = driver.findElement(By.xpath("//input[@name='confirm_password']"));
		password2.sendKeys("qwertyui");

		// Email

		WebElement email = driver.findElement(By.xpath("//input[@name='userEmail']"));
		email.sendKeys("viker");

		// Gender

		driver.findElement(By.xpath("//input[@value='Female']")).click();
		
		// Terms Accept

		driver.findElement(By.xpath("//input[@name='terms']")).click();

	}*/
}
