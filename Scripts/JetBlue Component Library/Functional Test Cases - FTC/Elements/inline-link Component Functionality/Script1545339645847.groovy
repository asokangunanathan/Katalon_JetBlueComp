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

WebUI.comment('User Story:  When I access the inline-link component page and scroll to Inline Link: no icon')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'links/inline-link/')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/h3_Inline Link no icon'), 
    10)

WebUI.comment('then I should be able to see the Inline Link: no icon example')

WebUI.comment('When I click on the inline link in "Lorem ipsum Inline link dolor esta." then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/a_Inline link'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('User Story:  When I scroll to Inline Links: with icon example')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/h3_Inline Links with icon'), 
    10)

WebUI.comment('then I should be able to see the "Inline Links: with icon" example and clicking on it should take me to /icons')

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/inline-link Component Objects/Page_JetBlue  Component Library/jb-icon_Inline link_pl1 t-fast'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Illustration Icons', false)

WebUI.back()

WebUI.closeBrowser()

