package pac.String;

public class ReverseEachWord {

	public static void main(String[] args) {
		String input="my name is linkan";
		 String[]words=input.split(" ");
		  String revString="";
	   for(int i=0;i<=words.length-1;i++)
	   {
		   String word=words[i];
		   System.out.println(word);
		   String revWords="";
		   for(int j=word.length()-1;j>=0;j--)
		   {
			    revWords=  revWords+word.charAt(j);
		   }
		   revString=revString+revWords+" ";
	   }
	   System.out.println(revString);
	}

}
