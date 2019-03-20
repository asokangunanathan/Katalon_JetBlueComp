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

'User Story:  When the user accesses the standalone-link component page'
WebUI.comment('User Story:  When the user accesses the standalone-link component page')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'elements/standalone-link?test')

// Click on T button to remove JetBlue floating menu
//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))
'When the user clicks on the Standalone link then the user should be taken to google.com'
WebUI.comment('When the user clicks on the Standalone link then the user should be taken to google.com')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone link'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone link'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))
'when the user clicks on Standalone link: with icon then the user should be taken to component library icons page'
WebUI.comment('when the user clicks on Standalone link: with icon then the user should be taken https://dev.b6orgeng.net/component-library/style-guide')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone with icon link'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone with icon link'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('JetBlue Component Library', false)

WebUI.closeBrowser()

