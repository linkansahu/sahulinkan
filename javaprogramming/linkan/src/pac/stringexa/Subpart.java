package pac.stringexa;

public class Subpart {

	public static void main(String[] args) {
		String str="mylinkannameislinkan";
		String fstr="linkan";
		int lastindex=0;
		int cnt=0;
		while(lastindex!=-1)
		{
			lastindex=str.indexOf(fstr,lastindex);
			System.out.println(lastindex);
			if(lastindex!=-1)
			{
				lastindex=lastindex+fstr.length();
				cnt++;
			}
		}
System.out.println(cnt);
	}

}
