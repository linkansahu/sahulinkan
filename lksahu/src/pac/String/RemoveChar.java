package pac.String;

public class RemoveChar {

	public static void main(String[] args) {
		/*String str = "173.vsd";
		String result ="";
		         
		   for (int i=0; i<str.length(); i++){
		             
		  //System.out.println(str.charAt(i));
		             
		 char chars = str.charAt(i);
		    if(!Character.isDigit(chars))
		     {
		          result += chars;
		       }
		 }
		System.out.println(result);*/
		
		String str="linkan123kumar";
		char c ;
		  for (int i=0; i<str.length(); i++){
			  c=str.charAt(i);
			  if(c>=97&&c<=122)
				  
			  {	  System.out.println(c);
				 // sb.deleteCharAt(i);
				  //i--;
			  }
		  }
	
	}

}
