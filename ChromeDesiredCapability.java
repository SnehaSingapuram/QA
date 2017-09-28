package DesiredCapabiliti;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ChromeDesiredCapability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is used to define chrome capability 
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		WebDriver Chromedriver = new ChromeDriver();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(ChromeDriver.);


		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		  
		 //it is used to initialize the chrome driver
		 WebDriver driver = new ChromeDriver(capabilities);
		 driver.manage().window().maximize();
		 driver.get("http://gmail.com");
		 System.out.println(driver.getTitle());
		 driver.quit();

	}

}



		 
