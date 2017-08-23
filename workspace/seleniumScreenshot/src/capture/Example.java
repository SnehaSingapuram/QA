package capture;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example
{
	
@Test  //This executes the test cases
	public void captureScreenshot() throws IOException
	{
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sneha\\Selenium\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); 
	
	//Opens Gmail URL
	driver.get("https://www.google.com/gmail/about/");
	
	//Click on the signIn button
	driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
	
	//Click on the textbox of gmail signIn id 
	driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("snehanvsingapu@gmail.com");

	//Take screeshot by first creating an object
	TakesScreenshot obj = (TakesScreenshot)driver;
	
	//Store this screenshot in a file 
	File source =obj.getScreenshotAs(OutputType.FILE);
	
	//Copying the same screenshots into destination file(here the desti file is same selenium i.e., it is going to store in this eclipse program file)
	FileUtils.copyFile(source, new File("./Screenshots/gmail.png") );
	
	//Prints Screenshot captured
System.out.println("Screenshot Captured");
	
	//close the driver
	driver.close();
	
	}
}
