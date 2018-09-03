package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class WebTablesStatic {

	WebDriver driver;
	@BeforeTest
	public void start()throws Exception
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com//index.php//pim//viewEmployeeList"); // Open URL
	}
	
}


