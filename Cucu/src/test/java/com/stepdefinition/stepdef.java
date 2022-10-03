package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {

	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver_v105.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/MY%20COMPUTER/SOFTWARE%20TESTING/Docs/queue%20codes%20offline%20website/Offline%20Website/index.html");
	

	}

	@Given("User enters email \\({string})")
	public void user_enters_email(String uName) {
		driver.findElement(By.id("email")).sendKeys(uName);
	}

	@Given("User enters password \\({string})")
	public void user_enters_password(String uPass) {
		driver.findElement(By.id("password")).sendKeys(uPass);
	}

	@When("User Clicks on submit")
	public void user_clicks_on_submit() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("login Successful")
	public void login_successful() {
		System.out.println("User Successfully logged in");
	}

}
