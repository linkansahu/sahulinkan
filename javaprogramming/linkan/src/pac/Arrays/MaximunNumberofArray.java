package pac.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximunNumberofArray {

	public static void main(String[] args) {
		int[] a = {2,8,7,60};
		
		String[]s1=new String[a.length];
		for(int i=0;i<=a.length-1;i++)
		{
		s1[i]=String.valueOf(a[i]);
		}
		

        List<String> list = new ArrayList<String>();
        
  Collections.addAll(list,s1);
  
  System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        StringBuffer sb=new StringBuffer();
        for(String s:list)
        {
        	sb.append(s);
        	
        }
        System.out.println(sb.toString());



	}

}
