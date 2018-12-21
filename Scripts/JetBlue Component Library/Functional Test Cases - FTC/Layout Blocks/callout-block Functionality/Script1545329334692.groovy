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

WebUI.comment('User Story: When user goes to callout-block component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'layout/callout-block')

WebUI.comment('and scrolls to example "Callout Block (2-up)"')

WebUI.comment('then the user should see the "Callout Block (2-up)" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/h3_Callout Block (2-up)'), 
    10)

//WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/promo-block full container'), 
//   10)
WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/jb-copy_Enjoy the most legroom'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/jb-callout-block_Stretch out'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/h3_Stretch out'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/a_Learn more'), 
    10)

WebUI.comment('When I click on the Learn more link then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/callout-block Objects/Page_JetBlue  Component Library/a_Learn more'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.closeBrowser()

