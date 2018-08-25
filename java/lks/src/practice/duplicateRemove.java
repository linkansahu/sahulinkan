package practice;

public class duplicateRemove {

 static int count=0;

	public static void main(String[] args) {
		int []a={1,2,3,4,5,1,2,3};
		int flag=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				if(i!=j)
				{
					if(a[i]!=a[j])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
			{
				count++;
				 System.out.print(a[i]+" ");
			}
		}
		
		System.out.println("");
        System.out.println("Number of non repeated elements are:"+count);
    		    

}
}