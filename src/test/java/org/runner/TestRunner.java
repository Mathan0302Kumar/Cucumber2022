package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\AdacticHotel.feature", glue = "org.stepdef", monochrome = true, plugin = {
		"pretty", "html:C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target",
		"json:C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target\\sample.json",
		"junit:C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target\\sample.xml" })

public class TestRunner {

}
