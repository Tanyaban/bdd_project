package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	String title;
	@Given("^Login application should be available$")
	public void login_application_should_be_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/");
		driver=new FirefoxDriver();
	    driver.get("http://13.251.143.66:8090//IPL-Fantasy-League-0.0.1-SNAPSHOT/");
	}

	@When("^Validate Login application$")
	public void validate_Login_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		title=driver.getTitle();
	    System.out.println("title");
	    System.out.println(title);
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("IPL Fantasy League", title);
		System.out.println("hi");
		System.out.println("bye");
	    
	}

}
