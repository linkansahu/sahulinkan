package pac.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Desrialization {

	public static void main(String[] args) {
	try
	{
		 FileInputStream fis=new  FileInputStream("C:\\Users\\User\\Desktop\\New folder (2)\\lksahu\\betu.txt");
		 ObjectInputStream ois=new ObjectInputStream (fis);
		 Emp e=(Emp)ois.readObject();
		 System.out.println(e.name+" "+e.id+" "+e.phno);
		 System.out.println("serialized object extracted from betu");
		 
	}
	catch(Exception e)
	{
		 System.out.println(e.getMessage());
	}

	}

}
