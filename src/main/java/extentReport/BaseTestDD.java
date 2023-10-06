package extentReport;

import java.io.*;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
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
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import dataDriven.DataDrivenDD;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.asserts.SoftAssert;

public class BaseTestDD {
	public static WebDriver driver;
	public static String screenshotsSubFolderName;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;

	DataDrivenDD d = new DataDrivenDD();
	Date date = new Date();
	String fileDate = date.toString().replace(":", "_").replace(" ", "_");

	@AfterSuite
	public void generateExtentReports() throws Exception {
		extentReports.flush();
	}

	@Parameters("browserName")
	@BeforeMethod
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
		Markup m = MarkupHelper.createLabel(device.toUpperCase(), ExtentColor.BLUE);

		// extentTest.assignAuthor(author);
		extentTest.assignDevice(device.toUpperCase());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void checkStatus(Method m, ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.fail(m.getName() + " has failed");
			extentTest.log(Status.FAIL, result.getThrowable(), MediaEntityBuilder
					.createScreenCaptureFromPath(captureScreenshot(m.getName() + fileDate + ".jpg")).build());

		}
		if (result.getStatus() == ITestResult.SKIP) {
			extentTest.skip(m.getName() + " has skipped");
			extentTest.log(Status.SKIP, result.getThrowable(), MediaEntityBuilder
					.createScreenCaptureFromPath(captureScreenshot(m.getName() + fileDate + ".jpg")).build());
		}

