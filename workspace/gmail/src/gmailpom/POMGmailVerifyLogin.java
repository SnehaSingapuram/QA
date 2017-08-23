/**
 * 
 */
package gmailpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomforgmail.LoginPage;

/**
 * @author sneha
 *
 */
public class POMGmailVerifyLogin 
 {
	
	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        		
		LoginPage login = new LoginPage(driver);
		
		login.typeEmail();
		login.typeBE();
		login.typeEnterYourPassword();
		login.typeBP();
		
		driver.quit();
	}
	
}
