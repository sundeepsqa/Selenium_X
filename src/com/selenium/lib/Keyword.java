package com.selenium.lib;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

//import com.selenium.datatable.Xls_Reader;

public class Keyword extends Constant{
	
	//static Xls_Reader datatable = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\selenium\\config\\Controller.xlsx");
	
	public static WebDriver getBrowser(String bType){
		
		try {
			
		
		if((bType.equalsIgnoreCase("FF")) || bType.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}
		else if((bType.equalsIgnoreCase("IE")) || bType.equalsIgnoreCase("InternetExplorer")){
				System.setProperty("webdriver.ie.driver", "");
				driver = new InternetExplorerDriver();
			}
				
		else if(bType.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "F:\\jars-core\\chromedriver_win32\\chromedriver.exe");
						driver = new ChromeDriver();
				}			
		else if (bType.equalsIgnoreCase("safari")){
							driver = new SafariDriver();
						}
		
		driver.manage().window().maximize();
		
		}
				
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Wrong browser :(");
			throw (e);
		}
		
		return driver;
		
		}
	
	
	public static void getUrl(String url){
		try {
			driver.get(url);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Which URL?? :(");
			throw(e);
		}
	}


	public static void enterTextvalue(WebElement element, String text) {
		// TODO Auto-generated method stub
		try {
//			System.out.println(element);
			element.sendKeys(text);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Don't know where to enter text :(");
			throw(e);
		}
	}


	public static void clickelmt(WebElement element) {
		// TODO Auto-generated method stub
//		System.out.println(element);
		try {
//			System.out.println(element);
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(element);
			System.out.println("Don't know where to click :(");
			throw(e);
		}
	}


	public static void selectfrom_dd(WebElement element, String string) throws Exception {
		// TODO Auto-generated method stub
		try {
//			System.out.println(element);
//			System.out.println("DD list text is:" + element.getText());
			Select select = new Select(element);
			Thread.sleep(3);
			select.selectByVisibleText(string);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("I can't find a drop down list :(");
			throw(e);
		}
	}

	public static void selectfrom_dd(WebElement element, int i) throws Exception {
		// TODO Auto-generated method stub
		
		try {
//			System.out.println(element);
//			System.out.println("DD list text is:" + element.getText());
			Select select = new Select(element);
			Thread.sleep(3);
			select.selectByIndex(i);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Drop down list not found:(");
			throw(e);
		}
		
	}


	public static void enterKey(WebElement element, Keys key) {
		// TODO Auto-generated method stub
		try {
			//System.out.println(element);
			element.sendKeys(key);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Can't find key :(");
			throw(e);
		}
	}


	public static void cleartext(WebElement element) {
		// TODO Auto-generated method stub
		try {
//			System.out.println(element);
			element.clear();
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(element);
			System.out.println("Unable to clean :(");
			throw(e);
		}
	}


	
	
	
	

	
	
	
	

}