		else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " has passed");
		}

		extentTest.assignCategory(m.getAnnotation(Test.class).groups());
		 driver.quit();
	}

	public void login() throws InterruptedException, IOException {
		// open login page
		ArrayList LI001 = d.getData("LI001", "beforeTest");
		driver.get((String) LI001.get(6));
		Thread.sleep(5000);
		String log1 = (String) LI001.get(0) + " " + LI001.get(1);
		extentTest.log(Status.PASS, log1,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log1 + fileDate + ".jpg")).build());

		// Click Login Button
		clickElement("LI002", "beforeTest", "Click Login Button");

		// Click Welcome
		try {
			ArrayList FR005 = d.getData("FR005", "afterTest");
			WebElement welcome = driver.findElement(By.xpath((String) FR005.get(5)));
			if (welcome.isDisplayed()) {
				// Click Welcome
				clickElement("FR005", "afterTest", "Click Welcome");

				// Click Sign Out
				clickElement("FR006", "afterTest", "Logout of default user id");

				// Click Login Button
				clickElement("LI002", "beforeTest", "Click Login Button");

				// Click Use Another Account
				clickElement("LI003A", "beforeTest", "Click Use Another Account");
			}
		} catch (Exception e) {

		}

		// enter username
		ArrayList LI003 = d.getData("LI003", "beforeTest");
		WebElement userName = driver.findElement(By.xpath((String) LI003.get(5)));
		userName.sendKeys((String) LI003.get(6));
		String log3 = (String) LI003.get(0) + " " + LI003.get(1);
		extentTest.log(Status.PASS, log3,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log3 + fileDate + ".jpg")).build());

		// Click Next
		clickElement("LI004", "beforeTest", "Click Next");

		Thread.sleep(5000);
		// enter password
		ArrayList LI005 = d.getData("LI005", "beforeTest");
		WebElement pwd = driver.findElement(By.xpath((String) LI005.get(5)));
		pwd.sendKeys((String) LI005.get(6));
		String log5 = (String) LI005.get(0) + " " + LI005.get(1);
		extentTest.log(Status.PASS, log5,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log5 + fileDate + ".jpg")).build());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click Signin
		ArrayList LI006 = d.getData("LI006", "beforeTest");
		WebElement signIn = driver.findElement(By.xpath((String) LI006.get(5)));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", signIn);
		Thread.sleep(5000);
		String log6 = (String) LI006.get(0) + " " + LI006.get(1);
		extentTest.log(Status.PASS, log6,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log6 + fileDate + ".jpg")).build());

		// Click No to "Stay Signed In?"
		try {

			ArrayList LI007 = d.getData("LI007", "beforeTest");
			WebElement no = driver.findElement(By.xpath((String) LI007.get(5)));
			if (no.isDisplayed()) {

				// Click Use Another Account
				no.click();
				System.out.println("NO is clicked");
				Thread.sleep(5000);
				String log7 = (String) LI007.get(0) + " " + LI007.get(1);
				extentTest.log(Status.PASS, log7,
						MediaEntityBuilder
								.createScreenCaptureFromPath(captureScreenshot("NoToStaySignedIn" + fileDate + ".jpg"))
								.build());
			}
		} catch (Exception e) {
			System.out.println("NO is not displayed");

		}

		assertEquals("LI008", "beforeTest");
	}

	// UPLOAD FILE
	public void uploadFile() throws IOException, InterruptedException, AWTException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		// w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

		// Click Import HCS Assessment
		clickElement("UF001", "beforeTest", "Click Import Button");

		// Choose File
		ArrayList UF002 = d.getData("UF002", "beforeTest");
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath((String) UF002.get(5))));
		String fileName = (String) UF002.get(6);
		WebElement chooseFileBtn = driver.findElement(By.xpath((String) UF002.get(5)));
		String log9 = (String) UF002.get(0) + " " + (String) UF002.get(1);
		extentTest.log(Status.PASS, log9 + ": " + fileName,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log9 + fileDate + ".jpg")).build());

		// Log Upload File
		ArrayList UF003 = d.getData("UF003", "beforeTest");
		String path = System.getProperty("user.dir") + (String) UF003.get(6);
		chooseFileBtn.sendKeys(path);
		String log10 = (String) UF003.get(0) + " " + (String) UF003.get(1);
		extentTest.log(Status.PASS, log10,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log10 + fileDate + ".jpg")).build());

		// Click Submit File
		clickElement("UF004", "beforeTest", "Click Submit");
		Thread.sleep(3000);

		// Verify Progress Bar is 97%
		assertEquals("UF005", "beforeTest");
	}

	public void signatureAndLogout(String tsID) throws InterruptedException, IOException {
		String sheetName = "afterTest";

		// Click Final Recommendation Menu
		ArrayList FR001 = d.getData("FR001", sheetName);
		WebElement finalRecMenu = driver.findElement(By.xpath((String) FR001.get(5)));
		finalRecMenu.click();
		extentTest.log(Status.PASS, (String) FR001.get(0) + " " + (String) FR001.get(1), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("Final Rec" + tsID + fileDate + ".jpg")).build());

		// Add a Signature into the Nurse Signature Box
		ArrayList FR002 = d.getData("FR002", sheetName);
		WebElement canvas = driver.findElement(By.xpath((String) FR002.get(5)));
		Actions builder = new Actions(driver);
		Action signature = builder.moveToElement(canvas).clickAndHold().moveByOffset(200, 50).moveByOffset(10, 0)
				.click().build();
		signature.perform();
		extentTest.log(Status.PASS, (String) FR002.get(0) + " " + (String) FR002.get(1), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("FR002" + tsID + fileDate + ".jpg")).build());

		// Click Accept Signature Button
		clickElement("FR003", sheetName, tsID);
		
		
		ArrayList<String> selectList = d.getData(tsID, "testSteps");
		WebElement selectOption = driver.findElement(By.xpath((String) selectList.get(7)));
		selectOption.getText();
		
		System.out.println("Option selected is -->"+selectOption.getText());
		
		if (selectOption.getText().equals("Select an option")) {
			// Verify Progress Bar is 97%
			assertEquals("FR003A", "afterTest");
			System.out.println("97% Progress Bar for: "+selectOption.getText());
			
		} else
		{
			// Verify Progress Bar is 100%
			assertEquals("FR003B", "afterTest");
			System.out.println("100% Progress Bar for: "+selectOption.getText());
			
			// Click the Complete Assessment Button
			clickElement("FR004", sheetName, tsID);
		}

		// Click Welcome
		clickElement("FR005", sheetName, tsID);
		// Click Sign Out
		clickElement("FR006", sheetName, tsID);

		System.out.println("Test Step " + tsID + " completed successfully.");
	}

	public void clickElement(String rowName, String sheetName, String tsID) throws IOException {
		// WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		// Click Element
		ArrayList list = d.getData(rowName, sheetName);
		WebElement element = driver.findElement(By.xpath((String) list.get(5)));
		element.click();

		// Log and Screenshot
		extentTest.log(Status.PASS, (String) list.get(0) + " " + (String) list.get(1), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(rowName + tsID + fileDate + ".jpg")).build());
	}

	public void clickDropdown(String tsID) throws IOException, InterruptedException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		// Click Dropdown
		ArrayList<String> listDD = d.getData(tsID, "testSteps");
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath((String) listDD.get(7))));
		WebElement dropdown = driver.findElement(By.xpath((String) listDD.get(7)));
		dropdown.click();
		extentTest.log(Status.PASS, (String) listDD.get(0) + " " + (String) listDD.get(3), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot((String) listDD.get(0) + fileDate + ".jpg")).build());
		System.out.println("Dropdown " + tsID + " clicked.");
	}

	public void selectOption(String tsID) throws IOException, InterruptedException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		ArrayList<String> list = d.getData(tsID, "testSteps");
		WebElement selectOption = driver.findElement(By.xpath((String) list.get(7)));
		selectOption.click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath((String) list.get(7))));
		extentTest.log(Status.PASS, (String) list.get(0) + " " + (String) list.get(3),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(tsID + fileDate + ".jpg")).build());
		
		String option = selectOption.getText();
		System.out.println("Option: " + tsID + option + " selected.");
		
		if (selectOption.getText().equals("Select an option")) {
			// Verify Progress Bar is 94%
			assertEquals("FR001A", "afterTest");
			System.out.println("94% Progress Bar for: "+selectOption.getText());
			
		} else
		{
			// Verify Progress Bar is 97%
			assertEquals("FR001B", "afterTest");
			System.out.println("97% Progress Bar for: "+selectOption.getText());
		}
	}

	public void assertIsDisplayed(String rowName, String sheetName) throws InterruptedException, IOException {
		ArrayList list = d.getData(rowName, sheetName);
		Assert.assertEquals(driver.findElement(By.xpath((String) list.get(5))).isDisplayed(), true);
		Thread.sleep(10000);
		extentTest.log(Status.PASS, (String) list.get(0) + " " + list.get(1), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(rowName + sheetName + fileDate + ".jpg")).build());
	}

	public void assertEquals(String rowName, String sheetName) throws InterruptedException, IOException {
		ArrayList list = d.getData(rowName, sheetName);
		WebElement element = driver.findElement(By.xpath((String) list.get(5)));
		String actualValue = element.getText();
		String expectedValue = (String) list.get(6);
		Assert.assertEquals(actualValue, expectedValue);
		Thread.sleep(10000);
		extentTest.log(Status.PASS, (String) list.get(0) + " " + (String) list.get(1) + " Actual Value: " + actualValue,
				MediaEntityBuilder.createScreenCaptureFromPath(
						captureScreenshot(rowName + sheetName + "assert" + fileDate + ".jpg")).build());
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

}
