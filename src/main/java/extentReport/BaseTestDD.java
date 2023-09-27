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
import org.openqa.selenium.support.ui.WebDriverWait;

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
		 + capabilities.getBrowserVersion().substring(0,
		 capabilities.getBrowserVersion().indexOf("."));
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
		ArrayList LI002 = d.getData("LI002", "beforeTest");
		WebElement loginButton = driver.findElement(By.xpath((String) LI002.get(5)));
		loginButton.click();
		String log2 = (String) LI002.get(0) + " " + LI002.get(1);
		extentTest.log(Status.PASS, log2,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log2 + fileDate + ".jpg")).build());

		// Click Welcome
		try {
			ArrayList FR008 = d.getData("FR008", "afterTest");
			WebElement welcome = driver.findElement(By.xpath((String) FR008.get(6)));
			if (welcome.isDisplayed()) {

				welcome.click();
				String log008 = (String) FR008.get(0) + " " + FR008.get(2);
				extentTest.log(Status.PASS, "Click Welcome", MediaEntityBuilder
						.createScreenCaptureFromPath(captureScreenshot(log008 + fileDate + ".jpg")).build());

				// Click Sign Out
				ArrayList FR009 = d.getData("FR009", "afterTest");
				WebElement signOut = driver.findElement(By.xpath((String) FR009.get(6)));
				signOut.click();
				String log009 = (String) FR009.get(0) + " " + FR009.get(2);
				extentTest.log(Status.PASS, "Click Sign Out Button", MediaEntityBuilder
						.createScreenCaptureFromPath(captureScreenshot(log009 + fileDate + ".jpg")).build());

				// Click Login Button
				ArrayList LI002A = d.getData("LI002", "beforeTest");
				WebElement loginButton1 = driver.findElement(By.xpath((String) LI002A.get(5)));
				loginButton1.click();
				// String log2A = (String) LI002.get(0) + " " + LI002.get(1);
				extentTest.log(Status.PASS, log2, MediaEntityBuilder
						.createScreenCaptureFromPath(captureScreenshot(log2 + fileDate + ".jpg")).build());

				// Click Use Another Account
				ArrayList LI003A = d.getData("LI003A", "beforeTest");
				WebElement useAnotherAcc = driver.findElement(By.xpath((String) LI003A.get(5)));
				useAnotherAcc.click();
				String log3A = (String) LI003A.get(0) + " " + LI003A.get(1);
				extentTest.log(Status.PASS, log3A, MediaEntityBuilder
						.createScreenCaptureFromPath(captureScreenshot(log3A + fileDate + ".jpg")).build());
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

		// click Next
		ArrayList LI004 = d.getData("LI004", "beforeTest");
		WebElement next = driver.findElement(By.xpath((String) LI004.get(5)));
		next.click();
		String log4 = (String) LI004.get(0) + " " + LI004.get(1);
		extentTest.log(Status.PASS, log4,
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(log4 + fileDate + ".jpg")).build());

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
		// signIn.click();
		System.out.println("Clicked signin button");
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
				extentTest.log(Status.PASS, log7, MediaEntityBuilder
						.createScreenCaptureFromPath(captureScreenshot("NoToStaySignedIn" + fileDate + ".jpg")).build());
			}
		} catch (Exception e) {
			System.out.println("NO is not displayed");

		}
	}

	// UPLOAD FILE
	public void uploadFile() throws IOException, InterruptedException, AWTException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		// w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

		// Click Import HCS Assessment
		ArrayList UF001 = d.getData("UF001", "beforeTest");
		ArrayList UF002 = d.getData("UF002", "beforeTest");
		String fileName = (String) UF002.get(6);

		WebElement importBtn = driver.findElement(By.xpath((String) UF001.get(5)));
		String log8 = (String) UF001.get(0)+" "+(String) UF001.get(1);
		extentTest.log(Status.PASS, log8, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log8  + fileDate + ".jpg")).build());
		importBtn.click();

		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath((String) UF002.get(5))));

		// Choose File
		WebElement chooseFileBtn = driver.findElement(By.xpath((String) UF002.get(5)));
		String log9 = (String) UF002.get(0)+ " "+ (String) UF002.get(1);
		extentTest.log(Status.PASS,  log9+ ": " + fileName, MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log9 + fileDate + ".jpg")).build());

		// Log Upload File
		ArrayList UF003 = d.getData("UF003", "beforeTest");
		String path = System.getProperty("user.dir") + (String) UF003.get(6);
		String log10 = (String) UF003.get(0) + " "+(String) UF003.get(1);
		extentTest.log(Status.PASS, log10 , MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log10+ fileDate + ".jpg")).build());

		chooseFileBtn.sendKeys(path);

