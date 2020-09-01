package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefination{

	 WebDriver driver;

	
	 @Given("^user is already on Login Page$")
		public void user_is_already_on_Login_Page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\pallavi.p.patil\\Desktop\\selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 driver.manage().window().maximize(); 
			 driver.get("https://classic.freecrm.com/index.html");
			 sleep(10);	
		}
	
	
	 private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button$")
		public void user_clicks_on_login_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js =(JavascriptExecutor)driver;
			WebElement loginBtn=driver.findElement(By.xpath("//input[@class='btn btn-small']"));
			js.executeScript("arguments[0].click();", loginBtn);
		}
	
	 @Then("^user is on home page$")
		public void user_is_on_home_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			
	 
	 }
	

}