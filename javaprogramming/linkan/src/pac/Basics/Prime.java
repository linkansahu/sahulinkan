package pac.Basics;

public class Prime {

	public static void main(String[] args) 
	{ int cnt=0;
	 for(int i=1;i<=100;i++)
	 {
		 if(checkPrime(i))
		 {
			 cnt++;
			 System.out.println(i+" : is prime");
		 }
	 }
	 System.out.println("no of  prine no is:"+cnt);
	}

	static boolean checkPrime(int n) 
	{
		boolean flag=true;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

}
