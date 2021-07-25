package org.web.step.defination;



import org.openqa.selenium.chrome.ChromeDriver;
import org.web.base.BeginDriver;
import org.web.library.TakeScreenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicStepDefinations extends BeginDriver{
	

	
	
	//ChromeDriver driver ; 
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable
	{
		this.startBrowser();
		
	}
	    
	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		log.enterusername("abcd");
		
	   TakeScreenshot.takeBrowserScreenshot("AfterLogin");
		
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		
		log.enterpassword("abcd");
	 
	}

	@When("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		
		log.clicksignin();
	 
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    
	}

}
