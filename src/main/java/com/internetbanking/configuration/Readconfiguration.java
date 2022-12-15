package com.internetbanking.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Readconfiguration {
	Properties pro;
	public Readconfiguration() {
	File src = new File("C:\\Users\\HP\\eclipse-workspace\\myproject2\\src\\main\\java\\com\\internetbanking\\configuration\\config.property");
	
    FileInputStream fis;
	try {
		fis = new FileInputStream(src);	
        pro =new Properties();	    
		pro.load(fis);
	} catch (Exception e1) {
		System.out.println("Exception is :"+e1.getMessage());
}		
	}

public String getApplicationURL() {
         String url = pro.getProperty("baseURL");
         return url; 
}

public String getUsername() {
	String username= pro.getProperty("username");
	return username;
}

public String getPassword() {
String password =pro.getProperty("password");	
return password;

}
public String getChromePath() {
	
	String chromepath =pro.getProperty("chromepath");
	return chromepath;
}
   public String getForeFoxPath() {
	
	String chromepath =pro.getProperty("firefoxpath");
	return chromepath;
}



}
