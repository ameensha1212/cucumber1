package main_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base_class {
	
	public WebDriver Driver;

	@BeforeTest
	public void Set_up()  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ameen\\Documents\\Selenium Software\\chromedriver_83\\chromedriver.exe");
	  Driver = new ChromeDriver ();//creating a driver instance.
		
	  Driver.get("http://newtours.demoaut.com/");//launching url
	  Driver.manage().window().maximize();
	  Driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  Driver.manage().deleteAllCookies();
	}
	  
	 @AfterTest
     public void close() {
	 Driver.close();//close
	 }

}
	
	
	
	
	
	


