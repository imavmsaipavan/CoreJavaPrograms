package FrameWorkDemo1;
public class RemoveLastCharcter1  
{  
	public static void main(String args[])  
	{  
		String str = "SaiPavan";  
		StringBuffer sb= new StringBuffer(str);  
		sb.deleteCharAt(sb.length()-1);  
		System.out.println(sb);  
	}  
}  