//		Actions builder = new Actions(driver);
//		builder.moveToElement(chooseFileBtn).click().build().perform();
//		Thread.sleep(2000);
//
//		// Upload Function
//		Robot rb = new Robot();
//		StringSelection str = new StringSelection(path);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//		Thread.sleep(3000);
//
//		// press Contol+V for pasting
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		Thread.sleep(2000);
//
//		// release Contol+V for pasting
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(2000);
//
//		// for pressing and releasing Enter
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);

		// Click Submit File
		ArrayList UF004 = d.getData("UF004", "beforeTest");
		WebElement submitBtn = driver.findElement(By.xpath((String) UF004.get(5)));
		submitBtn.click();
		Thread.sleep(3000);
		String log11 = (String) UF004.get(0)+" "+(String) UF004.get(1);
		extentTest.log(Status.PASS,  log11 , MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot(log11 + fileDate + ".jpg")).build());
		Thread.sleep(3000);
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

	public void clickDropdown(String tsID) throws IOException, InterruptedException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		// Click Dropdown
		ArrayList<String> listDD = d.getData(tsID, "testSteps");
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath((String) listDD.get(7))));
		WebElement dropdown = driver.findElement(By.xpath((String) listDD.get(7)));
		dropdown.click();
		extentTest.log(Status.PASS, (String) listDD.get(0)+" "+(String) listDD.get(3), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot((String) listDD.get(0) + fileDate + ".jpg")).build());
		System.out.println("Dropdown " + tsID + " clicked.");
	}

	public void selectOption(String tsID) throws IOException, InterruptedException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		ArrayList<String> list = d.getData(tsID, "testSteps");
		WebElement selectOption = driver.findElement(By.xpath((String) list.get(7)));
		selectOption.click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath((String) list.get(7))));
		extentTest.log(Status.PASS, (String) list.get(0)+" "+(String) list.get(3),
				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(tsID + fileDate + ".jpg")).build());
		System.out.println("Option " + tsID + " selected.");
	}

	public void signatureAndLogout(String tsID) throws InterruptedException, IOException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		String sheetName = "afterTest";
		// Click Final Recommendation Menu
		ArrayList FR001 = d.getData("FR001", sheetName);
		WebElement finalRecMenu = driver.findElement(By.xpath((String) FR001.get(6)));
		finalRecMenu.click();
		extentTest.log(Status.PASS, (String) FR001.get(0)+" "+(String) FR001.get(2), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("Final Rec" + tsID + fileDate + ".jpg")).build());

		// Add a Signature into the Nurse Signature Box
		ArrayList FR002 = d.getData("FR002", sheetName);
		WebElement canvas = driver.findElement(By.xpath((String) FR002.get(6)));
		Actions builder = new Actions(driver);
		Action signature = builder.moveToElement(canvas).clickAndHold().moveByOffset(200, 50).moveByOffset(10, 0)
				.click().build();
		signature.perform();
		extentTest.log(Status.PASS, (String) FR002.get(0)+" "+(String) FR002.get(2), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("FR002" + tsID + fileDate + ".jpg")).build());

		// Click Accept Signature Button
		ArrayList FR003 = d.getData("FR003", sheetName);
		WebElement acceptSign = driver.findElement(By.xpath((String) FR003.get(6)));
		acceptSign.click();
		extentTest.log(Status.PASS, (String) FR003.get(0)+" "+(String) FR003.get(2), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("FR003" + tsID + fileDate + ".jpg")).build());

//		// Click Clear Signature Button
//		ArrayList FR004 = d.getData("FR004", sheetName);
//		WebElement clearSign = driver.findElement(By.xpath((String) FR004.get(6)));
//		clearSign.click();
//		Thread.sleep(5000);
//		extentTest.log(Status.PASS, (String) FR004.get(2),
//				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("FR004" + ssID + ".jpg")).build());
//
//		// Add a Signature into the Nurse Signature Box
//		ArrayList FR005 = d.getData("FR005", sheetName);
//		// WebElement canvas1 = driver.findElement(By.xpath((String) FR005.get(6)));
//		// Action signature1 =
//		// builder.moveToElement(canvas).clickAndHold().moveByOffset(200,
//		// 50).moveByOffset(10, 0)
//		// .click().build();
//		signature.perform();
//		Thread.sleep(5000);
//		extentTest.log(Status.PASS, (String) FR005.get(2),
//				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("FR005" + ssID + ".jpg")).build());
//
//		// Click Accept Signature Button
//		ArrayList FR006 = d.getData("FR006", sheetName);
//		WebElement acceptSign1 = driver.findElement(By.xpath((String) FR006.get(6)));
//		acceptSign.click();
//		String log65 = (String) FR006.get(0) + " " + FR006.get(2);
//		extentTest.log(Status.PASS, (String) FR006.get(2),
//				MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot("FR006" + ssID + ".jpg")).build());

		ArrayList FR007 = d.getData("FR007", sheetName);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath((String) FR007.get(6))));
		// Click the Complete Assessment Button
		WebElement completeAssessment = driver.findElement(By.xpath((String) FR007.get(6)));
		completeAssessment.click();
		extentTest.log(Status.PASS, (String) FR007.get(0)+" "+(String) FR007.get(2), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("FR007" + tsID + fileDate + ".jpg")).build());

		// Click Welcome
		ArrayList FR008 = d.getData("FR008", sheetName);
		WebElement welcome = driver.findElement(By.xpath((String) FR008.get(6)));
		welcome.click();
		extentTest.log(Status.PASS, (String) FR008.get(0)+" "+(String) FR008.get(2), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("FR008" + tsID + fileDate + ".jpg")).build());

		// Click Sign Out
		ArrayList FR009 = d.getData("FR009", sheetName);
		WebElement signOut = driver.findElement(By.xpath((String) FR009.get(6)));
		signOut.click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@ng-click='vm.login()']")));
		extentTest.log(Status.PASS, (String) FR009.get(0)+" "+(String) FR009.get(2), MediaEntityBuilder
				.createScreenCaptureFromPath(captureScreenshot("FR009" + tsID + fileDate + ".jpg")).build());
		System.out.println("Test Step " + tsID + " has been completed.");
	}

}
