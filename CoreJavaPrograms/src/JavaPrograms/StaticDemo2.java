package JavaPrograms;

public class StaticDemo2 {
int i=10;
static int j=20;
	public static void main(String[] args) {
    StaticDemo2 s1=new StaticDemo2();
    System.out.println(s1.i);
    int i=20;
    System.out.println(s1.i);
    System.out.println(j);
j=40;
int j=30;
System.out.println(j);
	}

}
