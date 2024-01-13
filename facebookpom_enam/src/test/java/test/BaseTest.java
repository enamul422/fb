// This is the under test package, and this is parent class of main @test er class 
// 3lines of code, and our webpage, should be here  
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {    //parent class
	static WebDriver driver;  // 
	@BeforeSuite      // use @Beforesuite for priority
	public void setup() {      //after take any annotations, we must create a method
		                        //This is thumb role
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	
				
	}

}
