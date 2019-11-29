package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FacebookPage extends FunctionalLibrary {

	public FacebookPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(name="email")
	private WebElement unme;
	
	@FindBy(name="pass")
	private WebElement pswd;
	
	@FindAll({
	@FindBy(name="login"),
	@FindBy(xpath="//input[@value='Log In']")})
	private WebElement lgnbtn;

	public WebElement getUnme() {
		return unme;
	}

	public void setUnme(WebElement unme) {
		this.unme = unme;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public void setPswd(WebElement pswd) {
		this.pswd = pswd;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	public void setLgnbtn(WebElement lgnbtn) {
		this.lgnbtn = lgnbtn;
	}
	

}
