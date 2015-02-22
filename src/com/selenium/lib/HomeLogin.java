package com.selenium.lib;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.pagefact.Login;

public class HomeLogin {

	public static void Loginto() throws InterruptedException{
				
		Login lg = PageFactory.initElements(Keyword.driver, Login.class);
		WebDriverWait wait = new WebDriverWait(Keyword.driver, 3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(lg.login_link));
		Keyword.clickelmt(lg.login_link);
				
		wait.until(ExpectedConditions.visibilityOf(lg.email));
		Keyword.enterTextvalue(lg.email, Constant.emailID);

		wait.until(ExpectedConditions.visibilityOf(lg.password));
		Keyword.enterTextvalue(lg.password, Constant.password);
		
		wait.until(ExpectedConditions.visibilityOf(lg.login_button));
		Keyword.clickelmt(lg.login_button);
		
	}
	
}
