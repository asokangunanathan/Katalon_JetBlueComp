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

'User Story: When user goes to navigation-block component page'
WebUI.comment('User Story: When user goes to navigation-block component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'navigation-block/')

'and scrolls down to the 1 up Navigation Block example'
WebUI.comment('and scrolls down to the 1 up Navigation Block example')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/Cookbook section - Navigation Block Example'), 
    10)

'user should be able to see 1-up example'
WebUI.comment('user should be able to see 1-up example')

'Navigation Block should have Title, Block Copy, Optional Icon, and the entire Navigation block should be clickable'
WebUI.comment('Navigation Block should have Title, Block Copy, Optional Icon, and the entire Navigation block should be clickable')

WebUI.verifyElementText(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/1up Nav Block Example Title'), 
    'In-flight Experience')

WebUI.verifyElementText(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/1up Nav Block Example Content Text'), 
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit.')

WebUI.verifyElementAttributeValue(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/1up nav block example Icon'), 
    'tag', 'svg', 5)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/1up Nav Blcok Example Dog Image'))

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/1up Nav Block Example Text Container'))

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/1up Nav Block Example Full Container'))

'Clicking on navigation block should navigate to google'
WebUI.comment('Clicking on navigation block should navigate to google')

WebUI.clickOffset(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/1up Nav Block Example Full Container'), 
    100, 100)

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

'When user scrolls down to the Secondary Block'
WebUI.comment('When user scrolls down to the Secondary Block')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/Cookbook Secondary Block Section'), 
    10)

'the user should be able to see Secondary Block Example'
WebUI.comment('the user should be able to see Secondary Block Example')

'Seconary Navigation Block should have Title, Block Copy, and the entire Navigation block should be clickable'
WebUI.comment('Seconary Navigation Block should have Title, Block Copy, and the entire Navigation block should be clickable')

WebUI.verifyElementText(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/3 Titles of Secondary Nav Block'), 
    'In-flight Experience')

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/Secondary Block container 1'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/Secondary Block container 2'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/Secondary Block container 3'), 
    10)

WebUI.verifyElementClickable(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/Secondary Block full container'))

'Clicking on navigation block should navigate to google'
WebUI.comment('Clicking on navigation block should navigate to google')

WebUI.clickOffset(findTestObject('JetBlue Component Library Objects/Layout Blocks/navigation-block Objects/Page_JetBlue  Component Library/Secondary Block container 1'), 
    100, 100)

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.closeBrowser()

