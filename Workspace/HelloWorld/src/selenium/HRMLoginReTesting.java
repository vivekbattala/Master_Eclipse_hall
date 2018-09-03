package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class HRMLoginReTesting {

	WebDriver driver;
	Properties po;
	String time;
	
	// Date and Time stamp
public void date()
	
	{	
		//Generating Timestamp value
		  DateFormat df = new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");
		  Date d = new Date();
		  time = df.format(d);
		  System.out.println(time);	
	}

public void takeScreenShot(String name)throws Exception
{
	date();	  
	//Take ScreenShot
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\Vivek\\Desktop\\Workspace\\ScreenShots\\"+name+time+".png"));
}

	@BeforeTest
	public void start()throws Exception
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\Vivek\\Desktop\\Workspace\\HelloWorld\\src\\selenium\\Utility.properties");
		po = new Properties();
		po.load(fin);
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\SeleniumJars\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(po.getProperty("url")); // Open URL
	}
	
	@Test
  public void logic() throws Exception
	{
	
		FileInputStream fi = new FileInputStream("C:\\Users\\PHANITHEJ\\Downloads\\Workspace 12\\TestData\\OrangeHRmLogin.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("HRMLogin");
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\PHANITHEJ\\Downloads\\Workspace 12\\Results\\OrangeHRmLoginResults.xls");
		WritableWorkbook wb = Workbook.createWorkbook(fo);
		WritableSheet ws = wb.createSheet("Results",0);
		

		for (int i = 1; i < s.getRows(); i++) 
		{
			driver.findElement(By.xpath(po.getProperty("login.uname"))).sendKeys(s.getCell(1,i).getContents()); // type in username field
			driver.findElement(By.xpath(po.getProperty("login.pwd"))).sendKeys(s.getCell(2,i).getContents()); // type in password field
			driver.findElement(By.xpath(po.getProperty("login.submit"))).click();
			Thread.sleep(1000);
			
			for (int j = 0; j < s.getColumns(); j++) 
			{
				Label excelContents = new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(excelContents);
			
			}
	
			int size = driver.findElements(By.xpath(po.getProperty("home.welcomeText"))).size();
			System.out.println(po.getProperty("home.welcomeText"));
			System.out.println(size);
			
			if (size>0) 
			{
				System.out.println("Logged in Successfully");
				driver.findElement(By.xpath(po.getProperty("home.welcomeText"))).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(po.getProperty("home.logout"))).click();
				Label pass = new Label(4, i, "Pass");
				ws.addCell(pass);
				
				
			} else 
				
			{
				System.out.println("Log in Failed");
				Label fail = new Label(4, i, "Fail");
				ws.addCell(fail);
				takeScreenShot("LoginFailure");
			}
					
		}
		
		Label sc = new Label(0, 0, "Senario");
	  	Label un = new Label(1, 0,"Username");
	  	Label ps = new Label(2, 0, "Password");
	  	Label ac = new Label(3, 0, "ExpectedResult");
		Label rs = new Label(4, 0, "ActualResult");
		
		ws.addCell(sc);
		ws.addCell(un);
		ws.addCell(ps);
		ws.addCell(ac);
		ws.addCell(rs);
		
		wb.write();
		wb.close();	 
		
    }
	
	 @AfterTest
		public void end() throws Exception
		{
			Thread.sleep(3000);
			driver.close();	
		}
	  
	
}