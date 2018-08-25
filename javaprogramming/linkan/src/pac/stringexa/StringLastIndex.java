package pac.stringexa;

public class StringLastIndex {

	public static void main(String[] args) {
		String str = "BeginnersBook tutorial";
		System.out.println(str.length());
		
		 int last_in = str.lastIndexOf('B',13);
		    System.out.println("Last occurrence of char 'b'" +
		                     " after index 30 is : " + last_in);
		 
	}

}
