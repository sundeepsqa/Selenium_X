package com.selenium.TestSuite;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.lib.Constant;
import com.selenium.lib.HomeLogin;
import com.selenium.lib.Keyword;
import com.selenium.pagefact.Login;

public class LoginTest extends Constant{
	
	@Test
	public void login() throws InterruptedException{
		
		Login lg = PageFactory.initElements(Keyword.driver, Login.class);
		
		
		Keyword.getBrowser("FF");
		Keyword.getUrl(Constant.Url);
		HomeLogin.Loginto();
		

	}

}
