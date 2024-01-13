package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupModel extends BaseModel{
	public SignupModel(WebDriver d) {
		super(d);
	}
	public WebElement getFirstName() throws InterruptedException {
		Thread.sleep(2000);
		WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
		return first;
	}
	public WebElement getLastName() throws InterruptedException {
		Thread.sleep(2000);
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		return last;
	}
	public WebElement getEmail() {
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    return email;
	}
	public WebElement getpassword () {
		WebElement pw=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    return pw;
	}
public WebElement getdropdownListBox() {
	WebElement dropdown1=driver.findElement(By.xpath("//select[@name='birthday_month'] "));
    return dropdown1;
}
public WebElement getpickdate() {
	WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
    return date;
}
public WebElement getpickyear() {
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
    return year;
}
public WebElement getGender(String gender){

String myxpath = "//label[text()='"  + gender +  "']/following-sibling::input";

WebElement g = driver.findElement(By.xpath(myxpath));
return g;
}

}
