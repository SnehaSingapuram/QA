/**
 * 
 */
package pomforgmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * @author sneha
 * Page Object Model for gmail  https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin
 * This class will tore all the methods for Login Page
 */
public class LoginPage {
	WebDriver driver;
	
	By Email = By.id("identifierId");
	By BE = By.xpath(".//*[@id='identifierNext']/div[2]");
	By Password = By.name("password");
	By BP = By.xpath(".//*[@id='passwordNext']/div[2]");

	private By EnterYourPassword;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typeEmail()
	{
		driver.findElement(Email).sendKeys("snehanvsingapu");
	}
public void typeBE()
{
	driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();	
}
	
public void typeEnterYourPassword() throws InterruptedException
{
	Thread.sleep(5000);
	driver.findElement(EnterYourPassword).sendKeys("24381940");	
}
	
	public void typeBP()
	{
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();		
		
	}



}
