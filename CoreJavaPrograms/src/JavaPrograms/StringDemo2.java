package JavaPrograms;

public class StringDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str="{[('abc':'123')]},{[('def':'456')]},{[('ghi':'789')]}";

		
		str.replace("'abc':'123'", "'abc'='123'");
         str.replace("'def':'456'", "'def'='456'");
		str.replace("'ghi':'789'", "'ghi'='789'");
		System.out.println(str);
		
		
		
	}

}
