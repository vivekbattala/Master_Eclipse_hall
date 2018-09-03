package sikuli_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class PageTest {

	WebDriver driver;
	
	@Test
	public void sikuli() throws InterruptedException, SikuliException
	{
		Screen sc=new Screen();
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");

		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=ZnDOpkiMV6Q");
		Thread.sleep(2000);
		
		Pattern pause=new Pattern("C:\\Users\\Vivek\\Desktop\\YouTube_Screens\\pause.png");
		Pattern play=new Pattern("C:\\Users\\Vivek\\Desktop\\YouTube_Screens\\play.jpeg");
		Pattern setting=new Pattern("C:\\Users\\Vivek\\Desktop\\YouTube_Screens\\Settings.jpeg");
	
	    sc.click(pause);
	    sc.click(setting);
	}
}
