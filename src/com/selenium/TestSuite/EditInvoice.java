package com.selenium.TestSuite;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.lib.Keyword;
import com.selenium.pagefact.Invoicefact;

public class EditInvoice {
  @Test
  public void EditRI() {
	  
	  Invoicefact demo = PageFactory.initElements(Keyword.driver, Invoicefact.class);
		
	  WebDriverWait wait = new WebDriverWait(Keyword.driver, 3000);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.editRI));
	  Keyword.clickelmt(demo.editRI);
	  	   
	  wait.until(ExpectedConditions.visibilityOf(demo.due_date_value));
	  Keyword.cleartext(demo.due_date_value);
	  Keyword.enterTextvalue(demo.due_date_value, "15");
	  
	  wait.until(ExpectedConditions.visibilityOf(demo.InvoiceTo));
	  Keyword.cleartext(demo.InvoiceTo);
	  Keyword.enterTextvalue(demo.InvoiceTo, "Sundeep");
		
	  wait.until(ExpectedConditions.elementToBeClickable(demo.addNewLineItemButton));
	  Keyword.clickelmt(demo.addNewLineItemButton);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.Item_dd));
	  Keyword.clickelmt(demo.Item_dd);
	 
	  wait.until(ExpectedConditions.visibilityOf(demo.Item_dd));
	  Keyword.enterKey(demo.Item_dd, Keys.ARROW_DOWN);
	  Keyword.enterKey(demo.Item_dd, Keys.ARROW_DOWN);
	  Keyword.enterKey(demo.Item_dd, Keys.ENTER);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.Approve));
	  Keyword.clickelmt(demo.Approve);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.branding));
	  Keyword.clickelmt(demo.branding);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.orange_brand));
	  Keyword.clickelmt(demo.orange_brand);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.Save));
	  Keyword.clickelmt(demo.Save);
	  
	  wait.until(ExpectedConditions.visibilityOf(demo.validation));
	  	   
	  try {
			Assert.assertEquals((Keyword.driver.getTitle()), "Xero | Invoices | Demo Company (NZ)", "Test Failed");
			System.out.println("Test Passed: Edit Successful");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Test Failed: Edit failed");
		}
	  
  }
}
