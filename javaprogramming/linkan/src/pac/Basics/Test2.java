package pac.Basics;
class Test4 
{
	Test4()
	{	System.out.print("P");	
	}
}
public class Test2  extends Test4{
	Test2()
	{	System.out.print("C");	}
	
	{
		System.out.print("I");
	}
	static
	{
		System.out.print("S");
	}
	public static void main(String[] args) {
		System.out.print("M");
		Test2 t=new Test2();

	}

}
