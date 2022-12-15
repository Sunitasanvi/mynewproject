package com.internetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.internetbanking.baseclass.Baseclass;

public class internetbanking_loginpage extends Baseclass {
	 public internetbanking_loginpage() {
		  
		  PageFactory.initElements(driver,this);
	  }
	  
	  //2.
	  @FindBy(name = "uid")
	  public WebElement Username;
	  
	  @FindBy(xpath = "//input[@name=\"password\"]")
	  public WebElement Password;
	  
	  @FindBy(name = "btnLogin")
	  public WebElement LoginBtn;
	  
	  
	  //3.
	  public void Setusername(String Uname) {
		  Username.sendKeys(Uname);
	  }
	  
	  public void SetPassword(String Pwd) {
		  
		  Password.sendKeys(Pwd);
	  }
	  
	  public void Clickbtn() {
		  LoginBtn.click();
	  }
	  

}
