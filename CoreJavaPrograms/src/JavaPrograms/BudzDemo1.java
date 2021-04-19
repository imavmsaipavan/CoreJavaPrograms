package JavaPrograms;

public class BudzDemo1 {

	public static void main(String[] args) {
  int grossSalary=10000;
  BudzDemo1 bd1=new BudzDemo1();
  int charges=bd1.houseCharges2();
  int netSalary=grossSalary-charges;
  System.out.println(netSalary);
  int taxCal=300^charges;
  System.out.println(taxCal);
	}
	void houseCharges()
	{
		int rent=1000;
		int childFee=2000;
		int totalCharges=rent+childFee;
		System.out.println(totalCharges);
	}
	int houseCharges2()
	{
		System.out.println("HouseCharge2 is invoking");
		int rent=1000;
		int childFee=2000;
		int totalCharges=rent+childFee;
		System.out.println(totalCharges);
		return totalCharges;
	}

}
