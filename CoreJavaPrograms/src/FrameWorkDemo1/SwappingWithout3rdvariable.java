package FrameWorkDemo1;

public class SwappingWithout3rdvariable 
{

	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		System.out.println("before swapping x value is :"+x);
		System.out.println("before swapping y value is :"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping x value is :"+x);
		System.out.println("after swapping y value is :"+y);

	}

}
