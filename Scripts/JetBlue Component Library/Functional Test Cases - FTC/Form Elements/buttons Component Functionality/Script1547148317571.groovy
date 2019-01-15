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

'User Story: When user goes to buttons component page'
WebUI.comment('User Story: When user goes to buttons component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'buttons')

WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and scrolls down to Primary Button - Default  example\n'
WebUI.comment('and scrolls down to Primary Button - Default example\n')

'and clicks on it  then the user should be taken to google.com'
WebUI.comment('and clicks on it  then the user should be taken to google.com')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Primary button_Button Default'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Primary button_Button Default'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and clicks on it  then the user should be taken to google.com'
WebUI.comment('when the user scrolls down to Primary Button - Paired example\n')

'and clicks on it  then the user should be taken to google.com'
WebUI.comment('and clicks on it  then the user should be taken to google.com')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Primary_Button Paired'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Primary_Button Paired'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user scrolls down to Primary Button - Square example\n'
WebUI.comment('when the user scrolls down to Primary Button - Square example\n')

'and clicks on it  then the user should be taken to google.com'
WebUI.comment('and clicks on it  then the user should be taken to google.com')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Primary button_Button Square'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Primary button_Button Square'))

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.waitForPageLoad(5)

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user scrolls down to Secondary Button - Rounded example\n'
WebUI.comment('when the user scrolls down to Secondary Button - Rounded example\n')

'and clicks on it  then the user should be taken to google.com'
WebUI.comment('and clicks on it  then the user should be taken to google.com')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Secondary button_Button Default'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Secondary button_Button Default'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user scrolls down to Secondary Button - Paired example\n'
WebUI.comment('when the user scrolls down to Secondary Button - Paired example\n')

'and clicks on it  then the user should be taken to google.com'
WebUI.comment('and clicks on it  then the user should be taken to google.com')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Secondary_Button Paired'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Secondary_Button Paired'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user scrolls down to Secondary Button - Default example\n'
WebUI.comment('when the user scrolls down to Secondary Button - Default example\n')

'and clicks on it then the user should be taken to google.com'
WebUI.comment('and clicks on it then the user should be taken to google.com')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Secondary button_Button Square'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/Secondary button_Button Square'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'wnen the user scrolls down to Loading Button example\n'
WebUI.comment('wnen the user scrolls down to Loading Button example\n')

'and clicks on it  then the user should see the button change to loading image'
WebUI.comment('and clicks on it  then the user should see the button change to loading image')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/button_Load Records'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/button_Load Records'))

WebUI.waitForElementPresent(findTestObject('JetBlue Component Library Objects/Form Elements/buttons Component Objects/Page_JetBlue  Component Library/button_-webkit-keyframes H1Wls'), 
    5)

WebUI.closeBrowser()

