package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("d:/test.txt");
		FileInputStream fis1=new FileInputStream("d:/data.txt");
		
		SequenceInputStream s=new SequenceInputStream(fis, fis1);
		int c;
		while((c=fis.read())!=-1)
		{
		System.out.print((char)c);
		}
		while((c=fis1.read())!=-1)
		{
		System.out.print("    "+(char)c);
		}
	}

}