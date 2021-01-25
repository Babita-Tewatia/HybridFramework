package Smoke;


import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import factory.BrowserFactory;
import util.ReportUtil;
import util.commonfunctions;

	public class login 
{
		@BeforeMethod
		public void initTestCase(Method m) {
			ReportUtil.initiateTCReport(m.getName());
		}
	@Test
	public void TC01() throws IOException
	{
		
		LoginPage objLP= new LoginPage();
		objLP.setUserName("admin");
		objLP.setPassword("admin123");
		objLP.clickLogin();
		objLP.clickWelcome();
		objLP.about();
		objLP.clickLogout();
		
		
	 //WebElement we = Driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a"));

	 //Action.moveToElement(we).build().perform();
	}
	@AfterMethod
	public void endofTestcase(ITestResult oreport)
	{
	if(!oreport.isSuccess())
	{
		ReportUtil.logfail("Exception occours. message is " + oreport.getThrowable().getMessage());
	}
		ReportUtil.closeReport();
		
	}
}
