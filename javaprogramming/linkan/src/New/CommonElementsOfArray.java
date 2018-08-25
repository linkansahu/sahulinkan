package New;

public class CommonElementsOfArray {

	public static void main(String[] args) {
		int a[]={3,5,7,2};
		int b[]={3,2,9};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
