//WebElements or variable are declared here...This is child class of BaseModel.
//We know if parents class have constructor then child class must have this.
//Here we used super keyword.
//Here WebElement is data type, and our return type is also WebElement type.
// so our returned is create.
package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel { //child class of BaseModel
	public HomeModel(WebDriver d) {  //as base model has constructor, child class must
		                             //have, use super keyword
		super (d);
	}
	public WebElement getCreateButton() {  //This class is for webelement and xpath
		WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		                         // Xpath of button
		return create;
	}
	public WebElement getGender(String gender){

		String myxpath = "//label[text()='"  + gender +  "']/following-sibling::input";

		WebElement g = driver.findElement(By.xpath(myxpath));
		return g;
		}

}
