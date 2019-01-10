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

WebUI.comment('User Story:  When I access the standalone-link component page')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'links/standalone-link/')

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

WebUI.comment('When I click on the Standalone link then I should be taken to google.com')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone link'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone link'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()
// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

WebUI.comment('when I click on Standalone link: with icon I should be taken to component library icons page')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone with icon link'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/standalone-link Component Objects/Page_JetBlue  Component Library/a_Standalone with icon link'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Illustration Icons', false)

WebUI.closeBrowser()

