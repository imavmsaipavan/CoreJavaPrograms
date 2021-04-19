package JavaPrograms;

public class PolyDemo3 {
	
	public static void main(String[] args) {
	PolyDemo3 p1=new PolyDemo3();
	A k=new A();
	k.funA();
    p1.funA(k);
    p1.funA(new A());
//    k.funA(null);
    
    B i=new B();
    p1.funA(i);
    p1.funA(new B());
    
    C m=new C();
    p1.funA(m);
    p1.funA(new C());
	}
	
	void funA(A a1){ 
	System.out.println("class A data type");
	System.out.println(a1);
	}
	void funA(B b1){ 
	System.out.println("class B data type");
	System.out.println(b1);
	}
	void funA(C c1){ 
	System.out.println("class C data type");
	System.out.println(c1);
	}
	

}
