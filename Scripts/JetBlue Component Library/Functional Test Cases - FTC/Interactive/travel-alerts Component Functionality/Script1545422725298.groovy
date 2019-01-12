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

'User Story: When user goes to travel-alerts component page'
WebUI.comment('User Story: When user goes to travel-alerts component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'travel-alerts')

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and scrolls to the Example'
WebUI.comment('and scrolls to the Example')

'then the user should see the "travel-alerts" example'
WebUI.comment('then the user should see the "travel-alerts" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/svg'), 
    10)

//WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/polygon'), 
//  10)
WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/button_Reset Alert'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/p_top margin of main navigatio'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/div_top margin of main navigat'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/div_Emotional Support Animal ('), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/p_Emotional Support Animal (ES'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/h3_Desktop view above main nav'), 
    10)

'When then user clicks close button then the travel alert should close'
WebUI.comment('When then user clicks close button then the travel alert should close')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/svg'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('JetBlue Component Library Objects/Interactive/travel alerts Objects/Page_JetBlue  Component Library/button_Reset Alert'))

WebUI.closeBrowser()

