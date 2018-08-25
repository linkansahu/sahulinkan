package New;

public class GCD {
	public static void main(String[] args) {

        int n1 = 4, n2 =10 , gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; i++)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.println( gcd);
    }
}
