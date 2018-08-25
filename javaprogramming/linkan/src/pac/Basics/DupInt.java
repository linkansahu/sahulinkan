package pac.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DupInt {
	
		 public static void main(String[] args) 
		    {
		        int intArray[]={3,2,1,4,2,1};
sort(intArray);

	   
		    }

		static void sort(int[] arr) {
		
			List<Integer>list=new ArrayList<Integer>();
			for(int i:arr)
			{
				list.add(i);
			}
			Set<Integer>set=new TreeSet<Integer>(list);
			for(Integer iarr:set)
			{
				System.out.print(iarr+" ");
			}
		}
}


