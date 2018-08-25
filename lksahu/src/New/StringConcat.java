package New;

public class StringConcat {

	public static void main(String[] args) {
		String firstname = "Virat";
		String lastname = "Kohli"; 
		// 1st way - Use + operator to concatenate String
		String name = firstname + " " + lastname; 
		System.out.println(name);

		// 2nd way - by using StringBuilder 
		StringBuilder sb = new StringBuilder("linkan"); 
		sb.append(lastname); 
		System.out.println(sb.toString()); 

				}

}


