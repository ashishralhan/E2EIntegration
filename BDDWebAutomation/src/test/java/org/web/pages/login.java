package org.web.pages;


import org.openqa.selenium.By;
import org.web.base.BeginDriver;
import org.web.library.PropertyReader;

public class login extends  BeginDriver {
	
	public void enterusername(String s ) throws Exception
	{
		driver.findElement(By.id(PropertyReader.getElementLocators("Login_username_id"))).sendKeys(s);
		
	
		
	}
public void clearusername() throws Exception
    {
	driver.findElement(By.id(PropertyReader.getElementLocators("Login_username_id"))).clear();
		
	}

public void enterpassword( String s) throws Exception
{
	driver.findElement(By.id(PropertyReader.getElementLocators("Login_password_id"))).sendKeys(s);
	
}
public void clearpassword() throws Exception
{
	driver.findElement(By.id(PropertyReader.getElementLocators("Login_password_id"))).clear();
	
}

public void clicksignin() throws Exception
{
	
	driver.findElement(By.xpath(PropertyReader.getElementLocators("Login_Signin_buttonxpath"))).click();
	
}


}
