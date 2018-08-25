package pac.Arrays;

public class SumOfTwoDigitNumberAndProductEqualToOriginalNum {

	public static void main(String[] args) {
		
	        for(int i=10;i<=99;i++)
	        {
	        	checknumber(i);
	        }
	        // Validate number between 10 to 99

	}

	private static void checknumber(int num) {
		  int firstDigit;
	        int lastDigit;
	        int sum;
	        int product;
        if (num < 10 || num > 99) {
            System.out
                    .println("Please enter correct 2 Digit Number between 10 to 99!");
        }

        else {
            // Retrieve first Digit
            firstDigit = num / 10;
            // Retrieve last Digit
            lastDigit = num % 10;
            // Calculate sum of the Digit
            sum = firstDigit + lastDigit;
            // Calculate product of the Digit
            product = firstDigit * lastDigit;
            // Check Special Two Digit Number
            if ((sum + product) == num) {
                System.out.println("Result : The number " + num
                        + " is a Special Two-Digit Number.");
            } else {
                System.out
                        .println("Result : The number is Not a Special Two-Digit Number.");
            }
        }
		
	}

}
