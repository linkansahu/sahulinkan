package New;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DupInteger {

	public static void main(String[] args) {
		int a[]={1,2,3,1,2,4,5};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i :a)
		{
			al.add(i);
		}
		System.out.println(al);
		Set<Integer>set=new HashSet<Integer>(al);
		for(Integer i1:set)
		{
			if(Collections.frequency(al, i1)>1){
			System.out.println(i1);
		}
		}

	}

}
