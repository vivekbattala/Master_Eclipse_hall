package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_properties_file {
	
	public static void main(String[] args) throws IOException
	
	{
		
		FileInputStream fi= new FileInputStream("C:\\Users\\Vivek\\Desktop\\Workspace\\HelloWorld\\src\\selenium\\Utility.properties");
		Properties prop= new Properties();
		prop.load(fi);
		System.out.println(prop.getProperty("login.url"));
		System.out.println(prop.getProperty("login.uname"));
		System.out.println(prop.getProperty("login.pwd"));
		System.out.println(prop.getProperty("login.submit"));
	}

}
