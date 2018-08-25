package pac.String;

public class Vowel {

	public static void main(String[] args) 
	{int digit = 0,count=0;
	String s1="linkan123";
	char c[]=s1.toCharArray();
	char ch;
	for(int i=0;i<=c.length-1;i++)
	{
	if(c[i]=='a'||c[i]=='A'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U')
	{
		count++;
		System.out.println(c[i]);
	}
	else if(Character.isDigit(c[i]))
	{
		digit++;
		System.out.println(c[i]);
	}
		
	}
	System.out.println("digit is:"+digit);
	int vowelper=count*100/s1.length();
	System.out.println(vowelper);
	

	}

}
