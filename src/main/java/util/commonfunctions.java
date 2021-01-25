package util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class commonfunctions {
	public static String getvalue(String strkey) throws IOException
	{
		String strconfigPath= "resources\\config.properties";
		FileInputStream stm= new  FileInputStream(strconfigPath);
		Properties prop= new Properties();
		prop.load(stm);
		return prop.getProperty(strkey);
		//System.out.println(prop.getProperty(strkey));
		
	}

}
