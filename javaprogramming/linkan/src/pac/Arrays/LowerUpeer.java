package pac.Arrays;

public class LowerUpeer {

	public static void main(String[] args) {
		String str="LinkaN";
		char ch;
		String s3=str.substring(2, 3);
		System.out.println(s3);
       for(int i=0;i<str.length();i++)
               {
                  ch=str.charAt(i);
                   if(ch>64&&ch<91)
                   {
                       ch=(char) (ch+32);
                       System.out.print(ch);
                   }
                   else if(ch>96&&ch<123)
                   {
                       ch=(char) (ch-32);
                       System.out.print( ch);
                   }
                  
               }
           
	}

}
