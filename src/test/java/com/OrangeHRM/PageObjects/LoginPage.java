package com.OrangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//locator
	@FindBy(name="username")
	WebElement txtUsername;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnLogin;
	
	
	//methods
	public void enterUsername(String uName) {
		txtUsername.sendKeys(uName);
		String unameval = txtUsername.getAttribute("value");
		System.out.println("value entered in username field is - " + unameval);
	}
	
	public void enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		String pwdVal = txtPassword.getAttribute("value");
		System.out.println("value entered in password field is - " + pwdVal);
	}
	
	public void clickLoginBtn() {
		btnLogin.click();
		System.out.println("clikced on login button");
	}

}
