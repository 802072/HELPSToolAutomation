package dropDownTest;

import java.io.IOException;
import java.awt.AWTException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentReport.BaseTestDD;

public class ADLselfPerformance extends BaseTestDD {

	
	@BeforeSuite
	public void initialiseExtentReports() {
		// ADL
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsToolADLDropdown.html");
		sparkReporter_all.config().setReportName("Helps Tool: Verify ADL - Self Performance Option Values");
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter_all);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		// extentReports.setSystemInfo("Environment", "Test Environment");

	}

	// ADL - Self Performance
	// Dropdown1: Bathing Response
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		
		clickDropdown("ADL0100");
		selectOption("ADL0101");
		verifyOptionIsSelected("ADL0100", "ADL0101");
		signatureAndLogout("ADL0101");
		
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0102");
		verifyOptionIsSelected("ADL0100", "ADL0102");
		signatureAndLogout("ADL0102");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0103");
		verifyOptionIsSelected("ADL0100", "ADL0103");
		signatureAndLogout("ADL0103");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0104");
		verifyOptionIsSelected("ADL0100", "ADL0104");
		signatureAndLogout("ADL0104");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0105");
		verifyOptionIsSelected("ADL0100", "ADL0105");
		signatureAndLogout("ADL0105");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0106");
		verifyOptionIsSelected("ADL0100", "ADL0106");
		signatureAndLogout("ADL0106");
	}

	// Option7:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0107");
		verifyOptionIsSelected("ADL0100", "ADL0107");
		signatureAndLogout("ADL0107");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0108");
		verifyOptionIsSelected("ADL0100", "ADL0108");
		signatureAndLogout("ADL0108");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Bathing Response")
	public void verifyBathingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0100");
		selectOption("ADL0109");
		verifyOptionIsSelected("ADL0100", "ADL0109");
		signatureAndLogout("ADL0109");
	}

	// Dropdown2: Personal Hygiene
	// Option1: Select an option;
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0201");
		verifyOptionIsSelected("ADL0200", "ADL0201");
		signatureAndLogout("ADL0201");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0202");
		verifyOptionIsSelected("ADL0200", "ADL0202");
		signatureAndLogout("ADL0202");
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
		verifyOptionIsSelected("ADL0200", "ADL0203");
		signatureAndLogout("ADL0203");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0204");
		verifyOptionIsSelected("ADL0200", "ADL0204");
		signatureAndLogout("ADL0204");
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
		verifyOptionIsSelected("ADL0200", "ADL0205");
		signatureAndLogout("ADL0205");
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
		verifyOptionIsSelected("ADL0200", "ADL0206");
		signatureAndLogout("ADL0206");
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
		verifyOptionIsSelected("ADL0200", "ADL0207");
		signatureAndLogout("ADL0207");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0208");
		verifyOptionIsSelected("ADL0200", "ADL0208");
		signatureAndLogout("ADL0208");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Personal Hygiene")
	public void verifyPersonalHygieneOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0200");
		selectOption("ADL0209");
		verifyOptionIsSelected("ADL0200", "ADL0209");
		signatureAndLogout("ADL0209");
	}

	// Dropdown3: Dressing Upper Body
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0301");
		verifyOptionIsSelected("ADL0300", "ADL0301");
		signatureAndLogout("ADL0301");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0302");
		verifyOptionIsSelected("ADL0300", "ADL0302");
		signatureAndLogout("ADL0302");
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
		verifyOptionIsSelected("ADL0300", "ADL0303");
		signatureAndLogout("ADL0303");
	}

	// OPtion4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0304");
		verifyOptionIsSelected("ADL0300", "ADL0304");
		signatureAndLogout("ADL0304");
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
		verifyOptionIsSelected("ADL0300", "ADL0305");
		signatureAndLogout("ADL0305");
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
		verifyOptionIsSelected("ADL0300", "ADL0306");
		signatureAndLogout("ADL0306");
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
		verifyOptionIsSelected("ADL0300", "ADL0307");
		signatureAndLogout("ADL0307");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0308");
		verifyOptionIsSelected("ADL0300", "ADL0308");
		signatureAndLogout("ADL0308");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Dressing Upper Body")
	public void verifyDressingUbodyOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0300");
		selectOption("ADL0309");
		verifyOptionIsSelected("ADL0300", "ADL0309");
		signatureAndLogout("ADL0309");
	}

	// Dropdown4: Dressing Lower Body
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0401");
		verifyOptionIsSelected("ADL0400", "ADL0401");
		signatureAndLogout("ADL0401");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0402");
		verifyOptionIsSelected("ADL0400", "ADL0402");
		signatureAndLogout("ADL0402");
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
		verifyOptionIsSelected("ADL0400", "ADL0403");
		signatureAndLogout("ADL0403");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0404");
		verifyOptionIsSelected("ADL0400", "ADL0404");
		signatureAndLogout("ADL0404");
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
		verifyOptionIsSelected("ADL0400", "ADL0405");
		signatureAndLogout("ADL0405");
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
		verifyOptionIsSelected("ADL0400", "ADL0406");
		signatureAndLogout("ADL0406");
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
		verifyOptionIsSelected("ADL0400", "ADL0407");
		signatureAndLogout("ADL0407");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0408");
		verifyOptionIsSelected("ADL0400", "ADL0408");
		signatureAndLogout("ADL0408");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Dressing Lower Body")
	public void verifyDressingLbodyOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0400");
		selectOption("ADL0409");
		verifyOptionIsSelected("ADL0400", "ADL0409");
		signatureAndLogout("ADL0409");
	}

	// Dropdown5: Locomotion
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0501");
		verifyOptionIsSelected("ADL0500", "ADL0501");
		signatureAndLogout("ADL0501");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0502");
		verifyOptionIsSelected("ADL0500", "ADL0502");
		signatureAndLogout("ADL0502");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0503");
		verifyOptionIsSelected("ADL0500", "ADL0503");
		signatureAndLogout("ADL0503");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0504");
		verifyOptionIsSelected("ADL0500", "ADL0504");
		signatureAndLogout("ADL0504");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0505");
		verifyOptionIsSelected("ADL0500", "ADL0505");
		signatureAndLogout("ADL0505");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0506");
		verifyOptionIsSelected("ADL0500", "ADL0506");
		signatureAndLogout("ADL0506");
	}

	// Option7:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 50% of subtasks
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0507");
		verifyOptionIsSelected("ADL0500", "ADL0507");
		signatureAndLogout("ADL0507");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0508");
		verifyOptionIsSelected("ADL0500", "ADL0508");
		signatureAndLogout("ADL0508");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Locomotion")
	public void verifyLocomotionOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0500");
		selectOption("ADL0509");
		verifyOptionIsSelected("ADL0500", "ADL0509");
		signatureAndLogout("ADL0509");
	}

	// Dropdown6: Transfer Toilet
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0601");
		verifyOptionIsSelected("ADL0600", "ADL0601");
		signatureAndLogout("ADL0601");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0602");
		verifyOptionIsSelected("ADL0600", "ADL0602");
		signatureAndLogout("ADL0602");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0603");
		verifyOptionIsSelected("ADL0600", "ADL0603");
		signatureAndLogout("ADL0603");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0604");
		verifyOptionIsSelected("ADL0600", "ADL0604");
		signatureAndLogout("ADL0604");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0605");
		verifyOptionIsSelected("ADL0600", "ADL0605");
		signatureAndLogout("ADL0605");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 60% or more of subtasks
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0606");
		verifyOptionIsSelected("ADL0600", "ADL0606");
		signatureAndLogout("ADL0606");
	}

	// Option7: Maximal assistance - weight-bearing support (including lifting
	// limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 60% of subtasks
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0607");
		verifyOptionIsSelected("ADL0600", "ADL0607");
		signatureAndLogout("ADL0607");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0608");
		verifyOptionIsSelected("ADL0600", "ADL0608");
		signatureAndLogout("ADL0608");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Transfer Toilet")
	public void verifyTransToiletOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0600");
		selectOption("ADL0609");
		verifyOptionIsSelected("ADL0600", "ADL0609");
		signatureAndLogout("ADL0609");
	}

	// Dropdown7: Toileting
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0701");
		verifyOptionIsSelected("ADL0700", "ADL0701");
		signatureAndLogout("ADL0701");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0702");
		verifyOptionIsSelected("ADL0700", "ADL0702");
		signatureAndLogout("ADL0702");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0703");
		verifyOptionIsSelected("ADL0700", "ADL0703");
		signatureAndLogout("ADL0703");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0704");
		verifyOptionIsSelected("ADL0700", "ADL0704");
		signatureAndLogout("ADL0704");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0705");
		verifyOptionIsSelected("ADL0700", "ADL0705");
		signatureAndLogout("ADL0705");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 70% or more of subtasks
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0706");
		verifyOptionIsSelected("ADL0700", "ADL0706");
		signatureAndLogout("ADL0706");
	}

	// Option7:Maximal assistance - weight-bearing support (including lifting limbs)
	// by 2+ helpers - OR - weight-bearing support for more than 70% of subtasks
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption7() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0707");
		verifyOptionIsSelected("ADL0700", "ADL0707");
		signatureAndLogout("ADL0707");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0708");
		verifyOptionIsSelected("ADL0700", "ADL0708");
		signatureAndLogout("ADL0708");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Toileting")
	public void verifyToiletingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0700");
		selectOption("ADL0709");
		verifyOptionIsSelected("ADL0700", "ADL0709");
		signatureAndLogout("ADL0709");
	}

	// Dropdown8: Bed Mobility
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0801");
		verifyOptionIsSelected("ADL0800", "ADL0801");
		signatureAndLogout("ADL0801");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0802");
		verifyOptionIsSelected("ADL0800", "ADL0802");
		signatureAndLogout("ADL0802");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0803");
		verifyOptionIsSelected("ADL0800", "ADL0803");
		signatureAndLogout("ADL0803");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0804");
		verifyOptionIsSelected("ADL0800", "ADL0804");
		signatureAndLogout("ADL0804");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0805");
		verifyOptionIsSelected("ADL0800", "ADL0805");
		signatureAndLogout("ADL0805");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 80% or more of subtasks
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0806");
		verifyOptionIsSelected("ADL0800", "ADL0806");
		signatureAndLogout("ADL0806");
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
		verifyOptionIsSelected("ADL0800", "ADL0807");
		signatureAndLogout("ADL0807");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0808");
		verifyOptionIsSelected("ADL0800", "ADL0808");
		signatureAndLogout("ADL0808");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Bed Mobility")
	public void verifyBedMobilityOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0800");
		selectOption("ADL0809");
		verifyOptionIsSelected("ADL0800", "ADL0809");
		signatureAndLogout("ADL0809");
	}

	// Dropdown9: Eating
	// Option1: Select an option
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0901");
		verifyOptionIsSelected("ADL0900", "ADL0901");
		signatureAndLogout("ADL0901");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0902");
		verifyOptionIsSelected("ADL0900", "ADL0902");
		signatureAndLogout("ADL0902");
	}

	// Option3: Independent, setup help only - article or device provided or placed
	// within reach, no physical assistance or supervision in any episode
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0903");
		verifyOptionIsSelected("ADL0900", "ADL0903");
		signatureAndLogout("ADL0903");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0904");
		verifyOptionIsSelected("ADL0900", "ADL0904");
		signatureAndLogout("ADL0904");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0905");
		verifyOptionIsSelected("ADL0900", "ADL0905");
		signatureAndLogout("ADL0905");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 90% or more of subtasks
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0906");
		verifyOptionIsSelected("ADL0900", "ADL0906");
		signatureAndLogout("ADL0906");
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
		verifyOptionIsSelected("ADL0900", "ADL0907");
		signatureAndLogout("ADL0907");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0908");
		verifyOptionIsSelected("ADL0900", "ADL0908");
		signatureAndLogout("ADL0908");
	}

	// Option9: Activity did not occur during entire period
	@Test(groups = "ADL - Self Performance: Eating")
	public void verifyEatingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("ADL0900");
		selectOption("ADL0909");
		verifyOptionIsSelected("ADL0900", "ADL0909");
		signatureAndLogout("ADL0909");
	}
}
