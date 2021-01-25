package Smoke;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class test {

	public static void main(String[] args) throws IOException {
		String strconfigPath= "resources\\config.properties";
	FileInputStream stm= new  FileInputStream(strconfigPath);
	Properties prop= new Properties();
	prop.load(stm);
	
	System.out.println(prop.getProperty("url"));
	
	}
	
	


}
