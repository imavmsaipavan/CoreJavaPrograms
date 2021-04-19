package JavaPrograms;

public class ArrayDemo6 {
	
	public static void main(String[] args) {
		ArrayDemo6 a1=new ArrayDemo6();
		for(int i=0;i<a1.array().length;i++) {
			System.out.println(a1.array()[i]);	
		}
	}
	int[] array()
	{
		 int[] k= {1,2,3,4,5};
		 return k;
	}
}
