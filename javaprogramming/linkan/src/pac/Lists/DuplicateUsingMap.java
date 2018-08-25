package pac.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DuplicateUsingMap {

	public static void main(String[] args) 
	{   ArrayList<String> al=new ArrayList<String>();
		al.add("linkan");
		al.add("diku");
		al.add("tiki");
		al.add("situ");
		al.add("linkan");
		al.add("tiki");
		al.add("lipi");
		al.add("bablu");
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		for (String s:al)
		{
			if(!hmap.containsKey(s))
			{
				hmap.put(s, 1);
			}
			else
			{
				hmap.put(s, hmap.get(s)+1);
			}
		}System.out.println(hmap);
           Set<String>set=hmap.keySet();
           for(String s:set)
           {
        	   if(hmap.get(s)>1)
        	   {
        		   System.out.println("String:"+s+":duplicates="+hmap.get(s));
        	   }
        	   
           }
           
	}

}
