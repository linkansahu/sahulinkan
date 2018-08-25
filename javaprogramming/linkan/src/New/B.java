package New;

public class B {
final void m1(){
	System.out.println("metod1 final");
}

}
class C  extends B{
	void m2()
	{System.out.println("metod2 of b");
	new B().m1(); ;
	}
}
