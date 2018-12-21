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

WebUI.comment('User Story: When user goes to product-block component page')

// User Story: When user goes to simple-selet component page
WebUI.navigateToUrl(GlobalVariable.envURL1 + 'product-block')

WebUI.comment('and scrolls to example "Product Block with all optional elements"')

WebUI.comment('then the user should see the "Grand Caymen Marriott Beach Resort)" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/h3_Product Block with all optional elements'), 
    10)

//WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/promo-block Component Objects/Page_JetBlue  Component Library/promo-block full container'), 
//   10)
WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/Product Title'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/Product Description'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/jb-copy_4-day3-night air  hote'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/dog image'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/jb-copy_from'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/jb-callout_385'), 
    10)

WebUI.verifyElementPresent(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/jb-copy_per person'), 
    10)

WebUI.comment('When I click on the Learn more link then I should be taken to google.com')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/dog image'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/Product Title'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/jb-callout_385'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/jb-copy_from'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/a_Reduced ratesGrand Cayman Ma'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/Flag - Reduced rates'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/jb-copy_per person'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Google', false)

WebUI.back()

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/product-block Objects/Page_JetBlue  Component Library/button_See restrictions'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.', 
    false)

WebUI.back()

WebUI.closeBrowser()

