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

'User Story: When user goes to callout-block component page'
WebUI.comment('User Story: When user goes to callout-block component page')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'layout-blocks/callout-block?test')

// Click on T button to remove JetBlue floating menu
//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and scrolls to example "Callout Block (2-up)"'
WebUI.comment('and scrolls to example "Callout Block (2-up)"')

'then the user should see the "Callout Block (2-up)" example'
WebUI.comment('then the user should see the "Callout Block (2-up)" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/jb-callout-block_Stretch out'), 
    10)

'When the user clicks on the Learn more link then the user should be taken to google.com'
WebUI.comment('When I click on the Learn more link then the user should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/a_Learn more'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.closeBrowser()

