package FrameWorkDemo1;

import java.util.Arrays;

public class MissingNumberprg 
{
	public static int missingnum(int arr[]) 
	{
		int n=arr.length;
		int m=n+1;
		int total=m*(m+1)/2;
		int sum=Arrays.stream(arr).sum();
		
		return total-sum;
	}
	

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,5,6,7,8,9};
		System.out.println("missing number is "+missingnum(arr));
		
		
	}

}
