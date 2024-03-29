package uploadDocTest;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import dataDriven.DataDrivenHT;

import extentReport.BaseTestUploadFile;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DocumentsUploadTest extends BaseTestUploadFile {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	DataDrivenHT d = new DataDrivenHT();

	// File Sample-1
	@Test 
	public void verifyInfoSample1() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 1");
		signatureAndLogout();
	}

	// File Sample-2
	@Test
	public void verifyInfoSample2() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 2");
		signatureAndLogout();
	}

	// File Sample-3
	@Test
	public void verifyInfoSample3() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 3");
		signatureAndLogout();
	}

	// File Sample-4
	@Test
	public void verifyInfoSample4() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 4");
		signatureAndLogout();
	}

	// File Sample-5
	@Test
	public void verifyInfoSample5() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 5");
		signatureAndLogout();
	}

	// File Sample-6
	@Test
	public void verifyInfoSample6() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 6");
		signatureAndLogout();
	}

	// File Sample-7
	@Test
	public void verifyInfoSample7() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 7");
		signatureAndLogout();
	}

	// File Sample-8
	@Test
	public void verifyInfoSample8() throws InterruptedException, IOException, AWTException {
		login();
		uploadAndSubmitFile("Sample 8");
		signatureAndLogout();
	}

	@AfterTest()
	public void tearup() {
		driver.close();
	}
}