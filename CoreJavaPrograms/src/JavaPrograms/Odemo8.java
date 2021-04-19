package JavaPrograms;

public class Odemo8 
{
void fun1(A a1)
{
	System.out.println(a1);
	if(a1!=null)
	{
		a1.i=a1.i+1;
		a1.j=a1.j+2;
	}
	System.out.println("end of fun1");
}
	public static void main(String[] args) {
     Odemo8 d1=new Odemo8();
     A a1=new A();
     
    d1.fun1(a1);
    System.out.println(a1.i);
    System.out.println(a1.j);
    
    d1.fun1(a1);
    System.out.println(a1.i);
    System.out.println(a1.j);
    
    d1.fun1(new A());
    System.out.println(a1.i);
    System.out.println(a1.j);
    
    d1.fun1(null);
    System.out.println(a1.i);
    System.out.println(a1.j);
    
	}

}
