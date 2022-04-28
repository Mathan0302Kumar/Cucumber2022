package org.stepdef;

import org.base.BaseClassSam;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClassSam extends BaseClassSam{
	
	
	
	@Before
	public void beforeScenario() {
		
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		
	}
	
	
	@After
	
	public void afterScenario() {
		
		quit();
		
	}

}
