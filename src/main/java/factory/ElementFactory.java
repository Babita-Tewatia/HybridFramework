package factory;

import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import util.ReportUtil;

public class ElementFactory {

	
	private static WebElement getElement(String strLocVal) throws IOException {
		return BrowserFactory.getBrowser().findElement(By.xpath(strLocVal));	
	}
	public static void clickElement(String strLoc) throws IOException {
		getElement(strLoc).click();
		ReportUtil.logPass("clicking the element '" +  strLoc + "'");
	}

	public static void setData(String strLoc,String strData) throws IOException {
		getElement(strLoc).sendKeys(strData);
		ReportUtil.logPass("setting the data '" + strData + "'on element'" +  strLoc + "'");
	}

}

