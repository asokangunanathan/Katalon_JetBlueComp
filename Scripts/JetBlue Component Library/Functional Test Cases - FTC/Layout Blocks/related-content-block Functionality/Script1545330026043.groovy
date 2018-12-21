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

WebUI.comment('User Story: When user goes to related-content-block component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'related-content-block')
WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/button_T'))

WebUI.comment('and scrolls to example "Section Specific Related Content Block With Icon"')

WebUI.comment('then the user should see the "Section Specific Related Content Block With Icon" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/Section Specific Related Content Block With Icon example'), 
    10)

//WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/polygon'), 
  //  10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/CTA Link'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/Header'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/jb-copy_Description'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/We Mean Business Related Content Block'), 
    10)


WebUI.comment('When I click on the Learn more link then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/related-content-block Objects/Page_JetBlue  Component Library/CTA Link'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.closeBrowser()

