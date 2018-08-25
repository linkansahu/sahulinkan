package pac.String;

public class Distinct {

	public static void main(String[] args) 
	{
		String s1="betu";
		String s2="";
		char c;
		for(int i=0;i<=s1.length()-1;i++)
		{
			c=s1.charAt(i);
			if(s2.indexOf(c)==-1)
			{
				s2=s2+c;
			}
			System.out.println(s2);
		}
				

	}

}
