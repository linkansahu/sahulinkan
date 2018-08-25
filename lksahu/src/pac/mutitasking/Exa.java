package pac.mutitasking;

public class Exa {

	public static void main(String[] args) {
		try {
            int[] i = {1, 2, 3};
            int x = i[3];//Change to 2 to see "return" result
            return ;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("caught");
            System.exit(0);
        } 
		finally {
        	
            System.out.println("finally");
        }
	}

}
