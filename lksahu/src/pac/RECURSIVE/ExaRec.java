package pac.RECURSIVE;

public class ExaRec {

	public static void main(String[] args) {
		factorial(5);
		System.out.println(ExaRec.factorial(5));

	}

	static long factorial(int num) 
	{
		double res;
		if(num==1)
		{
			return 1;
		}
		else
		{
			res=factorial(num-1)*num;
			
		}
		return (long) res;
		
		
	}

}
