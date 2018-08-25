package pac.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListSwap
{
	public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("c");
        list.add("c++");
        list.add(".net");
        list.add("html");
        list.add("python");
        list.add("ruby");
        Collections.swap(list, 2, 6);
        for(String str: list){
            System.out.println(str);
        }

	}
}
