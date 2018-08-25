package pac.stringexa;

public class StringMatching {


	public static boolean verifyNames(String name){
	
	if(name.matches("[a-zA-Z]+"))
	{
		return true;
		
	}
	else
	{
		return false;
	}
		
}public static void main(String[] args) {
String name="linkan";
	System.out.println(verifyNames(name));
		
	}
}
