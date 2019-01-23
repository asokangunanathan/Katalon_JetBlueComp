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

'User Story:  When the user accesses the CTA-link component page\n '
WebUI.comment('User Story:  When the user accesses the CTA-link component page\n ')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'links/cta-link/?test')

// Click on T button to remove JetBlue floating menu
//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'and the user clicks on the Default link CTA link'
WebUI.comment('and the user clicks on the Default link CTA link')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Default link CTA'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Default link CTA'))

WebUI.waitForPageLoad(5)

'the user should be taken to Google page'
WebUI.comment('the user should be taken to Google page')

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user clicks on the External link CTA link'
WebUI.comment('when the user clicks on the External link CTA link')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_External link CTA'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_External link CTA'))

WebUI.waitForPageLoad(5)

'the user should be taken to Google page'
WebUI.comment('the user should be taken to Google page')

WebUI.verifyTextPresent('Google', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user clicks on Document link CTA link'
WebUI.comment('when the user clicks on Document link CTA link')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Document link CTA'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Document link CTA'))

WebUI.waitForPageLoad(5)

'the user should taken to coponent libray icons page https://dev.b6orgeng.net/component-library/icons'
WebUI.comment('the user should taken to coponent libray icons page https://dev.b6orgeng.net/component-library/icons')

WebUI.verifyTextPresent('Illustration Icons', false)

WebUI.back()

// Click on T button to remove JetBlue floating menu
//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

'when the user clicks on Document link CTA with target _blank'
WebUI.comment('when the user clicks on Document link CTA with target _blank')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Document link CTA for target_blank'), 
    10)

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Document link CTA for target_blank'))

WebUI.waitForPageLoad(5)

'when the user clicks on Document link CTA with target _blank (new tab)'
WebUI.comment('the user should be taken to Google page in a new Tab')

//'Switch to Documentation window'
WebUI.switchToWindowTitle('Google')

WebUI.verifyTextPresent('Google', false)

WebUI.closeBrowser()

