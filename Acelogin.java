package verifyapplogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acelogin {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //Open URL
        driver.get("https://www.gmail.com");
        //Enter username//Login xpath
        driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("snehanvsingapu@gmail.com");
        Thread.sleep(5000);
      //Clicking Next
        driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
        Thread.sleep(5000);
        //Open By name. password
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("23481940");
        Thread.sleep(5000);   
        //clicking next   
        driver.findElement(By.xpath(" .//*[@id='passwordNext']/content")).click();
        Thread.sleep(5000);
        //closing the browser
        driver.close();
	}

}



    
        

        
    

