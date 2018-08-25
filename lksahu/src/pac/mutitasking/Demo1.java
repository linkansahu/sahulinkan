package pac.mutitasking;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws Throwable {
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
		t1.start();
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.in.read();
t.stop=true;


	}

}
