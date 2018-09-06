package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Flush {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("d:/test.txt");
		FileOutputStream fos=new FileOutputStream("d:/copy.txt");
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		int c;
		while((c=bis.read())!=-1)
		{
			bos.write(c);
			//bos.flush(); // use this when files are not closed
		}
		System.out.println("file copied sucessfully");
		// if file is not closed, data from buffer is not copied to hard disk then use flush
		bis.close();
		bos.close();
		fis.close();
		fos.close();
	}

}
