import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_XP {

	public static void main(String[] args){
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://accounts.google.com/signin/");
		dr.findElement(By.xpath(".//*[@id='identifierId'] ")).sendKeys("test@gmail.com");
		dr.findElement(By.xpath(".//*[@id='identifierNext']/div[2]n")).click();
		
	}
	}

}
