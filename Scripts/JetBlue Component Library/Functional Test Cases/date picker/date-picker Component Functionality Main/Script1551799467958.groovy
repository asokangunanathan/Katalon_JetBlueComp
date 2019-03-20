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

WebUI.maximizeWindow()

'User Story:  When the user accesses the date-picker component page'
WebUI.comment('User Story:  When the user accesses the date-picker component page')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'date-picker/?test')

WebUI.comment('and scrolls to the date picker forward example then I should see the calendar"')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/Date Picker Component forward'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/date-picker Component Objects/Page_JetBlue  Component Library/div_chevron S  M  T  W  T  F'), 
    10)

WebUI.callTestCase(findTestCase('JetBlue Component Library/Functional Test Cases/date picker/Verify cycling through Months using month Buttons'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

