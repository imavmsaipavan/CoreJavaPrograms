package JavaPrograms;

import org.testng.annotations.Test;

public class ReverseStringAndNumber {

	@Test
	public static void reverseString() {

		String str="This is String Reverse Method";
		char[] reverse=str.toCharArray();
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.print(reverse[i]);	
		}	
	}
	
//	@Test
	public static void reverseString1() {

		String str="This is String Reverse Method";
		int reverse=str.length();
		for(int i=reverse-1;i>=0;i--) {
			System.out.println(str.charAt(i));	
		}	
	}
	
//	@Test(priority = 1)
	public static void reverseNumber()
	{
		
		String str1="88863 3534377771";
		char[] reverse1=str1.toCharArray();
	    for(int i=reverse1.length-1;i>=0;i--) {
	    	System.out.println(reverse1[i]);
	    }
	
	}
	
	@Test
	public static void reverseNumber1()
	{
		int num=886377771;
//int data type will accept a range – 2,147,483,648 to 2,147,483,647 values
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	

}

