package com.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.resources.FunctionalLibrary;

public class Browsers extends FunctionalLibrary{

	@Test
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
}