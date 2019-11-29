package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
		
	public static void IEbrowser(String uRL) {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Parthi Rajan\\Parthi Rajan\\TestNG\\src\\test\\resources\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(uRL);
	}
	

	public static void browser(String uRL) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Parthi Rajan\\Parthi Rajan\\TestNG\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(uRL);
	}
	public static void clkBtn(WebElement element) {
		element.click();
	}
	
	
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);

	}
}
