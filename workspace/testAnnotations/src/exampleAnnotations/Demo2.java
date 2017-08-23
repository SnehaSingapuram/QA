package exampleAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 
{

	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("Starting TestNG");
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		
		System.out.println("Stopping TestNG");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("Start Test Execution");
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("Delete Selenium for class2");
		
	}
	
	@Test
	public void Test3()
	{
		
		System.out.println("Inside Test3");
		
	}
	
	//@AfterTest
	//public void afterTest()
	//{
		
		//System.out.println("");
		
	//}
	
	
}
