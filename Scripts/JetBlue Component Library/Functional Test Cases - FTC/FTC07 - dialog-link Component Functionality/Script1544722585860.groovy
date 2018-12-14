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

WebUI.comment('User Story:  When I access the dialog-link component page and scroll to Dialog Link Example')

WebUI.navigateToUrl(GlobalVariable.envURL1 + 'links/dialog-link/')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/dialog-link Component Objects/Page_JetBlue  Component Library/h3_Dialog Link'), 
    10)

WebUI.comment('then I should be able to see the Dialog Link example')

WebUI.comment('When I click on See restrictions link then then a dialog should popup with text "Lorem Ipsum Consequuntur"')

WebUI.click(findTestObject('JetBlue Component Library Objects/dialog-link Component Objects/Page_JetBlue  Component Library/button_See restrictions'))

WebUI.verifyTextPresent('Lorem Ipsum Consequuntur', false)


WebUI.back()

WebUI.closeBrowser()



