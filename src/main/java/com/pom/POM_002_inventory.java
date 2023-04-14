package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_002_inventory {
	
	public POM_002_inventory(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
			
			@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
			private WebElement backpack;
			
			@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
			private WebElement light;
			
			@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
			private WebElement tshirt;
			
			@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
			private WebElement jacket;
			
			@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
			private WebElement onesie ;
			
			@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
			private WebElement tshirtred;
			
			
			@FindBy(xpath = "//a[@class='shopping_cart_link']")
			private WebElement cart;

			

			public WebElement getCart() {
				return cart;
			}

			public WebElement getBackpack() {
				return backpack;
			}

			public WebElement getLight() {
				return light;
			}

			public WebElement getTshirt() {
				return tshirt;
			}

			public WebElement getJacket() {
				return jacket;
			}

			public WebElement getOnesie() {
				return onesie;
			}

			public WebElement getTshirtred() {
				return tshirtred;
			}
			

}
