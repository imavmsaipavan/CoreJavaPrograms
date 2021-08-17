package Practise;

public class StringReverse {

	public static void main(String[] args) {

		String str="Sai Pavan";
		char[] arr=str.toCharArray();
		System.out.println(str.length());
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
