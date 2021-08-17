package Practise;

import java.util.HashMap;

public class Program3 {

	public static void main(String[] args) {
		String input1 = "Java J2EE Java JSP J2EE";
		String input2= "All Is Well";
		String input3="Done And Gone";
				characterCount(input1);
				characterCount(input2);
				characterCount(input3);
				
	}
	public static void characterCount(String input) {
		HashMap<Character, Integer> hashmap=new HashMap<Character, Integer>();
		for(Character c:input.toCharArray())
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
