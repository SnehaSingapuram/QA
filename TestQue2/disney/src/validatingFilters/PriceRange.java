package validatingFilters;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PriceRange {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://disneyworld.disney.go.com/resorts/");
		driver.manage().window().maximize();
		driver.findElement(By.id("priceRangeResorts")).click();
		
	    Thread.sleep(5000);
		driver.findElement(By.id("$-resorts")).click();
		System.out.println(driver.findElement(By.id("activityFilters")).getText());
		Thread.sleep(5000);
		
		driver.findElement(By.id("$$-resorts")).click();
		System.out.println(driver.findElement(By.id("activityFilters")).getText());
		Thread.sleep(5000);
		
		driver.findElement(By.id("$$$-resorts")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("activityFilters")).getText());
		
		
		driver.findElement(By.partialLinkText("Clear Filters")).click();
		driver.close();
		}
		

	}


