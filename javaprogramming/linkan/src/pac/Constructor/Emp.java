package pac.Constructor;

public class Emp 
{
 String name;
 int id;
 Emp(String n,int i)
 {
	 name=n;
	 id=i;
 }
 }
class Te extends Emp
{   
	double sal;
	Te(String n, int i,double s)
	{
		super(n, i);
		sal=s;
	}

	void print()
	{
		System.out.println(name+"=="+"="+id+" ="+sal);
	}
	
}
