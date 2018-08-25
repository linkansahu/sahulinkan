package pac.Constructor;

public class A 
{
 A()
 {
	 System.out.println("default constructor");
 }
 A(int i,int j)
 {
	 this();
	 System.out.println("argument constructor"+i+" "+j);
 }
}
