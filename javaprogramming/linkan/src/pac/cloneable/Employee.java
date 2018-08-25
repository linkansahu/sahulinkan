package pac.cloneable;

public class Employee implements Cloneable {
	int id;
	String name;
	Employee(String n,int i)
	{
		name=n;
		id=i;
	}
	void getdata()
	{
		System.out.println("name:"+name+ " id:"+id);
		
	}
protected Object clone() throws CloneNotSupportedException
{
	return super.clone();
	
	
}
}
