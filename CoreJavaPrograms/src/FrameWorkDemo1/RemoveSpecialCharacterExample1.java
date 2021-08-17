package FrameWorkDemo1;
public class RemoveSpecialCharacterExample1  
{  
	public static void main(String args[])   
	{  
		String str= "SaiPavan@1998"; 

		//str = str.replaceAll("[^a-zA-Z0-9]"," "); 
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);  
	}  
}  