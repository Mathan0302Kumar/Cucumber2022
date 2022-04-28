package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	WebDriver driver;

	@Given("User is on Adactin hotel app page on chrome browser")
	public void user_is_on_Adactin_hotel_app_page_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(string);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(string2);

	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}

	@When("User select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_select(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		WebElement dropLocation = driver.findElement(By.id("location"));
		Select select = new Select(dropLocation);
		select.selectByVisibleText(string);
		WebElement dropHotel = driver.findElement(By.id("hotels"));
		Select sel = new Select(dropHotel);
		sel.selectByVisibleText(string2);
		WebElement dropRoomType = driver.findElement(By.id("room_type"));
		Select select2 = new Select(dropRoomType);
		select2.selectByVisibleText(string3);
		WebElement dropRoomNos = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(dropRoomNos);
		select3.selectByVisibleText(string4);
		WebElement txtDate = driver.findElement(By.id("datepick_in"));
		txtDate.clear();
		txtDate.sendKeys(string5);
		WebElement txtDateOut = driver.findElement(By.id("datepick_out"));
		txtDateOut.clear();
		txtDateOut.sendKeys(string6);
		WebElement dropAdultRoom = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(dropAdultRoom);
		select4.selectByVisibleText(string7);
		WebElement dropChildRoom = driver.findElement(By.id("child_room"));
		Select select5 = new Select(dropChildRoom);
		select5.selectByVisibleText(string8);

	}

	@When("Click continue button")
	public void click_continue_button() {

		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();

	}

	@When("User select Hotel and click continue for booking")
	public void user_select_Hotel_and_click_continue_for_booking() {
		WebElement btnRadiotin = driver.findElement(By.id("radiobutton_0"));
		btnRadiotin.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();

	}

	@When("User enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(string);
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(string2);
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(string3);
		WebElement txtCCnum = driver.findElement(By.id("cc_num"));
		txtCCnum.sendKeys(string4);
		WebElement dropCCtype = driver.findElement(By.id("cc_type"));
		Select select = new Select(dropCCtype);
		select.selectByValue(string5);
		WebElement dropMonth = driver.findElement(By.id("cc_exp_month"));
		Select select1 = new Select(dropMonth);
		select1.selectByVisibleText(string6);
		WebElement txtYear = driver.findElement(By.id("cc_exp_year"));
		Select select2 = new Select(txtYear);
		select2.selectByVisibleText(string7);
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		txtCvv.sendKeys(string8);
	}

	@When("User click on continue for generating order id")
	public void user_click_on_continue_for_generating_order_id() {
		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();

	}

	@Then("User print order id in the console")
	public void user_print_order_id_in_the_console() throws InterruptedException {
		Thread.sleep(10000);
		WebElement txtOrderid = driver.findElement(By.id("order_no"));
		String attribute = txtOrderid.getAttribute("value");
		System.out.println(attribute);

	}

}
