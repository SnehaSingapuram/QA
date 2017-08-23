package exampleAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Demo
{

	@BeforeClass
	public void BeforeClass()
	{
		
		System.out.println("Start Selenium for class1");
		
	}
	
	@BeforeMethod
	public void BeforeTest()
	{
		
		System.out.println("Opening Browser");
		
	}
	
	
	@Test
	
	public void Test1()
	{
		
		System.out.println("Inside Test1");		
		
	}
	
@Test
	public void Test2()
	{
		
		System.out.println("Inside Test2");
		
	}
	

//Actually it should be written as AfterMethod annotation but when I m trying to import it shows to change it to @org.testng.annotations.AfterMethod 
@org.testng.annotations.AfterMethod 
public void AfterMethod()
{

	System.out.println("Closing Browser");
	
}

@AfterClass
public void afterClass()
{
	
	System.out.println("Delete Selenium for class1");
	
}

}
