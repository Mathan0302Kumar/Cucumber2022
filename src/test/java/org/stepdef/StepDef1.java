package org.stepdef;

import org.base.BaseClassSam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 extends BaseClassSam{
	
	WebDriver driver;
	
	@Given("User is on Adactin1 hotel app page on chrome browser")
	public void user_is_on_Adactin_hotel_app_page_on_chrome_browser() {
	

	   
	}

	@When("User enters the username and password.")
	public void user_enters_the_username_and_password() {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("Maddy0302");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("maddy@0302");
	    
	}

	@When("User should click the login button.")
	public void user_should_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	  
	}

	@Then("User should verify homepage is displayed or not.")
	public void user_should_verify_homepage_is_displayed_or_not() {
		System.out.println("invalid");
	   
	}

	
	
	


}
