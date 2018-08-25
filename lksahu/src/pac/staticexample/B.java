package pac.staticexample;

public class B {
final void m1()
{
	System.out.println("m1 in b");
}
}
class C extends B
{
	final void m2()
	{
		System.out.println("m2 in c");
	new	B().m1();
	}
}

