package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("d:/test.txt");
		FileOutputStream fos=new FileOutputStream("d:/copy.txt");
	//fis.available() takes the size of specified file
		byte[] buffer = new byte[fis.available()];
		//simple way to copy data to another file without displaying
		fis.read(buffer);
		fos.write(buffer);
		//fos.write(buffer,3,5);// to copy only some data
		// another way of copying data to files with display
		
		/*int c;
		while((c=fis.read())!=-1)
		{
		System.out.print((char)c);
		fos.write(c);
		}*/
		System.out.println("  file copied sucessfully...");
		fis.close();
		fos.close();
	}

}
