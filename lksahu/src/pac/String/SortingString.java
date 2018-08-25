package pac.String;

public class SortingString {

	public static void main(String[] args) {
		String str="linkankumar";
		char[]arr=str.toCharArray();
		char temp;
		for(int i=0;i<=arr.length-2;i++)
			{
	         for(int j=0;j<=arr.length-2;j++)
	         {
	        	 if(arr[j]>arr[j+1])
	        	 {
	        		 temp=arr[j];
	        		 arr[j]=arr[j+1];
	        		 arr[j+1]=temp;
	        	 }
	         }
		   } 
		for(int k:arr)
		{
			System.out.println((char)k);
		}
	}
}
