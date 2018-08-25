package pac.String;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDups {

	public static void main(String[] args) {
		String str="linkan";
		char[]ch=str.toCharArray();
           ArrayList<Character>al=new ArrayList<Character>();
           for(char c:ch)
           {
        	   al.add(c);
        	}
           Set<Character>set=new TreeSet<Character>(al);
           System.out.println(set);
           
	}

}
