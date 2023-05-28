package com.OrangeHRM.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.PageObjects.DashboardPage;
import com.OrangeHRM.PageObjects.LoginPage;
import com.OrangeHRM.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_VerifyDashboardText extends BaseClass {

	
	
	
	//login   & //Check Text
	@Test
	public void checkDashboardText(){	
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(prop.getProperty("username"));
		lp.enterPassword(prop.getProperty("password"));
		lp.clickLoginBtn();
		
		DashboardPage dp = new DashboardPage( driver);
		String retVal = dp.getDashboardTopText();
		Assert.assertEquals(retVal, "Dashboard","Dashboard text is missing");
		System.out.println("Dashboard Text is present");
		
		
	}
	
	
	
	
}
