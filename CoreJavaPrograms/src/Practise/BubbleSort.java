package Practise;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr= {32,6,86,34,8,34,23};
		BubbleSort sort= new BubbleSort();
		sort.sortArray(arr);
		sort.afterSort(arr);
		
	}

	 void sortArray(int[] arr) {
		 int n=arr.length;
		 for(int i=0;i<n-1;i++) {
			 for(int j=0;j<n-i-1;j++) {
				 if(arr[j]>arr[j+1]) {

					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
	 }
	 
	 void afterSort(int[] arr) {
		 for(int i=0;i<arr.length-1;i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }
}
