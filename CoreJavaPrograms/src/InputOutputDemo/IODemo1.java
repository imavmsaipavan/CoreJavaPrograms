package InputOutputDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream files= new FileOutputStream("C:\\Users\\mani\\Desktop\\IODemo\\test1.txt");
		
//		FileInputStream input= new FileInputStream("C:\\Users\\mani\\Desktop\\IODemo\\test2.txt");
		File ob= new File("C:\\Users\\mani\\Desktop\\IODemo\\test3.txt");
		ob.createNewFile();
		System.out.println("Done");
		File ob2= new File("C:\\Users\\mani\\Desktop\\IODemo\\ABC");
		ob2.mkdir();
		
		File ob3= new File("C:\\Users\\mani\\Desktop\\IODemo\\A\\B\\C");
		ob3.mkdirs();
		
		System.out.println("done");


	}
}
