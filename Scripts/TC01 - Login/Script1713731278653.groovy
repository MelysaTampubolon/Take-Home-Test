import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.click(findTestObject('Object Repository/Take_Home_Test/Page_Swag Labs/div_Accepted usernames arestandard_userlock_f87578'))

WebUI.setText(findTestObject('Object Repository/Take_Home_Test/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.click(findTestObject('Object Repository/Take_Home_Test/Page_Swag Labs/body_You need to enable JavaScript to run t_37d0d7'))

WebUI.setEncryptedText(findTestObject('Object Repository/Take_Home_Test/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Take_Home_Test/Page_Swag Labs/form'))

WebUI.click(findTestObject('Object Repository/Take_Home_Test/Page_Swag Labs/input_Swag Labs_login-button'))

validation = WebUI.getText(findTestObject('Object Repository/Take_Home_Test/Page_Swag Labs/div_Swag Labs'))

println validation

assert validation.equals("Swag Labs") 
