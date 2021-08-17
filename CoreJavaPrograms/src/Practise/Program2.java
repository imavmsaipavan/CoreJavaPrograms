package Practise;

import java.util.HashMap;

public class Program2 {
	public static void main(String args[])
	{
		int arr[] = { 1,2,2,2,3,4,7,7,7,7,9,9,10,11,12,13,13,13,18,20 };
		int n = arr.length;
		int x1 = 2;
		int x2 = 5;
		int x3 = 7;
		System.out.println("Output: "+countOccurrences(arr, n, x1));
		System.out.println("Output: "+countOccurrences(arr, n, x2));
		System.out.println("Output: "+countOccurrences(arr, n, x3));
	}

		static int countOccurrences(int arr[], int n, int x)
		{
			int res = 0;
			for (int i=0; i<n; i++)
				if (x == arr[i])
					res++;
			return res;
		}

	}


