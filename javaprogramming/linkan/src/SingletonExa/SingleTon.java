package SingletonExa;

public class SingleTon {

	private static SingleTon singleton_instance=null;
	
	public static String str=null;
	private SingleTon()
	{

		str="Linkan";
	//	return str;
	} 
	/*public static String print()
	
	{
	}*/
	public static SingleTon getInstance()
	{
		if(singleton_instance==null)
			singleton_instance=new SingleTon();
		return singleton_instance;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		         SingleTon X=SingleTon.getInstance();
		         SingleTon Z=SingleTon.getInstance();
		         SingleTon Y=SingleTon.getInstance();
System.out.println(X.str.toString());
System.out.println(Y);
System.out.println(Z);
	}

}
