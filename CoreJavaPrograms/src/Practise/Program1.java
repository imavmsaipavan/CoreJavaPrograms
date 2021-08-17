package Practise;

import java.util.regex.Pattern;

public class Program1 {
	public static void main(String[] args) {
	
		String input1="Hello World";
		String input2="This is a test";
		String input3="This is a big sentence";
		reverseWord(input1);
		reverseWord(input2);
		reverseWord(input3);
	}
	public static void reverseWord(String str) {

		Pattern p = Pattern.compile("\\s");
	      String[] temp = p.split(str);
	      String rev = "";
	      for (int i = 0; i < temp.length; i++) {
	         if (i == temp.length - 1)
	         rev = temp[i] + rev;
	         else
	         rev = " " + temp[i] + rev;
	      }
	      System.out.println("Output: " + rev);
	}
	}

