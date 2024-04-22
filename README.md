How To Test
- To test websites for automation testing I use Katalon
- In Katalon I use features Record Web 
- To validate the correct login, we need validation with Object Spy
How To Run
- Open the project in Katalon
- Open the Test Case 
- Click Run

The Libraries to be Installed
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

This libraries is provide a collection of built-in keywords and utilities for web UI automation testing, and is used extensively for interacting with web elements, navigating between pages, handling alert, and much more.
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

This libraries is provides method for finding test objects, and findTestObject method is used to locate a test object by it is name.
