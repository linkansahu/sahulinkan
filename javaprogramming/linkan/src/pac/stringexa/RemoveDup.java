package pac.stringexa;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {


String string= "linkan";

    char[] chars = string.toCharArray();
    Set<Character> charSet = new LinkedHashSet<Character>();
    for (char c : chars) {
      if(!charSet.contains(c)){
    	  charSet.add(c);
      }
    }
    System.out.println(charSet);
    StringBuilder sb = new StringBuilder();
    for (Character character : charSet) {
        sb.append(character);
    }
    System.out.println(sb.toString());

	}

}
