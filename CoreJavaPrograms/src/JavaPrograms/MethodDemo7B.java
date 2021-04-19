package JavaPrograms;

public class MethodDemo7B {

	public static void main(String[] args) {
		MethodDemo7B m1=new MethodDemo7B();
		m1.funB();
		MethodDemo7B m2=new MethodDemo7B();
		m2.funB();
	}
	void funA()
	{
		System.out.println("funA of MethodDemo7B");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo7B");
		funA();
	}

}
