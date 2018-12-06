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
// User Story: When user goes to simple-selet component page
    WebUI.navigateToUrl(GlobalVariable.envURL1 + 'simple-select/')
// and scroll down to Simple Select Example
    WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/simple-select Component Objects/Page_JetBlue  Component Library/h3_Simple Select'), 
        10)

    WebUI.verifyElementText(findTestObject('JetBlue Component Library Objects/simple-select Component Objects/Page_JetBlue  Component Library/strong_Simple Dropdown Value'), 
        'Simple Dropdown Value:')
// and selects each listItem in the simple select dropdown then Simple Dropdown Value should change to the listItem
    WebUI.verifyTextPresent('Dropdown title', false)
	for (def index : (1..9)) {
	
		WebUI.click(findTestObject('Object Repository/JetBlue Component Library Objects/simple-select Component Objects/Page_JetBlue  Component Library/list_button'))
		
		WebUI.click(findTestObject('JetBlue Component Library Objects/simple-select Component Objects/Page_JetBlue  Component Library/jb-copy_Item ' + 
            index), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/JetBlue Component Library Objects/simple-select Component Objects/Page_JetBlue  Component Library/h3_Simple Select'))

		WebUI.verifyTextPresent('Simple Dropdown Value: ' + index, false)

		WebUI.verifyTextNotPresent('Dropdown title', false)
    
	}
	WebUI.closeBrowser()
