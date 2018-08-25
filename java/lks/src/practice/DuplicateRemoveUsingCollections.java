package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemoveUsingCollections {

	public static void main(String[] args) {
	int []a={1,2,3,4,5,1,2,3};
		Set set=new HashSet();
		for(int i:a)
			{
			if(!set.add(i))
			{
				System.out.println(i);
			}
		}System.out.println(set);
		/*String s1="linkan";
       char[]arr=s1.toCharArray();
       Set<Character> set=new LinkedHashSet<Character>();
       StringBuffer sb=new StringBuffer();
       for(char c:arr)
       {
    	  
    	   set.add(c);	  
       }
       System.out.println(set);
       for(Character c:set)
       {
    	  
    	 sb.append(c);	  
       } System.out.println(sb);*/
	}

}
