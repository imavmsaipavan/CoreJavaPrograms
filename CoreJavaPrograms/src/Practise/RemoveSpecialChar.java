package Practise;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String str="Sai$Pavan@$";
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);
	}

}
