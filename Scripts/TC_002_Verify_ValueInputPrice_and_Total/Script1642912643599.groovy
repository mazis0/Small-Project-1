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

WebUI.clearText(findTestObject('checkout/Form/Shopping_cart/midtrans_pillow'))

WebUI.sendKeys(findTestObject('checkout/Form/Shopping_cart/midtrans_pillow'), findTestData('Data_Input_Positive_Case').getValue(
        2, 2))

String midtrans = findTestData('Data_Input_Positive_Case').getValue(2, 2)

System.out.println(midtrans)

total_midtrans = WebUI.getText(findTestObject('checkout/Form/Shopping_cart/total'))

total_midtrans = total_midtrans.replaceAll('\\D+', '')

int new_total_midtrans = Integer.parseInt(total_midtrans)

System.out.println(new_total_midtrans)

WebUI.verifyEqual(midtrans, new_total_midtrans)

WebUI.closeBrowser()

