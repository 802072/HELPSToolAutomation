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

	//UAS Assessment Details
	//Cognitive Skills for Daily Decision Making
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0101");
		signatureAndLogout("afterTest", "UAS0101");
	}

	// Option2: Independent - Decisions consistent, reasonable and safe
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0102");
		signatureAndLogout("afterTest", "UAS0102");
	}

	// Option3: Modified independence - Some difficulty in new situations only
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0103");
		signatureAndLogout("afterTest", "UAS0103");
	}

	// Option4: Minimally impaired - In specific recurring situations, decisions
	// become poor or unsafe; cues / supervision necessary at those times
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0104");
		signatureAndLogout("afterTest", "UAS0104");
	}

	// Option5: Moderately impaired - Decisions consistently poor or unsafe;
	// cues/supervision required at all times
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0105");
		selectOption("UAS0105");
		signatureAndLogout("afterTest", "UAS0105");
	}

	// Option6: Severely impaired - Never or rarely makes decisions
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0106");
		signatureAndLogout("afterTest", "UAS0106");
	}

	// Option7: No discernable consciousness
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0107");
		signatureAndLogout("afterTest", "UAS0107");
	}

	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0201");
		signatureAndLogout("afterTest", "UAS0201");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0202");
		signatureAndLogout("afterTest", "UAS0202");
	}

	// Option3: Primary diagnosis/diagnosis for stay/placement
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0203");
		signatureAndLogout("afterTest", "UAS0203");
	}

	// Option4: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0204");
		signatureAndLogout("afterTest", "UAS0204");
	}

	// Option5: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0205");
		signatureAndLogout("afterTest", "UAS0205");
	}

	// Wandering
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0301");
		signatureAndLogout("afterTest", "UAS0301");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0302");
		signatureAndLogout("afterTest", "UAS0302");
	}

	// Option3 Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0303");
		signatureAndLogout("afterTest", "UAS0303");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0304");
		signatureAndLogout("afterTest", "UAS0304");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0305");
		signatureAndLogout("afterTest", "UAS0305");
	}

	// PsychiatricDepression
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0401");
		signatureAndLogout("afterTest", "UAS0401");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0402");
		signatureAndLogout("afterTest", "UAS0402");
	}

	// Option3: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0403");
		signatureAndLogout("afterTest", "UAS0403");
	}

	// Option4: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0404");
		signatureAndLogout("afterTest", "UAS0404");
	}

	// Option5: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0405");
		signatureAndLogout("afterTest", "UAS0405");
	}

	// VerbalAbuse
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0501");
		signatureAndLogout("afterTest", "UAS0501");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0502");
		signatureAndLogout("afterTest", "UAS0502");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0503");
		signatureAndLogout("afterTest", "UAS0503");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0504");
		signatureAndLogout("afterTest", "UAS0504");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0505");
		signatureAndLogout("afterTest", "UAS0505");
	}

	// Psychiatric Schizophrenia
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0601");
		signatureAndLogout("afterTest", "UAS0601");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0602");
		signatureAndLogout("afterTest", "UAS0602");
	}

	// Option3: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0603");
		signatureAndLogout("afterTest", "UAS0603");
	}

	// Option4: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0604");
		signatureAndLogout("afterTest", "UAS0604");
	}

	// Option5: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0605");
		signatureAndLogout("afterTest", "UAS0605");
	}

	// Physical Abuse
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0701");
		signatureAndLogout("afterTest", "UAS0701");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0702");
		signatureAndLogout("afterTest", "UAS0702");
	}

	// Option3: Not Present
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0703");
		signatureAndLogout("afterTest", "UAS0703");
	}

	// Option4: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0704");
		signatureAndLogout("afterTest", "UAS0704");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0705");
		signatureAndLogout("afterTest", "UAS0705");
	}

	// Dyspnea
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0801");
		signatureAndLogout("afterTest", "UAS0801");
	}

	// Option2: Absence of symptom
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0802");
		signatureAndLogout("afterTest", "UAS0802");
	}

	// Option3: Absent at rest, but present when performed moderate activities
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0803");
		signatureAndLogout("afterTest", "UAS0803");
	}

	// Option4: Absent at rest, but present when performed normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0804");
		signatureAndLogout("afterTest", "UAS0804");
	}

	// Option5: Present at rest
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0805");
		signatureAndLogout("afterTest", "UAS0805");
	}

	// Socially Inappropriate Or Disruptive Behavior
	// Option1: Select an Option
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0901");
		signatureAndLogout("afterTest", "UAS0901");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0902");
		signatureAndLogout("afterTest", "UAS0902");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0903");
		signatureAndLogout("afterTest", "UAS0903");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0904");
		signatureAndLogout("afterTest", "UAS0904");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0905");
		signatureAndLogout("afterTest", "UAS0905");
	}

	// Fatigue
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1001");
		signatureAndLogout("afterTest", "UAS1001");
	}

	// Option2: None
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1002");
		signatureAndLogout("afterTest", "UAS1002");
	}

	// Option3: Minimal - Diminished energy but completes normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1003");
		signatureAndLogout("afterTest", "UAS1003");
	}

	// Option4: Moderate - Due to diminished energy, UNABLE TO FINISH normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1004");
		signatureAndLogout("afterTest", "UAS1004");
	}

	// Option5: Severe - Due to diminished energy, UNABLE TO START SOME normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1005");
		signatureAndLogout("afterTest", "UAS1005");
	}

	// Option6: Unable to commence any normal day-to-day activities - Due to
	// diminished energy
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1006");
		signatureAndLogout("afterTest", "UAS1006");
	}

	// Inappropriate Public Sexual Behavior Or Public Disrobing
	// Option1: Select an Option
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1101");
		signatureAndLogout("afterTest", "UAS1101");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1102");
		signatureAndLogout("afterTest", "UAS1102");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1103");
		signatureAndLogout("afterTest", "UAS1103");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1104");
		signatureAndLogout("afterTest", "UAS1104");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1105");
		signatureAndLogout("afterTest", "UAS1105");
	}

	// Pain
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1201");
		signatureAndLogout("afterTest", "UAS1201");
	}

	// Option2: No issue of pain
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1202");
		signatureAndLogout("afterTest", "UAS1202");
	}

	// Option3: Pain intensity acceptable to individual; no treatment regimen or
	// change in regimen required
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1203");
		signatureAndLogout("afterTest", "UAS1203");
	}

	// Option4: Controlled adequately by therapeutic regimen
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1204");
		signatureAndLogout("afterTest", "UAS1204");
	}

	// Option5: Controlled when therapeutic regimen followed, but not always
	// followed as ordered
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1205");
		signatureAndLogout("afterTest", "UAS1205");
	}

	// Option6: Therapeutic regimen followed, but pain control not adequate
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1206");
		signatureAndLogout("afterTest", "UAS1206");
	}

	// Option7: No therapeutic regimen being followed for pain; pain not adequately
	// controlled
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1207");
		signatureAndLogout("afterTest", "UAS1207");
	}

	// Resist Care
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1301");
		signatureAndLogout("afterTest", "UAS1301");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1302");
		signatureAndLogout("afterTest", "UAS1302");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1303");
		signatureAndLogout("afterTest", "UAS1303");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1304");
		signatureAndLogout("afterTest", "UAS1304");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1305");
		signatureAndLogout("afterTest", "UAS1305");
	}

	// IADL
	// Meal Preparation Response
	// Option1: Select an option
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0101");
		signatureAndLogout("afterTest", "IADL0101");
	}

	// option2: Independent - no physical assistance, setup, or
	// supervision in any episode
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0102");
		signatureAndLogout("afterTest", "IADL0102");
	}

	// Option3: Setup help only
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0103");
		signatureAndLogout("afterTest", "IADL0103");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0104");
		signatureAndLogout("afterTest", "IADL0104");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0105");
		signatureAndLogout("afterTest", "IADL0105");
	}

	// Option6: Extensive assistance - help throughout task, but performs 50% or
	// more
	// of task on own
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0106");
		signatureAndLogout("afterTest", "IADL0106");
	}

	// Option7: Maximal assistance - help throughout task, but performs less than
	// 50%
	// of task on own
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0107");
		signatureAndLogout("afterTest", "IADL0107");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0108");
		signatureAndLogout("afterTest", "IADL0108");
	}

	// Option9: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0109");
		signatureAndLogout("afterTest", "IADL0109");
	}

	// Ordinary Housework Response
	// Option1: Select an option
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0201");
		signatureAndLogout("afterTest", "IADL0201");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0202");
		signatureAndLogout("afterTest", "IADL0202");
	}

	// Option3: Setup help only
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0203");
		signatureAndLogout("afterTest", "IADL0203");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0204");
		signatureAndLogout("afterTest", "IADL0204");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0205");
		signatureAndLogout("afterTest", "IADL0205");
	}

	// Option6: Extensive assistance - help throughout task, but performs 50% or
	// more
	// of task on own
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0206");
		signatureAndLogout("afterTest", "IADL0206");
	}

	// Option7: Maximal assistance - help throughout task, but performs less than
	// 50%
	// of task on own
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0207");
		signatureAndLogout("afterTest", "IADL0207");
	}

	// Option8: Total dependence - full performance by others during all
	// episodes
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0208");
		signatureAndLogout("afterTest", "IADL0208");
	}

	// Option9: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0209");
		signatureAndLogout("afterTest", "IADL0209");
	}

	// Shopping Response
	// Option1: Select an option
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0301");
		signatureAndLogout("afterTest", "IADL0301");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0302");
		signatureAndLogout("afterTest", "IADL0302");
	}

	// Option3: Setup help only
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0303");
		signatureAndLogout("afterTest", "IADL0303");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0304");
		signatureAndLogout("afterTest", "IADL0304");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0305");
		signatureAndLogout("afterTest", "IADL0305");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0306");
		signatureAndLogout("afterTest", "IADL0306");
	}

	// Option7: Maximal assistance - weight-bearing support (including lifting
	// limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0307");
		signatureAndLogout("afterTest", "IADL0307");
	}

	// Option8: Select: Total dependence - full performance by others during all
	// episodes
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0308");
		signatureAndLogout("afterTest", "IADL0308");
	}

	// Option9: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0309");
		signatureAndLogout("afterTest", "IADL0309");
	}

	// ADL - Self Performance
	// Bathing Response
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0101");
		signatureAndLogout("afterTest", "ADL0101");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0102");
		signatureAndLogout("afterTest", "ADL0102");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0103");
		signatureAndLogout("afterTest", "ADL0103");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0104");
		signatureAndLogout("afterTest", "ADL0104");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0105");
		signatureAndLogout("afterTest", "ADL0105");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0106");
		signatureAndLogout("afterTest", "ADL0106");
	}

	// Option7:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0107");
		signatureAndLogout("afterTest", "ADL0107");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0108");
		signatureAndLogout("afterTest", "ADL0108");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0109");
		signatureAndLogout("afterTest", "ADL0109");
	}

	// Personal Hygiene
	// Option1: Select an option;
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0201");
		signatureAndLogout("afterTest", "ADL0201");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0202");
		signatureAndLogout("afterTest", "ADL0202");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within
	// reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0203");
		signatureAndLogout("afterTest", "ADL0203");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0204");
		signatureAndLogout("afterTest", "ADL0204");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without
	// taking weight
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0205");
		signatureAndLogout("afterTest", "ADL0205");
	}

	// option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1
	// helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0206");
		signatureAndLogout("afterTest", "ADL0206");
	}

	// Option7: Maximal assistance - weight-bearing support (including
	// lifting limbs) by 2+
	// helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0207");
		signatureAndLogout("afterTest", "ADL0207");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0208");
		signatureAndLogout("afterTest", "ADL0208");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0209");
		signatureAndLogout("afterTest", "ADL0209");
	}

	// Dressing Upper Body
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0301");
		signatureAndLogout("afterTest", "ADL0301");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0302");
		signatureAndLogout("afterTest", "ADL0302");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within
	// reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0303");
		signatureAndLogout("afterTest", "ADL0303");
	}

	// OPtion4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0304");
		signatureAndLogout("afterTest", "ADL0304");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without
	// taking weight
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0305");
		signatureAndLogout("afterTest", "ADL0305");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1
	// helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0306");
		signatureAndLogout("afterTest", "ADL0306");
	}

	// Option7: Maximal assistance - weight-bearing support (including lifting
	// limbs) by 2+
	// helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0307");
		signatureAndLogout("afterTest", "ADL0307");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0308");
		signatureAndLogout("afterTest", "ADL0308");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0309");
		signatureAndLogout("afterTest", "ADL0309");
	}

	// Dressing Lower Body
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0401");
		signatureAndLogout("afterTest", "ADL0401");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0402");
		signatureAndLogout("afterTest", "ADL0402");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within
	// reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0403");
		signatureAndLogout("afterTest", "ADL0403");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0404");
		signatureAndLogout("afterTest", "ADL0404");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without
	// taking weight
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0405");
		signatureAndLogout("afterTest", "ADL0405");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1
	// helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0406");
		signatureAndLogout("afterTest", "ADL0406");
	}

	// Option7: Maximal assistance - weight-bearing support (including lifting
	// limbs) by 2+
	// helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0407");
		signatureAndLogout("afterTest", "ADL0407");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0408");
		signatureAndLogout("afterTest", "ADL0408");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0409");
		signatureAndLogout("afterTest", "ADL0409");
	}

	// LOCOMOTION
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0501");
		signatureAndLogout("afterTest", "ADL0501");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0502");
		signatureAndLogout("afterTest", "ADL0502");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0503");
		signatureAndLogout("afterTest", "ADL0503");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0504");
		signatureAndLogout("afterTest", "ADL0504");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0505");
		signatureAndLogout("afterTest", "ADL0505");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0506");
		signatureAndLogout("afterTest", "ADL0506");
	}

	// Option7:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0507");
		signatureAndLogout("afterTest", "ADL0507");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0508");
		signatureAndLogout("afterTest", "ADL0508");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0509");
		signatureAndLogout("afterTest", "ADL0509");
	}

	// Transfer Toilet
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0601");
		signatureAndLogout("afterTest", "ADL0601");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0602");
		signatureAndLogout("afterTest", "ADL0602");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0603");
		signatureAndLogout("afterTest", "ADL0602");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0604");
		signatureAndLogout("afterTest", "ADL0604");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0605");
		signatureAndLogout("afterTest", "ADL0605");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 60% or more of subtasks
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0606");
		signatureAndLogout("afterTest", "ADL0606");
	}

	// Option7: Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 60% of subtasks
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0607");
		signatureAndLogout("afterTest", "ADL0607");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0608");
		signatureAndLogout("afterTest", "ADL0608");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0609");
		signatureAndLogout("afterTest", "ADL0609");
	}

	// Toileting
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0701");
		signatureAndLogout("afterTest", "ADL0701");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0702");
		signatureAndLogout("afterTest", "ADL0702");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0703");
		signatureAndLogout("afterTest", "ADL0703");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0704");
		signatureAndLogout("afterTest", "ADL0704");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0705");
		signatureAndLogout("afterTest", "ADL0705");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 70% or more of subtasks
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0706");
		signatureAndLogout("afterTest", "ADL0706");
	}

	// Option7:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 70% of subtasks
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0707");
		signatureAndLogout("afterTest", "ADL0707");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0708");
		signatureAndLogout("afterTest", "ADL0708");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0709");
		signatureAndLogout("afterTest", "ADL0709");
	}

	// Bed Mobility
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0801");
		signatureAndLogout("afterTest", "ADL0801");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0802");
		signatureAndLogout("afterTest", "ADL0802");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0803");
		signatureAndLogout("afterTest", "ADL0803");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0804");
		signatureAndLogout("afterTest", "ADL0804");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0805");
		signatureAndLogout("afterTest", "ADL0805");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 80% or more of subtasks
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0806");
		signatureAndLogout("afterTest", "ADL0806");
	}

	// Option7: Maximal assistance - weight-bearing support (including lifting
	// limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 80% of subtasks
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0807");
		signatureAndLogout("afterTest", "ADL0807");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0808");
		signatureAndLogout("afterTest", "ADL0808");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0809");
		signatureAndLogout("afterTest", "ADL0809");
	}

	// Eating
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0901");
		signatureAndLogout("afterTest", "ADL0901");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0902");
		signatureAndLogout("afterTest", "ADL0902");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0903");
		signatureAndLogout("afterTest", "ADL0903");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0904");
		signatureAndLogout("afterTest", "ADL0904");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0905");
		signatureAndLogout("afterTest", "ADL0905");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 90% or more of subtasks
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0906");
		signatureAndLogout("afterTest", "ADL0906");
	}

	// Option7: Maximal assistance - weight-bearing support (including lifting
	// limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 90% of subtasks
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0907");
		signatureAndLogout("afterTest", "ADL0907");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0908");
		signatureAndLogout("afterTest", "ADL0908");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0909");
		signatureAndLogout("afterTest", "ADL0909");
	}
}
