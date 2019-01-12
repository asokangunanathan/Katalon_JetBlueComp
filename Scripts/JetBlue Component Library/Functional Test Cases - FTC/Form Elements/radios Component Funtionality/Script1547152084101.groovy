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

'User Story: When user goes to radios component page'
WebUI.comment('User Story: When user goes to radios component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'radios')

WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and scrolls to Simple Radio Button example\n'
WebUI.comment('and scrolls to Simple Radio Button example\n')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/radios Component Objects/Page_JetBlue  Component Library/ul_Option 1  Option 2  Option'), 
    10)

'selecting the radio item by item number should set the value to the correct number\n'
WebUI.comment('selecting the radio item by item number should set the value to the correct number\n')

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/radios Component Objects/Page_JetBlue  Component Library/label_Option 1'))

WebUI.verifyTextPresent('Value: 1', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/radios Component Objects/Page_JetBlue  Component Library/label_Option 2'))

WebUI.verifyTextPresent('Value: 2', false)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/radios Component Objects/Page_JetBlue  Component Library/label_Option 3'))

WebUI.verifyTextPresent('Value: 3', false)

WebUI.closeBrowser()

