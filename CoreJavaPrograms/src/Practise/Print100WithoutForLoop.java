package Practise;

public class Print100WithoutForLoop {

	public static void main(String[] args) {
		print100(1);

	}

	static void print100(int i) {

		if(i<=100) {
			System.out.println(i+" ");
			print100(i+1);
		}
	}

}
