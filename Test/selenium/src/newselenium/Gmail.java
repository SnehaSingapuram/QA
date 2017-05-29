package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{

	public static void main(String[] args)
	{
		
		//Open chrome
		System.setProperty(" webdriver.chrome.driver",  "‪C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.google.com//");
		

		
		
	}

}
