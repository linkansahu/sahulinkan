package pac.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		Integer a[]={1,2,3};
		Integer []b={2,3};
		List<Integer> lst1=new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> lst2=new ArrayList<Integer>(Arrays.asList(b));
		lst1.retainAll(lst2);
		System.out.println(lst1);
		/*lst.addAll(Arrays.asList(b));
		
		System.out.println(lst);
		Set<Integer>set=new HashSet<Integer>();
		for(Integer i :lst)
		{
			if(!set.contains(i))
			{
				set.add( i);
			}
		}
		System.out.println(set);*/
		
		
	}

}
