package pac.comparator;

import java.util.Comparator;

public class SortbyName  implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		
		return  arg0.name.compareTo(arg1.name);
		
	}

}
