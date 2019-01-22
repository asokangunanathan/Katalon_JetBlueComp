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

'User Story: When user goes to promo-block component page'
WebUI.comment('User Story: When user goes to promo-block component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'layout/promo-block/')

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and scrolls down to the first Over the moon Promo Block example'
WebUI.comment('and scrolls down to the first Over the moon Promo Block example')

'then the user should be able to see the Over the moon Promo Block example'
WebUI.comment('then the user should be able to see the Over the moon Promo Block example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/promo-block full container'), 
    10)

//WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/promo-block full container'), 
//   10)
WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Beach Area of Image'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Text Content'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/jetBlue Logo'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/a_Book now'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Headline'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Subcopy'), 
    FailureHandling.STOP_ON_FAILURE)

'When the user clicks on the background image then the user should be taken to google.com'
WebUI.comment('When the user clicks on the background image then the user should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Beach Area of Image'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'When the user clicks on the Over the Moon section then the user should be taken to google.com'
WebUI.comment('When the user clicks on the Over the Moon section then the user should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Text Content'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'When the user clicks on the Headline the user should be taken to google.com'
WebUI.comment('When the user clicks on the Headline the user should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Headline'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'When the user clicks on the Subcopy the user should be taken to google.com'
WebUI.comment('When the user clicks on the Subcopy the user should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/Subcopy'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'When the user clicks on the background image then the user should be taken to google.com'
WebUI.comment('When the user clicks on the background image then the user should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/jetBlue Logo'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'When the user clicks on the CTA Button (Book Now) the user should be taken to https://www.jetblue.com/'
WebUI.comment('When I click on the CTA Button (Book Now) the user should be taken to https://www.jetblue.com/')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/a_Book now'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Let\'s go somewhere.', false)

WebUI.closeBrowser()

