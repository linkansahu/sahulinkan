package pac.String;

public class Reverse {

	public static void main(String[] args) {
		String s1="my name is linkan";
		char[] carr=s1.toCharArray();
         for(int i=carr.length-1;i>=0;i--)
         {
        	 System.out.print(carr[i]);
         }
	}

}
