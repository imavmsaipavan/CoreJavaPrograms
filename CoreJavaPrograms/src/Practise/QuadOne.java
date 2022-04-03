package Practise;

import java.util.HashMap;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class QuadOne {

	public static void main(String[] args) {

		ExtentHtmlReporter html= new ExtentHtmlReporter("C:\\Users\\mani\\Desktop\\extentReport"+"report.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(html);
		ExtentTest test=report.createTest("test1");
		test.log(Status.PASS, "First Test case");
		report.flush();
		
		
	}
	
}
