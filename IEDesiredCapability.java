package Capability;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class IEDesiredCapability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is used to define IE capability 
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		WebDriver IEdriver = new InternetExplorerDriver();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		capabilities.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


		System.setProperty("webdriver.ie.driver", "IEdriver\\IEDriverServer.exe");
		  
		 //it is used to initialize the IE driver
		 WebDriver driver = new InternetExplorerDriver(capabilities);
		 driver.manage().window().maximize();
		 driver.get("http://gmail.com");
		 System.out.println(driver.getTitle());
		 driver.quit();

	}

}

  
 