package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailID {
	
	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("banner.viker");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("kingstons");
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("gb_71")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

	



}
