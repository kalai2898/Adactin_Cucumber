package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;
import java.util.*;

public class ConfigurationReader {
	public static Properties prop;
	
	public ConfigurationReader() throws IOException
	{
		File f= new File("D:\\java demo\\CucumberTest\\src\\test\\java\\com\\propertyFile\\adactin.properties");
		FileInputStream fis=new FileInputStream(f);
		prop=new Properties();
		prop.load(fis);
	}
	public String getBrowser()
	{
		  String property = prop.getProperty("browsername");
		  return property;
	}
    public String getUrl()
    {
    	String url = prop.getProperty("Url");
    	return url;
    }
    public String getUser()
    {
      String User = prop.getProperty("username");
	  return User;
    }
    
    public String getPass()
    {
    	String pass = prop.getProperty("pasword");
		return pass;
    }
    public String getCard()
    {
     String ccno = prop.getProperty("creditcard");
	return ccno;
    }
    public String gettype()
    {
     String cctype = prop.getProperty("creditcardtype");
	return cctype;
    }
    public String getmonth()
    {
     String cmonth = prop.getProperty("month");
	return cmonth;
    }
    public String getyear()
    {
     String cyear = prop.getProperty("year");
	return cyear;
    }
    public String getccv()
    {
        String ccv = prop.getProperty("ccv");
   	return ccv;
       }
    
}
