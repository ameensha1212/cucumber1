package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_definition {
   
	   @Given("^User login to Amazon.com$")
	      public void User_login_to_Amazoncom() {
	      System.out.println("User login to Amazon.com ");
	 }
	
	
	   @And("^User signin with valid Username and password$")
	   public void  And_User_signin_with_valid_Username_and_password() {
		   System.out.println("User signin with valid Username and password");
	   }
	
	   @And("^User type the item name in searchbar$") 
	   public void  User_type_the_item_name_in_searchbar () {
		   System.out.println("User type the item name in searchbar");
	   }
	
	   @When("^User click the search button$")
	   public void  When_User_click_the_search_button() {
		   System.out.println("User click the search button");
	   }
	
	   @Then ("^User should find the search item$")
	   public void User_should_find_the_search_item() {
		   System.out.println("User should find the search item");
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

