package com.selenium.pagefact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Invoicefact {
	
	@FindBy(xpath="//a[@id='ext-gen1031']")
	public WebElement Demo_company_link;
  
	@FindBy(xpath="//a[@id='Accounts']")
	public WebElement Accounts_tab;
	
	@FindBy(xpath="//*[@id='xero-nav']/div[2]/div[2]/div/ul/li[2]/ul/li[2]/a")
	public WebElement Sales;
	
	@FindBy(xpath="//span[@class='sq-new-item-list']")
	public WebElement New_invoice;
	
	@FindBy(xpath="//b[contains(.,'Repeating invoice')]")
	public WebElement Repeating_invoice;
	
	@FindBy(xpath="//a[contains(@id,'TimeUnit_toggle')]")
	public WebElement Recurring_trans;
	
	@FindBy(xpath="//*[@id='TimeUnit_suggestions']/div/div[2]")
	public WebElement Recurring_trans_month;
	
	@FindBy(xpath="//input[@id='StartDate']")
	public WebElement invoice_date;
	
	@FindBy(xpath="//input[@id='DueDateDay']")
	public WebElement due_date_value;
	
	@FindBy(xpath="//a[@id='DueDateType_toggle']")
	public WebElement due_date;
	
	@FindBy(xpath="//*[@id='DueDateType_suggestions']/div/div[4]")
	public WebElement due_date_select;
	
	@FindBy(xpath="//button[contains(.,'OK')]")
	public WebElement ok_popup;
	
	@FindBy(xpath="//input[@id='saveAsDraft']")
	public WebElement saveAsDraft;
	
	@FindBy(xpath="//input[@id='saveAsAutoApproved']")
	public WebElement Approve;
		
	@FindBy(xpath="//input[@id='saveAsAutoApprovedAndEmail']")
	public WebElement ApprovedAndEmail;
	
	@FindBy(xpath="//input[@class='x-form-text x-form-field autocompleter field x-form-focus']")
	public WebElement InvoiceTo;
	
	@FindBy(xpath="//*[@id='ext-gen20']/div[1]/table/tbody/tr/td[2]/div")
	public WebElement Item1;
	
	@FindBy(xpath="//*[@id='ext-gen20']/div[2]/table/tbody/tr/td[2]/div")
	public WebElement Item2;
	
	@FindBy(id="ext-comp-1001")
	public WebElement Item_dd;
	
	@FindBy(xpath="//*[@id='ext-gen102']")
	public WebElement Item_listing;
	
	@FindBy(xpath="//div[@class='x-combo-list-item x-combo-selected']")
	public WebElement book;
	
	@FindBy(xpath="//button[@tabindex='252']")
	public WebElement Save;
	
	@FindBy(xpath="//*[@id='title']")
	public WebElement assert_text;
	
	@FindBy(xpath="//a[contains(.,'New Repeating Invoice')]")
	public WebElement validation;
	
	@FindBy(xpath="//a[contains(.,'Sandy')]")
	public WebElement editRI;
	
	@FindBy(xpath="//button[@id='addNewLineItemButton']")
	public WebElement addNewLineItemButton;
	
	@FindBy(xpath="//a[@id='TemplateDropDown_toggle']")
	public WebElement branding;
	
	@FindBy(xpath="//*[@id='TemplateDropDown_suggestions']/div/div[3]")
	public WebElement orange_brand;
	
	@FindBy(xpath="//input[@id='subTotal']")
	public WebElement subTotal;
	
	@FindBy(xpath="//input[@id='TAXTotal GST 15.00%']")
	public WebElement gst;
	
	@FindBy(xpath="//input[@id='invoiceTotal']")
	public WebElement Total;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
