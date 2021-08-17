package FrameWorkDemo1;
public class WithoutForloop1_100Print {

	public static void main(String[] args) 
	{
	printnum(14);	

	}
	public static void printnum(int num)
	{
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				flag=true;
			break;
		}
		if(!flag) {
			System.out.println(num+ " is a prime number");
		}
		else {
			System.out.println("not prime");
		}
	}
	

}
