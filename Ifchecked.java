package checkbox;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
		//Open URL
		driver.get("https://www.chinahighlights.com/china-airline/shanghai-airlines.htm");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
List<WebElement>radio=driver.findElements(By.xpath(".//input[@name='triptype' and @type='radio']"));
 for(int i=0;i<radio.size();i++)
	 
 {
 WebElement local_radio=radio.get(i);	
 String value=local_radio.getAttribute("value");
 System.out.println("radio buttons values ======>>>>>"+value);
 if(value.equalsIgnoreCase("One Way"));
 {
	 local_radio.click();
 }
 }
 driver.close();
	}

}
