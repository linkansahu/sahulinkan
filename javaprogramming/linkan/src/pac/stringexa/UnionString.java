package pac.stringexa;

import java.util.Set;
import java.util.TreeSet;

public class UnionString {

	public static void main(String[] args) {
		String a = "usha";
        String b = "asha";
        String c = a.concat(b);
        System.out.println(c);
        char[] ch = c.toCharArray();

        Set set = new TreeSet();
      
        for(char s : ch) {

            if(!set.contains(s)) {

                set.add(s);
            } 
        }
        System.out.println(set);



	}

}
