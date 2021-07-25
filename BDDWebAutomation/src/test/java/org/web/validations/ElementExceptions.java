package org.web.validations;


import org.openqa.selenium.By;
import org.web.base.BeginDriver;

public class ElementExceptions extends BeginDriver {
	
	public boolean validateTextOnElement( String xpath, String Exptext)
	{
		boolean result = false; 
		try{
		if(driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase(Exptext)){
			result = true;
		}
		}catch(Exception e){}
		return result; 
	
	}
	
	public boolean validateTextExistOnElement( String xpath, String Exptext)
	{
		boolean result = false; 
		try{
		if(driver.findElement(By.xpath(xpath)).getText().contains(Exptext)){
			result = true;
		}
		}catch(Exception e){}
		return result; 
	
	}
	
	
	public boolean validateAttributeOnElement( String xpath, String Atrname, String Exptext)
	{
		boolean result = false; 
		try{
		if(driver.findElement(By.xpath(xpath)).getAttribute(Atrname).equalsIgnoreCase(Exptext)){
			result = true;
		}
		}catch(Exception e){}
		return result; 
	
	}
	
	
	public boolean validateElementIsVisible( String xpath)
	{
		boolean result = false; 
		try{
		if(driver.findElement(By.xpath(xpath)).isDisplayed()){
			result = true;
		}
		}catch(Exception e){}
		return result; 
	
	}
	
	
	
	public boolean validateElementIsEnable( String xpath)
	{
		boolean result = false; 
		try{
		if(driver.findElement(By.xpath(xpath)).isEnabled()){
			result = true;
		}
		}catch(Exception e){}
		return result; 
	
	}
	
	public boolean validateElementIsChecked( String xpath)
	{
		boolean result = false; 
		try{
		if(driver.findElement(By.xpath(xpath)).isSelected()){
			result = true;
		}
		}catch(Exception e){}
		return result; 
	
	}
	
	
	      

}
