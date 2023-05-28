package com.OrangeHRM.testBase;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public Properties prop;
	
public Logger logger = LogManager.getLogger(this.getClass());


	
	
	/****
	 * Method can be used to launch application
	 * @throws IOException 
	 */
		@BeforeMethod
		public void setup() throws IOException {
			prop=new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Downloads\\Ashutosh QA sessions\\Ashutosh_SeleniumPractise55\\OrangeHRM\\resources\\config.properties");
			prop.load(fis);
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			
			logger.info("OrangeHRM application is opened");
			//System.out.println("OrangeHRM application is opened");
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
		}
		
		/****
		 * Method can be used to close application.
		 */
		@AfterMethod
		public void closeApplication() {
			driver.quit();
			logger.info("OrangeHRM application is closed");
			//System.out.println("OrangeHRM application is closed");
		}

}
