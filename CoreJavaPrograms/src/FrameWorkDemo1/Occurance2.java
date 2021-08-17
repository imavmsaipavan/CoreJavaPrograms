package FrameWorkDemo1;

import java.util.HashMap;

public class Occurance2 {

	public static void main(String[] args) 
	{
		String str="rbgtechnologies";
		HashMap<Character, Integer> hashmap=new HashMap<Character, Integer>();
		for(Character c:str.toCharArray())
		{
			if(hashmap.containsKey(c))
			{
				hashmap.put(c, hashmap.get(c)+1);
			}
			else
			{
				hashmap.put(c, 1);
			}
			
		}
		System.out.println(hashmap);

	}

}