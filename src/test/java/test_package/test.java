package test_package;



import org.testng.annotations.Test;

import main_method.base_class;

import pagefactory.contact_page;
import pagefactory.home_page;
import pagefactory.register_page;

public class test extends base_class {
	
	

	  @Test(priority=0)
		public void signon() {
		

		home_page home= new home_page(Driver);

		home.Signon_homepage().click();
		home.Register_homepage().click();

	}
	
	  @Test(priority=1)
		public void register() {
		

		home_page home= new home_page(Driver);

		
		home.Register_homepage().click();

	}
	     
	  
	  @Test(priority=2)
	    public void emaill() {
	    register_page auth = new register_page(Driver);
	    auth.firstname().sendKeys("Aminsha");
		//inserting name
		auth.lastname().sendKeys("Dhakal");
		auth.email().sendKeys("aaminsha20@gamil.com");
		
		auth.username().sendKeys("ameensha");
		auth.password().sendKeys("abcddee");
		auth.confirm().sendKeys("abbcddee");
		auth.contact().click();
		 //auth.wait(20,TimeUnit.SECONDS);
		//auth.country().click();
		
	    }
	    
	  @Test(priority=3)
	  
	      public void contact() {
		  contact_page contact = new contact_page(Driver);
		  contact.back_home().getText();
	  }
	  
	  
	  
	  
	  
	  
}
