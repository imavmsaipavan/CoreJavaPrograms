package FrameWorkDemo1;

public class FindDuplicateCharacter 
{

	public static void main(String[] args) 
	{
		String str="RBG technologies";
		char[] carray=str.toCharArray();
		System.out.println("given string is "+str);
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(carray[i]==carray[j])
				{
					System.out.println("duplicate characters in given array is "+carray[j]);
					break;	
				}
				
			}
		}
		

	}

}
