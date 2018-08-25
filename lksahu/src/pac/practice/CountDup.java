package pac.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDup {

	public static void main(String[] args)
	{
    	int a[]={1,2,3,4,1,6,6,9,0,10};
    	Map<Integer,Integer>map=new HashMap<Integer,Integer>();
    	for(Integer i:a)
    		
    	{
    		if(!map.containsKey(i))
    		{
    			map.put(i, 1);
    		}
    		else
    		{
            map.put(i, map.get(i)+1);
    		}
    	}
	System.out.println(map);
	Set<Integer>set=map.keySet();
	for(Integer i:set)
	{
		if(map.get(i)>1)
		{
			System.out.println("characters:"+i+" "+map.get(i));
		}
	}
	
	}

}
