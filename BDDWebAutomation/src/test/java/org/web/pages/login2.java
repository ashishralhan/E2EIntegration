package org.web.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.web.base.BeginDriver;

public class login2 extends  BeginDriver {
	
	
	
	@FindBy(id="email") WebElement username;
	@FindBy(id="pass") WebElement password;
	@FindBy(xpath="//button[@value='1']") WebElement signin;
	
	public void enterusername(String s )
	{
		username.sendKeys(s);
		
	
		
	}
public void clearusername()
    {
	username.clear();
		
	}

public void enterpassword( String s)
{
	password.sendKeys(s);
	
}
public void clearpassword()
{
	password.clear();
	
}

public void clicksignin()
{
	
	signin.click();
	
}
}
