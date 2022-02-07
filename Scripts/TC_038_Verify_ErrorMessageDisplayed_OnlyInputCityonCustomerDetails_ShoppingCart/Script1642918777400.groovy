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

WebUI.openBrowser(findTestData('Data_Input_Negative_Case').getValue(2, 1))

WebUI.click(findTestObject('HomePage/BuyNow_Button'))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/name'), ' ')

WebUI.setText(findTestObject('checkout/Form/Customer_Details/email'), ' ')

WebUI.setText(findTestObject('checkout/Form/Customer_Details/phone'), ' ')

WebUI.setText(findTestObject('checkout/Form/Customer_Details/City'), findTestData('Data_Input_Negative_Case').getValue(2, 
        6))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/address'), ' ')

WebUI.setText(findTestObject('checkout/Form/Customer_Details/postal_code'), ' ')

WebUI.click(findTestObject('checkout/Form/checkout_button'))

WebUI.waitForElementPresent(findTestObject('HomePage/BuyNow_Button'), 3)

WebUI.verifyElementPresent(findTestObject('HomePage/error_message/error_message1'), 0)

WebUI.closeBrowser()

