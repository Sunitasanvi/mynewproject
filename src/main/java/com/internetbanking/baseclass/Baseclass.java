package com.internetbanking.baseclass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.internetbanking.configuration.Readconfiguration;
import com.internetbanking.utilities.Testutil;


public class Baseclass {
	

		
	
	Readconfiguration readconfig =new Readconfiguration();
    
    public  String baseURL = readconfig.getApplicationURL();
    public  String username=readconfig.getUsername();
    public  String password=readconfig.getPassword();
    public static WebDriver driver;
    @SuppressWarnings("deprecation")
	@Parameters("Browser")
	@BeforeMethod
	public void initialization(String br) {
   
    if(br.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\myproject2\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		}
		else {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\myproject2\\drivers\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
				
		driver.manage().timeouts().pageLoadTimeout( Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
         	
	    driver.get(baseURL);
    
	
		
		
	}
public void Teardown() {
	driver.quit();
}

}


