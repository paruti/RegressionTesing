package com.testcases;

import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.FacebookPage;
import com.org.TestRunner;
import com.resources.FunctionalLibrary;

public class LoginFcn extends FunctionalLibrary{
	
	
String [][] data	={
		{"parthiraj93@gmail.com","rajangetfit123"},
		/*{"parthi123","rajangetfit123"},
		{"parthiraj93@gmail.com","rajan"},
		{"parthi","rajan"}
		*/};
	
	
	
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;

	}
	@BeforeTest
	@Parameters("browser")
	public void verifyBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Parthi Rajan\\Parthi Rajan\\TestNG\\src\\test\\resources\\Driver\\IEDriverServer.exe");
			
		driver = new InternetExplorerDriver();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Parthi Rajan\\Parthi Rajan\\TestNG\\src\\test\\resources\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			}
		
		}
	
	

	
	
	@BeforeMethod
	public static void bFTime() {
			
	Date d= new Date();
	int m1 = d.getMinutes();
	d.getSeconds();
	System.out.println(m1+""+d);
	}
	@Test(dataProvider="loginData",groups= {"fb"},retryAnalyzer=TestRunner.class)
	public static void TestCases(String uname,String pswd) {
		driver.get("https://www.facebook.com/");
		FacebookPage f = new FacebookPage();
		enterText(f.getUnme(),uname );
		enterText(f.getPswd(), pswd);
		clkBtn(f.getLgnbtn());

		driver.quit();
	}
	
	@Test(groups= {"e-commerce"})
	public void flipkart1() {
		driver.get("https://www.flipkart.com/");
	}
	
	@Test(groups= {"e-commerce"})
	public void flipkart() {
		driver.get("https://www.amazon.com/");
	}
	@AfterMethod
	public static void aFTime() {
		Date d= new Date();
		int m2 = d.getMinutes();
		d.getSeconds();
		System.out.println(m2+""+d);
	}
	@AfterTest
	public void quit() {
		driver.close();
	}
	
	}
