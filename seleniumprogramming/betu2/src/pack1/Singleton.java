package pack1;

public class Singleton {
private static Singleton singletoninstance=null;
private static String str="";
private static String str1="";
private Singleton()
{
	str1="betu";
}
public void print(){
	str="Linkan";
	System.out.println(str);
}

public static Singleton getInstance()
{
	if(singletoninstance==null)
	{
		singletoninstance=new Singleton();
		
	}
	return singletoninstance;
}
public static void main(String[] args) {
    Singleton X=Singleton.getInstance();
    Singleton Z=Singleton.getInstance();
    Singleton Y=Singleton.getInstance();
X.print();
Y.print();
System.out.println(X.str1.toString());
}
}
