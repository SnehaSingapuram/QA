package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest 
{

	WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void Open_Chrome_and_start_application() throws Throwable
	{
	 
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}

	@When("^I enter vaild username and valid password$")
	public void I_enter_vaild_username_and_valid_password() throws Throwable
	{
	   driver.findElement(By.id("email")).sendKeys("sneha.bimagowni@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("24381940");
		
	}

	@Then("^Then user should login sucessfully$")
	public void Then_user_should_login_sucessfully() throws Throwable 
	{
		 driver.findElement(By.id("loginbutton")).click();
		
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void I_want_to_write_a_step_with_name(int arg1) throws Throwable
	{
	   
		
	}

	@When("^I check for the (\\d+) in step$")
	public void I_check_for_the_in_step(int arg1) throws Throwable 
	{


	}

	@Then("^I verify the success in step$")
	public void I_verify_the_success_in_step() throws Throwable
	{
	  
		
	}

	@Then("^I verify the Fail in step$")
	public void I_verify_the_Fail_in_step() throws Throwable 
	{


	}

	
}
