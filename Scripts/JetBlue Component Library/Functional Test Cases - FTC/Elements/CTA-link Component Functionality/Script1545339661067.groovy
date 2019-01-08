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

WebUI.comment('User Story:  When I access the CTA-link component page and scroll to Text CTA Links: default')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'links/cta-link/')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/h3_Text CTA Links default'), 
    10)

WebUI.comment('then I should be able to see the Text CTA Links: default example')

WebUI.comment('When I click on Default link CTA then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Default link CTA'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('User Story:  When I access the CTA-link component page and scroll to Text CTA Links: External')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/h3_Text CTA Links external'), 
    10)

WebUI.comment('then I should be able to see the Text CTA Links: External example and clicking on it should take me to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_External link CTA'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.comment('User Story:  When I access the CTA-link component page and scroll to Text CTA Links: document\n')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/h3_Text CTA Links external'), 
    10)

WebUI.comment('then I should be able to see the Text CTA Links: document\n example and clicking on it should take me to /icons')

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Document link CTA'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Illustration Icons', false)

WebUI.back()

WebUI.comment('User Story:  When I access the CTA-link component page and scroll to Text CTA Links: target _blank\n\n')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/h3_Text CTA Links target _blan'), 
    10)

WebUI.comment('then I should be able to see the Text CTA Links: document\n example and clicking on it should take me to /icons')

WebUI.click(findTestObject('JetBlue Component Library Objects/Elements Components/CTA-link Component Objects/Page_JetBlue  Component Library/a_Document link CTA for target_blank'))

WebUI.waitForPageLoad(5)

//'Switch to Documentation window'
WebUI.switchToWindowTitle('Google')

WebUI.verifyTextPresent('Google', false)

WebUI.closeBrowser()

