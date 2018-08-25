package pac.Basics;

public class Fibbonacci {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		for(int i=1;i<=10;i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3);
		}

	}

}
