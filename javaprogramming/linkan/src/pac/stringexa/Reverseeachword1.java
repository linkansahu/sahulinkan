package pac.stringexa;

import java.util.Arrays;

public class Reverseeachword1 {

	public static void main(String[] args)
	{
	String s1="my name is";
	//String s2[]=s1.split(" ");
	//System.out.println(Arrays.toString(s2));
	String s3="";
	
	 /*for(int i=s2.length-1;i>=0;i--)
	
	 {
		s3=s3+s2[i]+" "; 
		
	 }*/
	// System.out.println(s3); 
 StringBuffer sb=new StringBuffer(s1);
 String res=sb.reverse().toString();
 System.out.println(res);
	}

}
