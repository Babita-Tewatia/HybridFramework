package util;

import java.io.IOException;
import java.sql.Timestamp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

 class ProjectReporter {
	 public static void main(String[] args) throws IOException, InterruptedException {
		 String strFileName= "Report_" + new Timestamp(System.currentTimeMillis());
		 strFileName= strFileName.replace("-","_").replace(" ", "_").replace(":","_").replace(".","_");
		 System.out.println(strFileName);
		 Thread.sleep(1000);
		 strFileName= "Report_" + new Timestamp(System.currentTimeMillis());
		 strFileName= strFileName.replace("-","_").replace(" ", "_").replace(":","_").replace(".","_");
		 System.out.println(strFileName);
		 Thread.sleep(1000);
		 strFileName= "Report_" + new Timestamp(System.currentTimeMillis());
		 strFileName= strFileName.replace("-","_").replace(" ", "_").replace(":","_").replace(".","_");
		 System.out.println(strFileName);
		 
		 
	 }
	 
	 public static void main1(String[] args) throws IOException {
		String strHTMLPath="Reports/test7july.html";
		ExtentReports extent= new ExtentReports();
		ExtentHtmlReporter reporter= new ExtentHtmlReporter(strHTMLPath);
		extent.attachReporter(reporter);
		
		ExtentTest testCaseReport= extent.createTest("TC01");
		testCaseReport.log(Status.PASS,"entered the user id");
		testCaseReport.log(Status.PASS,"entered the Password");
		testCaseReport.log(Status.PASS,"click on login");
		testCaseReport.log(Status.PASS,"logout successfully");
		
		
		testCaseReport= extent.createTest("TC02");
		testCaseReport.log(Status.PASS,"entered the user id");
		testCaseReport.log(Status.PASS,"entered the Password");
		testCaseReport.log(Status.PASS,"click on login");
		testCaseReport.log(Status.PASS,"logout successfully");
		
		testCaseReport= extent.createTest("TC03");
		testCaseReport.log(Status.PASS,"entered the user id");
		testCaseReport.log(Status.PASS,"entered the Password");
		testCaseReport.log(Status.FAIL,"click on login");
		testCaseReport.addScreenCaptureFromPath("C:\\Users\\sweekar\\Desktop\\screen1.jpg");
		
		extent.flush();
		ReportUtil.initiateTCReport("New TC01");
		ReportUtil.logPass("enter user name");
		ReportUtil.logPass("enter password");
		ReportUtil.logPass("click on login button");
		
		
		ReportUtil.initiateTCReport("New TC02");
		ReportUtil.logPass("enter user name");
		ReportUtil.logPass("enter password");
		ReportUtil.logfail("click on login button");
		ReportUtil.closeReport();
	 }
	
}
