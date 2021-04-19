package JavaPrograms;


public class ConsDemo3 {
	int a=10;
	ConsDemo3()
	{
		System.out.println("null");
		int a=20;
	}

	public static void main(String[] args) {
		ConsDemo3 a1=new ConsDemo3();
		System.out.println(a1.a);
	}

}
