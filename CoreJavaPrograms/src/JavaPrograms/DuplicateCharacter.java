package JavaPrograms;

import org.testng.annotations.Test;

public class DuplicateCharacter 
{

	@Test
	public static void findDuplicateCharacter( )
	{
		String str="String Parameter";
		char[] carray=str.toCharArray();
		System.out.println("given string is "+str);
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(carray[i]==carray[j])
				{
					System.out.println("duplicate characters in given array is "+carray[j]);
//					break;	
				}
				
			}
		}
	}
}
