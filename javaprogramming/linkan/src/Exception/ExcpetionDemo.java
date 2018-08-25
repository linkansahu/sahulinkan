package Exception;

public class ExcpetionDemo {
	public static void main(String agrs[])
	{
	 
	try
	{
	//statements
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	catch(ArithmeticException e1){
		//unreachable block.. not supported by java. leads to error
	
	System.out.println(e1);
	
	}
	}
}
