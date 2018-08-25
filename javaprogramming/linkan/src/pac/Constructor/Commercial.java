package pac.Constructor;

public class Commercial 
{
 String name;
 Commercial(String n)
 {
	 name=n;
 }
 void print(int unit)
 {
	 System.out.println("charges:"+unit*10);
 }
 
}

class Domestic  extends Commercial{

 
 int id;
 Domestic (String n,int i)
 {
	 super(n);
	 name=n;
 }
 void print(int unit)
 {
	 System.out.println("charges:"+unit*5);
 }
 
}