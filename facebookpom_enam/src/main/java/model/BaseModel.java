//                 First project 0n FaceBook

//Project-our webpage is-("http://www.facebook.com")
//Find out following-Q-1For first webpage- click on create button
//Q-2: when 2nd page open> 1.put-a) firstname b) last name c) email d) password
// d) dropdown listBox, e) radio button etc==========
//Setup Lab- 1)create selenium project-->File>new>other>mavenproject>next>
//maven-archetype-quickstart-in the consel pick-YES 2)Add jar- selenium(2ti),
// Apachipoi(2ti),TestNg,.. 3)create folder-->data(excel),-driver for 
//(chromedriver.exe),screenshotfolder,   
//1)Under package name::model > classes are> BaseModel,HomeModel, SignModel>>
//Those, another package lib for library(excelReader.java)
//under test package under Test- BaseTest and SignupPageTest 
//classes are represents as Varaiable or Webelement lebel

//Liks are -for firstwebpage- BaseModel, HomeModel,Homepage>BaseTest>SignupTest 
//for 2nd page- BaseModel,SignupModel,SignUp page,BaseTest>SignupTest 
//Remember- use excel, DataProvider, Explicitwait,thread.sleep, SelectClass
// NB- As many Column as many argument number
// To add webelement--->then have to change in the following steps-
//1. add webelement in Model package 2. add column in excel, 3 add method in 
// in methodpage 4) add argument in @Test 5)Invoke required method
//  save all
package model;

import org.openqa.selenium.WebDriver;

public class BaseModel {     //This is parent class
	WebDriver driver;         //instance variable
	public BaseModel(WebDriver d) { // constructor, (because of instance variable) 
		driver=d;
		
	};

}
