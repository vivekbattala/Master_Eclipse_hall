package framework;

import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Junit_sample {
	WebDriver driver;

	@Before
	public void before() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("banner.viker");
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("xxxxxx");
		driver.findElement(By.id("passwordNext")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("gb_71")).click();

	}

	@After
	public void after() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	}

}
