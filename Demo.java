package multiplewindow;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	
	public static final String Subwindow = null;

	
		@Test
			public void Testcase() 
	
		{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	driver.get("https://www.pnc.com/en/personal-banking.html");
	
	//Choosing the element//
		
	driver.findElement(By.xpath(".//*[@id='userId']")).click();
	driver.findElement(By.xpath(".//*[@id='olb-btn']")).click();
	String ParentWindow=driver.getWindowHandle();
	for(String Subwindow:driver.getWindowHandles());
	{
		driver.switchTo().window(Subwindow);
	}
	System.out.println(driver.findElement(By.cssSelector(".panelHeadTitle>h1")).getText());
	driver.findElement(By.xpath(".//*[@id='alternateSignon_userId']")).click();
	driver.close();
	
	driver.switchTo().window(ParentWindow);
driver.close();
	}

	}






	