package pac.stringexa;

import java.util.Arrays;

public class ountOccurrencesOfSubstringExample {

	public static void main(String[] args) {
		String str = "Java  Examples Java Code Java Program";
		 //String s1[]=str.split("Java",-1);
		 //System.out.println(Arrays.toString(s1));
	//System.out.println(str.split("Java", -1).length );
		String s1[] = str.split(" ");
		 
		System.out.println("Total occurrences: " + s1.toString());

	}

}
