package pac.Arrays;

public class Kadane {

	public static void main(String[] args) {
		//Initialize:
			int a[]={12, 14, 0, -4, 61};
		  int  max_so_far = 0;
		    int max_ending_here = 0;

		//Loop for each element of the array
		    for(int i=0;i<=a.length-1;i++)
		    {
		   max_ending_here = max_ending_here + a[i];
		   if(max_ending_here < 0)
		            max_ending_here = 0;
		   if(max_so_far < max_ending_here)
		            max_so_far = max_ending_here;
	System.out.println( max_so_far);;
	}

}
}