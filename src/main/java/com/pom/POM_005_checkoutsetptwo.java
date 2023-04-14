package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_005_checkoutsetptwo {
	
	public POM_005_checkoutsetptwo(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	@FindBy(xpath = "//button[@data-test=\"finish\"]")
	private WebElement finishbutton;

	@FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
	private WebElement validatethankyou;

	@FindBy(xpath = "(//div[@class=\"summary_value_label\"])[1]")
	private WebElement paymentinformation;

	@FindBy(xpath = "(//div[@class=\"summary_value_label\"])[2]")
	private WebElement shippinginformation;
	
	
	
	@FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
	private WebElement Totalamount;



	


	public WebElement getFinishbutton() {
		return finishbutton;
	}



	public WebElement getValidatethankyou() {
		return validatethankyou;
	}



	public WebElement getPaymentinformation() {
		return paymentinformation;
	}



	public WebElement getShippinginformation() {
		return shippinginformation;
	}



	public WebElement getTotalamount() {
		return Totalamount;
	}

}
