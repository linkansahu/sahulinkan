package pac.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class BasicExaOfMAp {

	public static void main(String[] args) {
	Map<String,Integer>map=new TreeMap<String,Integer>();
	map.put("linkan",1);
	map.put("diku",5);
	map.put("piyush", 2);
	map.put("tiki",3);
	Iterator<Map.Entry<String, Integer>>itr=map.entrySet().iterator();
       while(itr.hasNext())
       {
    	  Map.Entry<String,Integer>m= itr.next();
    	  System.out.println(m.getKey()+"==="+m.getValue());
       }
	}

}
