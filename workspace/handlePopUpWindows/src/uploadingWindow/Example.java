package uploadingWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.actimind.com/contact.php");
		
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\sneha\\downloads\\0.png");
		
		
		
		
		
		
		
	}
	
	
}
