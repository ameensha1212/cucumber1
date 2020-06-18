package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	public WebDriver Driver;
	
	 @Given("^User initialize the browser$")
	   public void User_initialize_the_browser() {
	   System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ameen\\Documents\\Selenium Software\\chromedriver_83\\chromedriver.exe");
	   Driver = new ChromeDriver ();
		  
	 }
	
	 @When("^User enters webaddress$")
	 public void User_enters_webaddress() {
		 Driver.get("http://newtours.demoaut.com/"); 
	 }
	
	@Then("User lands at homepage")
	public void User_lands_homepage() {
		 String Exp_value = "Home";
	 	 String Act_value = Driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
	 	 Assert.assertEquals(Act_value,Exp_value );
	
	}
	    @When("^User enters \"(.*)\" and \"(.*)\"$")
	    public void user_enters_and(String username, String password) {
		Driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("<username>");
		Driver.findElement(By.cssSelector("[name=password]")).sendKeys("<password>");
	    System.out.println(username);
	    System.out.println(password);
	}
	

	    @And("^User enters signin button$")
	     public void User_enters_signin_button() {
		 Driver.findElement(By.xpath("//input[@name='login']")).click();
	 }
	
	    @Then("^User verify  \"(.*)\\\" in step")
	     public void User_verify_the_status_in_step(String status) {
		 System.out.println(status);
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
