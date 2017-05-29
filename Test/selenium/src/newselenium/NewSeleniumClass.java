package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class NewSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		
//open Mozilla Firefox
	//WebDriver d = new FirefoxDriver();
		
//Open Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.google.com//");
		
		//finding elements gmail on the browser
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		
		//Selecting the signin button element
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		
		//finding the textbox email and sending the text
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("snehanvsingapu@gmail.com");
		
		//Clicking the next button
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		//finding the textbox password and sending the text
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("24381942");
		
		//click on next button
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

//selecting compose button
Thread.sleep(5000);
driver.findElement(By.xpath("//div[contains(text(), 'COMPOSE')]")).click();

//selecting the attach or upload button
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id=':ns']")).click();


	}

}
