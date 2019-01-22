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

// take screenshot of entire web page
// resolve file name under the target directory
// get diff%
// ---------------------------------------------------------------------------------
WebUI.openBrowser('')

WebUI.maximizeWindow()

//WebUI.setViewPortSize(1024, 768)
// direct link to componenent page
def expectedComponentURL = (GlobalVariable.envURL2 + componentLocation) + componentName

def actualComponentURL = (GlobalVariable.envURL1 + componentLocation) + componentName +"?test"

def browserName = DriverFactory.getExecutedBrowser().getName()

// Take screenshot of expected componenent page
KeywordLogger log = new KeywordLogger()

log.logInfo('Component Name: ' + componentName)

log.logInfo('expected URL: ' + expectedComponentURL)

log.logInfo('actual URL: ' + actualComponentURL)

WebUI.navigateToUrl(expectedComponentURL)

WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/button_G'))

// Verify all Links on page
//WebUI.verifyAllLinksOnCurrentPageAccessible(true, [])
File expectedFile = resolveScreenshotFile((("$browserName" + '_') + "$componentName") + '_expected_component_page.png' //****** Variable ****
    )

//WebUI.comment('just a comment')
takeEntirePage(DriverFactory.getWebDriver(), expectedFile, 500)

WebUI.comment(">>> wrote the expected component page image into ${expectedFile.toString()}")

// Take screenshot of actual component page
WebUI.navigateToUrl(actualComponentURL)

//WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/Test_Flag_Button'))

WebUI.click(findTestObject('JetBlue Component Library Objects/Misc/Page_JetBlue  Component Library/button_G'))

File actualFile = resolveScreenshotFile((("$browserName" + '_') + "$componentName") + '_actual_component_page.png' //****** Variable ****
    )

takeEntirePage(DriverFactory.getWebDriver(), actualFile, 500)

WebUI.comment(">>> wrote the actual component page image into ${actualFile.toString()}")

// make ImageDiff of integration vs development environment
BufferedImage expectedImage = ImageIO.read(expectedFile)

BufferedImage actualImage = ImageIO.read(actualFile)

Screenshot expectedScreenshot = new Screenshot(expectedImage)

Screenshot actualScreenshot = new Screenshot(actualImage)

ImageDiff diff = new ImageDiffer().makeDiff(expectedScreenshot, actualScreenshot)

BufferedImage markedImage = diff.getMarkedImage()

DecimalFormat dformat = new DecimalFormat('##0.00')

// check how much difference was found between the integration and development environments
// if diff% exceed the criteria, then mark the test case as FAILED
//Double criteriaPercent = 3.0
//Double criteriaPercent = Double.parseDouble(GlobalVariable.acceptCriteria )
Double criteriaPercent = Double.parseDouble(acceptableDiff)

Double diffRatioPercent = diffRatioPercent(diff)

if (diffRatioPercent > criteriaPercent) {
    KeywordUtil.markFailed("diffRatio=${dformat.format(diffRatioPercent)} exceeds criteria=${criteriaPercent}")
}

// save the diff image into file
File diffFile = resolveScreenshotFile((("$browserName" + '_') + "$componentName") + "_component_imageDiff(${dformat.format(diffRatioPercent)}).png" //****** Variable ****
    )

ImageIO.write(markedImage, 'PNG', diffFile)

WebUI.comment(">>> wrote the ImageDiff into ${diffFile.toString()}")

WebUI.closeBrowser() //Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(timeout)).takeScreenshot(webDriver)

void takeEntirePage(WebDriver webDriver, File file, Integer timeout = 300) {
    Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportRetina(100, 0, 0, 2)).takeScreenshot(
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

