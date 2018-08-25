package pac.Arrays;

public class DeletingduplicatesElement {

	public static void countUnique(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length - 1; i++) {
 			if (A[i] == A[i + 1]) {
			
 				System.out.println(A[i]);
			}
		}
		
	}
	 
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		countUnique(arr);
		
		}
}
