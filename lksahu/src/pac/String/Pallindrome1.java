package pac.String;

import java.util.Scanner;

public class Pallindrome1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("enter a  u want string");
	    String s1=scn.next();
	    int l=s1.length();
	    int a=1;
	    for(int i=0;i<=l/2;i++)
	    {
	    	if(s1.charAt(i)!=s1.charAt(l-1-i))
	    	{
	    		a=0;
	    		break;
	    	}
	    }
	    if(a==1)
	    {
	    	System.out.println(s1+" ia pallindrome");
	    }
	    else
	    {
	    	System.out.println(s1+" ia  not pallindrome");
	    }
	}

	}

