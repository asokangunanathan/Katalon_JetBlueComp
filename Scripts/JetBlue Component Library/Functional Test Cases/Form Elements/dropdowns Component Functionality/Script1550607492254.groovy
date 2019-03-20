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

'User Story: When user goes to simple-selet component page'
WebUI.comment('User Story: When user goes to dropdowns component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'form-elements/dropdown/?test')

//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))
'and scrolls down to Simple Select Example'
WebUI.comment('and scrolls down to Standard Select Example')

// and scroll down to Simple Select Example
WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Form Elements/simple-select Component Objects/Page_JetBlue  Component Library/h3_Simple Select (with min-width)'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Form Elements/simple-select Component Objects/Page_JetBlue  Component Library/simpleSelectbutton_Dropdown title'), 
    10)

// and selects each listItem in the simple select dropdown then Simple Dropdown Value should change to the listItem
// then the Simple Dropdown value should change to the selected listItem Value
WebUI.verifyTextPresent('Dropdown title', false)

'and then selects each listItem in the simple select dropdown then Simple Dropdown Value should change to the listItem'
WebUI.comment('and then selects each listItem in the standard select dropdown then Simple Dropdown Value should change to the listItem')

'then the Simple Dropdown value should change to the selected list Item Value'
WebUI.comment('then the Standard select Dropdown value should change to the selected listItem Value')

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/simple-select Component Objects/Page_JetBlue  Component Library/button_Dropdown title chevron'))

for (def index : (1..9)) {
    WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/simple-select Component Objects/Page_JetBlue  Component Library/jb-copy_Item ' + 
            index))

    //WebUI.verifyTextPresent("Simple Dropdown Value: " + index, false)
    WebUI.click(findTestObject(('JetBlue Component Library Objects/Form Elements/simple-select Component Objects/Page_JetBlue  Component Library/button_Item ' + 
            index) + ' chevron'))
}

WebUI.click(findTestObject('JetBlue Component Library Objects/Form Elements/simple-select Component Objects/Page_JetBlue  Component Library/button_Dropdown title chevron'))

WebUI.verifyTextPresent('Standard Dropdown Value: 1', false)

WebUI.closeBrowser()

