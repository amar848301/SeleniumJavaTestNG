package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterUtil {
	
	public static ExtentReports extent;
	
	public static ExtentReports Reporter()
	{
		ExtentSparkReporter report = new ExtentSparkReporter("C:\\Users\\amarv\\eclipse-workspace\\SeleniumJavaTestNG\\test-output\\sparkreports");
		report.config().setDocumentTitle("Autoation Report");
		report.config().setReportName("Extent Report");
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Host name", "Localhost");
		extent.setSystemInfo("Environment", "stg");
		extent.setSystemInfo("Reporter name", "Amar Vijay");
		return extent;
	}
}
