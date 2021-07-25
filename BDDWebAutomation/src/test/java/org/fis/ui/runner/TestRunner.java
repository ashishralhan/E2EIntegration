package org.fis.ui.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "FeatureFiles",
	monochrome = true,
	glue = "org.web.step.defination",
	dryRun = false,
	tags ="@Smoke",
			plugin={"html:target/cucumber-report/",
				    "json:target/cucumber.json",
				    "pretty:target/cucumber-pretty.txt",
				     "junit:target/cucumber-results.xml",
	                 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"}
	
	
		)
public class TestRunner {
	
	
	@BeforeClass
	public static void setReportConfiguration(){
		ExtentProperties prop = ExtentProperties.INSTANCE;
		prop.setReportPath("./Reports/Reports.html");
	}

}
