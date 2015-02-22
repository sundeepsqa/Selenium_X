package com.selenium.TestSuite;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.lib.Constant;
import com.selenium.lib.Keyword;
import com.selenium.pagefact.Invoicefact;

public class CreateInvoice {
	
	@Test
	public void DemoTest() throws Exception{
		
		Invoicefact demo = PageFactory.initElements(Keyword.driver, Invoicefact.class);
		
		//Keyword.clickelmt(demo.Demo_company_link);
		
		WebDriverWait wait = new WebDriverWait(Keyword.driver, 3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Accounts_tab));
		Keyword.clickelmt(demo.Accounts_tab);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Sales));
		Keyword.clickelmt(demo.Sales);

		wait.until(ExpectedConditions.elementToBeClickable(demo.New_invoice));
		Keyword.clickelmt(demo.New_invoice);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Repeating_invoice));
		Keyword.clickelmt(demo.Repeating_invoice);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Recurring_trans));
		Keyword.clickelmt(demo.Recurring_trans);
		Keyword.clickelmt(demo.Recurring_trans);
								
		wait.until(ExpectedConditions.visibilityOf(demo.invoice_date));
		Keyword.enterTextvalue(demo.invoice_date, "5");
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.due_date_value));
		Keyword.clickelmt(demo.due_date_value);
		
		Date date = new Date();
		String date1 = date.toString().substring(8, 10);
		int date_val = Integer.parseInt(date1);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.ok_popup));
		if(date_val>=5)
		Keyword.clickelmt(demo.ok_popup);
		
		wait.until(ExpectedConditions.visibilityOf(demo.due_date_value));
		Keyword.enterTextvalue(demo.due_date_value, "10");
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.due_date));
		Keyword.clickelmt(demo.due_date);
		wait.until(ExpectedConditions.elementToBeClickable(demo.due_date_select));
		Keyword.clickelmt(demo.due_date_select);
		
		wait.until(ExpectedConditions.visibilityOf(demo.InvoiceTo));
		Keyword.enterTextvalue(demo.InvoiceTo, "Sandy");
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Item1));
		Keyword.clickelmt(demo.Item1);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Item_dd));
		Keyword.clickelmt(demo.Item_dd);
		
		wait.until(ExpectedConditions.visibilityOf(demo.Item_dd));
		Keyword.enterKey(demo.Item_dd, Keys.ARROW_DOWN);
		Keyword.enterKey(demo.Item_dd, Keys.ARROW_DOWN);
		Keyword.enterKey(demo.Item_dd, Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Item2));
		Keyword.clickelmt(demo.Item2);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Item_dd));
		Keyword.clickelmt(demo.Item_dd);
		
		wait.until(ExpectedConditions.visibilityOf(demo.Item_dd));
		Keyword.enterKey(demo.Item_dd, Keys.ARROW_DOWN);
		Keyword.enterKey(demo.Item_dd, Keys.ARROW_DOWN);
		Keyword.enterKey(demo.Item_dd, Keys.ARROW_DOWN);
		Keyword.enterKey(demo.Item_dd, Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.saveAsDraft));
		Keyword.clickelmt(demo.saveAsDraft);
		
		wait.until(ExpectedConditions.elementToBeClickable(demo.Save));
		Keyword.clickelmt(demo.Save);
		
		wait.until(ExpectedConditions.visibilityOf(demo.validation));

		try {
			Assert.assertEquals((Keyword.driver.getTitle()), "Xero | Invoices | Demo Company (NZ)", "Test Failed");
			System.out.println("Test Passed: Repeating invoice created");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Test Failed: Repeating invoice creation failed");
		}
			
		}
	
}
