//class of @Test annotaions 
// must have to create object of method class/page class..
// create link with excel

package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;
import page.HomePage;
import page.SignupPage;
public class SignUpPageTest extends BaseTest { //child class of BaseTest
	@Test(dataProvider="fbData")  // for make link with excel
	public void signuppagetest(String firstname, String lastname, String email,String password,String months,String date,String year,String gender) throws InterruptedException {
		//For 1st webpage must create object of (here method class)homepageclass
		HomePage hp=new HomePage(driver);// driver have to pass here
		hp.clickonCreateButton(); //invoke method of page/method class
				
		//create an object of signuppage class and invoke two methods or as
		//necessary> type firstname(), lastname()
		SignupPage sp=new SignupPage(driver);
		sp.typeFirstName(firstname);
		sp.typeLastName(lastname);
		sp.typeEmail(email);
		sp.typepassword(password);
		sp.pickMonths(months);
		sp.pickGender(gender);
		sp.pickDate(date);
		sp.pickYear(year);
		sp.pickGender(gender);
	}
     
	@DataProvider(name="fbData")
    public Object[][] getData() throws IOException{
    	 Object[][] x;
	              //data will come from excel
		String filename="data/FbforPOMProject.xlsx";
		String sheetname="sheet1";
		ExcelReader ex=new ExcelReader(filename,sheetname);
		
		x=ex.excelToArray();
		return x;
	}

}
