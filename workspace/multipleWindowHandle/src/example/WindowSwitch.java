package example;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowSwitch 
{
	   
@Test	

	public void switchChildWindow()
	
	{
	
System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();

driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dcarousel-about-en");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

String parent_window = driver.getWindowHandle();

System.out.println("Before switching Title is" +driver.getTitle());

driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a"));

Set <String> s1 =     driver.getWindowHandles();

Iterator <String> i1 = s1.iterator();

while(i1.hasNext())
{
	
	String child_window = i1.next();
	
	if(!parent_window.equalsIgnoreCase(child_window))
	{
	
		driver.switchTo().window(child_window);
		
		System.out.println("After switching Title is" +driver.getTitle());
		
		driver.close();	
	}
	
}

driver.switchTo().window(parent_window);

System.out.println("Back to the Parent Window" +driver.getTitle());
	}
}
