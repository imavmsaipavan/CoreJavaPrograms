package com.rbg.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader 
{

	Properties objfile;

	public PropertiesReader() throws IOException
	{

		FileInputStream file = new FileInputStream(".//Properties//Test1.properties");

		objfile = new Properties();

		objfile.load(file);  

	}

	public String chromePath()
	{
		String path = objfile.getProperty("chrome") ;
		return path;

	}

	public String URL()
	{
		return objfile.getProperty("URL");
	}

	public String username()
	{
		return objfile.getProperty("userName");
	}

	public String password()
	{
		return objfile.getProperty("password");
	}


}