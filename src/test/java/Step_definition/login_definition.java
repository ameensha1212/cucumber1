package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_definition {
	
	@Given("^User enters amazon.com website$")
	public void User_enters_amazoncom_website() {
		System.out.println("User enters amazon.com website");
	}
	
	@And("^User clicks login button$")
	public void User_clicks_login_button() {
		System.out.println("User clicks login button");
	}
	
	@When("^User enters valid username \"(.*)\"$")
	public void User_enters_valid_username(String a) {
		System.out.println("User enters valid username");
		System.out.println(a);
	}
    
	@And("^User enters valid password \"(.*)\"$")
	public void User_enters_valid_password(String b) {
		System.out.println("User enters valid password");
		System.out.println(b);
	}
	
	@And("^User clicks signin button$")
	public void User_clicks_signin_button() {
		System.out.println("User  clicks signin button");
		
	}
	
	@Then("^User should land into homepage$")
	public void User_should_land_into_homepage() {
		System.out.println("User should land into homepage");
	}
	
	@When("^User enters invalid username \"(.*)\"$") //negative login test
	public void User_enters_invalid_username(String c) {
		System.out.println("User enters invalid username");
		System.out.println(c);
	}
	
	
	@And("^User enters invalid password \"(.*)\"$")
	public void User_enters_invalid_password(String d) {
		System.out.println("User enters invalid password");
		System.out.println(d);
	}
	
	@Then("^User shouldnot land into homepage$")
	public void User_shouldnot_land_into_homepage() {
		System.out.println("User shouldnot land into homepage");
	}
	
	
	@And("^User should see an error message$")
	public void User_should_see_an_error_message() {
		System.out.println("User should see an error message");
	}
	
	
	
	
	
	
}
