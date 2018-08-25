package New;

public class LengthOfString {

	public static void main(String[] args) {
		String str="linkan1239";
		char[]car=str.toCharArray();
		for(int i=0;i<=car.length-1;i++){
			char c=car[i];
			if(c>97&&c<122){
				System.out.println(c);
			}
			else if(c>48&&c<97)
			{
				System.out.print(c);
			}
			
		
   
	}
	}

}
