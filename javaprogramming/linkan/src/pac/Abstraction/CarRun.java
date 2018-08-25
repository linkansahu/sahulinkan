package pac.Abstraction;

public class CarRun {

	public static void main(String[] args) {
		Car c=new Bmw();
         c.start();
         c.run();
         c.stop();
         if(c instanceof Bmw)
         {
        	 Bmw b=(Bmw)c;
        	 b.navigation();
         }
 		Car c1=new Auddi();
 		c1.start();
 		c1.run();
 		c1.stop();
	}

}
