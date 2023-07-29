package dropDownTest;

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
import extentReport.BaseTestDD;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DropdownTest extends BaseTestDD {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	DataDrivenHT d = new DataDrivenHT();

	// select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyCognitiveSkillOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0100");
		// Select Option1
		selectOptionAndTakeScreenshot("UAS0101", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Independent - Decisions consistent, reasonable and safe
	@Test(groups = "UAS Assessment Details")
	public void verifyCognitiveSkillOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0100");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0102", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Modified independence - Some difficulty in new situations only
	@Test(groups = "UAS Assessment Details")
	public void verifyCognitiveSkillOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0100");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0103", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Modified independence - Some difficulty in new situations only
	@Test(groups = "UAS Assessment Details")
	public void verifyCognitiveSkillOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0100");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0104", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Minimally impaired - In specific recurring situations, decisions
	// become poor or unsafe; cues / supervision necessary at those times
	@Test(groups = "UAS Assessment Details")
	public void verifyCognitiveSkillOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0100");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0105", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Moderately impaired - Decisions consistently poor or unsafe;
	// cues/supervision required at all times
	@Test(groups = "UAS Assessment Details")
	public void verifyCognitiveSkillOption6() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0100");

		// Select Option6
		selectOptionAndTakeScreenshot("UAS0106", fileName);
		signAndLogout("afterTest", fileName);
	}

	@Test(groups = "UAS Assessment Details")
	public void verifyCognitiveSkillOption7() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0100");

		// Select Option7
		selectOptionAndTakeScreenshot("UAS0107", fileName);
		signAndLogout("afterTest", fileName);
	}

	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricAnxietyOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0200");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0201", fileName);
		signAndLogout("afterTest", fileName);
	}

	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricAnxietyOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0200");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0202", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Primary diagnosis/diagnosis for stay/placement
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricAnxietyOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0200");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0203", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricAnxietyOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0200");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0204", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricAnxietyOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0200");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0205", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Wandering
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyWanderingOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0300");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0301", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyWanderingOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0300");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0302", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyWanderingOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0300");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0303", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyWanderingOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0300");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0304", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricDepressionOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0400");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0401", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricDepressionOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0400");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0402", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricDepressionOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0400");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0403", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricDepressionOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0400");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0404", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricDepressionOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0400");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0405", fileName);
		signAndLogout("afterTest", fileName);
	}

	// VerbalAbuse
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyVerbalAbuseOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0500");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0501", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyVerbalAbuseOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0500");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0502", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyVerbalAbuseOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0500");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0503", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyVerbalAbuseOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0500");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0504", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyVerbalAbuseOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0500");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0505", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Psychiatric Schizophrenia
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricSchizophreniaOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0600");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0601", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricSchizophreniaOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0600");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0602", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricSchizophreniaOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0600");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0603", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricSchizophreniaOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0600");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0604", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details")
	public void verifyPsychiatricSchizophreniaOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0600");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0605", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Physical Abuse
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyPhysicalAbuseOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0700");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0701", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyPhysicalAbuseOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0700");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0702", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyPhysicalAbuseOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0700");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0703", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyPhysicalAbuseOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0700");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0704", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyPhysicalAbuseOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0700");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0705", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Dyspnea
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyDyspneaOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0800");

		// Select: Absence of symptom
		selectOptionAndTakeScreenshot("UAS0801", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyDyspneaOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0800");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0802", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Absent at rest, but present when performed moderate activities
	@Test(groups = "UAS Assessment Details")
	public void verifyDyspneaOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0800");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0803", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Absent at rest, but present when performed normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details")
	public void verifyDyspneaOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0800");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0804", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Present at rest
	@Test(groups = "UAS Assessment Details")
	public void verifyDyspneaOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0800");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0805", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Socially inappropriate or disruptive behavior
	@Test(groups = "UAS Assessment Details")
	public void verifySIDBoption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0900");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0901", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifySIDBoption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0900");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0902", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifySIDBoption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0900");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0903", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifySIDBoption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0900");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0904", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifySIDBoption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS0900");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0905", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Fatigue
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyFatigueOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1000");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1001", fileName);
		signAndLogout("afterTest", fileName);
	}

	// None
	@Test(groups = "UAS Assessment Details")
	public void verifyFatigueOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1000");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1002", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Minimal - Diminished energy but completes normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details")
	public void verifyFatigueOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1000");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1003", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Moderate - Due to diminished energy, UNABLE TO FINISH normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details")
	public void verifyFatigueOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1000");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1004", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Severe - Due to diminished energy, UNABLE TO START SOME normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details")
	public void verifyFatigueOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1000");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS1005", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Unable to commence any normal day-to-day activities - Due to
	// diminished energy
	@Test(groups = "UAS Assessment Details")
	public void verifyFatigueOption6() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1000");

		// Select Option6
		selectOptionAndTakeScreenshot("UAS1006", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Inappropriate public sexual behavior or public disrobing
	@Test(groups = "UAS Assessment Details")
	public void verifyIPSBPDoption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1100");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1101", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyIPSBPDoption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1100");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1102", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyIPSBPDoption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1100");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1103", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyIPSBPDoption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1100");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1104", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyIPSBPDoption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1100");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS1105", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Pain
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyPainOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1200");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1201", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: No issue of pain
	@Test(groups = "UAS Assessment Details")
	public void verifyPainOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1200");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1202", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Controlled adequately by therapeutic regimen
	@Test(groups = "UAS Assessment Details")
	public void verifyPainOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1200");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1203", fileName);
		signAndLogout("afterTest", fileName);
	}

	// TODO
	// Select: Controlled when therapeutic regimen followed, but not always followed
	// as ordered
	@Test(groups = "UAS Assessment Details")
	public void verifyPainOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1200");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1204", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Therapeutic regimen followed, but pain control not adequate
	@Test(groups = "UAS Assessment Details")
	public void verifyPainOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1200");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS1205", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: No therapeutic regimen being followed for pain; pain not adequately
	// controlled
	@Test(groups = "UAS Assessment Details")
	public void verifyPainOption6() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1200");

		// Select Option6
		selectOptionAndTakeScreenshot("UAS1206", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Resist Care
	// Select: Select an option
	@Test(groups = "UAS Assessment Details")
	public void verifyResistCareOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1300");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1301", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details")
	public void verifyResistCareOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1300");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1302", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyResistCareOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1300");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1303", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyResistCareOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1300");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1304", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details")
	public void verifyResistCareOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "UAS1300");
		// Select Option5
		selectOptionAndTakeScreenshot("UAS1305", fileName);
		signAndLogout("afterTest", fileName);
	}

	// IADL
	// Meal Preparation Response
	// Select: Select an option
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0101", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Independent - No help, setup, or supervision
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option2
		selectOptionAndTakeScreenshot("IADL0102", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Setup help only
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option3
		selectOptionAndTakeScreenshot("IADL0103", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option4
		selectOptionAndTakeScreenshot("IADL0104", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Limited assistance - help on some occasions
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option5
		selectOptionAndTakeScreenshot("IADL0105", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Extensive assistance - help throughout task, but performs 50% or more
	// of task on own
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption6() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option6
		selectOptionAndTakeScreenshot("IADL0106", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Maximal assistance - help throughout task, but performs less than 50%
	// of task on own
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption7() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option7
		selectOptionAndTakeScreenshot("IADL0107", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Total dependence - full performance by others during entire period
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption8() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option8
		selectOptionAndTakeScreenshot("IADL0108", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity")
	public void verifyMealPrepOption9() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0100");
		// Select Option9
		selectOptionAndTakeScreenshot("IADL0109", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Ordinary Housework Response
	// Select: Select an option
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0201", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Independent - No help, setup, or supervision
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option2
		selectOptionAndTakeScreenshot("IADL0202", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Setup help only
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option3
		selectOptionAndTakeScreenshot("IADL0203", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option4
		selectOptionAndTakeScreenshot("IADL0204", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Limited assistance - help on some occasions
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option5
		selectOptionAndTakeScreenshot("IADL0205", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Extensive assistance - help throughout task, but performs 50% or more
	// of task on own
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption6() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option6
		selectOptionAndTakeScreenshot("IADL0206", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Select: Maximal assistance - help throughout task, but performs less than 50%
	// of task on own
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption7() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option7
		selectOptionAndTakeScreenshot("IADL0207", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Total dependence - full performance by others during entire period
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption8() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option8
		selectOptionAndTakeScreenshot("IADL0208", fileName);
		signAndLogout("afterTest", fileName);
	}

	// Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity")
	public void verifyOrdinaryHouseworkOption9() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0200");
		// Select Option9
		selectOptionAndTakeScreenshot("IADL0209", fileName);
		signAndLogout("afterTest", fileName);
	}

	//Shopping Response
	//Select: Select an option
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0301", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Independent - No help, setup, or supervision
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0302", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Setup help only
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option3
		selectOptionAndTakeScreenshot("IADL0303", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option4
		selectOptionAndTakeScreenshot("IADL0304", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Limited assistance - help on some occasions
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option5
		selectOptionAndTakeScreenshot("IADL0305", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Extensive assistance - help throughout task, but performs 50% or more of task on own
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption6() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option6
		selectOptionAndTakeScreenshot("IADL0306", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Maximal assistance - help throughout task, but performs less than 50% of task on own
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption7() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option7
		selectOptionAndTakeScreenshot("IADL0307", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Total dependence - full performance by others during entire period
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption8() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option8
		selectOptionAndTakeScreenshot("IADL0308", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity")
	public void verifyShoppingOption9() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "IADL0300");
		// Select Option9
		selectOptionAndTakeScreenshot("IADL0309", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//ADL - Self Performance
	// Bathing Response
	//Select: Select an option
	@Test(groups = "ADL - Self Performance")
	public void verifyBathingOption1() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "ADL0100");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0101", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Independent - No help, setup, or supervision
	@Test(groups = "ADL - Self Performance")
	public void verifyBathingOption2() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "ADL0100");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0102", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Setup help only

	@Test(groups = "ADL - Self Performance")
	public void verifyBathingOption3() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "ADL0100");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0103", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance")
	public void verifyBathingOption4() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "ADL0100");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0104", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Limited assistance - help on some occasions
	@Test(groups = "ADL - Self Performance")
	public void verifyBathingOption5() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "ADL0100");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0105", fileName);
		signAndLogout("afterTest", fileName);
	}
	
	//Select: Limited assistance - help on some occasions
	@Test(groups = "ADL - Self Performance")
	public void verifyBathingOption6() throws IOException, InterruptedException, AWTException {
		ArrayList file1 = d.getData("File1", "beforeTest");
		String fileName = (String) file1.get(1);
		String path = (String) file1.get(2);
		uploadAndSubmitFile(fileName, path);
		ClickDropdown(fileName, "ADL0100");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0106", fileName);
		signAndLogout("afterTest", fileName);
	}
}
