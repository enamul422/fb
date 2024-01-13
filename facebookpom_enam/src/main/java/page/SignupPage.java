package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.SignupModel;

public class SignupPage extends SignupModel{
	public SignupPage(WebDriver d) {
		super (d);
	}
	public void typeFirstName(String firstName) throws InterruptedException {
		WebElement first=getFirstName();
		first.clear();
		first.sendKeys(firstName);
	}
	public void typeLastName(String lastName) throws InterruptedException {
		WebElement last=getLastName();
		last.clear();
		last.sendKeys(lastName);

	}
	public void typeEmail(String email) {
		WebElement myemail=getEmail();
		myemail.clear();
		myemail.sendKeys(email);
	}
	public void typepassword(String password) {
		WebElement mypass=getpassword();
		mypass.clear();
		mypass.sendKeys(password);
	}
	public void pickMonths(String months) {   //getdropdownListBox()>pick months
		WebElement mydropdown=getdropdownListBox();
		Select s=new Select(mydropdown);
		s.selectByVisibleText(months);
		
		
	}
	public void pickDate(String date) {   //getdropdownListBox()>pick date
		WebElement mydate=getpickdate();
		Select d=new Select(mydate);
		d.selectByVisibleText(date);
}
	public void pickYear(String year) {   //getdropdownListBox()>pick year
		WebElement myyear=getpickyear();
		Select y=new Select(myyear);
		y.selectByVisibleText(year);
	}
	public void pickGender(String gender){

	       WebElement e   =getGender(gender);
	       e.click();

	}
}