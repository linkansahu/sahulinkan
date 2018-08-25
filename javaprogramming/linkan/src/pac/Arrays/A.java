package pac.Arrays;

public class A {

	public static void main(String[] args) 
	{
	 String s1="linkan kumar";
	
	 String[]s2=s1.split("\\s");
	 String s3=" ";
	 for(int i=s2.length-1;i>=0;i--)
	 {
	 s3=s3+s2[i]+" ";
		
	 }
	  System.out.println(s3);
      StringBuffer sb=new StringBuffer(s3);
      sb.reverse().toString();
      System.out.println(sb);
	}

}
