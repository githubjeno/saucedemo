package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_004_checkoutone {
	public POM_004_checkoutone(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@placeholder=\"Zip/Postal Code\"]")
	private WebElement zipcode;
	
	@FindBy(xpath = "//input[@data-test=\"continue\"]")
	private WebElement continuebutton;

	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
}
