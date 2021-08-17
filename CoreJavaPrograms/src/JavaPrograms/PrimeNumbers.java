package JavaPrograms;

import org.testng.annotations.Test;

public class PrimeNumbers {
	
	public void checkPrimeNumbers(int number){
	int num=number;
	boolean primenum=true;
	for(int i=2;i<number;i++)
	{
	 if(number%i==0)
	 {
		 primenum=false;
		 break;
	 }
	}
         if(primenum==true)
      {
          System.out.println(num+" is a prime number");
      }
           else
      {
		   System.out.println(num+" is not a prime number");
		}
		    }
		}
	
