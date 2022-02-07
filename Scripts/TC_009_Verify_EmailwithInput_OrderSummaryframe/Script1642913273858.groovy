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

WebUI.openBrowser(findTestData('Data_Input_Positive_Case').getValue(2, 1))

WebUI.click(findTestObject('HomePage/BuyNow_Button'))

WebUI.setText(findTestObject('checkout/Form/Shopping_cart/midtrans_pillow'), findTestData('Data_Input_Positive_Case').getValue(
        2, 2))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/name'), findTestData('Data_Input_Positive_Case').getValue(2, 
        3))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/email'), findTestData('Data_Input_Positive_Case').getValue(
        2, 4))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/phone'), findTestData('Data_Input_Positive_Case').getValue(
        2, 5))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/City'), findTestData('Data_Input_Positive_Case').getValue(2, 
        6))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/address'), findTestData('Data_Input_Positive_Case').getValue(
        2, 7))

WebUI.setText(findTestObject('checkout/Form/Customer_Details/postal_code'), findTestData('Data_Input_Positive_Case').getValue(
        2, 8))

input_email = WebUI.getAttribute(findTestObject('checkout/Form/Customer_Details/email'), 'value')

System.out.println(input_email)

WebUI.click(findTestObject('checkout/Form/checkout_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('checkout/Order_Summary/Shipping_details/Shipping_details_button'))

email_shippingdetails = WebUI.getText(findTestObject('checkout/Order_Summary/Shipping_details/email'))

System.out.println(email_shippingdetails)

WebUI.verifyEqual(input_email, email_shippingdetails)

WebUI.closeBrowser()

