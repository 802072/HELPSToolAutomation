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
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0100");
		// Select Option1
		selectOptionAndTakeScreenshot("UAS0101");
		signAndLogout("afterTest", "UAS0101");
	}

	// Independent - Decisions consistent, reasonable and safe
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0100");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0102");
		signAndLogout("afterTest", "UAS0102");
	}

	// Select: Modified independence - Some difficulty in new situations only
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0100");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0103");
		signAndLogout("afterTest", "UAS0103");
	}

	// Select: Modified independence - Some difficulty in new situations only
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0100");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0104");
		signAndLogout("afterTest", "UAS0104");
	}

	// Select: Minimally impaired - In specific recurring situations, decisions
	// become poor or unsafe; cues / supervision necessary at those times
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0105");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0105");
		signAndLogout("afterTest", "UAS0105");
	}

	// Select: Moderately impaired - Decisions consistently poor or unsafe;
	// cues/supervision required at all times
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0100");

		// Select Option6
		selectOptionAndTakeScreenshot("UAS0106");
		signAndLogout("afterTest", "UAS0106");
	}

	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0100");

		// Select Option7
		selectOptionAndTakeScreenshot("UAS0107");
		signAndLogout("afterTest", "UAS0107");
	}

	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0200");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0201");
		signAndLogout("afterTest", "UAS0201");
	}

	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0200");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0202");
		signAndLogout("afterTest", "UAS0202");
	}

	// Select: Primary diagnosis/diagnosis for stay/placement
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0200");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0203");
		signAndLogout("afterTest", "UAS0203");
	}

	// Select: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0200");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0204");
		signAndLogout("afterTest", "UAS0204");
	}

	// Select: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0200");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0205");
		signAndLogout("afterTest", "UAS0205");
	}

	// Wandering
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0300");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0301");
		signAndLogout("afterTest", "UAS0301");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0300");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0302");
		signAndLogout("afterTest", "UAS0302");
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0300");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0303");
		signAndLogout("afterTest", "UAS0303");
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0300");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0304");
		signAndLogout("afterTest", "UAS0304");
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0300");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0305");
		signAndLogout("afterTest", "UAS0305");
	}

	// PsychiatricDepression
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0400");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0401");
		signAndLogout("afterTest", "UAS0401");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0400");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0402");
		signAndLogout("afterTest", "UAS0402");
	}

	// Select: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0400");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0403");
		signAndLogout("afterTest", "UAS0403");
	}

	// Select: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0400");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0404");
		signAndLogout("afterTest", "UAS0404");
	}

	// Select: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0400");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0405");
		signAndLogout("afterTest", "UAS0405");
	}

	// VerbalAbuse
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0500");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0501");
		signAndLogout("afterTest", "UAS0501");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0500");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0502");
		signAndLogout("afterTest", "UAS0502");
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0500");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0503");
		signAndLogout("afterTest", "UAS0503");
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0500");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0504");
		signAndLogout("afterTest", "UAS0504");
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0500");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0505");
		signAndLogout("afterTest", "UAS0505");
	}

	// Psychiatric Schizophrenia
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0600");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0601");
		signAndLogout("afterTest", "UAS0601");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0600");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0602");
		signAndLogout("afterTest", "UAS0602");
	}

	// Select: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0600");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0603");
		signAndLogout("afterTest", "UAS0603");
	}

	// Select: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0600");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0604");
		signAndLogout("afterTest", "UAS0604");
	}

	// Select: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0600");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0605");
		signAndLogout("afterTest", "UAS0605");
	}

	// Physical Abuse
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0700");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0701");
		signAndLogout("afterTest", "UAS0701");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0700");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0702");
		signAndLogout("afterTest", "UAS0702");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0700");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0703");
		signAndLogout("afterTest", "UAS0703");
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0700");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0704");
		signAndLogout("afterTest", "UAS0704");
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0700");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0705");
		signAndLogout("afterTest", "UAS0705");
	}

	// Dyspnea
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0800");

		// Select: Absence of symptom
		selectOptionAndTakeScreenshot("UAS0801");
		signAndLogout("afterTest", "UAS0801");
	}

	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0800");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0802");
		signAndLogout("afterTest", "UAS0802");
	}

	// Select: Absent at rest, but present when performed moderate activities
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0800");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0803");
		signAndLogout("afterTest", "UAS0803");
	}

	// Select: Absent at rest, but present when performed normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0800");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0804");
		signAndLogout("afterTest", "UAS0804");
	}

	// Select: Present at rest
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0800");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0805");
		signAndLogout("afterTest", "UAS0805");
	}

	// Socially inappropriate or disruptive behavior
	@Test(groups = "UAS Assessment Details: Socially inappropriate or disruptive behavior")
	public void verifySIDBoption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0900");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS0901");
		signAndLogout("afterTest", "UAS0901");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Socially inappropriate or disruptive behavior")
	public void verifySIDBoption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0900");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS0902");
		signAndLogout("afterTest", "UAS0902");
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Socially inappropriate or disruptive behavior")
	public void verifySIDBoption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0900");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS0903");
		signAndLogout("afterTest", "UAS0903");
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Socially inappropriate or disruptive behavior")
	public void verifySIDBoption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0900");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS0904");
		signAndLogout("afterTest", "UAS0904");
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Socially inappropriate or disruptive behavior")
	public void verifySIDBoption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS0900");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS0905");
		signAndLogout("afterTest", "UAS0905");
	}

	// Fatigue
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1000");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1001");
		signAndLogout("afterTest", "UAS1001");
	}

	// None
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1000");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1002");
		signAndLogout("afterTest", "UAS1002");
	}

	// Select: Minimal - Diminished energy but completes normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1000");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1003");
		signAndLogout("afterTest", "UAS1003");
	}

	// Select: Moderate - Due to diminished energy, UNABLE TO FINISH normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1000");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1004");
		signAndLogout("afterTest", "UAS1004");
	}

	// Select: Severe - Due to diminished energy, UNABLE TO START SOME normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1000");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS1005");
		signAndLogout("afterTest", "UAS1005");
	}

	// Select: Unable to commence any normal day-to-day activities - Due to
	// diminished energy
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1000");

		// Select Option6
		selectOptionAndTakeScreenshot("UAS1006");
		signAndLogout("afterTest", "UAS1006");
	}

	// Inappropriate public sexual behavior or public disrobing
	@Test(groups = "UAS Assessment Details: Inappropriate public sexual behavior or public disrobing")
	public void verifyIPSBPDoption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1100");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1101");
		signAndLogout("afterTest", "UAS1101");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Inappropriate public sexual behavior or public disrobing")
	public void verifyIPSBPDoption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1100");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1102");
		signAndLogout("afterTest", "UAS1102");
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate public sexual behavior or public disrobing")
	public void verifyIPSBPDoption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1100");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1103");
		signAndLogout("afterTest", "UAS1103");
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate public sexual behavior or public disrobing")
	public void verifyIPSBPDoption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1100");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1104");
		signAndLogout("afterTest", "UAS1104");
	}

	// Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate public sexual behavior or public disrobing")
	public void verifyIPSBPDoption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1100");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS1105");
		signAndLogout("afterTest", "UAS1105");
	}

	// Pain
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1200");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1201");
		signAndLogout("afterTest", "UAS1201");
	}

	// Select: No issue of pain
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1200");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1202");
		signAndLogout("afterTest", "UAS1202");
	}

	// Select: Controlled adequately by therapeutic regimen
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1200");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1203");
		signAndLogout("afterTest", "UAS1203");
	}

	// Select: Controlled when therapeutic regimen followed, but not always followed
	// as ordered
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1200");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1204");
		signAndLogout("afterTest", "UAS1204");
	}

	// Select: Therapeutic regimen followed, but pain control not adequate
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1200");

		// Select Option5
		selectOptionAndTakeScreenshot("UAS1205");
		signAndLogout("afterTest", "UAS1205");
	}

	// Select: No therapeutic regimen being followed for pain; pain not adequately
	// controlled
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1200");

		// Select Option6
		selectOptionAndTakeScreenshot("UAS1206");
		signAndLogout("afterTest", "UAS1206");
	}

	// Resist Care
	// Select: Select an option
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1300");

		// Select Option1
		selectOptionAndTakeScreenshot("UAS1301");
		signAndLogout("afterTest", "UAS1301");
	}

	// Select: Not Present
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1300");

		// Select Option2
		selectOptionAndTakeScreenshot("UAS1302");
		signAndLogout("afterTest", "UAS1302");
	}

	// Select: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1300");

		// Select Option3
		selectOptionAndTakeScreenshot("UAS1303");
		signAndLogout("afterTest", "UAS1303");
	}

	// Select: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1300");

		// Select Option4
		selectOptionAndTakeScreenshot("UAS1304");
		signAndLogout("afterTest", "UAS1304");
	}

	// Select: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("UAS1300");
		// Select Option5
		selectOptionAndTakeScreenshot("UAS1305");
		signAndLogout("afterTest", "UAS1305");
	}

	// IADL
	// Meal Preparation Response
	// Select: Select an option
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0101");
		signAndLogout("afterTest", "IADL0101");
	}

	// Select: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option2
		selectOptionAndTakeScreenshot("IADL0102");
		signAndLogout("afterTest", "IADL0102");
	}

	// Select: Setup help only
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option3
		selectOptionAndTakeScreenshot("IADL0103");
		signAndLogout("afterTest", "IADL0103");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option4
		selectOptionAndTakeScreenshot("IADL0104");
		signAndLogout("afterTest", "IADL0104");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option5
		selectOptionAndTakeScreenshot("IADL0105");
		signAndLogout("afterTest", "IADL0105");
	}

	// Select: Extensive assistance - help throughout task, but performs 50% or more
	// of task on own
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option6
		selectOptionAndTakeScreenshot("IADL0106");
		signAndLogout("afterTest", "IADL0106");
	}

	// Select: Maximal assistance - help throughout task, but performs less than 50%
	// of task on own
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option7
		selectOptionAndTakeScreenshot("IADL0107");
		signAndLogout("afterTest", "IADL0107");
	}

	// Select: Select: Total dependence - full performance by others during all
	// episodes
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option8
		selectOptionAndTakeScreenshot("IADL0108");
		signAndLogout("afterTest", "IADL0108");
	}

	// Select: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Meal Preparation")
	public void verifyMealPrepOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0100");
		// Select Option9
		selectOptionAndTakeScreenshot("IADL0109");
		signAndLogout("afterTest", "IADL0109");
	}

	// Ordinary Housework Response
	// Select: Select an option
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0201");
		signAndLogout("afterTest", "IADL0201");
	}

	// Select: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option2
		selectOptionAndTakeScreenshot("IADL0202");
		signAndLogout("afterTest", "IADL0202");
	}

	// Select: Setup help only
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option3
		selectOptionAndTakeScreenshot("IADL0203");
		signAndLogout("afterTest", "IADL0203");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option4
		selectOptionAndTakeScreenshot("IADL0204");
		signAndLogout("afterTest", "IADL0204");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option5
		selectOptionAndTakeScreenshot("IADL0205");
		signAndLogout("afterTest", "IADL0205");
	}

	// Select: Extensive assistance - help throughout task, but performs 50% or more
	// of task on own
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option6
		selectOptionAndTakeScreenshot("IADL0206");
		signAndLogout("afterTest", "IADL0206");
	}

	// Select: Maximal assistance - help throughout task, but performs less than 50%
	// of task on own
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option7
		selectOptionAndTakeScreenshot("IADL0207");
		signAndLogout("afterTest", "IADL0207");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option8
		selectOptionAndTakeScreenshot("IADL0208");
		signAndLogout("afterTest", "IADL0208");
	}

	// Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0200");
		// Select Option9
		selectOptionAndTakeScreenshot("IADL0209");
		signAndLogout("afterTest", "IADL0209");
	}

	// Shopping Response
	// Select: Select an option
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0301");
		signAndLogout("afterTest", "IADL0301");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option1
		selectOptionAndTakeScreenshot("IADL0302");
		signAndLogout("afterTest", "IADL0302");
	}

	// Setup help only
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option3
		selectOptionAndTakeScreenshot("IADL0303");
		signAndLogout("afterTest", "IADL0303");
	}

	// Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option4
		selectOptionAndTakeScreenshot("IADL0304");
		signAndLogout("afterTest", "IADL0304");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option5
		selectOptionAndTakeScreenshot("IADL0305");
		signAndLogout("afterTest", "IADL0305");
	}

	// Select: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option6
		selectOptionAndTakeScreenshot("IADL0306");
		signAndLogout("afterTest", "IADL0306");
	}

	// Select: Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option7
		selectOptionAndTakeScreenshot("IADL0307");
		signAndLogout("afterTest", "IADL0307");
	}

	// Select: Select: Total dependence - full performance by others during all
	// episodes
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option8
		selectOptionAndTakeScreenshot("IADL0308");
		signAndLogout("afterTest", "IADL0308");
	}

	// Select: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("IADL0300");
		// Select Option9
		selectOptionAndTakeScreenshot("IADL0309");
		signAndLogout("afterTest", "IADL0309");
	}

	// ADL - Self Performance
	// Bathing Response
	// Select: Select an option
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0101");
		signAndLogout("afterTest", "ADL0101");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0102");
		signAndLogout("afterTest", "ADL0102");
	}

	// Select: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0103");
		signAndLogout("afterTest", "ADL0103");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0104");
		signAndLogout("afterTest", "ADL0104");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0105");
		signAndLogout("afterTest", "ADL0105");
	}

	// Select: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0106");
		signAndLogout("afterTest", "ADL0106");
	}

	// Select:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0107");
		signAndLogout("afterTest", "ADL0107");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0108");
		signAndLogout("afterTest", "ADL0108");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0100");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0109");
		signAndLogout("afterTest", "ADL0109");
	}

	// Personal Hygiene

	// Select an option;
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0201");
		signAndLogout("afterTest", "ADL0201");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0202");
		signAndLogout("afterTest", "ADL0202");
	}

	// Independent, setup help only - article or device provided or placed within
	// reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0203");
		signAndLogout("afterTest", "ADL0203");
	}

	// Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0204");
		signAndLogout("afterTest", "ADL0204");
	}

	// Limited assistance - guided maneuvering of limbs, physical guidance without
	// taking weight
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0205");
		signAndLogout("afterTest", "ADL0205");
	}

	// Extensive assistance - weight-bearing support (including lifting limbs) by 1
	// helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0206");
		signAndLogout("afterTest", "ADL0206");
	}

	// Maximal assistance - weight-bearing support (including lifting limbs) by 2+
	// helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0207");
		signAndLogout("afterTest", "ADL0207");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0208");
		signAndLogout("afterTest", "ADL0208");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0200");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0209");
		signAndLogout("afterTest", "ADL0209");
	}

	// Dressing Upper Body
	// Select an option
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0301");
		signAndLogout("afterTest", "ADL0301");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0302");
		signAndLogout("afterTest", "ADL0302");
	}

	// Independent, setup help only - article or device provided or placed within
	// reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0303");
		signAndLogout("afterTest", "ADL0303");
	}

	// Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0304");
		signAndLogout("afterTest", "ADL0304");
	}

	// Limited assistance - guided maneuvering of limbs, physical guidance without
	// taking weight
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0305");
		signAndLogout("afterTest", "ADL0305");
	}

	// Extensive assistance - weight-bearing support (including lifting limbs) by 1
	// helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0306");
		signAndLogout("afterTest", "ADL0306");
	}

	// Maximal assistance - weight-bearing support (including lifting limbs) by 2+
	// helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0307");
		signAndLogout("afterTest", "ADL0307");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0308");
		signAndLogout("afterTest", "ADL0308");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0300");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0309");
		signAndLogout("afterTest", "ADL0309");
	}

	// Dressing Lower Body
	// Select an option
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0401");
		signAndLogout("afterTest", "ADL0401");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0402");
		signAndLogout("afterTest", "ADL0402");
	}

	// Independent, setup help only - article or device provided or placed within
	// reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0403");
		signAndLogout("afterTest", "ADL0403");
	}

	// Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0404");
		signAndLogout("afterTest", "ADL0404");
	}

	// Limited assistance - guided maneuvering of limbs, physical guidance without
	// taking weight
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0405");
		signAndLogout("afterTest", "ADL0405");
	}

	// Extensive assistance - weight-bearing support (including lifting limbs) by 1
	// helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0406");
		signAndLogout("afterTest", "ADL0406");
	}

	// Maximal assistance - weight-bearing support (including lifting limbs) by 2+
	// helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0407");
		signAndLogout("afterTest", "ADL0407");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0408");
		signAndLogout("afterTest", "ADL0408");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0400");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0409");
		signAndLogout("afterTest", "ADL0409");
	}

	// LOCOMOTION
	// Select an option
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0501");
		signAndLogout("afterTest", "ADL0501");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0502");
		signAndLogout("afterTest", "ADL0502");
	}

	// Select: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0503");
		signAndLogout("afterTest", "ADL0503");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0504");
		signAndLogout("afterTest", "ADL0504");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0505");
		signAndLogout("afterTest", "ADL0505");
	}

	// Select: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0506");
		signAndLogout("afterTest", "ADL0506");
	}

	// Select:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0507");
		signAndLogout("afterTest", "ADL0507");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0508");
		signAndLogout("afterTest", "ADL0508");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0500");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0509");
		signAndLogout("afterTest", "ADL0509");
	}

	// Transfer Toilet

	// Select an option
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0601");
		signAndLogout("afterTest", "ADL0601");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0602");
		signAndLogout("afterTest", "ADL0602");
	}

	// Select: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0603");
		signAndLogout("afterTest", "ADL0602");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0604");
		signAndLogout("afterTest", "ADL0604");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0605");
		signAndLogout("afterTest", "ADL0605");
	}

	// Select: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 60% or more of subtasks
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0606");
		signAndLogout("afterTest", "ADL0606");
	}

	// Select:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 60% of subtasks
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0607");
		signAndLogout("afterTest", "ADL0607");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0608");
		signAndLogout("afterTest", "ADL0608");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0600");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0609");
		signAndLogout("afterTest", "ADL0609");
	}

	// Toileting

	// Select an option
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0701");
		signAndLogout("afterTest", "ADL0701");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0702");
		signAndLogout("afterTest", "ADL0702");
	}

	// Select: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0703");
		signAndLogout("afterTest", "ADL0703");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0704");
		signAndLogout("afterTest", "ADL0704");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0705");
		signAndLogout("afterTest", "ADL0705");
	}

	// Select: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 70% or more of subtasks
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0706");
		signAndLogout("afterTest", "ADL0706");
	}

	// Select:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 70% of subtasks
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0707");
		signAndLogout("afterTest", "ADL0707");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0708");
		signAndLogout("afterTest", "ADL0708");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0700");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0709");
		signAndLogout("afterTest", "ADL0709");
	}

	// Bed Mobility
	// Select an option
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0801");
		signAndLogout("afterTest", "ADL0801");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0802");
		signAndLogout("afterTest", "ADL0802");
	}

	// Select: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0803");
		signAndLogout("afterTest", "ADL0803");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0804");
		signAndLogout("afterTest", "ADL0804");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0805");
		signAndLogout("afterTest", "ADL0805");
	}

	// Select: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 80% or more of subtasks
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0806");
		signAndLogout("afterTest", "ADL0806");
	}

	// Select:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 80% of subtasks
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0807");
		signAndLogout("afterTest", "ADL0807");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0808");
		signAndLogout("afterTest", "ADL0808");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0800");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0809");
		signAndLogout("afterTest", "ADL0809");
	}

	// Eating
	// Select an option
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption1() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option1
		selectOptionAndTakeScreenshot("ADL0901");
		signAndLogout("afterTest", "ADL0901");
	}

	// Independent - no physical assistance, setup, or supervision in any episode
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption2() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option2
		selectOptionAndTakeScreenshot("ADL0902");
		signAndLogout("afterTest", "ADL0902");
	}

	// Select: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption3() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option3
		selectOptionAndTakeScreenshot("ADL0903");
		signAndLogout("afterTest", "ADL0903");
	}

	// Select: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption4() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option4
		selectOptionAndTakeScreenshot("ADL0904");
		signAndLogout("afterTest", "ADL0904");
	}

	// Select: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption5() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option5
		selectOptionAndTakeScreenshot("ADL0905");
		signAndLogout("afterTest", "ADL0905");
	}

	// Select: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 90% or more of subtasks
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption6() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option6
		selectOptionAndTakeScreenshot("ADL0906");
		signAndLogout("afterTest", "ADL0906");
	}

	// Select:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 90% of subtasks
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption7() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option7
		selectOptionAndTakeScreenshot("ADL0907");
		signAndLogout("afterTest", "ADL0907");
	}

	// Select: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption8() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option8
		selectOptionAndTakeScreenshot("ADL0908");
		signAndLogout("afterTest", "ADL0908");
	}

	// Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption9() throws IOException, InterruptedException, AWTException {

		clickDropdown("ADL0900");
		// Select Option9
		selectOptionAndTakeScreenshot("ADL0909");
		signAndLogout("afterTest", "ADL0909");
	}
}
