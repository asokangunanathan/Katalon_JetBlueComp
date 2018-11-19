import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.image.BufferedImage
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

import javax.imageio.ImageIO

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer
import ru.yandex.qatools.ashot.shooting.ShootingStrategies
import com.kms.katalon.core.util.KeywordUtil
import java.text.DecimalFormat

// take screenshot of entire web page
void takeEntirePage(WebDriver webDriver, File file, Integer timeout = 300) {
	Screenshot screenshot = new AShot().
			shootingStrategy(ShootingStrategies.viewportPasting(timeout)).
			takeScreenshot(webDriver)
	ImageIO.write(screenshot.getImage(), "PNG", file)
}

// resolve file name under the target directory
File resolveScreenshotFile(String fileName) {
	Path projectDir = Paths.get(RunConfiguration.getProjectDir())
	Path reportDir = projectDir.resolve('Screenshots')
	Files.createDirectories(reportDir)
	Path pngFile = reportDir.resolve(fileName)
	return pngFile.toFile()
}

// get diff%
Double diffRatioPercent(ImageDiff diff) {
	boolean hasDiff = diff.hasDiff()
	if (!hasDiff) {
		return 0.0
	}
	int diffSize = diff.getDiffSize()
	int area = diff.getMarkedImage().getWidth() * diff.getMarkedImage().getHeight()
	Double diffRatio = diff.getDiffSize() / area * 100
	return diffRatio	
}

// ---------------------------------------------------------------------------------

WebUI.openBrowser('')
WebUI.setViewPortSize(1024, 768)

// component name
def componentName = "flag"

// Take screenshot of component page on integration environment
def originalUrl = 'https://int.b6orgeng.net/component-library/'+componentName    //****** Variable ****
WebUI.navigateToUrl(originalUrl)
WebUI.click(findTestObject('JetBlue/Misc/Page_JetBlue  Component Library/button_G'))
File original = resolveScreenshotFile("$componentName"+'_expected_component_page.png')  //****** Variable ****
takeEntirePage(DriverFactory.getWebDriver(), original, 500)
WebUI.comment(">>> wrote the integration environment component page image into ${original.toString()}")

// Take screenshot of component page on development environment
def mimicUrl = 'https://dev.b6orgeng.net/component-library/'+componentName    //****** Variable ****
WebUI.navigateToUrl(mimicUrl)
WebUI.click(findTestObject('JetBlue/Misc/Page_JetBlue  Component Library/button_G'))
File mimic = resolveScreenshotFile("$componentName"+'_actual_component_page.png')   //****** Variable ****
takeEntirePage(DriverFactory.getWebDriver(), mimic, 500)
WebUI.comment(">>> wrote the development environment component page image into ${mimic.toString()}")

// make ImageDiff of integration vs development environment
BufferedImage expectedImage = ImageIO.read(original)
BufferedImage actualImage   = ImageIO.read(mimic)
Screenshot expectedScreenshot = new Screenshot(expectedImage)
Screenshot actualScreenshot = new Screenshot(actualImage)
ImageDiff diff = new ImageDiffer().makeDiff(expectedScreenshot, actualScreenshot)
BufferedImage markedImage = diff.getMarkedImage()

DecimalFormat dformat = new DecimalFormat("##0.00")

// check how much difference was found between the integration and development environments
// if diff% exceed the criteria, then mark the test case as FAILED
//Double criteriaPercent = 3.0
Double criteriaPercent = Double.parseDouble(GlobalVariable.acceptCriteria)
Double diffRatioPercent = diffRatioPercent(diff)
if (diffRatioPercent > criteriaPercent) {
	KeywordUtil.markFailed("diffRatio=${dformat.format(diffRatioPercent)} exceeds criteria=${criteriaPercent}")
}

// save the diff image into file
File diffFile = resolveScreenshotFile("$componentName"+"_component_imageDiff(${dformat.format(diffRatioPercent)}).png")    //****** Variable ****
ImageIO.write(markedImage, "PNG", diffFile)
WebUI.comment(">>> wrote the ImageDiff into ${diffFile.toString()}")


WebUI.closeBrowser()