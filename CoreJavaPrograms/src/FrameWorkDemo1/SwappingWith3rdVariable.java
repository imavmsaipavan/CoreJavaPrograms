package FrameWorkDemo1;

public class SwappingWith3rdVariable 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int temp;
		System.out.println("before swapping x value is :"+x);
		System.out.println("before swapping y value is :"+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping x value is :"+x);
		System.out.println("after swapping y value is :"+y);
		
	}

}
