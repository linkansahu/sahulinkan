package pac.mutitasking;
//how to terminate a thread
public class MyThread extends Thread 
{
   boolean stop=false;
    public void run()
    {
    	for(int i=1;i<15;i++)
    	{
          		
    		System.out.println(i);
    		try
    		{
    			Thread.sleep(2000);
    		}
    		catch(Exception e)
    		{
    			System.out.println(e.getMessage());
    		}
    		if(stop)
    			return;
    	}
    }
}

