package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main_method.base_class;

public class contact_page extends base_class{
	
	
	 public WebDriver Driver;
		
		//constructor method receiving the driver from the script and setting into WebDriver driver.
		public contact_page(WebDriver driver) {
			this.Driver = driver;
		PageFactory.initElements(driver,this);
		}
		   
		  @FindBy(css="tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) a:nth-child(1) > img:nth-child(1)")
		   WebElement back_home;

          public WebElement back_home () {
          return back_home;
}
	
	

}
