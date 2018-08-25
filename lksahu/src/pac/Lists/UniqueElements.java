package pac.Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("linkan");
		al.add("diku");
		al.add("tiki");
		al.add("situ");
		al.add("linkan");
		al.add("tiki");
		al.add("lipi");
		al.add("bablu");
		Set<String>set=new HashSet<String>();
		for(String s:al)
		{
			if(!set.contains(s))
			{
				set.add(s);
			}
		}
        System.out.println(set);
	}

}
