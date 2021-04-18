package InputOutputDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GFTestProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fileRead = new FileInputStream(System.getProperty("user.dir")+"\\configProperties\\Test2.properties");
		Properties p1=new Properties();
		p1.load(fileRead);
		
		String openBrowser= (String)p1.get("openBrowser");
		System.out.println(openBrowser);
		
		String enterURL= (String)p1.get("enterURL");
		System.out.println(enterURL);
		
		String enterData= (String)p1.get("enterData");
		System.out.println(enterData);
		
		String xpath= (String)p1.get("xpath");
		System.out.println(xpath);
	}

}
