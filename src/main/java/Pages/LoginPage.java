package Pages;

import java.io.IOException;

import factory.ElementFactory;


public class LoginPage {
	String LocUserName = "//*[@id='txtUsername']";
	String LocPassword = "//*[@id='txtPassword']";
	String LocLogin = "//*[@value='LOGIN']";
	String locWelcome="//*[@id='welcome']";
	String LocLogout="//*[@id=\"welcome-menu\"]/ul/li[2]/a";
	String locabout= "//*[@id=\"aboutDisplayLink\"]";
	
	public void setUserName(String strData) throws IOException
		{
		ElementFactory.setData(LocUserName, strData);	
		}
	
	public void setPassword(String strData) throws IOException
		{
		ElementFactory.setData(LocPassword, strData);	
		}
	public void clickLogin() throws IOException
		{
			ElementFactory.clickElement(LocLogin);		
		}
	
	public void clickWelcome() throws IOException
	{
		ElementFactory.clickElement(locWelcome);	
	
	}
	public void about() throws IOException
	{
		ElementFactory.clickElement(locabout);	
	
	}
	public void clickLogout() throws IOException
	{
		ElementFactory.clickElement(LocLogout);		
		System.out.println("logout");
	}

}
