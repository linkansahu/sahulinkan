package pac.stringexa;

import java.util.Arrays;

public class AnaExa {

	public static void main(String[] args) {
	String str1="Mother In Law";
	String str2="Hitler Woman";
	String s1 = str1.replaceAll("\\s", "");  
    String s2 = str2.replaceAll("\\s", ""); 
	  boolean status = true;  
      if (s1.length() != s2.length()) {  
          status = false;  
      } else {  
          char[] ArrayS1 = s1.toLowerCase().toCharArray();  
          char[] ArrayS2 = s2.toLowerCase().toCharArray();  
          Arrays.sort(ArrayS1); 
          System.out.println(ArrayS1);
          Arrays.sort(ArrayS2);  
          System.out.println(ArrayS2);
          status = Arrays.equals(ArrayS1, ArrayS2);  
      }  
      if (status) {  
          System.out.println(s1 + " and " + s2 + " are anagrams");  
      } else {  
          System.out.println(s1 + " and " + s2 + " are not anagrams");  
      }  
	}

}
