package com.OrangeHRM.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_NumberOfLinks extends BaseClass {
	
	
	//count number of links
	@Test
	public void countNumberofLinks() {
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on Login page is - " + noOfLinks.size());
	}
	
	

}
