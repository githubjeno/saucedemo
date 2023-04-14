package com.pom;

import org.openqa.selenium.WebDriver;
  
public class Page_Object_Manager {
    public static WebDriver driver;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver= driver2;
	}

 private POM_001_HOME phome;
 private POM_002_inventory pinventory;
 private POM_003_cartitems pcartitems;
 private POM_004_checkoutone pcheckoutone;
 private POM_005_checkoutsetptwo pcheckouttwo;

 public POM_001_HOME getPOM_001_HOME() {
	phome = new POM_001_HOME(driver);
	 return phome;
}
public POM_002_inventory getPOM_002_inventory() {
	pinventory = new POM_002_inventory(driver);
	return pinventory;
}
public POM_003_cartitems getPOM_003_cartitems() {
	pcartitems = new POM_003_cartitems(driver);
	return pcartitems;
}
public POM_004_checkoutone getPOM_004_checkoutone() {
	pcheckoutone = new POM_004_checkoutone(driver);
	return pcheckoutone;
}
public POM_005_checkoutsetptwo getPOM_005_checkoutsetptwo() {
	pcheckouttwo = new POM_005_checkoutsetptwo(driver);
	return pcheckouttwo;
}
 
 
}
