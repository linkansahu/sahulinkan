package pac.Constructor;

public class B 
{
B(int a)
{
	System.out.println("Constructor of B-="+a);
}
}
class C extends B
{
	C(int a,double b)
	{
	super(a);
	System.out.println("Constructor of C--"+a+" "+b);
	}
}
class D extends C
{
	D(int a,double b,int c)
	{
		super( a, b);
		System.out.println("Constructor of D=="+a+" "+b+" "+c);
	}
}
