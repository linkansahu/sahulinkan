package pac.Threading;

public class Addition extends Thread {
	 public void run()
	{
	int sum=0;
	
	for(int i=1;i<5;i++)
	{
		sum=sum+i;
		System.out.print(sum);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}System.out.print(" ");
	}

}
