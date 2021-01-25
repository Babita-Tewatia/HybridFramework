package factory;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;


import util.commonfunctions;

public class BrowserFactory {
	//Actions action = new Actions(driver);

	private static ChromeDriver driver;
	public static ChromeDriver getBrowser() throws IOException
	{
		if(driver==null) {
		String strdriverPath= System.getProperty("user.dir") + commonfunctions.getvalue("chromePath");
		System.setProperty("webdriver.chrome.driver",strdriverPath);
		driver= new ChromeDriver();
		driver.get(commonfunctions.getvalue("url"));
		
		
		}
		return driver;
	}
	
	public static String getBrowserTitle() throws IOException
	{
		return getBrowser().getTitle();
	}

}
