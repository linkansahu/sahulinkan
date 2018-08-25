package pac.String;

import java.util.Scanner;

public class CountProgram {
	public static void main(String[] args) 
	{
	 
	String str1="linkan";
	int count=0;
char []c=str1.toCharArray();
	// Run a for loop that will run based on String length
	for(int i=0;i<=c.length-1;i++)
	{
	
	// This will check if match found
	if(c[i]=='n')
	 
	{
	 
	// It will increment the counter
	count++;
	 
	}
	 
	}
	 
	System.out.println(count);
	 
	}
	 }
