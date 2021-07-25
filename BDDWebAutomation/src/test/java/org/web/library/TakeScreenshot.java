package org.web.library;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.web.base.BeginDriver;

public class TakeScreenshot extends BeginDriver

{
	
	public static  void takeBrowserScreenshot(String filename) throws IOException
	{
        Date d = new Date(); 
		File F1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		   File F2 = new File("./Screenhsot/"+filename+String.valueOf(d.getTime()).replace(" ", "").replace(":", "")+".png"); 
		   FileUtils.copyFile(F1, F2);

	}

}
