package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import main_method.base_class;

public class home_page extends base_class {
	
	
	
		
		
		//constructor method receiving the driver from the script and setting into WebDriver driver.
		public home_page(WebDriver driver) {
			
		PageFactory.initElements(driver,this);
		
		}
			
			
		@FindBy(xpath="//a[text()='SIGN-ON']")
				WebElement Signon_homePage;
		
		public WebElement Signon_homepage() {
	    return Signon_homePage;
		}
      
		@FindBy(xpath="//a[text()='REGISTER']")
		WebElement Register_homepage;

        public WebElement Register_homepage() {
        return Register_homepage;
}
		
		
		
}
