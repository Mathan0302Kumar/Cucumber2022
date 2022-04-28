package org.runner;

import org.base.CucumberReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Login.feature", glue = "org.stepdef", monochrome = true,plugin = {
		"pretty", "html:C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target",
		"json:C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target\\san.json",
		"junit:C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target\\san1.xml" })

public class TestRunner2{

	@AfterClass

	public static void afterClass() {
		CucumberReports.jvmReport("C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target\\san.json");

	}

}
