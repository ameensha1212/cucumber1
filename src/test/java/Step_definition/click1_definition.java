package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class click1_definition {
	
	@Given("^User visits to Amazon.com$")
	public void User_visits_to_Amazoncom() {
		System.out.println("Given User visits to Amazon.com");
	}
	
	@And("^User login with valid username and password$")
	public void User_login_with_valid_username_and_password() {
		System.out.println("User login with valid username and password");
	}
	
	@When("^User search an item$")
	public void User_search_an_item() {
		System.out.println("User search an item");
	}
	
	  @And("^User finds an item$")
	  public void  User_finds_an_item() {
	   System.out.println("User finds an item");
		  
	  }
	
	  @Then("^User clicks the item$")
	  public void User_clicks_the_item() {
		  System.out.println("User clicks the item");
	  }
	
	
	
	
	
	
	
	
	
	
	

}
