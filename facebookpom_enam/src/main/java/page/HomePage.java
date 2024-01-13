// This class is for Take method for action. We can invoke this method in test class
// 
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel{ // child class of HomeModel where elements is
	                                     // created 
	public HomePage(WebDriver d) {// as parent class has constructor, child class must
		                    //do, use super keyword
		super(d);
	}
	public void clickonCreateButton() {
		WebElement e=getCreateButton();// must invoke webelement class er method
		e.click();              //This is action, what we want
	}

}
