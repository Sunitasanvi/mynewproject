package com.internetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetbanking.baseclass.Baseclass;
import com.internetbanking.pageobject.internetbanking_loginpage;



public class Loginpagetest extends Baseclass  {
	
	@Test
	public void LoginTest() throws IOException{
		//initialization();
		internetbanking_loginpage LP = new  internetbanking_loginpage();
		LP.Setusername(username);
		
		LP.SetPassword(password);
		
		LP.Clickbtn();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			System.out.println("Passed");
		}
		
		else {
			
			Assert.assertTrue(false);
		}
				
	}
}
