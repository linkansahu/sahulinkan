package pac.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String,Integer>map=new TreeMap<String,Integer>();
		map.put("linkan",1);
		map.put("diku",5);
		map.put("piyush", 2);
		map.put("tiki",3);
List<Map.Entry<String,Integer>>lst=new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
Collections.sort(lst,new SortByValue());
		
for(Map.Entry<String,Integer>m1:lst)
{
	System.out.println(m1.getKey()+" "+m1.getValue());
}

	}

}
