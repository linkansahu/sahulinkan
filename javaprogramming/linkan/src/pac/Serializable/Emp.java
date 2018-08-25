package pac.Serializable;

import java.io.Serializable;

public class Emp implements Serializable {
	String name;
	int id;
	transient long phno;
	Emp(String n,int i,long p)
	{
		 name=n;
		 id=i;
		 phno=p;
	}
	public String toString()
	{
		return name+" "+id+" "+phno;
	}

}
