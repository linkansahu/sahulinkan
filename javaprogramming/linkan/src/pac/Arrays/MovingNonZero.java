package pac.Arrays;

import java.util.Arrays;

public class MovingNonZero {

	public static void main(String[] args) {
		int arr[] = {1, 0, 9, 8, 4, 0, 0, 2,
                7, 0, 6, 0, 9};
		 int count = 0;
		    int temp;
		 
		    // Traverse the array. If arr[i] is 
		    // non-zero, then swap the element at 
		    // index 'count' with the element at 
		    // index 'i'
		    for (int i = 0; i <=arr.length-1; i++) {
		    if ((arr[i] != 0)) 
		    {
		        temp = arr[count];
		        arr[count] = arr[i];
		        arr[i] = temp;
		        count = count + 1;
		    }
		    }System.out.println(Arrays.toString(arr));

	}

}
