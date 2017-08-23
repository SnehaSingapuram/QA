package selectItems;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static  void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//Creating a "Select" class for month with obj "mnt"
		//Select mnt = new Select(driver.findElement(By.id("month")));
		
		//Selecting the month  by Index
		// mnt.selectByIndex(4);
		
		//Selecting the month by Value
		// mnt.selectByValue("6");
		
		//Selecting the month by visible text
		//mnt.selectByVisibleText("Dec");
		
		//driver.quit();
		

	}


}
