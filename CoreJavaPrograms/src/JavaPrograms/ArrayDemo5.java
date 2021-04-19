package JavaPrograms;

public class ArrayDemo5 {

	public static void main(String[] args) {
		ArrayDemo5 ab=new ArrayDemo5();
		int[] main= {1,2,3,4,5};
		ab.funA(main);
	}
	 void funA(int arr[])
	{
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}

}
