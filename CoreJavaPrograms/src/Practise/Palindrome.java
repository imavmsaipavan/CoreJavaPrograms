package Practise;

public class Palindrome {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		String str="madam";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			 rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println("Palindrone");
		}
		else {
			System.out.println("not Plaindrone");
		}
	}

}
