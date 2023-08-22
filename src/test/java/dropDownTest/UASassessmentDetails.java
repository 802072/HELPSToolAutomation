package dropDownTest;

import java.io.IOException;
import java.awt.AWTException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentReport.BaseTestDD;

public class UASassessmentDetails extends BaseTestDD {

	@BeforeSuite
	public void initialiseExtentReports() {

		// UAS
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsToolUASDropdown.html");
		sparkReporter_all.config().setReportName("Helps Tool: Verify UAS Assessment Details Dropdown Option Values");

		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter_all);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		// extentReports.setSystemInfo("Environment", "Test Environment");
		// extentReports.setSystemInfo("Environment", "Production Environment");
	}

	// UAS Assessment Details
	// Cognitive Skills for Daily Decision Making
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0101");
		signatureAndLogout("UAS0101");
	}

	// Option2: Independent - Decisions consistent, reasonable and safe
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0102");
		signatureAndLogout("UAS0102");
	}

	// Option3: Modified independence - Some difficulty in new situations only
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0103");
		signatureAndLogout("UAS0103");
	}

	// Option4: Minimally impaired - In specific recurring situations, decisions
	// become poor or unsafe; cues / supervision necessary at those times
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0104");
		signatureAndLogout("UAS0104");
	}

	// Option5: Moderately impaired - Decisions consistently poor or unsafe;
	// cues/supervision required at all times
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0105");
		selectOption("UAS0105");
		signatureAndLogout("UAS0105");
	}

	// Option6: Severely impaired - Never or rarely makes decisions
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0106");
		signatureAndLogout("UAS0106");
	}

	// Option7: No discernable consciousness
	@Test(groups = "UAS Assessment Details: Cognitive Skills for Daily Decision Making")
	public void verifyCognitiveSkillOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0100");
		selectOption("UAS0107");
		signatureAndLogout("UAS0107");
	}

	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0201");
		signatureAndLogout("UAS0201");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0202");
		signatureAndLogout("UAS0202");
	}

	// Option3: Primary diagnosis/diagnosis for stay/placement
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0203");
		signatureAndLogout("UAS0203");
	}

	// Option4: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0204");
		signatureAndLogout("UAS0204");
	}

	// Option5: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Anxiety")
	public void verifyPsychiatricAnxietyOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0200");
		selectOption("UAS0205");
		signatureAndLogout("UAS0205");
	}

	// Wandering
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0301");
		signatureAndLogout("UAS0301");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0302");
		signatureAndLogout("UAS0302");
	}

	// Option3 Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0303");
		signatureAndLogout("UAS0303");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0304");
		signatureAndLogout("UAS0304");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Wandering")
	public void verifyWanderingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0300");
		selectOption("UAS0305");
		signatureAndLogout("UAS0305");
	}

	// PsychiatricDepression
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0401");
		signatureAndLogout("UAS0401");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0402");
		signatureAndLogout("UAS0402");
	}

	// Option3: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0403");
		signatureAndLogout("UAS0403");
	}

	// Option4: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0404");
		signatureAndLogout("UAS0404");
	}

	// Option5: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Depression")
	public void verifyPsychiatricDepressionOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0400");
		selectOption("UAS0405");
		signatureAndLogout("UAS0405");
	}

	// VerbalAbuse
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0501");
		signatureAndLogout("UAS0501");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0502");
		signatureAndLogout("UAS0502");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0503");
		signatureAndLogout("UAS0503");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0504");
		signatureAndLogout("UAS0504");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Verbal Abuse")
	public void verifyVerbalAbuseOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0500");
		selectOption("UAS0505");
		signatureAndLogout("UAS0505");
	}

	// Psychiatric Schizophrenia
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0601");
		signatureAndLogout("UAS0601");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0602");
		signatureAndLogout("UAS0602");
	}

	// Option3: Primary diagnosis/diagnosis for current stay
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0603");
		signatureAndLogout("UAS0603");
	}

	// Option4: Diagnosis present, receiving active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0604");
		signatureAndLogout("UAS0604");
	}

	// Option5: Diagnosis present, monitored but no active treatment
	@Test(groups = "UAS Assessment Details: Psychiatric Schizophrenia")
	public void verifyPsychiatricSchizophreniaOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0600");
		selectOption("UAS0605");
		signatureAndLogout("UAS0605");
	}

	// Physical Abuse
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0701");
		signatureAndLogout("UAS0701");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0702");
		signatureAndLogout("UAS0702");
	}

	// Option3: Not Present
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0703");
		signatureAndLogout("UAS0703");
	}

	// Option4: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0704");
		signatureAndLogout("UAS0704");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Physical Abuse")
	public void verifyPhysicalAbuseOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0700");
		selectOption("UAS0705");
		signatureAndLogout("UAS0705");
	}

	// Dyspnea
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0801");
		signatureAndLogout("UAS0801");
	}

	// Option2: Absence of symptom
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0802");
		signatureAndLogout("UAS0802");
	}

	// Option3: Absent at rest, but present when performed moderate activities
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0803");
		signatureAndLogout("UAS0803");
	}

	// Option4: Absent at rest, but present when performed normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0804");
		signatureAndLogout("UAS0804");
	}

	// Option5: Present at rest
	@Test(groups = "UAS Assessment Details: Dyspnea")
	public void verifyDyspneaOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0800");
		selectOption("UAS0805");
		signatureAndLogout("UAS0805");
	}

	// Socially Inappropriate Or Disruptive Behavior
	// Option1: Select an Option
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0901");
		signatureAndLogout("UAS0901");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0902");
		signatureAndLogout("UAS0902");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0903");
		signatureAndLogout("UAS0903");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0904");
		signatureAndLogout("UAS0904");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Socially Inappropriate Or Disruptive Behavior")
	public void verifySIDBoption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS0900");
		selectOption("UAS0905");
		signatureAndLogout("UAS0905");
	}

	// Fatigue
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1001");
		signatureAndLogout("UAS1001");
	}

	// Option2: None
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1002");
		signatureAndLogout("UAS1002");
	}

	// Option3: Minimal - Diminished energy but completes normal day-to-day
	// activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1003");
		signatureAndLogout("UAS1003");
	}

	// Option4: Moderate - Due to diminished energy, UNABLE TO FINISH normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1004");
		signatureAndLogout("UAS1004");
	}

	// Option5: Severe - Due to diminished energy, UNABLE TO START SOME normal
	// day-to-day activities
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1005");
		signatureAndLogout("UAS1005");
	}

	// Option6: Unable to commence any normal day-to-day activities - Due to
	// diminished energy
	@Test(groups = "UAS Assessment Details: Fatigue")
	public void verifyFatigueOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1000");
		selectOption("UAS1006");
		signatureAndLogout("UAS1006");
	}

	// Inappropriate Public Sexual Behavior Or Public Disrobing
	// Option1: Select an Option
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1101");
		signatureAndLogout("UAS1101");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1102");
		signatureAndLogout("UAS1102");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1103");
		signatureAndLogout("UAS1103");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1104");
		signatureAndLogout("UAS1104");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Inappropriate Public Sexual Behavior Or Public Disrobing")
	public void verifyIPSBPDoption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1100");
		selectOption("UAS1105");
		signatureAndLogout("UAS1105");
	}

	// Pain
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1201");
		signatureAndLogout("UAS1201");
	}

	// Option2: No issue of pain
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1202");
		signatureAndLogout("UAS1202");
	}

	// Option3: Pain intensity acceptable to individual; no treatment regimen or
	// change in regimen required
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1203");
		signatureAndLogout("UAS1203");
	}

	// Option4: Controlled adequately by therapeutic regimen
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1204");
		signatureAndLogout("UAS1204");
	}

	// Option5: Controlled when therapeutic regimen followed, but not always
	// followed as ordered
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1205");
		signatureAndLogout("UAS1205");
	}

	// Option6: Therapeutic regimen followed, but pain control not adequate
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1206");
		signatureAndLogout("UAS1206");
	}

	// Option7: No therapeutic regimen being followed for pain; pain not adequately
	// controlled
	@Test(groups = "UAS Assessment Details: Pain")
	public void verifyPainOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1200");
		selectOption("UAS1207");
		signatureAndLogout("UAS1207");
	}

	// Resist Care
	// Option1: Select an option
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1301");
		signatureAndLogout("UAS1301");
	}

	// Option2: Not Present
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1302");
		signatureAndLogout("UAS1302");
	}

	// Option3: Present but not exhibited in last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1303");
		signatureAndLogout("UAS1303");
	}

	// Option4: Exhibited on 1-2 days of last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1304");
		signatureAndLogout("UAS1304");
	}

	// Option5: Exhibited daily in last 3 days
	@Test(groups = "UAS Assessment Details: Resist Care")
	public void verifyResistCareOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("UAS1300");
		selectOption("UAS1305");
		signatureAndLogout("UAS1305");
	}
}