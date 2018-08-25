package pac.Lists;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("java");
		al.add("a");
		al.add("b");
		al.add("a");
		al.add("a");
		al.add("java");
		al.add("10.3");
		al.add("c");
		al.add("14");
		al.add("java");
 for(int i=0;i<=al.size()-1;i++)
 {
	 for(int j=i+1;j<=al.size()-1;j++)
	 {System.out.println(al.get(i)+""+i+al.get(j)+" "+j);
		 if(al.get(i).equals(al.get(j)))
		 {
			 al.remove(j);
				j--;
		 }
	 }
 }
 System.out.println("after deleting elements:"+al);

	}

}

