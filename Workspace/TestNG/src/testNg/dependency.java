package testNg;

import org.testng.annotations.*;

import junit.framework.Assert;

public class dependency {

	@Test
	public void login() {

		Assert.assertEquals("gmail", "gmail");
		System.out.println("first");
	}

	@Test(dependsOnMethods={"login"})
	public void search() 
	{
		
		System.out.println("second");
		
	}
	
	@Test(dependsOnMethods={"search"})
	public void buy() 
	{
		Assert.assertEquals("rock", "pepper");
		System.out.println("search");
		
		
	}
	
	@Test(dependsOnMethods={"buy"},alwaysRun=true)
	public void last()
	{
		System.out.println("last");
	}
}
