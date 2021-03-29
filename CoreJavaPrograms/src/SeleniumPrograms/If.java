package SeleniumPrograms;

public class If {

	public static void main(String[] args) {
		boolean a=false;
		boolean b=true;
		boolean c=true;
		boolean f=false;
		boolean d=true;
		String str="this is a new string";
				
		
		
		
    if(a==true) {
    	System.out.println("passed");
    	if(b==true) {
    		System.out.println("passed");
    		if(c==true) {
    			System.out.println("passed");
    		}
    	}
    }
    else {
    	System.out.println("this is false");
    }
	}

}
