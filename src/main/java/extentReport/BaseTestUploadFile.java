package extentReport;

import java.io.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.chromium.HasCdp;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.TestNGMethod;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.file.UnableSaveSnapshotException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import dataDriven.DataDrivenHT;
//import dataDriven.writeDataExcel;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import java.util.HashMap;
import org.testng.annotations.DataProvider;

public class BaseTestUploadFile {
	public static WebDriver driver;
	public static String screenshotsSubFolderName;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public static ExtentTest testStepExtentTest;

	DataDrivenHT d = new DataDrivenHT();

	//writeDataExcel excelWR = new writeDataExcel();

	Date date = new Date();
	String fileDate = date.toString().replace(":", "_").replace(" ", "_");

	@Parameters("browserName")
	@BeforeTest
	public void setup(ITestContext context, @Optional("chrome") String browserName)
			throws IOException, InterruptedException {
		switch (browserName.toLowerCase()) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		}

		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
		String device = capabilities.getBrowserName() + " "
				+ capabilities.getBrowserVersion().substring(0, capabilities.getBrowserVersion().indexOf("."));
		// String author = context.getCurrentXmlTest().getParameter("author");

		extentTest = extentReports.createTest(context.getName());

		// extentTest.assignAuthor(author);
		extentTest.assignDevice(device.toUpperCase());
		// extentTest.assignCategory(device);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeSuite
	public void initialiseExtentReports() {
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsToolUploadDocuments.html");
		sparkReporter_all.config().setReportName("Helps Tool: Verify File Upload");

		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter_all);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		// extentReports.setSystemInfo("Environment", "Test Environment");
		// extentReports.setSystemInfo("Environment", "Production Environment");
	}

	@AfterSuite
	public void generateExtentReports() throws Exception {
		extentReports.flush();
		// Desktop.getDesktop().browse(new File("ProviderPortalTests.html").toURI());
		// Desktop.getDesktop().browse(new File("FailedTests.html").toURI());
		// excelWR.writeIntoExcel();
	}

	@AfterMethod
	public void checkStatus(Method m, ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshotpath = null;
			screenshotpath = captureScreenshot("failTest.jpg");
			extentTest.fail(m.getName() + " has failed");
			extentTest.log(Status.FAIL, result.getThrowable(),
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
		} else if (result.getStatus() == ITestResult.SUCCESS) {

		}

		extentTest.assignCategory(m.getAnnotation(Test.class).groups());
	}

	public String captureScreenshot(String screenShotName) throws IOException {

		// Shutterbug Working Code
		Files.createDirectories(Paths.get(System.getProperty("user.dir") + "/screenshots/"));
		BufferedImage image = Shutterbug.shootPage(driver, Capture.FULL, true).getImage();
		String dest = "./screenshots/" + screenShotName;
		writeImage(image, "PNG", new File(dest));
		return dest;
	}

	public static void writeImage(BufferedImage imageFile, String extension, File fileToWriteTo) {
		try {
			ImageIO.write(imageFile, extension, fileToWriteTo);
		} catch (IOException e) {
			throw new UnableSaveSnapshotException(e);
		}
	}

	public void login() throws InterruptedException, IOException {
		// open login page
		ArrayList TS001 = d.getData("TS001", "testSteps");
		driver.get((String) TS001.get(6));
		Thread.sleep(5000);
		String log1 = (String) TS001.get(0) + " " + TS001.get(1);
		extentTest.log(Status.PASS, log1,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot((String) TS001.get(0) + fileDate + ".jpg")).build());

		// Click Login Button
		ArrayList TS002 = d.getData("TS002", "testSteps");
		WebElement loginButton = driver.findElement(By.xpath((String) TS002.get(5)));
		loginButton.click();
		String log2 = (String) TS002.get(0) + " " + TS002.get(1);
		extentTest.log(Status.PASS, log2,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log2 + fileDate + ".jpg")).build());

		// Click Welcome
		try {
			ArrayList TS018 = d.getData("TS018", "testSteps");
			WebElement welcome = driver.findElement(By.xpath((String) TS018.get(5)));
			if (welcome.isDisplayed()) {

				welcome.click();
				String log18 = (String) TS018.get(0) + " " + TS018.get(1);
				extentTest.log(Status.PASS, "Click Welcome",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log18 + fileDate + ".jpg")).build());

				// Click Sign Out
				ArrayList TS019 = d.getData("TS019", "testSteps");
				WebElement signOut = driver.findElement(By.xpath((String) TS019.get(5)));
				signOut.click();
				String log19 = (String) TS019.get(0) + " " + TS019.get(1);
				extentTest.log(Status.PASS, "Click Sign Out Button",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log19 + fileDate + ".jpg")).build());

				// Click Login Button
				ArrayList TS002A = d.getData("TS002", "testSteps");
				WebElement loginButton1 = driver.findElement(By.xpath((String) TS002A.get(5)));
				loginButton1.click();
				// String log2A = (String) TS002.get(0) + " " + TS002.get(1);
				extentTest.log(Status.PASS, log2,
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log2 + fileDate + ".jpg")).build());

				// Click Use Another Account
				ArrayList TS003A = d.getData("TS003A", "testSteps");
				WebElement useAnotherAcc = driver.findElement(By.xpath((String) TS003A.get(5)));
				useAnotherAcc.click();
				String log3A = (String) TS003A.get(0) + " " + TS003A.get(1);
				extentTest.log(Status.PASS, log3A,
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log3A + fileDate + ".jpg")).build());
			}
		} catch (Exception e) {

		}

		// enter username
		ArrayList TS003 = d.getData("TS003", "testSteps");
		WebElement userName = driver.findElement(By.xpath((String) TS003.get(5)));
		userName.sendKeys((String) TS003.get(6));
		String log3 = (String) TS003.get(0) + " " + TS003.get(1);
		extentTest.log(Status.PASS, log3,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log3 + fileDate + ".jpg")).build());

		// click Next
		ArrayList TS004 = d.getData("TS004", "testSteps");
		WebElement next = driver.findElement(By.xpath((String) TS004.get(5)));
		next.click();
		String log4 = (String) TS004.get(0) + " " + TS004.get(1);
		extentTest.log(Status.PASS, log4,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log4 + fileDate + ".jpg")).build());

		Thread.sleep(5000);
		// enter password
		ArrayList TS005 = d.getData("TS005", "testSteps");
		WebElement pwd = driver.findElement(By.xpath((String) TS005.get(5)));
		pwd.sendKeys((String) TS005.get(6));
		String log5 = (String) TS005.get(0) + " " + TS005.get(1);
		extentTest.log(Status.PASS, log5,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log5 + fileDate + ".jpg")).build());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click Signin
		ArrayList TS006 = d.getData("TS006", "testSteps");
		WebElement signIn = driver.findElement(By.xpath((String) TS006.get(5)));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", signIn);
		// signIn.click();
		System.out.println("Clicked signin button");
		Thread.sleep(5000);
		String log6 = (String) TS006.get(0) + " " + TS006.get(1);
		extentTest.log(Status.PASS, log6,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log6 + fileDate + ".jpg")).build());

		// Click Yes to "Stay Signed In?"
		try {
			ArrayList TS007 = d.getData("TS007", "testSteps");
			WebElement no = driver.findElement(By.xpath((String) TS007.get(5)));
			if (no.isDisplayed()) {

				// Click Use Another Account
				no.click();
				Thread.sleep(5000);
				String log7 = (String) TS007.get(0) + " " + TS007.get(1);
				extentTest.log(Status.PASS, log7,
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log7 + fileDate + ".jpg")).build());
			}
		} catch (Exception e) {

		}
	}

	@SuppressWarnings("rawtypes")
	public void uploadAndSubmitFile(String rowName) throws InterruptedException, IOException, AWTException {
		ArrayList listName = d.getData(rowName, "filePath");
		String fileName = (String) listName.get(0);
		ArrayList listPath = d.getData(rowName, "filePath");
		String path = System.getProperty("user.dir") + (String) listPath.get(1);

		// Click Import HCS Assessment
		ArrayList TS008 = d.getData("TS008", "testSteps");
		WebElement importBtn = driver.findElement(By.xpath((String) TS008.get(5)));
		String log8 = (String) TS008.get(0) + " " + TS008.get(1);
		extentTest.log(Status.PASS, log8,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log8 + fileName + fileDate + ".jpg")).build());

		importBtn.click();
		Thread.sleep(5000);

		// Click Choose File
		ArrayList TS009 = d.getData("TS009", "testSteps");
		// String fileName = (String) TS009.get(6);
		WebElement chooseFileBtn = driver.findElement(By.xpath((String) TS009.get(5)));
		String log9 = (String) TS009.get(0) + " " + TS009.get(1);
		extentTest.log(Status.PASS, log9,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log9 + fileName + fileDate + ".jpg")).build());

		// log Upload File
		ArrayList TS010 = d.getData("TS010", "testSteps");
		// String path= (String) TS010.get(6);
		String log10 = (String) TS010.get(0) + " " + TS010.get(1);
		extentTest.log(Status.PASS, log10 + " : " + fileName,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log10 + fileName + fileDate + ".jpg")).build());
		chooseFileBtn.sendKeys(path);

		// Click Submit File
		ArrayList TS011 = d.getData("TS011", "testSteps");
		WebElement submitBtn = driver.findElement(By.xpath((String) TS011.get(5)));
		submitBtn.click();
		String log11 = (String) TS011.get(0) + " " + TS011.get(1);
		extentTest.log(Status.PASS, log11 + " : " + fileName,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log11 + fileName + fileDate + ".jpg")).build());

		Thread.sleep(5000);

	}

	// Verify field data
	public void signatureAndLogout() throws InterruptedException, IOException, AWTException {
		String sheetName = "testSteps";
		// Add a Signature into the Nurse Signature Box
		ArrayList TS012 = d.getData("TS012", sheetName);
		WebElement canvas = driver.findElement(By.xpath((String) TS012.get(5)));
		Actions builder = new Actions(driver);
		Action signature = builder.moveToElement(canvas).clickAndHold().moveByOffset(200, 50).moveByOffset(10, 0)
				.click().build();
		signature.perform();
		Thread.sleep(5000);
		String log12 = (String) TS012.get(0) + " " + TS012.get(1);
		extentTest.log(Status.PASS, log12, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log12 + sheetName + fileDate + ".jpg")).build());

		// Click Accept Signature Button
		ArrayList TS013 = d.getData("TS013", sheetName);
		WebElement acceptSign = driver.findElement(By.xpath((String) TS013.get(5)));
		acceptSign.click();
		String log13 = (String) TS013.get(0) + " " + TS013.get(1);
		extentTest.log(Status.PASS, log13, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log13 + sheetName + fileDate + ".jpg")).build());

		// Click Clear Signature Button
		ArrayList TS014 = d.getData("TS014", sheetName);
		WebElement clearSign = driver.findElement(By.xpath((String) TS014.get(5)));
		clearSign.click();
		Thread.sleep(5000);
		String log14 = (String) TS014.get(0) + " " + TS014.get(1);
		extentTest.log(Status.PASS, log14, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log14 + sheetName + fileDate + ".jpg")).build());

		// Add a Signature into the Nurse Signature Box
		ArrayList TS015 = d.getData("TS015", sheetName);
		WebElement canvas1 = driver.findElement(By.xpath((String) TS015.get(5)));
		Action signature1 = builder.moveToElement(canvas1).clickAndHold().moveByOffset(200, 50).moveByOffset(10, 0)
				.click().build();
		signature1.perform();
		Thread.sleep(5000);
		String log15 = (String) TS015.get(0) + " " + TS015.get(1);
		extentTest.log(Status.PASS, log15, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log15 + sheetName + fileDate + ".jpg")).build());

		// Click Accept Signature Button
		ArrayList TS016 = d.getData("TS016", sheetName);
		WebElement acceptSign1 = driver.findElement(By.xpath((String) TS016.get(5)));
		acceptSign1.click();
		String log16 = (String) TS016.get(0) + " " + TS016.get(1);
		extentTest.log(Status.PASS, log16, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log16 + sheetName + fileDate + ".jpg")).build());

		// Click the Complete Assessment Button
		ArrayList TS017 = d.getData("TS017", sheetName);
		WebElement completeAssessment = driver.findElement(By.xpath((String) TS017.get(5)));
		completeAssessment.click();
		String log17 = (String) TS017.get(0) + " " + TS017.get(1);
		extentTest.log(Status.PASS, log17, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log17 + sheetName + fileDate + ".jpg")).build());

		// Click Welcome
		ArrayList TS018 = d.getData("TS018", sheetName);
		WebElement welcome = driver.findElement(By.xpath((String) TS018.get(5)));
		welcome.click();
		String log18 = (String) TS018.get(0) + " " + TS018.get(1);
		extentTest.log(Status.PASS, log18, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log18 + sheetName + fileDate + ".jpg")).build());

		// Click Sign Out
		ArrayList TS019 = d.getData("TS019", sheetName);
		WebElement signOut = driver.findElement(By.xpath((String) TS019.get(5)));
		signOut.click();
		String log19 = (String) TS019.get(0) + " " + TS019.get(1);
		extentTest.log(Status.PASS, log19, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log19 + sheetName + fileDate + ".jpg")).build());

	}

}
