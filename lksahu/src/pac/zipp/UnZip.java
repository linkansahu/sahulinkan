package pac.zipp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.InflaterInputStream;

public class UnZip {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("C:\\Users\\User\\Desktop\\New folder (2)\\HR1.txt");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\User\\Desktop\\New folder (2)\\HR3.txt");
		InflaterInputStream iis=new InflaterInputStream(fis);
		int data;
		while ((data=iis.read())!=-1)

			fos.write(data);
			fos.close();
			iis.close();
	}

}
