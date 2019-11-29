package com.testcases;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.objectrepository.FacebookPage;
import com.org.TestRunner;
import com.resources.FunctionalLibrary;

public class LoginFcn2 extends FunctionalLibrary {
	String [][] data	={
			{"parthiraj93@gmail.com","rajangetfit123"},
			{"parthi123","rajangetfit123"},
			{"parthiraj93@gmail.com","rajan"},
			{"parthi","rajan"}
			};
		
		
		
		
		@DataProvider(name="loginData")
		public String[][] loginDataProvider() {
			return data;

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
			browser("https://www.facebook.com/");
			FacebookPage f = new FacebookPage();
			enterText(f.getUnme(),uname );
			enterText(f.getPswd(), pswd);
			clkBtn(f.getLgnbtn());

			driver.quit();
		}
		
		@Test(groups= {"e-commerce"})
		public void flipkart1() {
			browser("https://www.flipkart.com/");
		}
		
		@Test(groups= {"e-commerce"})
		public void flipkart() {
			browser("https://www.amazon.com/");
		}
		@AfterMethod
		public static void aFTime() {
			Date d= new Date();
			int m2 = d.getMinutes();
			d.getSeconds();
			System.out.println(m2+""+d);
		}


}
