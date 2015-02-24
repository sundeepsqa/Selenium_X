# Selenium_X
Xero on Github

Project Structure:
 
The TestNG Automation test framework is created using Selenium, Java programming and Page Object pattern aiming to test the “Repeating Invoice” UI component.
Framework contains Pagefactory, reusable library, test suite which is broken down into tests for Logging in, Invoice creation and Editing the Invoice.
-          LoginTest validates the user login functionality by logging into NZ demo site from Xero marketing site.
-          Once logged in, CreateInvoice test validates if the user is a new user or an existing user and the functionality of navigating to Sales page, Repeating Invoice page and creating a Repeating Invoice successfully.
-          On successful creation of a Repeating Invoice, calculations of SubTotal, GST and Total Invoice are validated. 
-          EditInvoice test validates the changes made to the created invoice from CreateInvoice test and is saved successfully.
-          Test is executed as a Test suite using TestNG.xml file.

 
Further Notes:
-         This test framework can be extended to be data-driven integrated with Apache POI API.
-         Build process can be automated and run using Apache ANT and Jenkins.
-         XSLT reporting can be easily integrated to generate comprehensive report.
-         Framework is created such a way that it can be migrated to BDD using Cucumber.
-         Easily integrate the project with SauceLabs, great service to launch tests in the cloud.
-         Adding Chrome Driver to the project: If you need to use chromedriver, you should point the proper driver file downloaded from http://code.google.com/p/chromium/downloads/list in your project.
          If you are on Windows, the file should be named chromedriver.exe, if on Unix-based system, the file should be named chromedriver.

More Info:

TestNG
For more info around TestNG framework, go to http://testng.org/doc/index.html. If you prefer, you could substitute this framework with JUnit.

Page Object pattern
For more info around this pattern, read this wiki page: http://code.google.com/p/selenium/wiki/PageObjects

Limitations:
-          Negative scenarios are not tested.
-          Edge cases are not covered.
