package testNg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;

public class Kundali {

	WebDriver driver;

	@BeforeTest
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.drikpanchang.com/jyotisha/horoscope-match/horoscope-match.html");
		Thread.sleep(2000);
	}

	@Test
	public void Boy() throws InterruptedException {
		WebElement fname = driver.findElement(By.id("kmb-name"));
		fname.sendKeys("Vivek");

		Select bmonth = new Select(driver.findElement(By.xpath("//select[@id='kmb-month']")));
		bmonth.selectByVisibleText("April (04)");

		Select bdate = new Select(driver.findElement(By.xpath("//select[@id='kmb-day']")));
		bdate.selectByVisibleText("15");

		Select byear = new Select(driver.findElement(By.xpath("//select[@id='kmb-year']")));
		byear.selectByVisibleText("1990");

		// Hours//

		Select bhour = new Select(driver.findElement(By.xpath("//select[@id='kmb-hr']")));
		bhour.selectByVisibleText("3");

		Select bminute = new Select(driver.findElement(By.xpath("//select[@id='kmb-min']")));
		bminute.selectByVisibleText("30");

		Select bsec = new Select(driver.findElement(By.xpath("//select[@id='kmb-sec']")));
		bsec.selectByVisibleText("10");

		Select bampm = new Select(driver.findElement(By.xpath("//select[@id='kmb-ampm']")));
		bampm.selectByVisibleText("PM");

		// City//

		WebElement bcity = driver.findElement(By.id("kmb-city"));
		bcity.sendKeys("Hyderabad");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER);
		ac.perform();

		Thread.sleep(2000);

	}

	@Test
	public void Girl() throws InterruptedException {
		Thread.sleep(2000);
		WebElement fname = driver.findElement(By.id("kmg-name"));
		fname.sendKeys("Pooja");

		Select bmonth = new Select(driver.findElement(By.xpath("//select[@id='kmg-month']")));
		bmonth.selectByVisibleText("February (02)");

		Select bdate = new Select(driver.findElement(By.xpath("//select[@id='kmg-day']")));
		bdate.selectByVisibleText("22");

		Select byear = new Select(driver.findElement(By.xpath("//select[@id='kmg-year']")));
		byear.selectByVisibleText("1992");

		// Hours//

		Select bhour = new Select(driver.findElement(By.xpath("//select[@id='kmg-hr']")));
		bhour.selectByVisibleText("1");

		Select bminute = new Select(driver.findElement(By.xpath("//select[@id='kmg-min']")));
		bminute.selectByVisibleText("30");

		Select bsec = new Select(driver.findElement(By.xpath("//select[@id='kmg-sec']")));
		bsec.selectByVisibleText("10");

		Select bampm = new Select(driver.findElement(By.xpath("//select[@id='kmg-ampm']")));
		bampm.selectByVisibleText("PM");

		// City//

		WebElement bcity = driver.findElement(By.id("kmg-city"));
		bcity.sendKeys("Mumbai");

		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER);
		ac.perform();
	}

	// submit
	@AfterTest
	public void submit() throws InterruptedException {
		driver.findElement(By.id("dpSubmitDiv")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();

	}

}
