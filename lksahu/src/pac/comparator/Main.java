package pac.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
	Student s1=new Student(8, "lksahu", "angul");
	Student s2=new Student(1, "sssahu", "angul1");
	Student s3=new Student(3, "bmsahu", "angul2");
      ArrayList<Student>al=new ArrayList<Student>();
      al.add(s1);
      al.add(s2);
      al.add(s3);
      Collections.sort(al,new SortbyName());
      System.out.println("\nSorted by name");
      for (int i=0; i<al.size(); i++){
    	  
      
          System.out.println(al.get(i));
	}
      Collections.sort(al,new SortbyId());
      System.out.println("\nSorted by rollno");
      for (int i=0; i<al.size(); i++)
      {        System.out.println(al.get(i));
      
      }
}
} 