package JavaPrograms;

public class ThisDemo4 {
int i=5;
ThisDemo4()
{
	this(30);
	System.out.println("zero args of cons");
}
ThisDemo4(int a)
{
	System.out.println("int args of cons");
	i=a;
}
public static void main(String[] args)
{
	ThisDemo4 t1=new ThisDemo4();
	System.out.println(t1.i);
}
}
