package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSam {
	
	WebDriver driver;

	public void getDriver(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void quit() {
		driver.quit();
	}

}
