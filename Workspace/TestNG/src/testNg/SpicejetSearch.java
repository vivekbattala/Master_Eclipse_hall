package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SpicejetSearch {
	WebDriver driver;
	@BeforeTest
	public void login() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void BookFlight() throws InterruptedException
	{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Delhi (DEL)']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[text()=' Mumbai (BOM)'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='28'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='20'])[1]")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']/option[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

	@AfterTest
	public void close()
	{
		driver.close();
	}
}
