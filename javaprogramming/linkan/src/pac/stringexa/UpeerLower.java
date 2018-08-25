package pac.stringexa;

public class UpeerLower {

	public static void main(String[] args) {
	String s1="liNkAn";

	String s2 = "This Is A Test";
	StringBuffer sb = new StringBuffer(s2);
	for (int i= 0; i < sb.length(); i++) 
	{
	   char c = sb.charAt(i);
	    if (Character.isLowerCase(c)) 
	    {
	        sb.setCharAt(i, Character.toUpperCase(c));
	    }
	    else 
	    {
	        sb.setCharAt(i, Character.toLowerCase(c));
	    }
	  
	}  System.out.println(sb.toString());

	}

}
