package pac.Arrays;

public class MulwithNo {

	public static void main(String[] args) {
		int a[]={4,3,2,2};
		int mul=1;
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					mul=mul*a[j];
			
				}
				
			}System.out.println(mul);
			
		}

	}

}
