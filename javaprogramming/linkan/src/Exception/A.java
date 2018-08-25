package Exception;

public class A {
void m1()
{
	int a=10/0;
	
}
void m2()
{
	try{
		m1();
	}
catch(Exception e)
{
System.out.println(e.getMessage());	
}
}
}