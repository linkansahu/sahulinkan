package pac.Arrays;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) 
	{
		int m, n, p, q, sum = 0, i, j, k;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns into a");
		m=scn.nextInt();
		n=scn.nextInt();
		int  a[][]=new int[m][n];
		System.out.println("Enter the elements into a");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=scn.nextInt();
		
		System.out.println("Enter the no of rows and columns into b");
		p=scn.nextInt();
		q=scn.nextInt();;
		if(n!=p)
		{
			System.out.println("entered matrices cant be multiplied");
		}
		else
		{
			int b[][]=new int[p][q];
			int multi[][]=new int[m][q];
			System.out.println("Enter the elements into b");

	         for ( i = 0 ; i < p ; i++ )
	            for ( j = 0 ; j < q ; j++ )
	               b[i][j] = scn.nextInt();
	 
			
		}

	}

}
