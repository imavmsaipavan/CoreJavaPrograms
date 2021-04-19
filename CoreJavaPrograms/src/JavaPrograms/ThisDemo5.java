package JavaPrograms;

public class ThisDemo5 
      {		
	int a=10;
		void funA()
		{
			System.out.println("funA of ThisDemo5");
		}
		void funB()
		{
			System.out.println("funB of ThisDemo5");
			funA();	
			System.out.println(a);
	}

}
