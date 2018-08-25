package pac.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesElements {

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
		
		
    
	

	    	Set<String>set=new HashSet<String>(al);
    	 for(String s:set)
	    {
			if(Collections.frequency(al, s)>1)
			{
	        
	        System.out.println(s);
			}
	 	}
	
		
	}
}
