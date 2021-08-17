package InputOutputDemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IODemo2 {

	public static void main(String[] args) {
		
		Date data=new Date();
		System.out.println(data);
		
		SimpleDateFormat s5=new SimpleDateFormat("d MM yyy H m s");
		String requiredDate5=s5.format(data);
		System.out.println(requiredDate5);
		File ob2= new File("C:\\Users\\mani\\Desktop\\IODemo\\"+requiredDate5);
		ob2.mkdirs();
	}
}
