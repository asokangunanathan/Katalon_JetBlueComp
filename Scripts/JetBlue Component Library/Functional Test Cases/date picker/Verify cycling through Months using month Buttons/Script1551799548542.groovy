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

WebUI.comment('Click on each month button and verify that the month on the calendar changes to the correct month')

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Mar'))

WebUI.verifyTextPresent('March 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Apr'))

WebUI.verifyTextPresent('April 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_May'))

WebUI.verifyTextPresent('May 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Jun'))

WebUI.verifyTextPresent('June 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Jul'))

WebUI.verifyTextPresent('July 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Aug'))

WebUI.verifyTextPresent('August 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Sep'))

WebUI.verifyTextPresent('September 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Oct'))

WebUI.verifyTextPresent('October 2019', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/button_Nov'))

WebUI.verifyTextPresent('November 2019', false)

