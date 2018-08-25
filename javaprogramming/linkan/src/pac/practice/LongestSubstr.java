package pac.practice;

import java.util.HashMap;

public class LongestSubstr {
	 static void longestSubstring(String inputString)
	    {
	        //Convert inputString to charArray
	         
	        char[] charArray = inputString.toCharArray();
	         
	                
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	   
	         
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            char ch = charArray[i];
	         
	          	             
	            if(!map .containsKey(ch))
	            {
	            	map .put(ch, 1);
	            }
	               
	            else
	            {    
	               map .put(ch,map.get(ch)+1);
	                
	            }
	            }System.out.println(map);
	         
	            for (int i = 0; i < charArray.length; i++) 
		        {
		            char ch = charArray[i];
		            if(map.get(ch)>1)
		            {
		            	System.out.println("characters:"+ch+"=="+map.get(ch));
		            }
		        }
	        }
	     
	    public static void main(String[] args) 
	    {    
	        longestSubstring("javaconceptoftheday");
	         
	        System.out.println("==========================");
	         
	        longestSubstring("thelongestsubstring");
	    }    

}
