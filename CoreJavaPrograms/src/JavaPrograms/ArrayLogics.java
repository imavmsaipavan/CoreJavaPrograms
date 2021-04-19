package JavaPrograms;

public class ArrayLogics {

	public static void main(String[] args) {
		ArrayLogics a=new ArrayLogics();
		int[] arr= {34,45,65,3,346,34,34};
		
		a.smallest(arr);
		a.largest(arr);
		a.total(arr);
		a.average(arr);
		a.median(arr);
	}
	
        void smallest(int arr[]) 
        {
        	int smallest=arr[0];
        	for(int i=0;i<arr.length;i++) {
        		if(smallest>arr[i])
        			smallest=arr[i];
        	}
        	System.out.println(smallest);
        	}
        
        void largest(int arr[])
        {
        	int largest=arr[0];
        	for(int i=0;i<arr.length;i++) {
        		if(largest<arr[i])
        			largest=arr[i];
        	}
        	System.out.println(largest);
        	}
        
        void total(int arr[]) {
        	int total=0;
        	for(int i=0;i<arr.length;i++) {        		
        		total=total+arr[i];
        	}
        	System.out.println(total);
        }
        
        void average(int arr[])
        {
        int total=0;
        for(int i=0;i<arr.length;i++) 
        {        		
        total=total+arr[i];
        }
        int average=total/arr.length;
        System.out.println(average);
        }
        
        void median(int arr[])
        {
        	
            int median=arr.length/2;
            System.out.println(median);
        }
        }
        
	


