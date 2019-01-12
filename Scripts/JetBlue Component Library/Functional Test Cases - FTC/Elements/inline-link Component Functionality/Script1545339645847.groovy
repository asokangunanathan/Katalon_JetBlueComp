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

'User Story:  When the user accesses the inline-link component page'
WebUI.comment('User Story:  When the user accesses the inline-link component page')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'links/inline-link/')

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/a_Inline link no icon'), 
    10)

'and clicks on the inline link in "Lorem ipsum Inline link dolor esta." then the user should be taken to google.com'
WebUI.comment('and clicks on the inline link in "Lorem ipsum Inline link dolor esta." then the user should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/a_Inline link no icon'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user clicks on Inline Links: with icon example link then the user should be taken to Component Library icons page'
WebUI.comment('when the user clicks on Inline Links: with icon example link then the user should be taken to Component Library icons page')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/a_Inline link with icon'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/a_Inline link with icon'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Illustration Icons', false)

WebUI.closeBrowser()

