package Ajax;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajaxcontrol {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("shanghai");
	  Thread.sleep(3000);
	  String str=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]")).getText();
	  System.out.println(str);
	  String[] s=str.split("\n");
	  System.out.println(s.length);
  for(int i=0;i<s.length;i++)
  {
	  if(s[i].equalsIgnoreCase("shanghai airlines"))
	  {
		  driver.findElement(By.xpath(".//*[@id='gs_htif0']")).clear();
		  driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys(s[i]);
		  driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
	  }
  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe"); 
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

}












	
 
  
  