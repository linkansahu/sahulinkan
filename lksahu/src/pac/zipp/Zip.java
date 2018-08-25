package pac.zipp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Zip {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis =new FileInputStream("C:\\Users\\User\\Desktop\\New folder (2)\\HR.txt");
	FileOutputStream fos=new FileOutputStream("C:\\Users\\User\\Desktop\\New folder (2)\\HR1.txt");
	DeflaterOutputStream  dos =new 	DeflaterOutputStream (fos);
	int data;
	while ((data=fis.read())!=-1)

		dos.write(data);
		fis.close();
		dos.close();
	
			

	}

}
