package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo12 {
    @Test
	public void m1() {
   System.out.println("hello");
  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   
  driver.manage().window().maximize();
  
	}

}
