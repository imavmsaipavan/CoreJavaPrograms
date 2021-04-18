package InputOutputDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fileRead = new FileInputStream(System.getProperty("user.dir")+"\\configProperties\\Test1.properties");
		Properties p1=new Properties();
		p1.load(fileRead);
		
		String data1= (String)p1.get("userName");
		System.out.println(data1);
		
		String data2= (String)p1.get("login");
		System.out.println(data2);
	}

}
