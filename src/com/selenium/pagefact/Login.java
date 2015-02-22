package com.selenium.pagefact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.lib.Constant;

public class Login {
	
	
	@FindBy(xpath="//a[@data-gaaction='Login']")
	public WebElement login_link;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//a[@id='submitButton']")
	public WebElement login_button;
}
