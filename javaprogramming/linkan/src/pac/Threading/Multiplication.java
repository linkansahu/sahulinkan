package pac.Threading;

public class Multiplication  extends Thread{
	 public void run()
		{
		int mul=1;
		System.out.println("addition			multiplication");
		for(int i=1;i<5;i++)   
		{
			mul=mul*i;
			
			System.out.println("				" + mul);
			
			try
			{
				Thread.sleep(2000);;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}System.out.print(" ");
		}

}
