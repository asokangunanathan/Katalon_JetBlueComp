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

'User Story: When user goes to flight-block component page'
WebUI.comment('User Story: When user goes to flight-block component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'flight-block')

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and scrolls to example "Price-based Flight Block"'
WebUI.comment('and scrolls to example "Price-based Flight Block"')

'then the user should see the "Price-based Flight Block" example'
WebUI.comment('then the user should see the "Price-based Flight Block" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/Full Fight Block Container'), 
    10)

'the entire component pieces should be clickable'
WebUI.comment('the entire component pieces should be clickable')

//WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/promo-block full container'), 
//   10)
WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/Block Title'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/p_New York (JFK) to Reykjavik'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/Full Fight Block Container'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/div_from'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/jb-callout_1028'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/span_one-way'), 
    FailureHandling.STOP_ON_FAILURE)

'when the user clicks on the Price-based Flight Block Example then user should navigate to jetblue.com'
WebUI.comment('when the user clicks on the Price-based Flight Block Example then user should navigate to jetblue.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/Full Fight Block Container'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Book on jetblue.com', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user clicks See restrictions Dialog link then a popup should open'
WebUI.comment('when the user clicks See restrictions Dialog link then a popup should open')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/flight-block Objects/Page_JetBlue  Component Library/button_See restrictions'))

WebUI.waitForPageLoad(5)

'Popup should contain Text: This fare is available on select dates between 08/21/2018 and 11/14/2018. Fare may not be available during holidays or other peak travel days. Click on the fare to see a fare calendar showing the exact dates this fare is available. Any "Price Drop" that is shown is based on lowest bookable fare within the last 72 hours.'
WebUI.verifyTextPresent('This fare is available on select dates between 08/21/2018 and 11/14/2018. Fare may not be available during holidays or other peak travel days. Click on the fare to see a fare calendar showing the exact dates this fare is available. Any "Price Drop" that is shown is based on lowest bookable fare within the last 72 hours.', 
    false)

WebUI.back()

WebUI.closeBrowser()

