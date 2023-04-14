package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
    Properties prop = new Properties();
public 	Configuration_Reader() throws IOException {
	File f = new File("C:\\Users\\ashin\\eclipse-workspace\\saucedemo\\src\\test\\java\\com\\helper\\saucedemo.properties");
    FileInputStream fis = new FileInputStream(f);
    prop.load(fis);
}
public String geturl() {
	return prop.getProperty("url");
}
public String getusername() {
	return prop.getProperty("username");
	}
public String getpassword() {
	return prop.getProperty("password");
}
public String getbrowsername() {
	return prop.getProperty("browser");
}
}
