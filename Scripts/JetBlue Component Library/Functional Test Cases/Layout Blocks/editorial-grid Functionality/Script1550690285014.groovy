import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.image.BufferedImage as BufferedImage
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import javax.imageio.ImageIO as ImageIO
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import ru.yandex.qatools.ashot.AShot as AShot
import ru.yandex.qatools.ashot.Screenshot as Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff as ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer as ImageDiffer
import ru.yandex.qatools.ashot.shooting.ShootingStrategies as ShootingStrategies
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.text.DecimalFormat as DecimalFormat
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

//Default Ashot parameters (Default for Desktop)
int scrollTimeout = 100
int header = 0
int footer = 0
float dpr = 2

// ---------------------------------------------------------------------------------
WebUI.openBrowser('')
def browserName = DriverFactory.getExecutedBrowser().getName()
if (browserName == 'IOS_DRIVER'){
	//Ashot parameters if Browser is on IOS:
	scrollTimeout = 500
	header=69
	footer=0
	dpr=2
}
// Maximize browser if not running on mobile
if (browserName != 'IOS_DRIVER'){
	WebUI.maximizeWindow()
}

// Build the URL for componenent pages
def expectedComponentURL = (GlobalVariable.envURL2 + componentLocation) + componentName +"?test"
def actualComponentURL = (GlobalVariable.envURL1 + componentLocation) + componentName +"?test"
KeywordLogger log = new KeywordLogger()
log.logInfo('Component Name: ' + componentName)
log.logInfo('expected URL: ' + expectedComponentURL)
log.logInfo('actual URL: ' + actualComponentURL)

// Navigate to expected Component URL page and take screen capture and save file in Screenshots directory with
// filename being browserName+componentName+expected_component_page.png
WebUI.navigateToUrl(expectedComponentURL)
//
'and scrolls to example "Editorial Grid"'
WebUI.comment('and scrolls to example "Editorial Grid"')

'then the user should see the "Editorial Grid" example'
WebUI.comment('then the user should see the "Editorial Grid" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/editorial-grid Objects/Page_JetBlue  Component Library/div_Editorial Grid  View in Co'),
	10)

'When the user calendar list button in the weather gird item then it should expand with months listed'
WebUI.comment('When I click on the calendar list button in the weather gird item then it should expand with months listed')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/editorial-grid Objects/Page_JetBlue  Component Library/button_toListMonths'))

WebUI.waitForPageLoad(5)
//
File expectedFile = resolveScreenshotFile((("$browserName" + '_') + "$componentName") + '_expected_calendar_list.png' //****** Variable ****
	)
takeEntirePage(DriverFactory.getWebDriver(), expectedFile, 500, scrollTimeout, header, footer, dpr)
WebUI.comment(">>> wrote the expected calendar list image into ${expectedFile.toString()}")

// Navigate to actual Component URL page and take screen capture and save file in Screenshots directory with
// filename being browserName+componentName+actual_component_page.png
WebUI.navigateToUrl(actualComponentURL)
//
'and scrolls to example "Editorial Grid"'
WebUI.comment('and scrolls to example "Editorial Grid"')

'then the user should see the "Editorial Grid" example'
WebUI.comment('then the user should see the "Editorial Grid" example')

WebUI.scrollToElement(findTestObject('JetBlue Component Library Objects/Layout Blocks/editorial-grid Objects/Page_JetBlue  Component Library/div_Editorial Grid  View in Co'),
	10)

'When the user calendar list button in the weather gird item then it should expand with months listed'
WebUI.comment('When I click on the calendar list button in the weather gird item then it should expand with months listed')

WebUI.click(findTestObject('JetBlue Component Library Objects/Layout Blocks/editorial-grid Objects/Page_JetBlue  Component Library/button_toListMonths'))

WebUI.waitForPageLoad(5)
//
File actualFile = resolveScreenshotFile((("$browserName" + '_') + "$componentName") + '_actual_calendar_list.png' //****** Variable ****
	)
takeEntirePage(DriverFactory.getWebDriver(), actualFile, 500, scrollTimeout, header, footer, dpr)
WebUI.comment(">>> wrote the actual calendar list image into ${actualFile.toString()}")

// Load both actual and expected image files into buffer and compare the two files using ImageDiff
 
BufferedImage expectedImage = ImageIO.read(expectedFile)
BufferedImage actualImage = ImageIO.read(actualFile)

Screenshot expectedScreenshot = new Screenshot(expectedImage)
Screenshot actualScreenshot = new Screenshot(actualImage)

ImageDiff diff = new ImageDiffer().makeDiff(expectedScreenshot, actualScreenshot)

BufferedImage markedImage = diff.getMarkedImage()
// Check how much difference was found between the two files and
// if diff% exceed the acceptable diff criteria, then mark the test case as FAILED

DecimalFormat dformat = new DecimalFormat('##0.00')
Double criteriaPercent = Double.parseDouble(acceptableDiff)
Double diffRatioPercent = diffRatioPercent(diff)
if (diffRatioPercent > criteriaPercent) {
	KeywordUtil.markFailed("diffRatio=${dformat.format(diffRatioPercent)} exceeds criteria=${criteriaPercent}")
}

// save the diff image as a .png file in Screenshots folder with name that identifies browserName, componentName, difference percentage
File diffFile = resolveScreenshotFile((("$browserName" + '_') + "$componentName") + "_calendar_list_imageDiff(${dformat.format(diffRatioPercent)}).png" //****** Variable ****
	)
ImageIO.write(markedImage, 'PNG', diffFile)
WebUI.comment(">>> wrote the ImageDiff into ${diffFile.toString()}")

WebUI.closeBrowser() 

void takeEntirePage(WebDriver webDriver, File file, Integer timeout = 300, scrollTimeout, header, footer, dpr) {
	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportRetina(scrollTimeout, header, footer, dpr)).takeScreenshot(
		webDriver)

	ImageIO.write(screenshot.getImage(), 'PNG', file)
}

File resolveScreenshotFile(String fileName) {
	Path projectDir = Paths.get(RunConfiguration.getProjectDir())

	Path reportDir = projectDir.resolve('Screenshots')

	Files.createDirectories(reportDir)

	Path pngFile = reportDir.resolve(fileName)

	return pngFile.toFile()
}

Double diffRatioPercent(ImageDiff diff) {
	boolean hasDiff = diff.hasDiff()

	if (!(hasDiff)) {
		return 0.0
	}
	
	int diffSize = diff.getDiffSize()

	int area = diff.getMarkedImage().getWidth() * diff.getMarkedImage().getHeight()

	Double diffRatio = (diff.getDiffSize() / area) * 100

	return diffRatio
}


