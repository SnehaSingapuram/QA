package langPreferences;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebDriverExample
{
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Create a Firefox Profile
		FirefoxProfile profile = new FirefoxProfile();
		
		driver.manage().window().maximize();
		
		//now setting language preferences as "french"
		profile.setPreference("intl.accecpt_languages", "fr");
		
		driver = new FirefoxDriver(profile);
		
		driver.get("https://www.google.com/");
		
		
	}

}
