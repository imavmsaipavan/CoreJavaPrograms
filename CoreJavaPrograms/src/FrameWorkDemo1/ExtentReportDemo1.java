package FrameWorkDemo1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo1 {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	public ExtentTest parentExtentLogger;

    @Test
    public void externalReportTest1()
    {
    	htmlReporter = new ExtentHtmlReporter("C:\\Users\\mani\\Desktop\\extentReport\\"+"test1.html");
		extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        parentExtentLogger = extent.createTest("Test1");
        extentLogger = parentExtentLogger.createNode("Add User with Madatory Fields");
    	extentLogger.log(Status.PASS,MarkupHelper.createLabel("TestCase1" , ExtentColor.GREEN));
    	extentLogger.log(Status.FAIL,MarkupHelper.createLabel("TestCase2" , ExtentColor.RED));
    	extentLogger.log(Status.SKIP,MarkupHelper.createLabel("TestCase1" , ExtentColor.GREY));


    	extent.flush();

    }
}
