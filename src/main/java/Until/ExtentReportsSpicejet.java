package Until;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsSpicejet {
	
		public static ExtentReports GetReport() {
		
		String path="C:\\Users\\HAPPY\\Desktop\\GUVI Project\\SpiceJet\\Reports\\Spicejetreport.html";
		
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Spicejet report");
		
		
		ExtentReports extentreports=new ExtentReports();
		extentreports.attachReporter(report);
		
		return extentreports;

}

}