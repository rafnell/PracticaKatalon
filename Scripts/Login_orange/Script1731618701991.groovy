import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/input_Username_username'), 'amor')

WebUI.setEncryptedText(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/input_Password_password'), 'M0uqcBoOpRgdry3C+4t+Fw==')

WebUI.click(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/button_Login'))

WebUI.setText(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/i_Disabled_oxd-icon bi-caret-up-fill oxd-se_30e8a8'))

WebUI.click(findTestObject('Object Repository/orangehrm/Page_OrangeHRM/i_Disabled_oxd-icon bi-caret-up-fill oxd-se_30e8a8'))

WebUI.closeBrowser()

