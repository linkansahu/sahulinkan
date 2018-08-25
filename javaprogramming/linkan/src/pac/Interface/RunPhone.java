package pac.Interface;

import java.util.Scanner;

public class RunPhone {

	public static void main(String[] args) {
	Scanner scn =new Scanner (System.in);
	System.out.println("enter phone name");
	String phoneName=scn.next();
	Owner o=new Owner();
	if( phoneName.equals("Nokia"))
	{
		o.use(new Nokia());
		
		
	}
	else
	{
		o.use(new Htc());
	}

	}

}
