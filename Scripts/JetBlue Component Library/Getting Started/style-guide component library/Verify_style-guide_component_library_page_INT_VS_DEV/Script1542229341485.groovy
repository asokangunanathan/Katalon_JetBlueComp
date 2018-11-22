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

// take screenshot of entire web page
// resolve file name under the target directory
// get diff%
// ---------------------------------------------------------------------------------
WebUI.openBrowser('')
//WebUI.maximizeWindow()
WebUI.setViewPortSize(1024, 768)

// component name
def componentName = 'style-guide'

// define environments
def originalUrl = GlobalVariable.intEnvURL + componentName
def mimicUrl = GlobalVariable.devEnvURL + componentName

// Take screenshot of componenent page on integration environment

WebUI.navigateToUrl(originalUrl)
//WebUI.click(findTestObject('Object Repository/JetBlue/Misc/Page_JetBlue  Component Library/button_T'))

WebUI.click(findTestObject('JetBlue/Misc/Page_JetBlue  Component Library/button_G'))

File original = resolveScreenshotFile("$componentName" + '_expected_component_page.png' //****** Variable ****
    )

WebUI.comment('just a comment')

takeEntirePage(DriverFactory.getWebDriver(), original, 500)

WebUI.comment(">>> wrote the integration environment component page image into ${original.toString()}")

// Take screenshot of component page on development environment
//def mimicUrl = 'https://dev.b6orgeng.net/component-library/' + componentName //****** Variable ****

WebUI.navigateToUrl(mimicUrl)
WebUI.click(findTestObject('Object Repository/JetBlue/Misc/Page_JetBlue  Component Library/button_T'))
WebUI.click(findTestObject('JetBlue/Misc/Page_JetBlue  Component Library/button_G'))

File mimic = resolveScreenshotFile("$componentName" + '_actual_component_page.png' //****** Variable ****
    )

takeEntirePage(DriverFactory.getWebDriver(), mimic, 500)

WebUI.comment(">>> wrote the development environment component page image into ${mimic.toString()}")

// make ImageDiff of integration vs development environment
BufferedImage expectedImage = ImageIO.read(original)

BufferedImage actualImage = ImageIO.read(mimic)

Screenshot expectedScreenshot = new Screenshot(expectedImage)

Screenshot actualScreenshot = new Screenshot(actualImage)

ImageDiff diff = new ImageDiffer().makeDiff(expectedScreenshot, actualScreenshot)

BufferedImage markedImage = diff.getMarkedImage()

DecimalFormat dformat = new DecimalFormat('##0.00')

// check how much difference was found between the integration and development environments
// if diff% exceed the criteria, then mark the test case as FAILED
//Double criteriaPercent = 3.0
Double criteriaPercent = Double.parseDouble(GlobalVariable.acceptCriteria )
Double diffRatioPercent = diffRatioPercent(diff)
if (diffRatioPercent > criteriaPercent) {
	KeywordUtil.markFailed("diffRatio=${dformat.format(diffRatioPercent)} exceeds criteria=${criteriaPercent}")
}

// save the diff image into file
File diffFile = resolveScreenshotFile("$componentName"+"_component_imageDiff(${dformat.format(diffRatioPercent)}).png")    //****** Variable ****
ImageIO.write(markedImage, "PNG", diffFile)
WebUI.comment(">>> wrote the ImageDiff into ${diffFile.toString()}")

WebUI.closeBrowser()

void takeEntirePage(WebDriver webDriver, File file, Integer timeout = 300) {
    //Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(timeout)).takeScreenshot(webDriver)
	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportRetina(100, 0, 0, 2)).takeScreenshot(webDriver)

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

