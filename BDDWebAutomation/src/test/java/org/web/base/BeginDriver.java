package org.web.base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.web.library.PropertyReader;
import org.web.library.browseroperations;
import org.web.listeners.Listeners;
import org.web.pages.login;
import org.web.validations.ElementExceptions;
import org.web.validations.pageValidations;


public class BeginDriver {
	
	 public static EventFiringWebDriver EventDriver;
	 public static WebDriver driver;
	 public static login log ; 
	 public static browseroperations operations; 
	 public static pageValidations validatepage; 
	 public static ElementExceptions elementvalidation;

	public void startBrowser() throws Exception {
		if(PropertyReader.getPropertyData("BrowserName").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		    driver = new ChromeDriver();
		   // driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   EventDriver = new  EventFiringWebDriver(driver); 
		   Listeners imp = new Listeners();
		   EventDriver.register(imp); 
			
		}
		
		else if(PropertyReader.getPropertyData("BrowserName").equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.chrome.driver", "./Driver/Firefoxdriver.exe");
		    driver = new FirefoxDriver();
		}
		
		//driver.get("https://www.thetestingworld.com");
	   driver.navigate().to("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.navigate().to(PropertyReader.getPropertyData("ApplicationURL"));
	    driver.manage().window().maximize();
	    log = PageFactory.initElements(driver, login.class);
	    operations = new browseroperations();
	    validatepage = new pageValidations();
	    elementvalidation = new ElementExceptions(); 
	   
	   
	   
	    
	 

	}
	
	
	
	public void closeBrowser() {
		
		//driver.close();
		//driver.quit();
	

	}
}
