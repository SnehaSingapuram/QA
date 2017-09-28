package multiplewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiplewindow {
@Test
	public void Testcase() {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "Drivers\\chrome.driver.exe");
	 WebDriver driver = new ChromeDriver();
driver.get("https://www.pnc.com/en/personal-banking.html");
System.out.println(driver.getTitle());
driver.close();

	}

}
