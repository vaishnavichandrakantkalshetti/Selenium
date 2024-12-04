package Com.Crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Com.Crm.BaseClass.BaseClass;

public class Listeners extends BaseClass implements ITestListener {

	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
	}

	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO,name+" onTestpass");
		test.log(Status.PASS,name+ " is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO,name+" onTestfailure");
		test.log(Status.FAIL,name+ " is failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO,name+" onTestskipped");
		test.log(Status.SKIP,name+ " is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		//create ExtentsparkReport
		spark=new ExtentSparkReporter("\\src\\main\\resources\\VTigerReport.html");
		spark.config().setDocumentTitle("Assignment Programs");
		spark.config().setReportName("Vaishnavi");
		spark.config().setTheme(Theme.DARK);
		//create extent report
		report=new ExtentReports();
		report.setSystemInfo("os","windows");
		report.setSystemInfo("browser","chrome");
		//attch spark
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
}
