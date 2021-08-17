package com.rbg.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.rbg.utilities.GenericFuntion1;


public class OrangeHRMDemo {
	@Test
	public void login_Test() throws IOException, InterruptedException {
	   
		GenericFuntion1 key= new GenericFuntion1();
		key.openBrowser("Chrome");
		key.enterURL("URL");
		key.enterData("Username", "Name");
		key.enterData("Password", "Pass");
		key.click("Login");
		Thread.sleep(2000);
		key.click("Admin");
		Thread.sleep(2000);
		key.click("Add");
		Thread.sleep(2000);
		key.enterData("Emp_Name", "Emp_Name_value");
		Thread.sleep(1000);
		key.enterData("Emp_Username", "Emp_User_value");
		key.enterData("Emp_Password", "Emp_Pass_value");
		key.enterData("Confirm_Pass", "Emp_Pass_value");
		key.click("Save_User");
		Thread.sleep(2000);
		key.enterData("Search_User", "Emp_User_value");
		key.click("Search_User_Button");
		Thread.sleep(2000);
		key.click("Search_User_CheckBox");
		Thread.sleep(1000);
		key.click("User_Delete");
		Thread.sleep(1000);
		key.click("Confirm_Deletion");
		
		
	}
	
}
