package pac.String;

public class UpeerLower {

	public static void main(String[] args) {
	String s1="liNkAn";
	/* for (int i = 0; i< s1.length(); i++)
     {
         char aChar = s1.charAt(i);
         if (65 <= aChar && aChar<=90)
         {
             aChar = (char)( (aChar + 32) ); 
         }
         System.out.print(aChar);
      }*/
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
