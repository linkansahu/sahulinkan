package practice;

import java.util.Arrays;

public class MoveNonZero {

	public static void main(String[] args) {
		int a[]={1,2,0,3,5,6,7,0};
		int count=0;
		int temp;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)
			{
				temp=a[count];
				a[count]=a[i];
				a[i]=temp;
				count++;
			}
		
		}
		System.out.println(Arrays.toString(a));
		

	}

}
