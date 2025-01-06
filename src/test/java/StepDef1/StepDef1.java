package StepDef1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef1 {
	WebDriver dr;
	WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(5));
	
	@Given ("Invoke Driver")
	public WebDriver invoke() {
		dr = new ChromeDriver();
		return dr;
	}
	
	@Given ("I land on page")
	public void land() {
		dr.get("https://rahulshettyacademy.com/client");
	}
	
    @When ("^I logged in w/ username (.+) and password (.+)$")
    public void input(String user, String pass) {
    	w.until(ExpectedConditions.visibilityOf(dr.findElement(By.cssSelector("#userEmail"))));
    	dr.findElement(By.cssSelector("#userEmail")).sendKeys(user);
    	dr.findElement(By.cssSelector("#userPassword")).sendKeys(pass);
    	dr.findElement(By.cssSelector("#login")).click();

	}
	
	
    @Then ("I will get {string} message")
    public void message(String string) throws InterruptedException {
    	//w.until(ExpectedConditions.visibilityOf(dr.findElement(By.cssSelector("[class*='flyInOut']"))));
    	String toast = dr.findElement(By.cssSelector("#toast-container")).getText();
    	Assert.assertEquals(string, toast);
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
