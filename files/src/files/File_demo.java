package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("d:/test.txt");
		
		// to display or read the contents of file
		/*int c;
		while((c=fis.read())!=-1)
		{
		System.out.print((char)c);	
		//System.out.print(c);// gives ASCII values 
		}*/
		
		byte[] buffer=new byte[fis.available()];
		fis.read(buffer);
		//fis.read(buffer, 3, 5);// gives stating and ending of given values
		//convert buffer to string
		
		/*String data=new String(buffer);
		System.out.println(data);*/
		System.out.println(new String(buffer));// simple way to print buffer 
		
		// display using for each loop
		/*for(byte b: buffer)
		{
			System.out.print((char)b);
		}*/
		// to copy and display
		
		fis.close();
		
	}

}
