package extentReport;

import java.io.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.file.UnableSaveSnapshotException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import dataDriven.DataDrivenHT;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestDD {
	public static WebDriver driver;
	public static String screenshotsSubFolderName;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public static ExtentTest testStepExtentTest;

	DataDrivenHT d = new DataDrivenHT();

	@BeforeSuite
	public void initialiseExtentReports() {
		// ALL
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsToolDropdown.html");
		sparkReporter_all.config().setReportName("Helps Tool: Verify Dropdown Option Values");

		// UAS
//		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsToolUASDropdown.html");
//		sparkReporter_all.config().setReportName("Helps Tool: Verify UAS Assessment Details Dropdown Option Values");

		// IADL
//		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsToolIADLDropdown.html");
//		sparkReporter_all.config().setReportName("Helps Tool: Verify IADL - Capacity Dropdown Option Values");

		// ADL
// 		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsADLDropdown.html");
//		sparkReporter_all.config().setReportName("Helps Tool: Verify ADL - Self Performance Option Values");	
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter_all);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		extentReports.setSystemInfo("Environment", "Test Environment");
		// extentReports.setSystemInfo("Environment", "Production Environment");
	}

	@AfterSuite
	public void generateExtentReports() throws Exception {
		extentReports.flush();
	}

	@BeforeMethod
	public void intiDriver(ITestContext context) throws IOException, InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		extentTest = extentReports.createTest(context.getName());

	}

	@AfterMethod
	public void checkStatus(Method m, ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshotpath = null;
			screenshotpath = captureScreenshot("failTest.jpg");
			extentTest.fail(m.getName() + " has failed");
			extentTest.log(Status.FAIL, result.getThrowable(),
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());

		}
		if (result.getStatus() == ITestResult.SKIP) {

			String screenshotpath = null;
			screenshotpath = captureScreenshot("skipTest.jpg");
			extentTest.skip(m.getName() + " has skipped");
			extentTest.log(Status.SKIP, result.getThrowable(),
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());

		}

		else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " has passed");
		}

		extentTest.assignCategory(m.getAnnotation(Test.class).groups());
		driver.quit();
	}

	// LOGIN
	public void login() throws IOException, InterruptedException {
		// Open Login Page
		ArrayList LI001 = d.getData("LI001", "beforeTest");
		driver.get((String) LI001.get(6));
		Thread.sleep(3000);
		String log1 = (String) LI001.get(0) + " " + LI001.get(1);
		extentTest.log(Status.PASS, log1,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log1 + ".jpg")).build());

		// Click Login Button
		ArrayList LI002 = d.getData("LI002", "beforeTest");
		WebElement loginButton = driver.findElement(By.xpath((String) LI002.get(5)));
		loginButton.click();
		Thread.sleep(3000);
		String log2 = (String) LI002.get(0) + " " + LI002.get(1);
		extentTest.log(Status.PASS, log2,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log2 + ".jpg")).build());

		// Enter Username
		Thread.sleep(3000);
		ArrayList LI003 = d.getData("LI003", "beforeTest");
		WebElement userName = driver.findElement(By.xpath((String) LI003.get(5)));
		userName.sendKeys((String) LI003.get(6));
		String log3 = (String) LI003.get(0) + " " + LI003.get(1);
		extentTest.log(Status.PASS, log3,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log3 + ".jpg")).build());

		// Click Next
		ArrayList LI004 = d.getData("LI004", "beforeTest");
		WebElement next = driver.findElement(By.xpath((String) LI004.get(5)));
		next.click();
		String log4 = (String) LI004.get(0) + " " + LI004.get(1);
		extentTest.log(Status.PASS, log4,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log4 + ".jpg")).build());

		Thread.sleep(5000);
		// Enter Password
		ArrayList LI005 = d.getData("LI005", "beforeTest");
		WebElement pwd = driver.findElement(By.xpath((String) LI005.get(5)));
		pwd.sendKeys((String) LI005.get(6));
		String log5 = (String) LI005.get(0) + " " + LI005.get(1);
		extentTest.log(Status.PASS, log5,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log5 + ".jpg")).build());

		// Click Signin
		ArrayList LI006 = d.getData("LI006", "beforeTest");
		WebElement signIn = driver.findElement(By.xpath((String) LI006.get(5)));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", signIn);
		// signIn.click();
		System.out.println("Clicked signin button");
		Thread.sleep(5000);
		String log6 = (String) LI006.get(0) + " " + LI006.get(1);
		extentTest.log(Status.PASS, log6,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log6 + ".jpg")).build());

		// Click Yes to "Stay Signed In?"
		ArrayList LI007 = d.getData("LI007", "beforeTest");
		WebElement no = driver.findElement(By.xpath((String) LI007.get(6)));
		no.click();
		Thread.sleep(3000);
		String log7 = (String) LI007.get(0) + " " + LI007.get(1);
		extentTest.log(Status.PASS, log7,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log7 + ".jpg")).build());
	}

	// UPLOAD FILE
	public void uploadFile() throws IOException, InterruptedException, AWTException {
		// UPLOAD FILE
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);

		// Click Import HCS Assessment
		ArrayList UF001 = d.getData("UF001", "beforeTest");
		WebElement importBtn = driver.findElement(By.xpath((String) UF001.get(5)));
		String log8 = (String) UF001.get(0) + " " + UF001.get(1);
		extentTest.log(Status.PASS, log8,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log8 + fileName + ".jpg")).build());
		importBtn.click();
		Thread.sleep(3000);

		// Click Choose File
		ArrayList UF002 = d.getData("UF002", "beforeTest");
		// String fileName = (String) UF002.get(6);
		WebElement chooseFileBtn = driver.findElement(By.xpath((String) UF002.get(5)));
		String log9 = (String) UF002.get(0) + " " + UF002.get(1);
		extentTest.log(Status.PASS, (String) UF002.get(0) + " Choose File: " + fileName,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log9 + fileName + ".jpg")).build());

		// Log Upload File
		ArrayList UF003 = d.getData("UF003", "beforeTest");
		// String path= (String) UF003.get(6);
		String log10 = (String) UF003.get(0) + " " + UF003.get(1);
		extentTest.log(Status.PASS, (String) UF003.get(0) + " " + UF003.get(1) + " " + fileName,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log10 + fileName + ".jpg")).build());

		Actions builder = new Actions(driver);
		builder.moveToElement(chooseFileBtn).click().build().perform();

		// Upload Function
		Thread.sleep(3000);
		Robot rb = new Robot();
		StringSelection str = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(3000);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		// Click Submit File
		ArrayList UF004 = d.getData("UF004", "beforeTest");
		WebElement submitBtn = driver.findElement(By.xpath((String) UF004.get(5)));
		submitBtn.click();
		String log11 = (String) UF004.get(0) + " " + UF004.get(1);
		extentTest.log(Status.PASS, (String) UF004.get(0) + " Submit File: " + fileName,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log11 + fileName + ".jpg")).build());

		Thread.sleep(5000);

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

	public void clickDropdown(String rowNameDD) throws IOException, InterruptedException {
		// Click dropdown
		ArrayList<String> listDD = d.getData(rowNameDD, "TC01");
		WebElement dropdown = driver.findElement(By.xpath((String) listDD.get(7)));
		Thread.sleep(3000);
		dropdown.click();

		extentTest.log(Status.PASS, (String) listDD.get(3), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot((String) listDD.get(0) + ".jpg")).build());
	}

	public void selectOption(String rowName) throws IOException, InterruptedException {
		ArrayList<String> list = d.getData(rowName, "TC01");
		WebElement selectOption = driver.findElement(By.xpath((String) list.get(7)));
		selectOption.click();
		Thread.sleep(3000);
		extentTest.log(Status.PASS, (String) list.get(3),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(rowName + ".jpg")).build());
	}

	public void signatureAndLogout(String sheetName, String ssID) throws InterruptedException, IOException {

		// Click Final Recommendation Menu
		ArrayList AT001 = d.getData("AT001", sheetName);
		WebElement finalRecMenu = driver.findElement(By.xpath((String) AT001.get(6)));
		finalRecMenu.click();
		extentTest.log(Status.PASS, (String) AT001.get(2),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("Final Rec" + ssID + ".jpg")).build());
		Thread.sleep(3000);

		// Add a Signature into the Nurse Signature Box
		ArrayList AT002 = d.getData("AT002", sheetName);
		WebElement canvas = driver.findElement(By.xpath((String) AT002.get(6)));
		Actions builder = new Actions(driver);
		Action signature = builder.moveToElement(canvas).clickAndHold().moveByOffset(200, 50).moveByOffset(10, 0)
				.click().build();
		signature.perform();
		extentTest.log(Status.PASS, (String) AT002.get(2),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT002" + ssID + ".jpg")).build());

		// Click Accept Signature Button
		ArrayList AT003 = d.getData("AT003", sheetName);
		WebElement acceptSign = driver.findElement(By.xpath((String) AT003.get(6)));
		acceptSign.click();
		extentTest.log(Status.PASS, (String) AT003.get(2),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT003" + ssID + ".jpg")).build());

//		// Click Clear Signature Button
//		ArrayList AT004 = d.getData("AT004", sheetName);
//		WebElement clearSign = driver.findElement(By.xpath((String) AT004.get(6)));
//		clearSign.click();
//		Thread.sleep(5000);
//		extentTest.log(Status.PASS, (String) AT004.get(2),
//				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT004" + ssID + ".jpg")).build());
//
//		// Add a Signature into the Nurse Signature Box
//		ArrayList AT005 = d.getData("AT005", sheetName);
//		// WebElement canvas1 = driver.findElement(By.xpath((String) AT005.get(6)));
//		// Action signature1 =
//		// builder.moveToElement(canvas).clickAndHold().moveByOffset(200,
//		// 50).moveByOffset(10, 0)
//		// .click().build();
//		signature.perform();
//		Thread.sleep(5000);
//		extentTest.log(Status.PASS, (String) AT005.get(2),
//				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT005" + ssID + ".jpg")).build());
//
//		// Click Accept Signature Button
//		ArrayList AT006 = d.getData("AT006", sheetName);
//		WebElement acceptSign1 = driver.findElement(By.xpath((String) AT006.get(6)));
//		acceptSign.click();
//		String log65 = (String) AT006.get(0) + " " + AT006.get(2);
//		extentTest.log(Status.PASS, (String) AT006.get(2),
//				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT006" + ssID + ".jpg")).build());

		Thread.sleep(5000);
		// Click the Complete Assessment Button
		ArrayList AT007 = d.getData("AT007", sheetName);
		WebElement completeAssessment = driver.findElement(By.xpath((String) AT007.get(6)));
		completeAssessment.click();
		extentTest.log(Status.PASS, (String) AT007.get(2),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT007" + ssID + ".jpg")).build());

		// Click Welcome
		ArrayList AT008 = d.getData("AT008", sheetName);
		WebElement welcome = driver.findElement(By.xpath((String) AT008.get(6)));
		welcome.click();
		extentTest.log(Status.PASS, (String) AT008.get(2),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT008" + ssID + ".jpg")).build());

		// Click Sign Out
		ArrayList AT009 = d.getData("AT009", sheetName);
		WebElement signOut = driver.findElement(By.xpath((String) AT009.get(6)));
		signOut.click();
		Thread.sleep(5000);
		extentTest.log(Status.PASS, (String) AT009.get(2),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("AT009" + ssID + ".jpg")).build());
	}

}
