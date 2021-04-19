package JavaPrograms;

public class StaticDemo5 {
int a=funA();
static int b=funB();
int funA()
{
	System.out.println("funA of StaticDemo5");
	return 10;
}
static int funB()
{
	System.out.println("funB of StaticDemo5");
	return 20;
}
static int funC()
{
	System.out.println("funB of StaticDemo5");
	return 30;
}
	public static void main(String[] args) {
 System.out.println("main method start");
 StaticDemo5 s1=new StaticDemo5();
 System.out.println(s1.a);
 System.out.println("Done");
	}

}
