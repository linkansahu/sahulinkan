package pac.Arrays;

import java.util.Arrays;

public class EvenPostion {
	public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0; 
         
        // Loop to find even, odd sum
        for (int i=0; i< arr.length; i++)
        {
            if (i%2==0){
         System.out.println(arr[i]+":even position");
            System.out.println(Arrays.toString(arr));
          }
        }
    }
	
}
