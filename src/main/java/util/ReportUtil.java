package util;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

import factory.BrowserFactory;
import sun.net.ftp.FtpDirEntry.Type;

public class ReportUtil {
	
	private static ExtentHtmlReporter reporter;
	private static ExtentReports extent;
	private static ExtentTest testCaseReport;
	
	public static ExtentReports getReporter()
	{
	if(extent==null){
		 String strFileName= "Report_" + new Timestamp(System.currentTimeMillis());
		 strFileName= strFileName.replace("-","_").replace(" ", "_").replace(":","_").replace(".","_");
		strFileName= "Reports\\" + strFileName + ".html"; 
		extent= new ExtentReports();
		reporter= new ExtentHtmlReporter(strFileName);
		extent.attachReporter(reporter);
	} 
	return extent;
}
	public static void initiateTCReport(String strTestCaseName)
	{
		testCaseReport=getReporter().createTest(strTestCaseName);
		
	}
	public static void logPass(String strmessage) {
		testCaseReport.log(Status.PASS, strmessage);
	}
	public static void logfail(String strmessage) {
		testCaseReport.log(Status.FAIL, strmessage);
	}
	
	public static void getScreenShot(String strPath) throws WebDriverException, IOException {
		File f=((TakesScreenshot)BrowserFactory.getBrowser()).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyfile(f,new file(strPath));
	}
	public static void closeReport() {
		getReporter().flush();
	}
}