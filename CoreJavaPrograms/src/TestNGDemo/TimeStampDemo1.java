package TestNGDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampDemo1 {

	public static void main(String[] args) {
	
		System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		
		Date data=new Date();
		System.out.println(data);
		
		SimpleDateFormat s5=new SimpleDateFormat("d MM yyy H m s");
		String requiredDate5=s5.format(data);
		System.out.println(requiredDate5);
		
		SimpleDateFormat s1=new SimpleDateFormat("dd MMMM yyyy");
		String requiredDate1=s1.format(data);
		System.out.println(requiredDate1);
		
		SimpleDateFormat s2=new SimpleDateFormat("dd MM yyyy");
		String requiredDate2=s2.format(data);
		System.out.println(requiredDate2);
		
		SimpleDateFormat s3=new SimpleDateFormat("dd M yyyy");
		String requiredDate3=s3.format(data);
		System.out.println(requiredDate3);
		
		SimpleDateFormat s4=new SimpleDateFormat("dd MM yyyy HH mm ss");
		String requiredDate4=s4.format(data);
		System.out.println(requiredDate4);
		
}
}
