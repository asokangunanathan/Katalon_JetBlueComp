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

WebUI.setViewPortSize(GlobalVariable.viewPortWidth, GlobalVariable.viewPortHeight)

'User Story: When user goes to tabs component page'
WebUI.comment('User Story: When user goes to tabs component page')

// User Story: When user goes to tabs component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'tabs/?test')

// and scrolls down to Tabbed Navigation (Text Only) Example
'and scrolls down to Tabbed Navigation (Text Only) Example'
WebUI.comment('and scrolls down to Tabbed Navigation (Text Only) Example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/h3_Tabbed Navigation (Text Only)'), 
    10)

// and selects each Tab in the Tabbed Navigation (Text Only) Component then the correct content should display within tab
'and selects each Tab in the Tabbed Navigation (Text Only) Component then the correct content should display within tab'
WebUI.comment('and selects each Tab in the Tabbed Navigation (Text Only) Component then the correct content should display within tab')

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -span_Item One'), 
    10)

for (def index : (1..3)) {
    if (index == 1) {
        WebUI.click(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -span_Item One'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementNotPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -h2_Item Two'), 
            5)

        WebUI.verifyElementNotPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -h2_Item Three'), 
            5)

        WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -span_Item One'), 
            5)
    }
    
    if (index == 2) {
        WebUI.click(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -span_Item Two'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementNotPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -h2_Item One'), 
            5)

        WebUI.verifyElementNotPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -h2_Item Three'), 
            5)

        WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -span_Item Two'), 
            5)
    }
    
    if (index == 3) {
        WebUI.click(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -span_Item Three'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementNotPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -h2_Item Two'), 
            5)

        WebUI.verifyElementNotPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -h2_Item One'), 
            5)

        WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Interactive/tabs Component Objects/Page_JetBlue  Component Library/Tabbed Nav Text Only -span_Item Three'), 
            5)
    }
}

WebUI.closeBrowser()

