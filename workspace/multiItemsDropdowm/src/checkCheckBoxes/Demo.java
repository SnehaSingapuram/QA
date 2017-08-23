package checkCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty(key, value)
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
        
		Thread.sleep(1000);
		//Creating a "Select" class for month with obj "mnt"
		Select mnt = new Select(driver.findElement(By.id("month")));
		
		Thread.sleep(1000);
		//Selecting the month  by Index
		mnt.selectByIndex(4);
		
		Thread.sleep(1000);
		//Selecting the month by Value
		mnt.selectByValue("6");
		
		Thread.sleep(1000);
		//Selecting the month by visible text
		mnt.selectByVisibleText("Dec");
		
		driver.quit();
		
	}

}
