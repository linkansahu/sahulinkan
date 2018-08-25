package practice;

public class StringImp {

	public static void main(String[] args) {
		String s1="aaabbbccccaadddd";
		char []arr=s1.toCharArray();
		StringBuffer sb=new StringBuffer();
		int count=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
			else{
				sb.append(arr[i]);
				sb.append(count);
				count=1;
			}
			if(i==arr.length-2)
			{
				sb.append(arr[i+1]);
				sb.append(count);
				
			}
		}System.out.println(sb.toString());
	}

}
