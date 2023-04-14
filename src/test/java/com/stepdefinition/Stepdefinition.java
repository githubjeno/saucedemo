package com.stepdefinition;

import java.io.FileReader;
import java.io.IOException;

import com.baseclass.BaseClass;
import com.helper.File_Reader;
import com.pom.POM_001_HOME;
import com.pom.POM_002_inventory;
import com.pom.POM_003_cartitems;
import com.pom.POM_004_checkoutone;
import com.pom.POM_005_checkoutsetptwo;
import com.pom.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	   Page_Object_Manager pom = new Page_Object_Manager(driver);
        
	@Given("user enters the url")
	public void user_enters_the_url() throws IOException {
		URL(File_Reader.getInstance().geturl());
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException, IOException {
	   Thread.sleep(3333);
	  pom.getPOM_001_HOME().getUsername().sendKeys(File_Reader.getInstance().getusername());
	   pom.getPOM_001_HOME().getPassword().sendKeys(File_Reader.getInstance().getpassword());
	  
	}
	@When("Click on login button")
	public void click_on_login_button() {
		 pom.getPOM_001_HOME().getLoginButton().click();
	}
	
	@When("user adds all the products to the cart")
	public void user_adds_all_the_products_to_the_cart() {
		pom.getPOM_002_inventory().getBackpack();
		pom.getPOM_002_inventory().getJacket();
		pom.getPOM_002_inventory().getLight();
		pom.getPOM_002_inventory().getOnesie();
		pom.getPOM_002_inventory().getTshirt();
		pom.getPOM_002_inventory().getTshirtred();
		
	   }
	@When("clicks on his cart")
	public void clicks_on_his_cart() {
		pom.getPOM_002_inventory().getCart().click();
	   }
	@When("clicks on Checkout button")
	public void clicks_on_checkout_button() {
	   pom.getPOM_003_cartitems().getCheckout().click();
	   
	}
	@When("user enter his first name {string} second name {string} zipcode {string}")
	public void user_enter_his_first_name_second_name_zipcode(String string, String string2, String string3) {
	    pom.getPOM_004_checkoutone().getFirstname().sendKeys(string);
	    pom.getPOM_004_checkoutone().getLastname().sendKeys(string2);
	    pom.getPOM_004_checkoutone().getZipcode().sendKeys(string3);
	}
	@When("clicks on continue button")
	public void clicks_on_continue_button() {
		pom.getPOM_004_checkoutone().getContinuebutton().click();
		
		
	   
	}
	@Then("display payment information and shipping information and toatal price")
	public void display_payment_information_and_shipping_information_and_toatal_price() {
	    System.out.println(pom.getPOM_005_checkoutsetptwo().getPaymentinformation().getText());
	    System.out.println(pom.getPOM_005_checkoutsetptwo().getShippinginformation().getText());
	    System.out.println(pom.getPOM_005_checkoutsetptwo().getTotalamount().getText());
	    
	}
	@Then("click on Finish button")
	public void click_on_finish_button() {
		pom.getPOM_005_checkoutsetptwo().getFinishbutton().click();
	}
	@Then("validate Thank you for your order")
	public void validate_thank_you_for_your_order() {
	    boolean contains = pom.getPOM_005_checkoutsetptwo().getValidatethankyou().getText().toLowerCase().contains("thank");
	    if(contains)
	    {
	    	System.out.println("your order is successfully done");
	    }
	    else
	    {
	    	System.out.println("some problem with site or the logic of site is wrong");
	    }
	}

}
