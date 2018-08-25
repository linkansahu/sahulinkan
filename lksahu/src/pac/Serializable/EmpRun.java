package pac.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmpRun {

	public static void main(String[] args) 
	{
	 Emp e=new Emp("linkan",12,9481509369L);//otherwise the compiler  
	 //will try to parse the literal as an int hence the error msg
	 try
	 {
		 FileOutputStream fos=new  FileOutputStream("C:\\Users\\User\\Desktop\\New folder (2)\\lksahu\\betu.txt");
		 ObjectOutputStream oos=new ObjectOutputStream (fos);
		 oos.writeObject(e);
		 System.out.println("serialized object stored into betu");
	 }
	 catch(Exception e1)
	 {
		 System.out.println(e1.getMessage());
	 }
	 

	}

}
