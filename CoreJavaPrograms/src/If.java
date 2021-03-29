
public class If {

	public static void main(String[] args) {
		boolean a=false;
		boolean b=true;
		boolean c=true;
		boolean d=true;
		boolean e=true;
		boolean f=true;
		boolean g=true;
		
		
		
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
