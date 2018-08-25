package pac.Basics;

public class Armstrong {

	public static void main(String[] args) 
	{
		 int cnt=0;
		 for(int i=100;i<=1000;i++)
		 {
			 if(checkArmStrong(i))
			 {
				 cnt++;
				 System.out.println(i+" : is Armstrong");
			 }
		 }
		 System.out.println("no of Armstrong is :"+cnt);
		}

	  static boolean checkArmStrong(int n) 
	  { 	boolean flag=true;
		  int temp=n;
		  int res=0;
		  while(n!=0)
		  {
			int r=n%10;
			n=n/10;
			res=res+(r*r*r);
		  }
		   if(temp==res)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }

	}

}
