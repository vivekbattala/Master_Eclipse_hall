package testNg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	
	@Test
	public void test() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("yo");
		String Actual= driver.getTitle();
		
		System.out.println(Actual);
		System.out.println("vv");
		driver.get("https://www.gmail.com/");
		Assert.assertEquals("Gmail", "Gmail");
	}

		
}
