import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://int.b6orgeng.net/component-library/tabs?test=')

WebUI.scrollToElement(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Item Two'), 
    0)

WebUI.click(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Item Two'))

WebUI.scrollToElement(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Item Three'), 
    0)

WebUI.click(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Item Three'))

WebUI.scrollToElement(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Consectetur adipis'), 
    0)

WebUI.click(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Consectetur adipis'))

WebUI.scrollToElement(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Hotels'), 
    0)

WebUI.click(findTestObject('Object Repository/JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/button_Hotels'))

WebUI.closeBrowser()

