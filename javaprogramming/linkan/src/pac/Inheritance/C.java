package pac.Inheritance;

public class C 
{
	void test1( int a)
	{
		 System.out.println(a+" :in C");
	}

}
class D extends C
{
	void test1( int a)
	{
		 System.out.println(a+" :in D");
	}
	void test2( int b)
	{
		 System.out.println(b+" :in D");
	}
}
