package Practise;

public class PrimeNumbers {

	public static void main(String[] args) {

		int num=12;
		boolean prime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime==true) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}

}
