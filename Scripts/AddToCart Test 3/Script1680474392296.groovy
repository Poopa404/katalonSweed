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

WebUI.navigateToUrl('http://18.206.230.255:3000/')

WebUI.click(findTestObject('Page_SWEED/button_toRegister'))

WebUI.click(findTestObject('Page_SWEED/button_toLogin'))

WebUI.setText(findTestObject('Page_SWEED/input_Email'), 'mumu@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_SWEED/input_Password'), 'rPUzPvUm5D8=')

WebUI.click(findTestObject('Object Repository/Page_SWEED/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_SWEED/div_Stoner'))

WebUI.click(findTestObject('Page_SWEED/button_AddToCart3'))

WebUI.click(findTestObject('Object Repository/Page_SWEED/button_Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SWEED/h3_FoodName'), food3)

WebUI.verifyElementText(findTestObject('Page_SWEED/span_Price3'), price3)

WebUI.click(findTestObject('Object Repository/Page_SWEED/button_Order'))

WebUI.closeBrowser()

