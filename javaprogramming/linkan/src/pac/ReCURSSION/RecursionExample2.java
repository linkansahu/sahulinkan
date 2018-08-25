package pac.ReCURSSION;

public class RecursionExample2 {
	static int count=0;  
	static void p(){  

	if(count<=5){  
	System.out.println("hello "+count); 
	count++;  
	p();  
	}  
	}  
	public static void main(String[] args) {  
	p();  
	}  
}
