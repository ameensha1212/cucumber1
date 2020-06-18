package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main_method.base_class;

public class register_page extends base_class {
	
	 public WebDriver Driver;
		
		//constructor method receiving the driver from the script and setting into WebDriver driver.
		public register_page(WebDriver driver) {
			this.Driver = driver;
		PageFactory.initElements(driver,this);
		}
		   @FindBy(xpath="//input[@name='firstName']")
		   WebElement firstname;

          public WebElement firstname () {
          return firstname;
 }
           @FindBy(xpath="//input[@name='lastName']")
		   WebElement lastname;

          public WebElement lastname () {
          return lastname;
 }
           @FindBy(xpath="//input[@id='userName']")
		   WebElement email;

          public WebElement email () {
          return email;
 }
          @FindBy(css="[id=email]")
		   WebElement username;

         public WebElement username() {
         return username;
  }
         
           @FindBy(css="[name=password]")
		   WebElement password;

         public WebElement password() {
         return password;
  }
         
          @FindBy(xpath="//*[@name='confirmPassword']")
		   WebElement confirm;

          public WebElement confirm() {
          return confirm;
}
         
           @FindBy(xpath="//a[contains(text(),'CONTACT')]")
		   WebElement contact;

         public WebElement contact() {
         return contact;
}
        
         @FindBy(xpath="//select[@name='country'] //*[@value='144']")
		   WebElement country;

         public WebElement country() {
        	
         return country;
}
         
              
          
          
}       //select[@name='country']//option[@value='3']
         
         

