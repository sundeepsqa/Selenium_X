package com.selenium.TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.selenium.lib.Keyword;
import com.selenium.pagefact.Invoicefact;

public class ValidationTest {
  @Test
  public void validate() throws InterruptedException {
	  
	  Invoicefact demo = PageFactory.initElements(Keyword.driver, Invoicefact.class);
	  WebDriverWait wait = new WebDriverWait(Keyword.driver, 3000);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.editRI));
	  Keyword.clickelmt(demo.editRI);	  
 
	  float Subtotal = 0;
	  
	  wait.until(ExpectedConditions.visibilityOf(demo.subTotal));
	  
	  for (int i = 1; i<=2; i++){
			
		  	String x = Keyword.driver.findElement(By.xpath("//*[@id='ext-gen20']/div["+i+"]/table/tbody/tr/td[11]/div/span")).getText();		
			Subtotal = Subtotal + Float.parseFloat(x);
			} 
	  	  
	  JavascriptExecutor js = (JavascriptExecutor)Keyword.driver ; 
	  js.executeScript("arguments[0].removeAttribute('readonly','readonly')",demo.subTotal);	  	  
	  String Subtotal_out = demo.subTotal.getAttribute("value");	
	  	  
	  if((int)Subtotal == (int)Float.parseFloat(Subtotal_out))
		  System.out.println("Subtotal calculation is correct\n");
	  else
		  System.out.println("Subtotal calculation is incorrect\n");
	  
	  
	  
	  float gst_val = (float) (0.15 * Subtotal);	  	  	  
	  js.executeScript("arguments[0].removeAttribute('readonly','readonly')",demo.gst);	  	 
	  String gst_out = demo.gst.getAttribute("value");
	  
	  if((int)gst_val == (int)Float.parseFloat(gst_out))
		  System.out.println("Total GST calculation is correct\n");
	  else
		  System.out.println("Total GST calculation is incorrect\n");
	  

	  float Total_val = gst_val + Subtotal;	 
	  js.executeScript("arguments[0].removeAttribute('readonly','readonly')",demo.Total);	 	  
	  String Total_out = demo.Total.getAttribute("value");	  
	  	  
	  if((int)Total_val == (int)Float.parseFloat(Total_out))
		  System.out.println("Invoice calculation is correct\n");
	  else
		  System.out.println("Invoice calculation is incorrect\n");
	  
	  System.out.println("Validation successful\n");
	  
		  
	  wait.until(ExpectedConditions.elementToBeClickable(demo.Save));
	  Keyword.clickelmt(demo.Save);
  }
}
