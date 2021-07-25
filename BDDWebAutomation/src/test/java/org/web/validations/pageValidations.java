package org.web.validations;


import org.openqa.selenium.By;
import org.web.base.BeginDriver;

public class pageValidations extends BeginDriver {
	
	
	
	
	public boolean validatePageURL( String expectedURL) {
		boolean  result = false; 
        if( driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
        {
        	result = true; 
        	
        	
        }
        
        return result; 
		
	}
	
	public boolean validatePageTitle( String expectedtitle) {
		boolean  result = false; 
        if( driver.getTitle().equalsIgnoreCase(expectedtitle))
        {
        	result = true; 
        	
        	
        }
        
        return result; 
	}
        
        
        
        public boolean validateTextOnPage( String expectedtext) {
    		boolean  result = false; 
            if( driver.getPageSource().contains(expectedtext))
            {
            	result = true; 
            	
            	
            }
            
            return result; 
    		
		
	}
        
        
        public boolean validateElementOnPage( String xpath) {
    		boolean  result = false; 
    		try {
    		driver.findElement(By.xpath("xpath"));
    		result = true; 
    		
    		}catch(Exception e ){}
            return result; 
    		
		
	}
	
	
	
	

}
