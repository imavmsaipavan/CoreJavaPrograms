package JavaPrograms;

public class PolyDemo2
{
	
	public static void main(String[] args) {
		PolyDemo2 s1=new PolyDemo2();
//		s1.funA();
		
	}
	 void funA(int a, long b)
	{
		 
		System.out.println("int long args of funA");
	}
	 void funA(long a, int b)
	{
		System.out.println("long int args of funA");
	}
}
