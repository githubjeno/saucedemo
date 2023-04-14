package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_003_cartitems {
	
	
	
	@FindBy(xpath = "//button[@data-test='checkout']")
	private WebElement checkout;

	public POM_003_cartitems(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getCheckout() {
		return checkout;
	}

}
