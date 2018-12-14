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

WebUI.comment('User Story: When user goes to promo-block component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'layout/promo-block/')

WebUI.comment('and scrolls down to the first Over the moon Promo Block example')

WebUI.comment('then I should be able to see the Over the moon Promo Block example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/Cookbook Example of promo block'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/promo-block full container'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/image area of beach'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/div_Over the moon full container'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/jetblue vacations logo'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/CTA Button'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/Headline'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/Subcopy'), 
    10)

WebUI.comment('When I click on the background image then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/image area of beach'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('When I click on the Over the Moon section then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/div_Over the moon full container'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('When I click on the Headline I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/Headline'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('When I click on the Subcopy I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/Subcopy'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('When I click on the background image then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/jetblue vacations logo'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('When I click on the CTA Button (Book Now)  I should be taken to https://www.jetblue.com/')

WebUI.click(findTestObject('JetBlue Component Library Objects/promo-block Component Objects/Page_JetBlue  Component Library/CTA Button'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Book on jetblue.com', false)

WebUI.back()

WebUI.closeBrowser()

