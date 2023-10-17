package dropDownTest;

import java.io.IOException;
import java.awt.AWTException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentReport.BaseTestDD;

public class IADLcapacity extends BaseTestDD {

	@BeforeSuite
	public void initialiseExtentReports() {
		// IADL
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("HelpsToolIADLDropdown.html");
		sparkReporter_all.config().setReportName("Helps Tool: Verify IADL - Capacity Dropdown Option Values");

		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter_all);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));

		// extentReports.setSystemInfo("Environment", "Production Environment");
	}

	// IADL
	// Dropdown1: Meal Preparation Response
	// Option1: Select an option
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0101");
		verifyOptionIsSelected("IADL0100", "IADL0101");
		signatureAndLogout("IADL0101");
	}

	// option2: Independent - no physical assistance, setup, or
	// supervision in any episode
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0102");
		verifyOptionIsSelected("IADL0100", "IADL0102");
		signatureAndLogout("IADL0102");
	}

	// Option3: Setup help only
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0103");
		verifyOptionIsSelected("IADL0100", "IADL0103");
		signatureAndLogout("IADL0103");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0104");
		verifyOptionIsSelected("IADL0100", "IADL0104");
		signatureAndLogout("IADL0104");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0105");
		verifyOptionIsSelected("IADL0100", "IADL0105");
		signatureAndLogout("IADL0105");
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
		verifyOptionIsSelected("IADL0100", "IADL0106");
		signatureAndLogout("IADL0106");
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
		verifyOptionIsSelected("IADL0100", "IADL0107");
		signatureAndLogout("IADL0107");
	}

	// Option8: Total dependence - full performance by others during all episodes
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0108");
		verifyOptionIsSelected("IADL0100", "IADL0108");
		signatureAndLogout("IADL0108");
	}

	// Option9: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Meal Preparation Response")
	public void verifyMealPrepOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0100");
		selectOption("IADL0109");
		verifyOptionIsSelected("IADL0100", "IADL0109");
		signatureAndLogout("IADL0109");
	}

	// Dropdown2: Ordinary Housework Response
	// Option1: Select an option
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0201");
		verifyOptionIsSelected("IADL0200", "IADL0201");
		signatureAndLogout("IADL0201");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0202");
		verifyOptionIsSelected("IADL0200", "IADL0202");
		signatureAndLogout("IADL0202");
	}

	// Option3: Setup help only
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0203");
		verifyOptionIsSelected("IADL0200", "IADL0203");
		signatureAndLogout("IADL0203");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0204");
		verifyOptionIsSelected("IADL0200", "IADL0204");
		signatureAndLogout("IADL0204");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0205");
		verifyOptionIsSelected("IADL0200", "IADL0205");
		signatureAndLogout("IADL0205");
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
		verifyOptionIsSelected("IADL0200", "IADL0206");
		signatureAndLogout("IADL0206");
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
		verifyOptionIsSelected("IADL0200", "IADL0207");
		signatureAndLogout("IADL0207");
	}

	// Option8: Total dependence - full performance by others during all
	// episodes
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0208");
		verifyOptionIsSelected("IADL0200", "IADL0208");
		signatureAndLogout("IADL0208");
	}

	// Option9: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Ordinary Housework Response")
	public void verifyOrdinaryHouseworkOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0200");
		selectOption("IADL0209");
		verifyOptionIsSelected("IADL0200", "IADL0209");
		signatureAndLogout("IADL0209");
	}

	// Dropdown3: Shopping Response
	// Option1: Select an option
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption1() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0301");
		verifyOptionIsSelected("IADL0300", "IADL0301");
		signatureAndLogout("IADL0301");
	}

	// Option2: Independent - no physical assistance, setup, or supervision in any
	// episode
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption2() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0302");
		verifyOptionIsSelected("IADL0300", "IADL0302");
		signatureAndLogout("IADL0302");
	}

	// Option3: Setup help only
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption3() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0303");
		verifyOptionIsSelected("IADL0300", "IADL0303");
		signatureAndLogout("IADL0303");
	}

	// Option4: Supervision - oversight/cueing
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption4() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0304");
		verifyOptionIsSelected("IADL0300", "IADL0304");
		signatureAndLogout("IADL0304");
	}

	// Option5: Limited assistance - guided maneuvering of limbs, physical guidance
	// without taking weight
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption5() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0305");
		verifyOptionIsSelected("IADL0300", "IADL0305");
		signatureAndLogout("IADL0305");
	}

	// Option6: Extensive assistance - weight-bearing support (including lifting
	// limbs) by 1 helper where person still performs 50% or more of subtasks
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption6() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0306");
		verifyOptionIsSelected("IADL0300", "IADL0306");
		signatureAndLogout("IADL0306");
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
		verifyOptionIsSelected("IADL0300", "IADL0307");
		signatureAndLogout("IADL0307");
	}

	// Option8: Select: Total dependence - full performance by others during all
	// episodes
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption8() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0308");
		verifyOptionIsSelected("IADL0300", "IADL0308");
		signatureAndLogout("IADL0308");
	}

	// Option9: Activity did not occur - during entire period
	@Test(groups = "IADL - Capacity: Shopping Response")
	public void verifyShoppingOption9() throws IOException, InterruptedException, AWTException {
		login();
		uploadFile();
		clickDropdown("IADL0300");
		selectOption("IADL0309");
		verifyOptionIsSelected("IADL0300", "IADL0309");
		signatureAndLogout("IADL0309");
	}
}
