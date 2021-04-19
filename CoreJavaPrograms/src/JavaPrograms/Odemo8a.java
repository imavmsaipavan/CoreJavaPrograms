package JavaPrograms;

public class Odemo8a {

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
		
	public static void main(String[] args) 
	{
			Odemo8a d1= new Odemo8a();
			A k=new A();
			d1.fun1(k);
			System.out.println(k.i);
			System.out.println(k.j);
			
			d1.fun1(k);
			System.out.println(k.i);
			System.out.println(k.j);
			
			A abc=new A();
			d1.fun1(abc);
			System.out.println(abc.i);
			System.out.println(abc.j);
			
			
			
		}
}
